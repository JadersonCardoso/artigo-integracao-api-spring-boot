package com.jbrandao.consumer.consulta;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsultaConsumer {

    @KafkaListener(topics = "agendamento-consultas", groupId = "grupo-agendamento")
    public void processaAgendamentoConsulta(ConsultaDTO consulta) {
        System.out.println("Consulta recebida: " + consulta);
    }

}
