package com.sofka.AcademiaIngles.nivel.event;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.AcademiaIngles.nivel.value.Contenido;
import com.sofka.AcademiaIngles.nivel.value.ModuloId;

public class ContenidoModuloActualizado extends DomainEvent {

    private final ModuloId moduloId;
    private final Contenido contenido;

    public ContenidoModuloActualizado(ModuloId entityId, Contenido contenido){
        super("sofka.nivel.contenidoModuloActualizado");
        this.moduloId = entityId;
        this.contenido = contenido;
    }

    public ModuloId getModuloId() {
        return moduloId;
    }

    public Contenido getContenido() {
        return contenido;
    }
}
