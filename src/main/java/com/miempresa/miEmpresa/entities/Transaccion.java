package com.miempresa.miEmpresa.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "transaccion")
public class Transaccion {
    // Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "concepto")
    private String concepto;
    @Column(name = "monto")
    private String monto;

    // usuario...
    @ManyToOne
    @JoinColumn(name = "empleado")
    private Empleado empleado;
    // empresa...
    @ManyToOne
    @JoinColumn(name = "empresaid")
    private Empresa empresa;

    @Column(name = "fechaCreado")
    private LocalDate fechaCreado;
    @Column(name = "fechaActualizado")
    private LocalDate fechaActualizado;

    //Getters & Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public String getMonto() {
        return monto;
    }

    public void setMonto(String monto) {
        this.monto = monto;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public LocalDate getFechaCreado() {
        return fechaCreado;
    }

    public void setFechaCreado(LocalDate fechaCreado) {
        this.fechaCreado = fechaCreado;
    }

    public LocalDate getFechaActualizado() {
        return fechaActualizado;
    }

    public void setFechaActualizado(LocalDate fechaActualizado) {
        this.fechaActualizado = fechaActualizado;
    }
}
