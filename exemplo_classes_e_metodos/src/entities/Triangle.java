// Triangulo é uma entidade de nosso pacote.
package entities;

//Triangullo será um tipo de dado que será Composto por 3 atributos.
public class Triangle {
    public double a;
    public double b;
    public double c;

    //'Public': indica que o atributo ou método pode ser usado em outros arquivos.
    //'double': será o tipo de dado que o método retornará (caso não retorne nada, a palavra será 'void')
    public double area() {
        double p = (a + b + c) / 2.0;
        double resultado = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return resultado;
    }
}
