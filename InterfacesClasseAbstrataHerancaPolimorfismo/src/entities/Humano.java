package entities;

//'Extends' trata-se de uma classe herdando as implementações de uma interface.
/* O método 'dormir' já está herdado, pois foi implementado na SuperClasse(Mãe).
 * O método 'respirar' não foi implementado na SuperClasse, por isso não foi herdado e precisou de uma implementação.
 */
public class Humano extends SerVivo {
    public Humano() {
        super(42);//Super - Chama o construtor da SuperClasse (Mãe) e passará esse valor para o parâmetro 'idade'
    }

    @Override
    public void respirar() {
        System.out.println(this.idade);//'idade' foi herdado, por isso temos acesso a este atributo
        System.out.println("Respirando...");
    }
}