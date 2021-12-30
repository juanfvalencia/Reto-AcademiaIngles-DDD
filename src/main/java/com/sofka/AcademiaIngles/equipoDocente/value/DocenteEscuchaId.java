package com.sofka.AcademiaIngles.equipoDocente.value;

import co.com.sofka.domain.generic.Identity;

public class DocenteEscuchaId extends Identity {

    public DocenteEscuchaId(){
    }

    public DocenteEscuchaId(String id){
        super(id);
    }

    public static DocenteEscuchaId of(String id){
        return new DocenteEscuchaId(id);
    }
}
