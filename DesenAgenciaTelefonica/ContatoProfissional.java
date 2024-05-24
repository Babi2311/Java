package DesenAgenciaTelefonica;

public class ContatoProfissional extends Contato{
    private String email;

    public ContatoProfissional(String nome, String numeroTelef, String email) {
        super(nome, numeroTelef);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return super.toString() + ", E-mail: " + email;
    }

}
