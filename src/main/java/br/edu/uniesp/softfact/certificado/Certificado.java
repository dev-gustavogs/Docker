package br.edu.uniesp.softfact.certificado;

import br.edu.uniesp.softfact.aluno.Aluno;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter @Setter
@Entity
@Table(name = "tb_softfact_certificado_ext")
@NoArgsConstructor @AllArgsConstructor @Builder
public class Certificado {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false) @JoinColumn(name = "aluno_id")
    private Aluno aluno;

    @Column(nullable = false)
    private String descricao;

    private String arquivoUrl;

    @Column(nullable = false)
    private LocalDate dataEnvio;
}
