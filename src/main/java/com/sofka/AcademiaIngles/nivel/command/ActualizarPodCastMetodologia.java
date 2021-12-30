package com.sofka.AcademiaIngles.nivel.command;

import co.com.sofka.domain.generic.Command;
import com.sofka.AcademiaIngles.nivel.value.MetodologiaId;
import com.sofka.AcademiaIngles.nivel.value.NivelId;
import com.sofka.AcademiaIngles.nivel.value.PodCast;

public class ActualizarPodCastMetodologia extends Command {

    private final NivelId nivelId;
    private final MetodologiaId metodologiaId;
    private final PodCast podCast;

    public ActualizarPodCastMetodologia(NivelId nivelId, MetodologiaId entityId, PodCast podCast) {
        this.nivelId = nivelId;
        this.metodologiaId = entityId;
        this.podCast = podCast;
    }

    public NivelId getNivelId() {
        return nivelId;
    }

    public MetodologiaId getMetodologiaId() {
        return metodologiaId;
    }

    public PodCast getPodCast() {
        return podCast;
    }
}
