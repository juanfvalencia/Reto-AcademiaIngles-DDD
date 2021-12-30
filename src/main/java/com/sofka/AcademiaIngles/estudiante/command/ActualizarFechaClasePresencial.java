package com.sofka.AcademiaIngles.estudiante.command;

import co.com.sofka.domain.generic.Command;
import com.sofka.AcademiaIngles.estudiante.value.ClasePresencialId;
import com.sofka.AcademiaIngles.estudiante.value.EstudianteId;
import com.sofka.AcademiaIngles.estudiante.value.Fecha;

public class ActualizarFechaClasePresencial extends Command {

    private final EstudianteId estudianteId;
    private final ClasePresencialId clasePresencialId;
    private final Fecha fecha;

    public ActualizarFechaClasePresencial(EstudianteId estudianteId, ClasePresencialId entityId, Fecha fecha) {
        this.estudianteId = estudianteId;
        this.clasePresencialId = entityId;
        this.fecha = fecha;
    }

    public EstudianteId getEstudianteId() {
        return estudianteId;
    }

    public ClasePresencialId getClasePresencialId() {
        return clasePresencialId;
    }

    public Fecha getFecha() {
        return fecha;
    }
}
