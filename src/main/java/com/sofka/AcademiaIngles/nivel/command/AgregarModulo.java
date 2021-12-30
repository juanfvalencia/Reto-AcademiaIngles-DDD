package com.sofka.AcademiaIngles.nivel.command;

import co.com.sofka.domain.generic.Command;
import com.sofka.AcademiaIngles.nivel.value.*;

public class AgregarModulo extends Command {

    private final NivelId nivelId;
    private final ModuloId moduloId;
    private final Contenido contenido;
    private final Tarea tarea;
    private final Practica practica;

    public AgregarModulo(NivelId nivelId, ModuloId entityId, Contenido contenido, Tarea tarea, Practica practica) {
        this.nivelId = nivelId;
        this.moduloId = entityId;
        this.contenido = contenido;
        this.tarea = tarea;
        this.practica = practica;
    }

    public NivelId getNivelId() {
        return nivelId;
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
