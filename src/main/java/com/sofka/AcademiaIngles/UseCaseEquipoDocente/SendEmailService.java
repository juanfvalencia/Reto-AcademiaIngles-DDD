package com.sofka.AcademiaIngles.UseCaseEquipoDocente;

import com.sofka.AcademiaIngles.equipoDocente.value.EquipoDocenteId;

public interface SendEmailService {

    boolean send(EquipoDocenteId equipoDocenteId, String email, String body);
}
