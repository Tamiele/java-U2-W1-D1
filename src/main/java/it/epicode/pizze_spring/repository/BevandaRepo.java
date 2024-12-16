package it.epicode.pizze_spring.repository;

import it.epicode.pizze_spring.entity.Bevanda;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BevandaRepo extends JpaRepository<Bevanda, Long> {
}
