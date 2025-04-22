# E-Commerce Microservices System

This project is a full-stack E-Commerce microservices-based system built using Spring Boot, Spring Cloud, Kafka, PostgreSQL, MongoDB, Zipkin for distributed tracing, and Docker for orchestration.

![image](https://github.com/user-attachments/assets/f7e568a5-c4e5-4ac8-af64-ea77b099f948)


## Features

- **Service Discovery** with Eureka
- **API Gateway** with Spring Cloud Gateway
- **Customer Management** (MongoDB)
- **Order Management** (PostgreSQL)
- **Product Management**
- **Payment Handling**
- **Kafka Integration** for event-driven architecture
- **Zipkin Tracing**
- **Monitoring** with PGAdmin and Mongo Express
- **Mail Testing** with MailDev

## Project Structure

- **gateway**: Spring Cloud Gateway for routing
- **eureka-server**: Eureka Service Registry
- **customer-service**: Customer microservice (MongoDB)
- **order-service**: Order microservice (PostgreSQL)
- **product-service**: Product catalog
- **payment-service**: Handles payments
- **kafka**: Used for publishing order events
- **zipkin**: Traces requests across services

## How to Run

Make sure Docker is installed. Then run:

```bash
docker-compose up --build
```

## Default Access Links

- Eureka Server: [http://localhost:8761/](http://localhost:8761/)
- PGAdmin: [http://localhost:5050/browser/](http://localhost:5050/browser/)
- Zipkin Tracing UI: [http://localhost:9411/zipkin](http://localhost:9411/zipkin)
- MailDev: [http://localhost:1080/](http://localhost:1080/)

## Requirements

- Java +21
- Maven
- Docker & Docker Compose
