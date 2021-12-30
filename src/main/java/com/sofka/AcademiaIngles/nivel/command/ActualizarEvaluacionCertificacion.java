package com.sofka.AcademiaIngles.nivel.command;

import co.com.sofka.domain.generic.Command;
import com.sofka.AcademiaIngles.nivel.value.CertificacionId;
import com.sofka.AcademiaIngles.nivel.value.Evaluacion;
import com.sofka.AcademiaIngles.nivel.value.NivelId;

public class ActualizarEvaluacionCertificacion extends Command {

    private final NivelId nivelId;
    private final CertificacionId certificacionId;
    private final Evaluacion evaluacion;

    public ActualizarEvaluacionCertificacion(NivelId nivelId, CertificacionId entityId, Evaluacion evaluacion) {
        this.nivelId = nivelId;
        this.certificacionId = entityId;
        this.evaluacion = evaluacion;
    }

    public NivelId getNivelId() {
        return nivelId;
    }

    public CertificacionId getCertificacionId() {
        return certificacionId;
    }

    public Evaluacion getEvaluacion() {
        return evaluacion;
    }
}
