package br.edu.uniesp.softfact.aluno.dto;

import br.edu.uniesp.softfact.aluno.enums.Curso;
import br.edu.uniesp.softfact.aluno.enums.Periodo;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.Set;

public record AlunoUpdateDTO(
        @NotBlank
        String nome,
        @NotBlank @Email
        String email,
        String telefone,
        @NotNull Curso curso,
        @NotBlank String
        matricula,
        @NotNull
        Periodo periodo,
        Set<Long>
        stacksIds
) {}
