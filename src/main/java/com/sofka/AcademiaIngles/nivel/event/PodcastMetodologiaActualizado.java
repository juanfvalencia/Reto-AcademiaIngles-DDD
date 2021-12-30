package com.sofka.AcademiaIngles.nivel.event;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.AcademiaIngles.nivel.value.MetodologiaId;
import com.sofka.AcademiaIngles.nivel.value.PodCast;

public class PodcastMetodologiaActualizado extends DomainEvent {

    private final MetodologiaId metodologiaId;
    private final PodCast podCast;

    public PodcastMetodologiaActualizado(MetodologiaId entityId, PodCast podCast){
        super("sofka.nivel.podcastMetodologiaActualizado");
        this.metodologiaId = entityId;
        this.podCast =  podCast;
    }

    public MetodologiaId getMetodologiaId() {
        return metodologiaId;
    }

    public PodCast getPodCast() {
        return podCast;
    }
}
