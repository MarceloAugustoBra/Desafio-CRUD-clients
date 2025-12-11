package com.MarceloAugustoBra.CRUD_clients.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String msg){
        super(msg);
    }
}
