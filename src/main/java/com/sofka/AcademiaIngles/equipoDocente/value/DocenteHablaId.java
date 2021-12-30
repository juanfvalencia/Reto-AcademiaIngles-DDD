package com.sofka.AcademiaIngles.equipoDocente.value;

import co.com.sofka.domain.generic.Identity;

public class DocenteHablaId extends Identity {

    public DocenteHablaId(){
    }

    public DocenteHablaId(String id){
        super(id);
    }

    public static DocenteHablaId of(String id){
        return new DocenteHablaId(id);
    }
}
