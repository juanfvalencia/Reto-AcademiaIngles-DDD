package com.sofka.AcademiaIngles.equipoDocente.command;

import co.com.sofka.domain.generic.Command;
import com.sofka.AcademiaIngles.equipoDocente.value.EquipoDocenteId;
import com.sofka.AcademiaIngles.nivel.value.NivelId;

public class AgregarNivelId extends Command {

    private EquipoDocenteId equipoDocenteId;
    private NivelId nivelId;

    public AgregarNivelId(EquipoDocenteId equipoDocenteId, NivelId nivelId) {
        this.equipoDocenteId = equipoDocenteId;
        this.nivelId = nivelId;
    }

    public EquipoDocenteId getEquipoDocenteId() {
        return equipoDocenteId;
    }

    public NivelId getNivelId() {
        return nivelId;
    }
}
