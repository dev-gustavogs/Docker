package br.edu.uniesp.softfact.aluno.dto;

import br.edu.uniesp.softfact.aluno.enums.Curso;
import br.edu.uniesp.softfact.aluno.enums.Periodo;
import br.edu.uniesp.softfact.stack.dto.StackResumo;

import java.util.Set;

public record AlunoResponseDTO(
        Long id,
        String nome,
        String email,
        String telefone,
        Curso curso,
        String matricula,
        Periodo periodo,
        Set<StackResumo> stacks
) {}
