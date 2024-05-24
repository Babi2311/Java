package GerenDeTarefas;

public class Tarefa {
    private String descricao;
    private boolean concluida;
    private CategoriaTaref categoria;

    public Tarefa(String descricao, boolean concluida, CategoriaTaref categoria) {
        this.descricao = descricao;
        this.concluida = concluida;
        this.categoria = categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void marcarConcluida() {
        this.concluida = true;
    }

    public CategoriaTaref getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        String status = concluida ? "Concluída" : "Pendente";
        return "Descrição: " + descricao + ", Status: " + status + ", Categoria: " + categoria;
    }


}
