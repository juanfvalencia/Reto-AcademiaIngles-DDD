package com.sofka.AcademiaIngles.nivel;

import co.com.sofka.domain.generic.Entity;
import com.sofka.AcademiaIngles.nivel.value.CertificacionId;
import com.sofka.AcademiaIngles.nivel.value.Evaluacion;
import com.sofka.AcademiaIngles.nivel.value.Puntaje;

import java.util.Objects;

public class Certificacion extends Entity<CertificacionId> {

    protected Evaluacion evaluacion;
    protected Puntaje puntaje;

    public Certificacion(CertificacionId entityId, Evaluacion evaluacion, Puntaje puntaje) {
        super(entityId);
        this.evaluacion = Objects.requireNonNull(evaluacion);
        this.puntaje = Objects.requireNonNull(puntaje);
    }

    public void actualizarEvaluacion(Evaluacion evaluacion){
        Objects.requireNonNull(evaluacion);
        this.evaluacion = evaluacion;
    }

    public Evaluacion evaluacion(){
        return evaluacion;
    }

    public Puntaje puntaje(){
        return puntaje;
    }
}
