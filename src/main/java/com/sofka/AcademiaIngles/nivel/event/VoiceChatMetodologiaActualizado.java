package com.sofka.AcademiaIngles.nivel.event;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.AcademiaIngles.nivel.value.MetodologiaId;
import com.sofka.AcademiaIngles.nivel.value.VoiceChat;

public class VoiceChatMetodologiaActualizado extends DomainEvent {

    private final MetodologiaId metodologiaId;
    private final VoiceChat voiceChat;

    public VoiceChatMetodologiaActualizado(MetodologiaId entityId, VoiceChat voiceChat){
        super("sofka.nivel.voiceChatMetodologiaActualizado");
        this.metodologiaId = entityId;
        this.voiceChat = voiceChat;
    }

    public MetodologiaId getMetodologiaId() {
        return metodologiaId;
    }

    public VoiceChat getVoiceChat() {
        return voiceChat;
    }
}
