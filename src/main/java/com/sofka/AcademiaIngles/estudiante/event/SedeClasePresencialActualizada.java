package com.sofka.AcademiaIngles.estudiante.event;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.AcademiaIngles.estudiante.value.ClasePresencialId;
import com.sofka.AcademiaIngles.estudiante.value.Sede;

public class SedeClasePresencialActualizada extends DomainEvent {

    private final ClasePresencialId clasePresencialId;
    private final Sede sede;

    public SedeClasePresencialActualizada(ClasePresencialId entityId, Sede sede){
        super("sofka.estudiante.sedeClasePresencialActualizada");
        this.clasePresencialId = entityId;
        this.sede = sede;
    }

    public ClasePresencialId getClasePresencialId() {
        return clasePresencialId;
    }

    public Sede getSede() {
        return sede;
    }
}
