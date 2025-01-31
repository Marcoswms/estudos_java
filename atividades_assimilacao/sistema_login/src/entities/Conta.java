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

    public void validaDados(String usuario, String senha) {
        if (usuario.equals(this.usuario) && senha.equals(this.senha)) {
            mensagem = "Logado com sucesso!!";
        } else mensagem = "Usuário ou senha incorretos!!";
    }

    @Override //Identifica quando trata-se de uma sobrescrita (Método  herdado da classe Pai, neste caso 'Object')
    public String toString() {
        return mensagem;
    }
}