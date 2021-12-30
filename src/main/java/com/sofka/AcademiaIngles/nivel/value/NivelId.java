package com.sofka.AcademiaIngles.nivel.value;

import co.com.sofka.domain.generic.Identity;

public class NivelId extends Identity {

    public NivelId(){

    }

    public NivelId(String id){
        super(id);
    }

    public static NivelId of(String id){
        return new NivelId(id);
    }
}
