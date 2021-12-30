package com.sofka.AcademiaIngles.nivel.event;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.AcademiaIngles.nivel.value.ModuloId;
import com.sofka.AcademiaIngles.nivel.value.Tarea;

public class TareaModuloActualizada extends DomainEvent {

    private final ModuloId moduloId;
    private final Tarea tarea;

    public TareaModuloActualizada(ModuloId entityId, Tarea tarea){
        super("sofka.nivel.tareaModuloActualizada");
        this.moduloId = entityId;
        this.tarea = tarea;
    }

    public ModuloId getModuloId() {
        return moduloId;
    }

    public Tarea getTarea() {
        return tarea;
    }
}
