package it.epicode.pizze_spring.configurations;

import it.epicode.pizze_spring.entity.Bevanda;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BevandaConfiguration {

    @Bean
    public Bevanda newBevandaLemonade() {
        Bevanda bevanda = new Bevanda();
        bevanda.setNome("Lemonade");
        bevanda.setPrezzo(1.29);
        bevanda.setCalorie(128);
        return bevanda;
    }

    @Bean
    Bevanda newBevandaWater() {
        Bevanda bevanda = new Bevanda();
        bevanda.setNome("Water");
        bevanda.setCalorie(0);
        bevanda.setPrezzo(1.3);
        return bevanda;
    }

    @Bean
    Bevanda newBevandaWine() {
        Bevanda bevanda = new Bevanda();
        bevanda.setNome("Wine");
        bevanda.setCalorie(607);
        bevanda.setPrezzo(7.5);
        return bevanda;
    }

}
