package com.sofka.AcademiaIngles.UseCaseEquipoDocente;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.sofka.AcademiaIngles.equipoDocente.EquipoDocente;
import com.sofka.AcademiaIngles.equipoDocente.command.AgregarDocenteEscritura;
import com.sofka.AcademiaIngles.equipoDocente.command.AgregarDocenteLectura;

public class AgregarDocenteLecturaUseCase extends UseCase<RequestCommand<AgregarDocenteLectura>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<AgregarDocenteLectura> agregarDocenteLecturaRequestCommand){
        var command = agregarDocenteLecturaRequestCommand.getCommand();

        EquipoDocente equipoDocente;

        equipoDocente = EquipoDocente.from(command.getEquipoDocenteId(),
                retrieveEvents());

        equipoDocente.agregarDocenteLectura(
                command.getNombre(),
                command.getEmail()
        );

        emit().onResponse(new ResponseEvents(equipoDocente.getUncommittedChanges()));
    }
}
