package com.sofka.AcademiaIngles.estudiante.value;


import co.com.sofka.domain.generic.Identity;

public class ClasePresencialId extends Identity {

    public ClasePresencialId(){
    }

    public ClasePresencialId(String id){
        super(id);
    }

    public static ClasePresencialId of(String id){
        return new ClasePresencialId(id);
    }
}
