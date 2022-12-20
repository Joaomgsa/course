package br.com.squad.course.services.exceptions;

public class ResourceNotfoundException extends RuntimeException{

    public static final long serialVersionUID = 1L;

    public ResourceNotfoundException(Object id) {
        super("Resource not found. Id : " + id);
    }
}
