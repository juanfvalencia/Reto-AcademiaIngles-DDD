package com.sofka.AcademiaIngles.equipoDocente.event;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.AcademiaIngles.equipoDocente.value.EquipoDocenteId;
import com.sofka.AcademiaIngles.equipoDocente.value.TipoEquipo;

public class EquipoDocenteCreado extends DomainEvent {

    private final EquipoDocenteId equipoDocenteId;
    private final TipoEquipo tipoEquipo;

    public EquipoDocenteCreado(EquipoDocenteId entityId, TipoEquipo tipoEquipo){
        super("sofka.equipoDocente.equipoDocenteCreado");
        this.equipoDocenteId = entityId;
        this.tipoEquipo = tipoEquipo;
    }

    public EquipoDocenteId getEquipoDocenteId() {
        return equipoDocenteId;
    }

    public TipoEquipo getTipoEquipo() {
        return tipoEquipo;
    }
}
