package com.sofka.AcademiaIngles.equipoDocente;

import co.com.sofka.domain.generic.EventChange;
import com.sofka.AcademiaIngles.equipoDocente.event.*;

public class EquipoDocenteChange extends EventChange {

    public EquipoDocenteChange(EquipoDocente equipoDocente){

        apply((EquipoDocenteCreado event) ->{
            equipoDocente.tipoEquipo = event.getTipoEquipo();
        });

        apply((DocenteEscrituraAgregado event)->{
           equipoDocente.docenteEscritura = new DocenteEscritura(
                   event.getDocenteEscrituraId(),
                   event.getNombre(),
                   event.getEmail()
           );
        });

        apply((DocenteEscuchaAgregado event)->{
            equipoDocente.docenteEscucha = new DocenteEscucha(
                    event.getDocenteEscuchaId(),
                    event.getNombre(),
                    event.getEmail()
            );
        });

        apply((DocenteHablaAgregado event)->{
            equipoDocente.docenteHabla = new DocenteHabla(
                    event.getDocenteHablaId(),
                    event.getNombre(),
                    event.getEmail()
            );
        });

        apply((DocenteHablaAgregado event)->{
            equipoDocente.docenteHabla = new DocenteHabla(
                    event.getDocenteHablaId(),
                    event.getNombre(),
                    event.getEmail()
            );
        });

        apply((DocenteLecturaAgregado event)->{
            equipoDocente.docenteLectura = new DocenteLectura(
                    event.getDocenteLecturaId(),
                    event.getNombre(),
                    event.getEmail()
            );
        });

        apply((EmailDocenteEscrituraActualizado event)->{
            equipoDocente.docenteEscritura.email = event.getEmail();
        });

        apply((EmailDocenteEscuchaActualizado event)->{
            equipoDocente.docenteEscucha.email = event.getEmail();
        });

        apply((EmailDocenteHablaActualizado event)->{
            equipoDocente.docenteHabla.email = event.getEmail();
        });

        apply((EmailDocenteLecturaActualizado event)->{
            equipoDocente.docenteLectura.email = event.getEmail();
        });
    }
}
