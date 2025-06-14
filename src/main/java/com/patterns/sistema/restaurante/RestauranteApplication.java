package com.patterns.sistema.restaurante;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.patterns.sistema.restaurante.builder.PedidoBuilder;
import com.patterns.sistema.restaurante.builder.director.Director;
import com.patterns.sistema.restaurante.model.Carne;
import com.patterns.sistema.restaurante.model.Mesa;

@SpringBootApplication
public class RestauranteApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestauranteApplication.class, args);

		Mesa m = new Mesa();

		Carne c = new Carne();

		PedidoBuilder builder = new PedidoBuilder();

		Director director = new Director();

		director.buildPedidoCompleto(builder, m, c, c);

		builder.toString();

	}

}
