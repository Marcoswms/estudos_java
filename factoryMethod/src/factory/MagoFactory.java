package factory;

import model.Avatar;
import model.AvatarMago;

public class MagoFactory extends AvatarFactory {

    public MagoFactory() {}

    @Override
    public Avatar criarAvatar(String classeDoAvatar, String nomeDoAvatar) {
        if ("Mago".equals(classeDoAvatar)) {
            Avatar mago = new AvatarMago();
            mago.setNome(nomeDoAvatar);
            return mago;
        } else return null;
    }
}