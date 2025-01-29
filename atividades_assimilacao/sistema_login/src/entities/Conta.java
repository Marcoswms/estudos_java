package entities;

public class Conta {
    protected String usuario;
    protected String senha;
    public String mensagem;

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getSenha() {
        return senha;
    }

    public String validaDados(String usuario, String senha) {
        if (usuario != getUsuario() && senha != getSenha()) {
            return mensagem = "Usuário ou senha incorretos!!";

        } else return mensagem = "Logado com sucesso!!";
    }

    public String toString() {
        return mensagem;
    }
}