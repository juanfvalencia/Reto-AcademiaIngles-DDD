package com.sofka.AcademiaIngles.estudiante;

import co.com.sofka.domain.generic.Entity;
import com.sofka.AcademiaIngles.estudiante.value.ClaseVirtualId;
import com.sofka.AcademiaIngles.estudiante.value.Horario;

import java.util.Objects;

public class ClaseVirtual extends Entity<ClaseVirtualId> {

    protected Horario horario;

    public ClaseVirtual(ClaseVirtualId entityId, Horario horario) {
        super(entityId);
        this.horario = Objects.requireNonNull(horario);
    }

    public void agregarHorario(Horario horario){
        Objects.requireNonNull(horario);
        this.horario = horario;
    }

    public void actualizarHorario(Horario horario){
        Objects.requireNonNull(horario);
        this.horario = horario;
    }

    public Horario horario(){
        return horario;
    }
}
