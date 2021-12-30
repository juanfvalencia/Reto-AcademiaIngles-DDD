package com.sofka.AcademiaIngles.nivel;

import co.com.sofka.domain.generic.Entity;
import com.sofka.AcademiaIngles.nivel.value.*;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Metodologia extends Entity<MetodologiaId>{

    protected PodCast podCast;
    protected ClaseEnVivo claseEnVivo;
    protected VoiceChat voiceChat;
    protected Reto reto;

    public Metodologia(MetodologiaId entityId, PodCast podCast, ClaseEnVivo claseEnVivo, VoiceChat voiceChat, Reto reto) {
        super(entityId);
        this.podCast = Objects.requireNonNull(podCast);
        this.claseEnVivo = Objects.requireNonNull(claseEnVivo);
        this.voiceChat = Objects.requireNonNull(voiceChat);
        this.reto = Objects.requireNonNull(reto);
    }

    public void actualizarPodcast(PodCast podCast){
        Objects.requireNonNull(podCast);
        this.podCast = podCast;
    }

    public void actualizarLiveClass(ClaseEnVivo claseEnVivo){
        Objects.requireNonNull(claseEnVivo);
        this.claseEnVivo = claseEnVivo;
    }

    public void actualizarVoiceChat(VoiceChat voiceChat){
        Objects.requireNonNull(voiceChat);
        this.voiceChat = voiceChat;
    }

    public void actualizarReto(Reto reto){
        Objects.requireNonNull(reto);
        this.reto = reto;
    }

    public PodCast podCast(){
        return podCast;
    }

    public ClaseEnVivo claseEnVivo(){
        return claseEnVivo;
    }

    public VoiceChat voiceChat(){
        return voiceChat;
    }

    public Reto reto(){
        return reto;
    }
}
