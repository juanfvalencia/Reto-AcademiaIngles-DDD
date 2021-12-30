package com.sofka.AcademiaIngles.estudiante.command;

import co.com.sofka.domain.generic.Command;
import com.sofka.AcademiaIngles.estudiante.value.ClasePresencialId;
import com.sofka.AcademiaIngles.estudiante.value.EstudianteId;
import com.sofka.AcademiaIngles.estudiante.value.Sede;

public class ActualizarSedeClasePresencial extends Command {

    private final EstudianteId estudianteId;
    private final ClasePresencialId clasePresencialId;
    private final Sede sede;

    public ActualizarSedeClasePresencial(EstudianteId estudianteId, ClasePresencialId entityId, Sede sede) {
        this.estudianteId = estudianteId;
        this.clasePresencialId = entityId;
        this.sede = sede;
    }

    public EstudianteId getEstudianteId() {
        return estudianteId;
    }

    public ClasePresencialId getClasePresencialId() {
        return clasePresencialId;
    }

    public Sede getSede() {
        return sede;
    }
}
