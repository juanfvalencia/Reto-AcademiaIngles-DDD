package com.sofka.AcademiaIngles.estudiante;

import co.com.sofka.domain.generic.Entity;
import com.sofka.AcademiaIngles.estudiante.value.ClasePresencialId;
import com.sofka.AcademiaIngles.estudiante.value.Fecha;
import com.sofka.AcademiaIngles.estudiante.value.Horario;
import com.sofka.AcademiaIngles.estudiante.value.Sede;

import java.util.Objects;

public class ClasePresencial extends Entity<ClasePresencialId> {

    protected Sede sede;
    protected Fecha fecha;
    protected Horario horario;

    public ClasePresencial(ClasePresencialId entityId, Sede sede, Fecha fecha, Horario horario) {
        super(entityId);
        this.sede = Objects.requireNonNull(sede);
        this.fecha = Objects.requireNonNull(fecha);
        this.horario = Objects.requireNonNull(horario);
    }

    public void agregarSede(Sede sede){
        Objects.requireNonNull(sede);
        this.sede = sede;
    }

    public void agregarFecha(Fecha fecha){
        Objects.requireNonNull(fecha);
        this.fecha = fecha;
    }

    public void actualizarFecha(Fecha fecha){
        Objects.requireNonNull(fecha);
        this.fecha = fecha;
    }

    public void agregarHorario(Horario horario){
        Objects.requireNonNull(horario);
        this.horario = horario;
    }

    public void actualizarHorario(Horario horario){
        Objects.requireNonNull(horario);
        this.horario = horario;
    }

    public Sede sede(){
        return sede;
    }

    public Fecha fecha(){
        return fecha;
    }

    public Horario horario(){
        return horario;
    }
}
