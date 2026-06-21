package model.exceptions;
//RuntimeException - quando não é obrigado a tratar, diferente da Exception que possui essa obrigação.

public class DomainException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public DomainException(String msg) {
        super(msg);
    }
}
