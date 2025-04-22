package com.jbrandao.kafka.consulta;

import java.time.LocalDateTime;

public record ConsultaDTO(Long idPaciente, LocalDateTime dataHora, String especialidade) {
}
