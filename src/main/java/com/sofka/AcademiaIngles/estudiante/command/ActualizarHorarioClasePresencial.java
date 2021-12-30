package com.sofka.AcademiaIngles.estudiante.command;

import co.com.sofka.domain.generic.Command;
import com.sofka.AcademiaIngles.estudiante.value.ClasePresencialId;
import com.sofka.AcademiaIngles.estudiante.value.ClaseVirtualId;
import com.sofka.AcademiaIngles.estudiante.value.EstudianteId;
import com.sofka.AcademiaIngles.estudiante.value.Horario;

public class ActualizarHorarioClasePresencial extends Command {

    private final EstudianteId estudianteId;
    private final ClasePresencialId clasePresencialId;
    private final Horario horario;

    public ActualizarHorarioClasePresencial(EstudianteId estudianteId, ClasePresencialId entityId, Horario horario) {
        this.estudianteId = estudianteId;
        this.clasePresencialId = entityId;
        this.horario = horario;
    }

    public EstudianteId getEstudianteId() {
        return estudianteId;
    }

    public ClasePresencialId getClasePresencialId() {
        return clasePresencialId;
    }

    public Horario getHorario() {
        return horario;
    }
}
