package com.sofka.AcademiaIngles.estudiante.command;

import co.com.sofka.domain.generic.Command;
import com.sofka.AcademiaIngles.estudiante.value.EstudianteId;
import com.sofka.AcademiaIngles.generics.Email;
import com.sofka.AcademiaIngles.generics.Nombre;
import com.sofka.AcademiaIngles.nivel.value.NivelId;

public class CrearEstudiante extends Command {

    private final EstudianteId entityId;
    private final NivelId nivelId;
    private final Nombre nombre;
    private final Email email;

    public CrearEstudiante(EstudianteId entityId, NivelId nivelId, Nombre nombre, Email email) {
        this.entityId = entityId;
        this.nivelId = nivelId;
        this.nombre = nombre;
        this.email = email;
    }

    public EstudianteId getEntityId() {
        return entityId;
    }

    public NivelId getNivelId() {
        return nivelId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Email getEmail() {
        return email;
    }
}
