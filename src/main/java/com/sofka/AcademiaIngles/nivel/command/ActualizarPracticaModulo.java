package com.sofka.AcademiaIngles.nivel.command;

import co.com.sofka.domain.generic.Command;
import com.sofka.AcademiaIngles.nivel.value.ModuloId;
import com.sofka.AcademiaIngles.nivel.value.NivelId;
import com.sofka.AcademiaIngles.nivel.value.Practica;

public class ActualizarPracticaModulo extends Command {

    private final NivelId nivelId;
    private final ModuloId moduloId;
    private final Practica practica;

    public ActualizarPracticaModulo(NivelId nivelId, ModuloId entityId, Practica practica) {
        this.nivelId = nivelId;
        this.moduloId = entityId;
        this.practica = practica;
    }

    public NivelId getNivelId() {
        return nivelId;
    }

    public ModuloId getModuloId() {
        return moduloId;
    }

    public Practica getPractica() {
        return practica;
    }
}
