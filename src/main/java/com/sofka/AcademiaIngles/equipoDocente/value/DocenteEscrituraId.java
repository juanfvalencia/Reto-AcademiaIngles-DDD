package com.sofka.AcademiaIngles.equipoDocente.value;

import co.com.sofka.domain.generic.Identity;

public class DocenteEscrituraId extends Identity {

    public DocenteEscrituraId(){
    }

    public DocenteEscrituraId(String id){
        super(id);
    }

    public static DocenteEscrituraId of(String id){
        return new DocenteEscrituraId(id);
    }
}
