package com.sofka.AcademiaIngles.nivel.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class VoiceChat implements ValueObject<String> {

    private final String value;

    public VoiceChat(String value) {
        this.value = value;
        if(this.value.isBlank()){
            throw new IllegalArgumentException("El VoiceChat no puede estar vacío");
        }
        if(this.value.length()<3){
            throw new IllegalArgumentException("El nombre del VoiceChat no puede tener menos de tres caracteres");
        }
        if(this.value.length()>30){
            throw new IllegalArgumentException("El nombre del VoiceChat no puede tener mas de treinta caracteres");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VoiceChat voiceChat = (VoiceChat) o;
        return Objects.equals(value, voiceChat.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String value(){
        return value;
    }
}
