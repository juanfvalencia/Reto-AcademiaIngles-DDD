package com.sofka.AcademiaIngles.nivel.event;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.AcademiaIngles.nivel.value.CertificacionId;
import com.sofka.AcademiaIngles.nivel.value.Evaluacion;
import com.sofka.AcademiaIngles.nivel.value.Puntaje;

public class CertificacionAgregada extends DomainEvent {

    private final CertificacionId certificacionId;
    private final Evaluacion evaluacion;
    private final Puntaje puntaje;

    public CertificacionAgregada(CertificacionId entityId, Evaluacion evaluacion, Puntaje puntaje){
        super("sofka.nivel.certificacionAgregada");
        this.certificacionId = entityId;
        this.evaluacion = evaluacion;
        this.puntaje = puntaje;
    }

    public CertificacionId getCertificacionId() {
        return certificacionId;
    }

    public Evaluacion getEvaluacion() {
        return evaluacion;
    }

    public Puntaje getPuntaje() {
        return puntaje;
    }
}
