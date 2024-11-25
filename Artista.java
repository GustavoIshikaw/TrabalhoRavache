import java.util.ArrayList;
import java.util.List;

public class Artista {
    private String nome;
    private String genero;
    private List<Disco> discos;

    public Artista(String nome, String genero) {
        this.nome = nome;
        this.genero = genero;
        this.discos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public List<Disco> getDiscos() {
        return discos;
    }

    public void adicionarDisco(Disco disco) {
        discos.add(disco);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Artista: ").append(nome).append(" (").append(genero).append(")\n");
        sb.append("Discos:\n");
        for (Disco disco : discos) {
            sb.append("  - ").append(disco.getTitulo()).append("\n");
        }
        return sb.toString();
    }
}
