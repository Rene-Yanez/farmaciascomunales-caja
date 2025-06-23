package com.farmaciascomunales.caja.repository;

import com.farmaciascomunales.caja.model.MovimientoCaja;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovimientoCajaRepository extends JpaRepository<MovimientoCaja, Long> {
}