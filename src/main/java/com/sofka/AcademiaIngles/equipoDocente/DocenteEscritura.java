package com.sofka.AcademiaIngles.equipoDocente;

import co.com.sofka.domain.generic.Entity;
import com.sofka.AcademiaIngles.equipoDocente.value.DocenteEscrituraId;
import com.sofka.AcademiaIngles.generics.Email;
import com.sofka.AcademiaIngles.generics.Nombre;

import java.util.Objects;

public class DocenteEscritura extends Entity<DocenteEscrituraId> {

    protected Nombre nombre;
    protected Email email;

    public DocenteEscritura(DocenteEscrituraId entityId, Nombre nombre, Email email) {
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
