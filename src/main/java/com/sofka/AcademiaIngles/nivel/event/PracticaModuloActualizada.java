package com.sofka.AcademiaIngles.nivel.event;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.AcademiaIngles.nivel.value.ModuloId;
import com.sofka.AcademiaIngles.nivel.value.Practica;

public class PracticaModuloActualizada extends DomainEvent {

    private final ModuloId moduloId;
    private final Practica practica;

    public PracticaModuloActualizada(ModuloId entityId, Practica practica){
        super("sofka.nivel.practicaModuloActualizada");
        this.moduloId = entityId;
        this.practica = practica;
    }

    public ModuloId getModuloId() {
        return moduloId;
    }

    public Practica getPractica() {
        return practica;
    }
}
