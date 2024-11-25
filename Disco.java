import java.util.ArrayList;
import java.util.List;

public class Disco {
    private String titulo;
    private int ano;
    private List<Faixa> faixas;

    public Disco(String titulo, int ano) {
        this.titulo = titulo;
        this.ano = ano;
        this.faixas = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAno() {
        return ano;
    }

    public List<Faixa> getFaixas() {
        return faixas;
    }

    public void adicionarFaixa(Faixa faixa) {
        faixas.add(faixa);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Disco: ").append(titulo).append(" (").append(ano).append(")\n");
        sb.append("Faixas:\n");
        for (Faixa faixa : faixas) {
            sb.append("  - ").append(faixa).append("\n");
        }
        return sb.toString();
    }
}
