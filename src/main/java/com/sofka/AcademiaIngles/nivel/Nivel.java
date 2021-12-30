package com.sofka.AcademiaIngles.nivel;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.AcademiaIngles.estudiante.value.EstudianteId;
import com.sofka.AcademiaIngles.nivel.event.*;
import com.sofka.AcademiaIngles.nivel.value.*;

import java.util.List;
import java.util.Objects;

public class Nivel extends AggregateEvent<NivelId> {

    protected EstudianteId estudianteId;
    protected Modulo modulo;
    protected Metodologia metodologia;
    protected Certificacion certificacion;

    public Nivel(NivelId entityId, EstudianteId estudianteId) {
        super(entityId);
        this.estudianteId = estudianteId;
        appendChange(new NivelCreado(entityId,estudianteId)).apply();
    }

    private Nivel(NivelId nivelId){
        super(nivelId);
        subscribe(new NivelChange(this));
    }

    public static Nivel from(NivelId nivelId, List<DomainEvent> events){
        var nivel = new Nivel(nivelId);
        events.forEach(nivel::applyEvent);
        return nivel;
    }

    public void agregarMetodologia(PodCast podCast, ClaseEnVivo claseEnVivo, VoiceChat voiceChat, Reto reto){
        var id = new MetodologiaId();
        Objects.requireNonNull(podCast);
        Objects.requireNonNull(claseEnVivo);
        Objects.requireNonNull(voiceChat);
        Objects.requireNonNull(reto);
        appendChange(new MetodologiaAgregada(id, podCast, claseEnVivo, voiceChat, reto)).apply();
    }

    public void agregarModulo(Contenido contenido, Tarea tarea, Practica practica){
        var id = new ModuloId();
        Objects.requireNonNull(contenido);
        Objects.requireNonNull(tarea);
        Objects.requireNonNull(practica);
        appendChange(new ModuloAgregado(id, contenido, tarea, practica)).apply();
    }

    public void agregarCertificacion(Evaluacion evaluacion, Puntaje puntaje){
        var id = new CertificacionId();
        Objects.requireNonNull(evaluacion);
        Objects.requireNonNull(puntaje);
        appendChange(new CertificacionAgregada(id, evaluacion, puntaje)).apply();
    }

    public void actualizarClaseEnVivoMetodologia(MetodologiaId entityId, ClaseEnVivo claseEnVivo){
        appendChange(new ClaseEnVivoMetodologiaActualizada(entityId, claseEnVivo)).apply();
    }

    public void actualizarPodCastMetodologia(MetodologiaId entityId, PodCast podCast ){
        appendChange(new PodcastMetodologiaActualizado(entityId, podCast)).apply();
    }

    public void actualizarRetoMetodologia(MetodologiaId entityId, Reto reto ){
        appendChange(new RetoMetodologiaActualizado(entityId, reto)).apply();
    }

    public void actualizarVoiceChatMetodologia(MetodologiaId entityId, VoiceChat voiceChat ){
        appendChange(new VoiceChatMetodologiaActualizado(entityId, voiceChat)).apply();
    }

    public void actualizarContenidoModulo(ModuloId entityId, Contenido contenido){
        appendChange(new ContenidoModuloActualizado(entityId, contenido)).apply();
    }

    public void actualizarTareaModulo(ModuloId entityId, Tarea tarea){
        appendChange(new TareaModuloActualizada(entityId, tarea)).apply();
    }

    public void actualizarPracticaModulo(ModuloId entityId, Practica practica){
        appendChange(new PracticaModuloActualizada(entityId, practica)).apply();
    }

    public void actualizarCertificacionEvaluacion(CertificacionId entityId, Evaluacion evaluacion){
        appendChange(new EvaluacionCertificacionActualizada(entityId, evaluacion)).apply();
    }

    public EstudianteId getEstudianteId() {
        return estudianteId;
    }

    public Modulo getModulo() {
        return modulo;
    }

    public Metodologia getMetodologia() {
        return metodologia;
    }

    public Certificacion getCertificacion() {
        return certificacion;
    }
}
