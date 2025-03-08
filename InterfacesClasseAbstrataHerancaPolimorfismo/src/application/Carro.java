package application;

//Interface: É o modelo que vai definir um padrão em que as classes devem seguir.
public interface Carro {
    void acelerar();

    void freiar();

    void parar();
}
/*
. Interface não se tem implementação;
. Dentro da interface, focamos em colocar métodos;
. Uma classe pode implementar uma interface;
. Assinatura: quando só colocamos a 'carcaça' de um método sem dar funcionalidade a ele por um momento.
. Criar a classe que se relacione com uma interface Ex:
    A classe 'Sandero' será conectada a interface 'Carro' (public class Sandero implements Carro) e caso esteja em
    outro pacote, chamá-lo: import application.Carro
. Interface NÃO pode ser instanciada, pois ela só possui 'modelos' do que uma classe deverá possuir.
*/