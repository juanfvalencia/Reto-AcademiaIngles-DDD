package com.sofka.AcademiaIngles.estudiante.event;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.AcademiaIngles.estudiante.value.ClasePresencialId;
import com.sofka.AcademiaIngles.estudiante.value.Fecha;

public class FechaClasePresencialActualizada extends DomainEvent {

    private final ClasePresencialId clasePresencialId;
    private final Fecha fecha;

    public FechaClasePresencialActualizada(ClasePresencialId entityId, Fecha fecha){
        super("sofka.estudiante.fechaClasePresencialActualizada");
        this.clasePresencialId = entityId;
        this.fecha = fecha;
    }

    public ClasePresencialId getClasePresencialId() {
        return clasePresencialId;
    }

    public Fecha getFecha() {
        return fecha;
    }
}
