package com.sofka.AcademiaIngles.nivel.command;

import co.com.sofka.domain.generic.Command;
import com.sofka.AcademiaIngles.nivel.value.Contenido;
import com.sofka.AcademiaIngles.nivel.value.ModuloId;
import com.sofka.AcademiaIngles.nivel.value.NivelId;

public class ActualizarContenidoModulo extends Command {

    private final NivelId nivelId;
    private final ModuloId moduloId;
    private final Contenido contenido;

    public ActualizarContenidoModulo(NivelId nivelId, ModuloId entityId, Contenido contenido) {
        this.nivelId = nivelId;
        this.moduloId = entityId;
        this.contenido = contenido;
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
}
