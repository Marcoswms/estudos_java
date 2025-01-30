package entities;

public class Conta {
    private String usuario;
    private String senha;
    protected String mensagem;

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
        if (usuario != this.usuario && senha != this.senha) {
            return mensagem = "Usuário ou senha incorretos!!";

        } else return mensagem = "Logado com sucesso!!";
    }

    public String toString() {
        return mensagem;
    }
}