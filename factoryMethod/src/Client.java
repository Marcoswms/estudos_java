import java.util.Scanner;
import factory.AvatarFactory;
import factory.BarbaroFactory;
import factory.MagoFactory;
import model.Avatar;

public class Client {
    public static void main(String[] args) {

        AvatarFactory avatarMago = new MagoFactory();
        AvatarFactory avatarBarbaro = new BarbaroFactory();

        System.out.println("Mago ou Barbaro\nEscolha seu Avatar:");
        Scanner scan = new Scanner(System.in);
        String recebeAvatar = scan.nextLine();

        if (!recebeAvatar.equals("Mago") && !recebeAvatar.equals("Barbaro")){
            System.out.println("Encontramos um problema com sua escolha!\nEncerrando...");
            System.exit(0);
        }

        System.out.println("O Avatar escolhido pertence a classe " + recebeAvatar + "\nAgora informe o nome:");
        String recebeNome = scan.nextLine();

        if (recebeAvatar.equals("Mago")){
            Avatar mago = avatarMago.montarAvatar(recebeAvatar, recebeNome);
            System.out.println(mago);
        } else if(recebeAvatar.equals("Barbaro")){
            Avatar barbaro = avatarBarbaro.montarAvatar(recebeAvatar, recebeNome);
            System.out.println(barbaro);
        }
        scan.close();
    }
}