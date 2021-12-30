package com.sofka.AcademiaIngles.nivel;

import co.com.sofka.domain.generic.Entity;
import com.sofka.AcademiaIngles.nivel.value.*;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Metodologia extends Entity<MetodologiaId>{

    protected Set<PodCast> podCasts;
    protected Set<ClaseEnVivo> claseEnVivos;
    protected VoiceChat voiceChat;
    protected Reto reto;

    public Metodologia(MetodologiaId entityId, VoiceChat voiceChat, Reto reto) {
        super(entityId);
        this.podCasts = new HashSet<>();
        this.claseEnVivos = new HashSet<>();
        this.voiceChat = Objects.requireNonNull(voiceChat);
        this.reto = Objects.requireNonNull(reto);
    }

    public void agregarPodcast(PodCast podCast){
        Objects.requireNonNull(podCast);
        this.podCasts.add(podCast);
    }

    public void agregarLiveClass(ClaseEnVivo claseEnVivo){
        Objects.requireNonNull(claseEnVivo);
        this.claseEnVivos.add(claseEnVivo);
    }

    public void actualizarVoiceChat(VoiceChat voiceChat){
        Objects.requireNonNull(voiceChat);
        this.voiceChat = voiceChat;
    }

    public void agregarReto(Reto reto){
        Objects.requireNonNull(reto);
        this.reto = reto;
    }

    public Set<PodCast> podCasts(){
        return podCasts;
    }

    public Set<ClaseEnVivo> claseEnVivos(){
        return claseEnVivos;
    }

    public VoiceChat voiceChat(){
        return voiceChat;
    }

    public Reto reto(){
        return reto;
    }
}
