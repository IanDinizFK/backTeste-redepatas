package com.redepatas.api.dtos.petDtos;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public record GetPetsDto(
        UUID idPet,
        String rgPet,
        String avatarUrl,
        String nome,
        String especie,
        String raca,
        String observacoes,
        Boolean castrado,
        Boolean sociavel,
        List<VacinaDto> vacinas,
        LocalDate dataNascimento,
        String sexo,
        BigDecimal peso,
        String tipoSanguineo) {
}