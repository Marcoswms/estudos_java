package factory;

import model.Avatar;

public abstract class AvatarFactory {

    public AvatarFactory() {}

    public Avatar montarAvatar(String classeDoAvatar, String nomeDoAvatar) {

        Avatar prototipo = null;

        prototipo = criarAvatar(classeDoAvatar, nomeDoAvatar);
        prototipo.getNome();
        prototipo.barraDeVida();
        prototipo.barraDeVigor();
        prototipo.barraDeHabilidadeEspecial();
        prototipo.habilidadeEspecial();

        return prototipo;
    }

    protected abstract Avatar criarAvatar(String classeDoAvatar, String nomeDoAvatar);
}