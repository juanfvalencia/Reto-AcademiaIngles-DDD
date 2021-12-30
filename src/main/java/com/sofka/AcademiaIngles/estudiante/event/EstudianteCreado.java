package com.sofka.AcademiaIngles.estudiante.event;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.AcademiaIngles.estudiante.value.EstudianteId;
import com.sofka.AcademiaIngles.generics.Email;
import com.sofka.AcademiaIngles.generics.Nombre;
import com.sofka.AcademiaIngles.nivel.value.NivelId;

public class EstudianteCreado extends DomainEvent {

    private final EstudianteId estudianteId;
    private final NivelId nivelId;
    private final Nombre nombre;
    private final Email email;

    public EstudianteCreado(EstudianteId estudianteId, NivelId entityId, Nombre nombre, Email email){
        super("sofka.estudiante.estudianteCreado");
        this.estudianteId = estudianteId;
        this.nivelId = entityId;
        this.nombre = nombre;
        this.email = email;
    }

    public EstudianteId getEstudianteId() {
        return estudianteId;
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
