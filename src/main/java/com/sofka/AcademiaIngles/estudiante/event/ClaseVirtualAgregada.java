package com.sofka.AcademiaIngles.estudiante.event;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.AcademiaIngles.estudiante.value.ClaseVirtualId;
import com.sofka.AcademiaIngles.estudiante.value.Horario;

public class ClaseVirtualAgregada extends DomainEvent {

    private final ClaseVirtualId claseVirtualId;
    private final Horario horario;

    public ClaseVirtualAgregada(ClaseVirtualId entityId, Horario horario){
        super("sofka.estudiante.claseVirtualAgregada");
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
