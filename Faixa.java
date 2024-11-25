public class Faixa {
    private String titulo;
    private int duracao; // Duração em minutos

    public Faixa(String titulo, int duracao) {
        this.titulo = titulo;
        this.duracao = duracao;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    @Override
    public String toString() {
        return titulo + " (" + duracao + " min)";
    }
}
