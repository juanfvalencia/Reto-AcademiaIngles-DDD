package com.sofka.AcademiaIngles.nivel.command;

import co.com.sofka.domain.generic.Command;
import com.sofka.AcademiaIngles.nivel.value.MetodologiaId;
import com.sofka.AcademiaIngles.nivel.value.NivelId;
import com.sofka.AcademiaIngles.nivel.value.Reto;

public class ActualizarRetoMetodologia extends Command {

    private final NivelId nivelId;
    private final MetodologiaId metodologiaId;
    private final Reto reto;

    public ActualizarRetoMetodologia(NivelId nivelId, MetodologiaId entityId, Reto reto) {
        this.nivelId = nivelId;
        this.metodologiaId = entityId;
        this.reto = reto;
    }

    public NivelId getNivelId() {
        return nivelId;
    }

    public MetodologiaId getMetodologiaId() {
        return metodologiaId;
    }

    public Reto getReto() {
        return reto;
    }
}
