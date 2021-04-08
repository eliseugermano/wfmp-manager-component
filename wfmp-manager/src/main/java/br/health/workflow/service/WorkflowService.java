package br.health.workflow.service;

import br.health.workflow.core.communication.SyncCommunication;
import br.health.workflow.core.communication.config.RestTemplateConfig;
import br.health.workflow.db.semantic.entity.PetriNetEntity;
import br.health.workflow.db.semantic.repository.PetriNetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.transaction.Transactional;
import java.io.IOException;

@Service
public class WorkflowService {

    @Autowired
    private PetriNetRepository petriNetRepository;

    @Autowired
    private PetriNetAnalyzerService analyzer;

    @Autowired
    private SyncCommunication synchronousCommunication;

    @Transactional
    public PetriNetEntity register(MultipartFile file) throws IOException {
        byte[] content = file.getBytes();
        PetriNetEntity workflow = analyzer.createSemanticModel(new String(content));
        return petriNetRepository.save(workflow);
    }

    public PetriNetEntity getByReference(String reference) {
        return petriNetRepository.findByName(reference);
    }

    @Async
    public void sendToWorker(RestTemplateConfig restTemplateAttributes) {
        synchronousCommunication.restRequest(restTemplateAttributes);
    }

}
