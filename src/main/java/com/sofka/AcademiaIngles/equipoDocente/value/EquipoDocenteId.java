package com.sofka.AcademiaIngles.equipoDocente.value;

import co.com.sofka.domain.generic.Identity;

public class EquipoDocenteId extends Identity {

    public EquipoDocenteId(){
    }

    public EquipoDocenteId(String id){
        super(id);
    }

    public static EquipoDocenteId of(String id){
        return new EquipoDocenteId(id);
    }
}
