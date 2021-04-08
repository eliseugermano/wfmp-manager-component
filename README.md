# wfmp-manager

### Current Release ###
* DSL grammar
* AST graphical view
* DSL parser
* Service registration components
* Service discovery components
* Workflow orchestration engine (Petri Net model)

### Requirements for execution ###

* [Docker](https://docs.docker.com/) | [Docker-compose](https://docs.docker.com/compose/) | [JDK 8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) | [Maven](https://maven.apache.org/) | [Postgresql](https://www.postgresql.org/)

### Setting Environment Variables ###
* Database
	- spring.datasource.username
	- spring.datasource.password
* RabbitMQ
	- spring.rabbitmq.host
	- spring.rabbitmq.port
	- spring.rabbitmq.password
	- spring.rabbitmq.username
    - spring.rabbitmq.virtual-host
    - spring.rabbitmq.default-exchange
* Server Host
	- server.host.manager
	- server.host.worker

### Parse Tree ###

* [ANTLR4 support in Visual Studio code](https://marketplace.visualstudio.com/items?itemName=mike-lischke.vscode-antlr4)
* Parsing tree for BloodPressureAnalysis workflow
![Alt text](wfmp-manager/blob/parse-tree.jpg?raw=true "Parse-Tree")

### API documentation ###
* {basePath}/swagger-ui.html