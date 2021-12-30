package com.sofka.AcademiaIngles.estudiante.value;

import co.com.sofka.domain.generic.ValueObject;

import java.time.LocalTime;
import java.util.Objects;

public class Horario implements ValueObject<Horario.Properties> {

    private final LocalTime horaInicio;
    private final LocalTime horaFinal;

    public Horario(String horaInicio, String horaFinal) {
        this.horaInicio = Objects.requireNonNull(LocalTime.parse(horaInicio), "HoraInicio null");
        this.horaFinal = Objects.requireNonNull(LocalTime.parse(horaFinal), "Horafinal null");
        if (this.horaInicio.isAfter(this.horaFinal)) {
            throw new IllegalArgumentException("Horario invalido");
        }
    }

    @Override
    public Properties value() {
        return new Properties() {
            @Override
            public LocalTime horaInicio() {
                return horaInicio;
            }

            @Override
            public LocalTime horaFinal() {
                return horaFinal;
            }
        };
    }


    public interface Properties {
        LocalTime horaInicio();
        LocalTime horaFinal();
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public LocalTime getHoraFinal() {
        return horaFinal;
    }
}
