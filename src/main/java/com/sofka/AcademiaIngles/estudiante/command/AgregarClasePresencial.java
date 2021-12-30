package com.sofka.AcademiaIngles.estudiante.command;

import co.com.sofka.domain.generic.Command;
import com.sofka.AcademiaIngles.estudiante.value.*;

public class AgregarClasePresencial extends Command {

    private final EstudianteId estudianteId;
    private final ClasePresencialId clasePresencialId;
    private final Sede sede;
    private final Fecha fecha;
    private final Horario horario;

    public AgregarClasePresencial(EstudianteId estudianteId, ClasePresencialId entityId, Sede sede, Fecha fecha, Horario horario) {
        this.estudianteId = estudianteId;
        this.clasePresencialId = entityId;
        this.sede = sede;
        this.fecha = fecha;
        this.horario = horario;
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

    public Fecha getFecha() {
        return fecha;
    }

    public Horario getHorario() {
        return horario;
    }
}
