package com.farmaciascomunales.caja.controller;

import com.farmaciascomunales.caja.model.MovimientoCaja;
import com.farmaciascomunales.caja.service.MovimientoCajaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/caja")
public class MovimientoCajaController {

    private final MovimientoCajaService service;

    public MovimientoCajaController(MovimientoCajaService service) {
        this.service = service;
    }

    @GetMapping
    public List<MovimientoCaja> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public MovimientoCaja obtener(@PathVariable Long id) {
        return service.obtener(id);
    }

    @PostMapping
    public MovimientoCaja crear(@RequestBody MovimientoCaja movimiento) {
        return service.crear(movimiento);
    }
}