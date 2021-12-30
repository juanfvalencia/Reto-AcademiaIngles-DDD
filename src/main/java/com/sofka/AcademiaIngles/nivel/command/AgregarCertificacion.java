package com.sofka.AcademiaIngles.nivel.command;

import co.com.sofka.domain.generic.Command;
import com.sofka.AcademiaIngles.nivel.value.CertificacionId;
import com.sofka.AcademiaIngles.nivel.value.Evaluacion;
import com.sofka.AcademiaIngles.nivel.value.NivelId;
import com.sofka.AcademiaIngles.nivel.value.Puntaje;

public class AgregarCertificacion extends Command {

    private final NivelId nivelId;
    private final CertificacionId certificacionId;
    private final Evaluacion evaluacion;
    private final Puntaje puntaje;

    public AgregarCertificacion(NivelId nivelId, CertificacionId entityId, Evaluacion evaluacion, Puntaje puntaje) {
        this.nivelId = nivelId;
        this.certificacionId = entityId;
        this.evaluacion = evaluacion;
        this.puntaje = puntaje;
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

    public Puntaje getPuntaje() {
        return puntaje;
    }
}
