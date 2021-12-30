package com.sofka.AcademiaIngles.nivel.command;

import co.com.sofka.domain.generic.Command;
import com.sofka.AcademiaIngles.nivel.value.ClaseEnVivo;
import com.sofka.AcademiaIngles.nivel.value.MetodologiaId;
import com.sofka.AcademiaIngles.nivel.value.NivelId;

public class ActualizarClaseEnVivoMetodologia extends Command {

    private final NivelId nivelId;
    private final MetodologiaId metodologiaId;
    private final ClaseEnVivo claseEnVivo;

    public ActualizarClaseEnVivoMetodologia(NivelId nivelId, MetodologiaId entityId, ClaseEnVivo claseEnVivo) {
        this.nivelId = nivelId;
        this.metodologiaId = entityId;
        this.claseEnVivo = claseEnVivo;
    }

    public NivelId getNivelId() {
        return nivelId;
    }

    public MetodologiaId getMetodologiaId() {
        return metodologiaId;
    }

    public ClaseEnVivo getClaseEnVivo() {
        return claseEnVivo;
    }
}
