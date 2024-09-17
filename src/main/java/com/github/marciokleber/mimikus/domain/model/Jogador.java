package com.github.marciokleber.mimikus.domain.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.annotations.Comment;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;


@Data
@Entity
@Table(name = "TB_JOGADOR")
public class Jogador {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_JOGADOR")
    @SequenceGenerator(allocationSize = 1, initialValue = 1, name = "SEQ_JOGADOR")
    private Long id;

    @NotNull
    @Column(nullable = false)
    @Comment("Campo para o armazenamento do nome do jogador")
    private String nome;

    @Column()
    @Comment("Campo para o armazenamento do apelido do jogador")
    private String nickname;

    @NotNull
    @Column(nullable = false)
    @Comment("Campo para o armazenamento do email do jogador")
    private String email;

    @CreationTimestamp
    private LocalDate Created_at;

    @UpdateTimestamp
    private LocalDate Updated_at;
}
