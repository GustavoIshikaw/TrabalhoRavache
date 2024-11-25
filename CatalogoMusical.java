import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CatalogoMusical {
    private List<Artista> artistas;

    public CatalogoMusical() {
        artistas = new ArrayList<>();
    }

    public void cadastrarArtista(String nome, String genero) {
        artistas.add(new Artista(nome, genero));
    }

    public void cadastrarDisco(String nomeArtista, String titulo, int ano) {
        for (Artista artista : artistas) {
            if (artista.getNome().equalsIgnoreCase(nomeArtista)) {
                Disco disco = new Disco(titulo, ano);
                artista.adicionarDisco(disco);
                return;
            }
        }
        System.out.println("Artista não encontrado!");
    }

    public void adicionarFaixa(String tituloDisco, String nomeFaixa, int duracao) {
        for (Artista artista : artistas) {
            for (Disco disco : artista.getDiscos()) {
                if (disco.getTitulo().equalsIgnoreCase(tituloDisco)) {
                    disco.adicionarFaixa(new Faixa(nomeFaixa, duracao));
                    return;
                }
            }
        }
        System.out.println("Disco não encontrado!");
    }

    public void listarDiscos() {
        for (Artista artista : artistas) {
            System.out.println(artista);
        }
    }

    public static void main(String[] args) {
        CatalogoMusical catalogo = new CatalogoMusical();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Cadastrar Artista");
            System.out.println("2. Cadastrar Disco");
            System.out.println("3. Adicionar Faixa");
            System.out.println("4. Listar Discos");
            System.out.println("5. Sair");

            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            switch (opcao) {
                case 1:
                    System.out.print("Nome do artista: ");
                    String nome = scanner.nextLine();
                    System.out.print("Gênero musical: ");
                    String genero = scanner.nextLine();
                    catalogo.cadastrarArtista(nome, genero);
                    break;

                case 2:
                    System.out.print("Nome do artista: ");
                    String nomeArtista = scanner.nextLine();
                    System.out.print("Título do disco: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Ano de lançamento: ");
                    int ano = scanner.nextInt();
                    catalogo.cadastrarDisco(nomeArtista, titulo, ano);
                    break;

                case 3:
                    System.out.print("Título do disco: ");
                    String tituloDisco = scanner.nextLine();
                    System.out.print("Nome da faixa: ");
                    String nomeFaixa = scanner.nextLine();
                    System.out.print("Duração (em minutos): ");
                    int duracao = scanner.nextInt();
                    catalogo.adicionarFaixa(tituloDisco, nomeFaixa, duracao);
                    break;

                case 4:
                    catalogo.listarDiscos();
                    break;

                case 5:
                    System.out.println("Encerrando o programa...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
