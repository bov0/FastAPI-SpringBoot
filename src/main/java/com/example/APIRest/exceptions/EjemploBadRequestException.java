package com.example.APIRest.exceptions;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class EjemploBadRequestException extends EjemploException {
    public EjemploBadRequestException(String mensaje) {
        super(mensaje);
    }
}
