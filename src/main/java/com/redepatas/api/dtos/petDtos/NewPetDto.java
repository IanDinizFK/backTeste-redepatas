package com.redepatas.api.dtos.petDtos;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

import jakarta.validation.constraints.NotNull;

public record NewPetDto(
    String rgPet,
    String avatarUrl,
    @NotNull(message = "O campo nome é obrigatório.") String nome,
    @NotNull(message = "O campo espécie é obrigatório.") String especie,
    String raca,
    String observacoes,
    @NotNull(message = "O campo castrado é obrigatório.") Boolean castrado,
    Boolean sociavel,
    List<VacinaDto> vacinas, // Lista de DTOs para a entidade Vacina
    LocalDate dataNascimento,
    @NotNull(message = "O campo sexo é obrigatório.") String sexo,
    BigDecimal peso,
    String tipoSanguineo
) {}