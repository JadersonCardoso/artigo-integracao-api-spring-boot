package com.jbrandao.kafka.consulta;

import com.jbrandao.kafka.consulta.ConsultaProducer;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/consultas")
public class ConsultaResource {

    private final ConsultaProducer producer;
    public ConsultaResource(ConsultaProducer producer) {
        this.producer = producer;
    }
    @PostMapping
    public void agendarConsulta(@RequestBody ConsultaDTO dto) {
        this.producer.enviarAgendamentoConsulta(dto);
    }
}
