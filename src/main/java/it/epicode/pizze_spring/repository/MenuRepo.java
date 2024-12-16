package it.epicode.pizze_spring.repository;

import it.epicode.pizze_spring.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepo extends JpaRepository<Menu, Long> {
}
