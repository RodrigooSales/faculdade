package autenticar;

public abstract class Usuario implements Autenticavel{
    protected String login;
    protected String senha;
    protected String role;

    public Usuario(String login, String senha, String role) {
        this.login = login;
        this.senha = senha;
        this.role = role;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String autenticar(String senha) {
        if(this.senha.equals(senha)){
            return "200";
        } else {
            return "400";
        }
    }
}
