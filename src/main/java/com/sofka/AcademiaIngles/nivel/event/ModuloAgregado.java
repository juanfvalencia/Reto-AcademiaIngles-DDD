package com.sofka.AcademiaIngles.nivel.event;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.AcademiaIngles.nivel.value.Contenido;
import com.sofka.AcademiaIngles.nivel.value.ModuloId;
import com.sofka.AcademiaIngles.nivel.value.Practica;
import com.sofka.AcademiaIngles.nivel.value.Tarea;

public class ModuloAgregado extends DomainEvent {

    private final ModuloId moduloId;
    private final Contenido contenido;
    private final Tarea tarea;
    private final Practica practica;

    public ModuloAgregado(ModuloId entityId, Contenido contenido, Tarea tarea, Practica practica){
        super("sofka.nivel.moduloAgregado");
        this.moduloId = entityId;
        this.contenido = contenido;
        this.tarea = tarea;
        this.practica = practica;
    }

    public ModuloId getModuloId() {
        return moduloId;
    }

    public Contenido getContenido() {
        return contenido;
    }

    public Tarea getTarea() {
        return tarea;
    }

    public Practica getPractica() {
        return practica;
    }
}
