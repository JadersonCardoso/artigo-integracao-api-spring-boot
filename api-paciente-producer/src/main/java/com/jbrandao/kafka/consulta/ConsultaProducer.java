package com.jbrandao.kafka.consulta;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ConsultaProducer {

    private final KafkaTemplate<String, ConsultaDTO> kafkaTemplate;

    public ConsultaProducer(KafkaTemplate<String, ConsultaDTO> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void enviarAgendamentoConsulta(ConsultaDTO consulta) {
        this.kafkaTemplate.send("agendamento-consultas", consulta);
    }
}
