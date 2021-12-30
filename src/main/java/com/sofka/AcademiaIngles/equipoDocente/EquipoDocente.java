package com.sofka.AcademiaIngles.equipoDocente;

import co.com.sofka.domain.generic.AggregateEvent;
import com.sofka.AcademiaIngles.equipoDocente.value.EquipoDocenteId;
import com.sofka.AcademiaIngles.estudiante.value.EstudianteId;

public class EquipoDocente extends AggregateEvent<EquipoDocenteId> {

    protected EstudianteId estudianteId;
    protected DocenteEscritura docenteEscritura;
    protected DocenteEscucha docenteEscucha;
    protected DocenteHabla docenteHabla;
    protected DocenteLectura docenteLectura;

    public EquipoDocente(EquipoDocenteId entityId, EstudianteId estudianteId, DocenteEscritura docenteEscritura, DocenteEscucha docenteEscucha, DocenteHabla docenteHabla, DocenteLectura docenteLectura) {
        super(entityId);
        this.estudianteId = estudianteId;
        this.docenteEscritura = docenteEscritura;
        this.docenteEscucha = docenteEscucha;
        this.docenteHabla = docenteHabla;
        this.docenteLectura = docenteLectura;
    }
}
