package com.sofka.AcademiaIngles.UseCaseEquipoDocente;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.sofka.AcademiaIngles.equipoDocente.EquipoDocente;
import com.sofka.AcademiaIngles.equipoDocente.command.AgregarDocenteEscritura;
import com.sofka.AcademiaIngles.equipoDocente.command.AgregarDocenteEscucha;

public class AgregarDocenteEscuchaUseCase extends UseCase<RequestCommand<AgregarDocenteEscucha>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<AgregarDocenteEscucha> agregarDocenteEscuchaRequestCommand){
        var command = agregarDocenteEscuchaRequestCommand.getCommand();

        EquipoDocente equipoDocente;

        equipoDocente = EquipoDocente.from(command.getEquipoDocenteId(),
                retrieveEvents());

        equipoDocente.agregarDocenteEscucha(
                command.getNombre(),
                command.getEmail()
        );

        emit().onResponse(new ResponseEvents(equipoDocente.getUncommittedChanges()));
    }
}
