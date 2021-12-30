package com.sofka.AcademiaIngles.nivel.event;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.AcademiaIngles.nivel.value.MetodologiaId;
import com.sofka.AcademiaIngles.nivel.value.Reto;

public class RetoMetodologiaActualizado extends DomainEvent {

    private final MetodologiaId metodologiaId;
    private final Reto reto;

    public RetoMetodologiaActualizado(MetodologiaId entityId, Reto reto){
        super("sofka.nivel.retoMetodologiaActualizado");
        this.metodologiaId = entityId;
        this.reto = reto;
    }

    public MetodologiaId getMetodologiaId() {
        return metodologiaId;
    }

    public Reto getReto() {
        return reto;
    }
}
