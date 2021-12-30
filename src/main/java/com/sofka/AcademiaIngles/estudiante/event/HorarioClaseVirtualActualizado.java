package com.sofka.AcademiaIngles.estudiante.event;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.AcademiaIngles.estudiante.value.ClaseVirtualId;
import com.sofka.AcademiaIngles.estudiante.value.Horario;

public class HorarioClaseVirtualActualizado extends DomainEvent {

    private final ClaseVirtualId claseVirtualId;
    private final Horario horario;

    public HorarioClaseVirtualActualizado(ClaseVirtualId entityId, Horario horario){
        super("sofka.estudiante.horarioClaseVirtualActualizado");
        this.claseVirtualId = entityId;
        this.horario = horario;
    }

    public ClaseVirtualId getClaseVirtualId() {
        return claseVirtualId;
    }

    public Horario getHorario() {
        return horario;
    }
}
