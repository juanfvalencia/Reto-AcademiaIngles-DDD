package com.sofka.AcademiaIngles.equipoDocente;

import co.com.sofka.domain.generic.Entity;
import com.sofka.AcademiaIngles.equipoDocente.value.DocenteEscrituraId;
import com.sofka.AcademiaIngles.equipoDocente.value.DocenteEscuchaId;
import com.sofka.AcademiaIngles.generics.Email;
import com.sofka.AcademiaIngles.generics.Nombre;

import java.util.Objects;

public class DocenteEscucha extends Entity<DocenteEscuchaId> {

    protected Nombre nombre;
    protected Email email;

    public DocenteEscucha(DocenteEscuchaId entityId, Nombre nombre, Email email) {
        super(entityId);
        this.nombre = Objects.requireNonNull(nombre);
        this.email = Objects.requireNonNull(email);
    }

    public void actualizarEmail(Email email){
        Objects.requireNonNull(email);
        this.email = email;
    }

    public Nombre nombre(){
        return nombre;
    }

    public Email email(){
        return email;
    }
}
