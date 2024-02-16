package com.example.APIRest.exceptions;

public abstract class EjemploException extends RuntimeException {
    public EjemploException(String mensaje) {
        super(mensaje);
    }
}
