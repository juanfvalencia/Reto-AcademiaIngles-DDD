package com.sofka.AcademiaIngles.equipoDocente.value;

import co.com.sofka.domain.generic.Identity;

public class DocenteLecturaId extends Identity {

    public DocenteLecturaId(){
    }

    public DocenteLecturaId(String id){
        super(id);
    }

    public static DocenteLecturaId of(String id){
        return new DocenteLecturaId(id);
    }
}
