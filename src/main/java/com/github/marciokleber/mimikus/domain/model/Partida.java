package com.github.marciokleber.mimikus.domain.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "TB_PARTIDA")
public class Partida {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_PARTIDA")
    @SequenceGenerator(allocationSize = 1, initialValue = 1, name = "SEQ_PARTIDA")
    private Long id;

}
