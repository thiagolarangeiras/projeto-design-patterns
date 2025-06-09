package com.patterns.sistema.restaurante.repository;

import com.patterns.sistema.restaurante.model.Mesa;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MesaRepository extends JpaRepository<Mesa, Long> {}