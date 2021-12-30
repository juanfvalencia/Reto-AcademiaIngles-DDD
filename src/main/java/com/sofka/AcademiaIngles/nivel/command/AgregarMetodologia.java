package com.sofka.AcademiaIngles.nivel.command;

import co.com.sofka.domain.generic.Command;
import com.sofka.AcademiaIngles.nivel.value.*;

public class AgregarMetodologia extends Command {

    private final NivelId nivelId;
    private final MetodologiaId metodologiaId;
    private final PodCast podCast;
    private final VoiceChat voiceChat;
    private final ClaseEnVivo claseEnVivo;
    private final Reto reto;

    public AgregarMetodologia(NivelId nivelId, MetodologiaId entityId, PodCast podCast, VoiceChat voiceChat, ClaseEnVivo claseEnVivo, Reto reto) {
        this.nivelId = nivelId;
        this.metodologiaId = entityId;
        this.podCast = podCast;
        this.voiceChat = voiceChat;
        this.claseEnVivo = claseEnVivo;
        this.reto = reto;
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

    public VoiceChat getVoiceChat() {
        return voiceChat;
    }

    public ClaseEnVivo getClaseEnVivo() {
        return claseEnVivo;
    }

    public Reto getReto() {
        return reto;
    }
}
