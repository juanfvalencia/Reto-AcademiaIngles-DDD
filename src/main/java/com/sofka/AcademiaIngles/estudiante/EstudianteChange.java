package com.sofka.AcademiaIngles.estudiante;

import co.com.sofka.domain.generic.EventChange;
import com.sofka.AcademiaIngles.estudiante.event.*;

public class EstudianteChange extends EventChange {

    public EstudianteChange(Estudiante estudiante){

        apply((EstudianteCreado event) ->{
            estudiante.nivelId = event.getNivelId();
            estudiante.nombre = event.getNombre();
            estudiante.email = event.getEmail();
        });

        apply((ClasePresencialAgregada event) ->{
            estudiante.clasePresencial = new ClasePresencial(
                    event.getClasePresencialId(),
                    event.getSede(),
                    event.getFecha(),
                    event.getHorario());
        });

        apply((ClaseVirtualAgregada event) ->{
            estudiante.claseVirtual = new ClaseVirtual(
                    event.getClaseVirtualId(),
                    event.getHorario());
        });

        apply((FechaClasePresencialActualizada event) ->{
            estudiante.clasePresencial.fecha = event.getFecha();
        });

        apply((HorarioClasePresencialActualizado event) ->{
            estudiante.clasePresencial.horario = event.getHorario();
        });

        apply((HorarioClaseVirtualActualizado event) ->{
            estudiante.claseVirtual.horario = event.getHorario();
        });

        apply((SedeClasePresencialActualizada event) ->{
            estudiante.clasePresencial.sede = event.getSede();
        });
    }
}
