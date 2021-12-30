package com.sofka.AcademiaIngles.nivel.event;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.AcademiaIngles.nivel.value.*;

public class MetodologiaAgregada extends DomainEvent {

    private final MetodologiaId metodologiaId;
    private final PodCast podCast;
    private final ClaseEnVivo claseEnVivo;
    private final VoiceChat voiceChat;
    private final Reto reto;

    public MetodologiaAgregada(MetodologiaId entityId, PodCast podCast, ClaseEnVivo claseEnVivo, VoiceChat voiceChat, Reto reto) {
        super("sofka.nivel.metodologiaAgregada");
        this.metodologiaId = entityId;
        this.podCast = podCast;
        this.claseEnVivo = claseEnVivo;
        this.voiceChat = voiceChat;
        this.reto = reto;
    }

    public MetodologiaId getMetodologiaId() {
        return metodologiaId;
    }

    public PodCast getPodCast() {
        return podCast;
    }

    public ClaseEnVivo getClaseEnVivo() {
        return claseEnVivo;
    }

    public VoiceChat getVoiceChat() {
        return voiceChat;
    }

    public Reto getReto() {
        return reto;
    }
}
