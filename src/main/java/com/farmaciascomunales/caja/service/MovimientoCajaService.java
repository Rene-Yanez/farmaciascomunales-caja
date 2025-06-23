package com.farmaciascomunales.caja.service;

import com.farmaciascomunales.caja.model.MovimientoCaja;
import com.farmaciascomunales.caja.repository.MovimientoCajaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovimientoCajaService {

    private final MovimientoCajaRepository repository;

    public MovimientoCajaService(MovimientoCajaRepository repository) {
        this.repository = repository;
    }

    public List<MovimientoCaja> listar() {
        return repository.findAll();
    }

    public MovimientoCaja obtener(Long id) {
        return repository.findById(id).orElse(null);
    }

    public MovimientoCaja crear(MovimientoCaja movimiento) {
        return repository.save(movimiento);
    }
}