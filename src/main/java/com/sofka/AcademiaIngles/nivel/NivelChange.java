package com.sofka.AcademiaIngles.nivel;

import co.com.sofka.domain.generic.EventChange;
import com.sofka.AcademiaIngles.nivel.event.*;


public class NivelChange extends EventChange {

    public NivelChange(Nivel nivel){

        apply((NivelCreado event) ->{
            nivel.estudianteId = event.getEstudianteId();
        });

        apply((MetodologiaAgregada event) ->{
            nivel.metodologia = new Metodologia(
                    event.getMetodologiaId(),
                    event.getPodCast(),
                    event.getClaseEnVivo(),
                    event.getVoiceChat(),
                    event.getReto()
            );
        });

        apply((ModuloAgregado event) ->{
            nivel.modulo = new Modulo(
                    event.getModuloId(),
                    event.getContenido(),
                    event.getTarea(),
                    event.getPractica()
            );
        });

        apply((CertificacionAgregada event) ->{
            nivel.certificacion = new Certificacion(
                    event.getCertificacionId(),
                    event.getEvaluacion(),
                    event.getPuntaje()
            );
        });

        apply((PodcastMetodologiaActualizado event) ->{
            nivel.metodologia.podCast = event.getPodCast();
        });

        apply((ClaseEnVivoMetodologiaActualizada event) ->{
            nivel.metodologia.claseEnVivo = event.getClaseEnVivo();
        });

        apply((VoiceChatMetodologiaActualizado event) ->{
            nivel.metodologia.voiceChat = event.getVoiceChat();
        });

        apply((RetoMetodologiaActualizado event) ->{
            nivel.metodologia.reto = event.getReto();
        });

        apply((ContenidoModuloActualizado event) ->{
            nivel.modulo.contenido = event.getContenido();
        });

        apply((TareaModuloActualizada event) ->{
            nivel.modulo.tarea = event.getTarea();
        });

        apply((PracticaModuloActualizada event) ->{
            nivel.modulo.practica = event.getPractica();
        });

        apply((EvaluacionCertificacionActualizada event) ->{
            nivel.certificacion.evaluacion = event.getEvaluacion();
        });

    }
}
