package com.sofka.AcademiaIngles.nivel.event;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.AcademiaIngles.estudiante.value.EstudianteId;
import com.sofka.AcademiaIngles.nivel.value.NivelId;

public class NivelCreado extends DomainEvent {

    private final NivelId nivelId;
    private final EstudianteId estudianteId;

    public NivelCreado(NivelId entityId, EstudianteId estudianteId){
        super("sofka.nivel.nivelCreado");
        this.nivelId = entityId;
        this.estudianteId =  estudianteId;
    }

    public NivelId getNivelId() {
        return nivelId;
    }

    public EstudianteId getEstudianteId() {
        return estudianteId;
    }
}
