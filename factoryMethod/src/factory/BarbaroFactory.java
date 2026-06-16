package factory;

import model.Avatar;
import model.AvatarBarbaro;

public class BarbaroFactory extends AvatarFactory {

    public BarbaroFactory() {
    }

    @Override
    protected Avatar criarAvatar(String classeDoAvatar, String nomeDoAvatar) {
        if ("Barbaro".equals(classeDoAvatar)) {
            Avatar barbaro = new AvatarBarbaro();
            barbaro.setNome(nomeDoAvatar);
            return barbaro;
        } else return null;
    }
}