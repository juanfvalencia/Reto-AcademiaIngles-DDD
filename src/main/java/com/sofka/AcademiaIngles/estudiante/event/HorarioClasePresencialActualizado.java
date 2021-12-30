package com.sofka.AcademiaIngles.estudiante.event;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.AcademiaIngles.estudiante.value.ClasePresencialId;
import com.sofka.AcademiaIngles.estudiante.value.Horario;

public class HorarioClasePresencialActualizado extends DomainEvent {

    private final ClasePresencialId clasePresencialId;
    private final Horario horario;

    public HorarioClasePresencialActualizado(ClasePresencialId entityId, Horario horario){
        super("sofka.estudiante.horarioClasePresencialActualizado");
        this.clasePresencialId = entityId;
        this.horario = horario;
    }

    public ClasePresencialId getClasePresencialId() {
        return clasePresencialId;
    }

    public Horario getHorario() {
        return horario;
    }
}
