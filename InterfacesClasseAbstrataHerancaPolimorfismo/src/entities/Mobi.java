package entities;

import application.Carro;

public class Mobi implements Carro {

    @Override
    public void acelerar() {
        System.out.println("Acelerando a 130Km");
    }

    @Override
    public void freiar() {

    }

    @Override
    public void parar() {

    }
}