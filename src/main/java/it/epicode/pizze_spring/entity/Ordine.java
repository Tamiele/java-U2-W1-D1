package it.epicode.pizze_spring.entity;

import it.epicode.pizze_spring.Enum.StatoOrdine;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@NamedQuery(name = "Trova_tutto_Ordine", query = "SELECT a FROM Ordine a")
public class Ordine {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "numero_ordine", nullable = false)
    private int numeroOrdine;

    @Column(name = "stato_ordine", nullable = false)
    private StatoOrdine statoOrdine;

    @Column(name = "numero_coperti", nullable = false)
    private int numeroCoperti;

    @Column(name = "ora_aquisizione", nullable = false)
    private LocalTime oraAcquisizione;

    @Column(name = "importo_totale", nullable = false)
    private double importoTotale;

    @ManyToOne
    private Tavolo tavolo;

    @ManyToMany
    private List<Menu> elementiMenu;


}