package com.sofka.AcademiaIngles.nivel.event;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.AcademiaIngles.nivel.value.CertificacionId;
import com.sofka.AcademiaIngles.nivel.value.Evaluacion;

public class EvaluacionCertificacionActualizada extends DomainEvent {

    private final CertificacionId certificacionId;
    private final Evaluacion evaluacion;

    public EvaluacionCertificacionActualizada(CertificacionId entityId, Evaluacion evaluacion){
        super("sofka.nivel.evaluacionCertificacionActualizada");
        this.certificacionId = entityId;
        this.evaluacion = evaluacion;
    }

    public CertificacionId getCertificacionId() {
        return certificacionId;
    }

    public Evaluacion getEvaluacion() {
        return evaluacion;
    }
}
