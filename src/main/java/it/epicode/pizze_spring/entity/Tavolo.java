package it.epicode.pizze_spring.entity;

import it.epicode.pizze_spring.Enum.StatoTavolo;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity

public class Tavolo {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column
    private int numero;

    @Column(name = "numero_coperti_max", nullable = false)
    private int numeroCopertiMax;

    @Column(name = "stato_tavolo", nullable = false)
    private StatoTavolo statoTavolo;

    @OneToOne
    private Ordine ordine;
}