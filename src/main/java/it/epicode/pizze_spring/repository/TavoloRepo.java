package it.epicode.pizze_spring.repository;

import it.epicode.pizze_spring.entity.Tavolo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TavoloRepo extends JpaRepository<Tavolo, Long> {
}
