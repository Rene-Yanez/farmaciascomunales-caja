package com.farmaciascomunales.caja.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class MovimientoCaja {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long idVenta;       // FK opcional a ventas
    private String tipo;        // "INGRESO" o "EGRESO"
    private String medioPago;   // EFECTIVO, TRANSFERENCIA, TARJETA
    private int monto;

    private LocalDateTime fechaHora;

    // Getters y setters
    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public Long getIdVenta() { return idVenta; }

    public void setIdVenta(Long idVenta) { this.idVenta = idVenta; }

    public String getTipo() { return tipo; }

    public void setTipo(String tipo) { this.tipo = tipo; }

    public String getMedioPago() { return medioPago; }

    public void setMedioPago(String medioPago) { this.medioPago = medioPago; }

    public int getMonto() { return monto; }

    public void setMonto(int monto) { this.monto = monto; }

    public LocalDateTime getFechaHora() { return fechaHora; }

    public void setFechaHora(LocalDateTime fechaHora) { this.fechaHora = fechaHora; }
}