# Integração de APIs com Apache Kafka, RabbitMQ, Apache Camel e Spring Boot

Este repositório contém dois projetos Spring Boot integrados com Apache Kafka, RabbitMQ e Apache Camel para simular um sistema de agendamento de consultas médicas:

- `api-paciente`: responsável por enviar mensagens com solicitações de agendamento.
- `api-agendamento`: consome as mensagens de Kafka e processa os dados recebidos.
