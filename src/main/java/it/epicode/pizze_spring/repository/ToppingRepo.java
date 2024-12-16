package it.epicode.pizze_spring.repository;

import it.epicode.pizze_spring.entity.Topping;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToppingRepo extends JpaRepository<Topping, Long> {
}
