package DesenAgenciaTelefonica;

public class ContatoPessoal extends Contato{
    private String dataNascimento;

    public ContatoPessoal(String nome, String numeroTelef, String dataNascimento) {
        super(nome, numeroTelef);
        this.dataNascimento = dataNascimento;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return super.toString() + ", Data de Nascimento: " + dataNascimento;
    }

}
