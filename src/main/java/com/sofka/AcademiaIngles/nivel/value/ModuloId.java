package com.sofka.AcademiaIngles.nivel.value;

import co.com.sofka.domain.generic.Identity;

public class ModuloId extends Identity {

    public ModuloId(){
    }

    public ModuloId(String id){
        super(id);
    }

    public static ModuloId of(String id){
        return new ModuloId(id);
    }
}
