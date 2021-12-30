package com.sofka.AcademiaIngles.estudiante.event;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.AcademiaIngles.estudiante.value.ClasePresencialId;
import com.sofka.AcademiaIngles.estudiante.value.Fecha;
import com.sofka.AcademiaIngles.estudiante.value.Horario;
import com.sofka.AcademiaIngles.estudiante.value.Sede;

public class ClasePresencialAgregada extends DomainEvent {

    private final ClasePresencialId clasePresencialId;
    private final Sede sede;
    private final Fecha fecha;
    private final Horario horario;

    public ClasePresencialAgregada(ClasePresencialId entityId, Sede sede, Fecha fecha, Horario horario){
        super("sofka.estudiante.clasePresencialAgregada");
        this.clasePresencialId = entityId;
        this.sede = sede;
        this.fecha = fecha;
        this.horario = horario;
    }

    public ClasePresencialId getClasePresencialId() {
        return clasePresencialId;
    }

    public Sede getSede() {
        return sede;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public Horario getHorario() {
        return horario;
    }
}
