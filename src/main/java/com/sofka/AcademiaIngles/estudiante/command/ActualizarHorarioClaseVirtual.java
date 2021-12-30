package com.sofka.AcademiaIngles.estudiante.command;

import co.com.sofka.domain.generic.Command;
import com.sofka.AcademiaIngles.estudiante.value.ClaseVirtualId;
import com.sofka.AcademiaIngles.estudiante.value.EstudianteId;
import com.sofka.AcademiaIngles.estudiante.value.Horario;

public class ActualizarHorarioClaseVirtual extends Command {

    private final EstudianteId estudianteId;
    private final ClaseVirtualId claseVirtualId;
    private final Horario horario;

    public ActualizarHorarioClaseVirtual(EstudianteId estudianteId, ClaseVirtualId entityId, Horario horario) {
        this.estudianteId = estudianteId;
        this.claseVirtualId = entityId;
        this.horario = horario;
    }

    public EstudianteId getEstudianteId() {
        return estudianteId;
    }

    public ClaseVirtualId getClaseVirtualId() {
        return claseVirtualId;
    }

    public Horario getHorario() {
        return horario;
    }
}
