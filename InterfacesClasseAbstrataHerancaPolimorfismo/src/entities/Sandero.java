package entities;

import application.Carro;

/*
. Criar a classe que se relacione com uma interface Ex:
   A classe 'Sandero' será conectada a interface 'Carro' (public class Sandero implements Carro) e caso esteja em
   outro pacote, chamá-lo: import application.Carro

. Polimorfismo: Quando objetos do mesmo tipo, sendo chamados dos mesmos métodos podem se comportar de formas diferentes.
  Ex: o Sandero acelera a 150Km enquanto o Mobi somente a 130Km, mas ambos possuem a mesma interface.
*/
public class Sandero implements Carro {
    //'Final' - Variável que seu valor não pode ser alterado.
    final int limiteDeVelocidade = 150;
    public int velocidadeAtual = 0;

    @Override
    public void acelerar() {//Aplicando Polimorfismo e chamando o método no Objeto 'meuCarro'
        if (this.velocidadeAtual < this.limiteDeVelocidade) {
            this.velocidadeAtual += 10;
            System.out.println("Acelerando");
        }
        System.out.println("Velocidade atual: " + this.velocidadeAtual);
    }

    @Override
    public void freiar() {
        System.out.println("Acelerando a 50Km");
    }

    @Override
    public void parar() {
        System.out.println("Acelerando a 50Km");
    }
}