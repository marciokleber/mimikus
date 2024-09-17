package com.github.marciokleber.mimikus.domain.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.Comment;

@Data
@Entity
@Table(name = "TB_RODADA")
public class Rodada {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_RODADA")
    @SequenceGenerator(allocationSize = 1, initialValue = 1, name = "SEQ_RODADA")
    private Long id;

    @Column
    private Double pontuacao;

    @OneToOne
    @JoinColumn()
    @Comment(value = "Vinculação de imitação a rodada")
    private Imitacao imitacao;

    @OneToOne
    @JoinColumn()
    @Comment(value = "Vinculação de jogador a rodada")
    private Jogador jogador;

    @OneToOne
    @JoinColumn()
    @Comment(value = "Vinculação da partida a rodada")
    private Partida partida;
}
