package com.sofka.AcademiaIngles.nivel.command;

import co.com.sofka.domain.generic.Command;
import com.sofka.AcademiaIngles.estudiante.value.EstudianteId;
import com.sofka.AcademiaIngles.nivel.value.NivelId;

public class CrearNivel extends Command {

    private final NivelId entityId;
    private final EstudianteId estudianteId;

    public CrearNivel(NivelId entityId, EstudianteId estudianteId) {
        this.entityId = entityId;
        this.estudianteId = estudianteId;
    }

    public NivelId getEntityId() {
        return entityId;
    }

    public EstudianteId getEstudianteId() {
        return estudianteId;
    }
}
