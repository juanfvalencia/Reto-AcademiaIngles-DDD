package com.sofka.AcademiaIngles.nivel.command;

import co.com.sofka.domain.generic.Command;
import com.sofka.AcademiaIngles.nivel.value.ModuloId;
import com.sofka.AcademiaIngles.nivel.value.NivelId;
import com.sofka.AcademiaIngles.nivel.value.Tarea;

public class ActualizarTareaModulo extends Command {

    private final NivelId nivelId;
    private final ModuloId moduloId;
    private final Tarea tarea;

    public ActualizarTareaModulo(NivelId nivelId, ModuloId entityId, Tarea tarea) {
        this.nivelId = nivelId;
        this.moduloId = entityId;
        this.tarea = tarea;
    }

    public NivelId getNivelId() {
        return nivelId;
    }

    public ModuloId getModuloId() {
        return moduloId;
    }

    public Tarea getTarea() {
        return tarea;
    }
}
