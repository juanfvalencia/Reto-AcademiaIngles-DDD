package com.sofka.AcademiaIngles.nivel.value;

import co.com.sofka.domain.generic.Identity;

public class MetodologiaId extends Identity {

    public MetodologiaId(){
    }

    public MetodologiaId(String id){
        super(id);
    }

    public static MetodologiaId of(String id){
        return new MetodologiaId(id);
    }
}
