package com.sofka.AcademiaIngles.equipoDocente.command;

import co.com.sofka.domain.generic.Command;
import com.sofka.AcademiaIngles.equipoDocente.value.EquipoDocenteId;
import com.sofka.AcademiaIngles.equipoDocente.value.TipoEquipo;

public class CrearEquipoDocente extends Command {

    private final EquipoDocenteId equipoDocenteId;
    private final TipoEquipo tipoEquipo;

    public CrearEquipoDocente(EquipoDocenteId entityId, TipoEquipo tipoEquipo) {
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
