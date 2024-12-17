package it.epicode.pizze_spring.repository;

import it.epicode.pizze_spring.entity.Ordine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdineRepo extends JpaRepository<Ordine, Long> {
}
