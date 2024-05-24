package DesenAgenciaTelefonica;

public class Contato {
    private String nome;
    private String numeroTelef;

    public Contato(String nome, String numeroTelef) {
        this.nome = nome;
        this.numeroTelef = numeroTelef;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumeroTelef() {
        return numeroTelef;
    }

    public void setNumeroTelef(String numeroTelef) {
        this.numeroTelef = numeroTelef;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Número de Telefone: " + numeroTelef;
    }

}
