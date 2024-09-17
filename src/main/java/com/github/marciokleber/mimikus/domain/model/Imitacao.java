package com.github.marciokleber.mimikus.domain.model;

import com.github.marciokleber.mimikus.domain.enums.Nivel;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.Comment;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "TB_IMITACAO")
public class Imitacao {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_IMITACAO")
    @SequenceGenerator(allocationSize = 1, initialValue = 1, name = "SEQ_IMITACAO")
    private Long id;

    @Column
    @Comment(value = "Imitação a ser realizada")
    private String nome;

    @Column
    @Comment(value = "Descrição referente a imitação")
    private String Descricao;

    @Column
    @Enumerated(EnumType.STRING)
    private Nivel nivel;

    @Column
    @Comment("Data da depreciação da imitação")
    private LocalDate deprecated_at;
}
