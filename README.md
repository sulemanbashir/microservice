# Inventory Management System Using Microservice Architecture


This repository contains backend of inventory managament system using java 8. 


## Frameworks and Services Used in Development
- Spring Boot
- Distributed configuration with Spring Cloud Config having configurations for all microservice on private git repository. Implemented auto refresh configurations mechanism using Apache Kafka for microservices.
- Service discovery for all microservices with Spring Cloud Netflix Eureka.
- API Gateway: Spring Cloud Gateway.
- Correlating logs with Spring Cloud Sleuth.
- Used Liquibase for maintaining and designing database.
