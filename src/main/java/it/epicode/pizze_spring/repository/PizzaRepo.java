package it.epicode.pizze_spring.repository;

import it.epicode.pizze_spring.entity.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PizzaRepo extends JpaRepository<Pizza,Long> {
}
