package application;

import entities.Humano;
import entities.Mobi;
import entities.Sandero;
import entities.SerVivo;

public class Main {
    public static void main(String[] args) {

        Carro meuCarro = new Sandero();
        Carro seuCarro = new Mobi();

        meuCarro.acelerar();
        seuCarro.acelerar();

        SerVivo meuSer = new Humano();
        meuSer.respirar();
        meuSer.dormir();

        meuCarro.acelerar();
        meuCarro.acelerar();
        meuCarro.acelerar();
        /*
         . Tratamento de Exception - Captura um possível erro e retorna um tratamento mais adequando para a situação.
         . Try - Adiciona o bloco de código / Catch (Nome da Exception exception) e no bloco de código a tratativa.
         */
        Carro meuCarroFurado = null;
        try {//caso aconteça algo dentro do bloco de código..
            meuCarroFurado.acelerar();
        } catch (NullPointerException exception) {//Capturar a exception e realizar uma tratativa para ela.
            System.out.println("meuCarroFurado está Nulo !\nObjeto vazio.");
        }
    }
}