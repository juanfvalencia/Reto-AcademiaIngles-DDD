package com.sofka.AcademiaIngles.nivel.command;

import co.com.sofka.domain.generic.Command;
import com.sofka.AcademiaIngles.nivel.value.MetodologiaId;
import com.sofka.AcademiaIngles.nivel.value.NivelId;
import com.sofka.AcademiaIngles.nivel.value.VoiceChat;

public class ActualizarVoiceChatMetodologia extends Command {

    private final NivelId nivelId;
    private final MetodologiaId metodologiaId;
    private final VoiceChat voiceChat;

    public ActualizarVoiceChatMetodologia(NivelId nivelId, MetodologiaId entityId, VoiceChat voiceChat) {
        this.nivelId = nivelId;
        this.metodologiaId = entityId;
        this.voiceChat = voiceChat;
    }

    public NivelId getNivelId() {
        return nivelId;
    }

    public MetodologiaId getMetodologiaId() {
        return metodologiaId;
    }

    public VoiceChat getVoiceChat() {
        return voiceChat;
    }
}
