package com.sofka.AcademiaIngles.estudiante.value;


import co.com.sofka.domain.generic.Identity;

public class ClasePresencialPorDiaId extends Identity {

    public ClasePresencialPorDiaId(){
    }

    public ClasePresencialPorDiaId(String id){
        super(id);
    }

    public static ClasePresencialPorDiaId of(String id){
        return new ClasePresencialPorDiaId(id);
    }
}
