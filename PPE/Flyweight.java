import java.util.HashMap;
import java.util.Map;

// Flyweight - dados compartilhados
class TipoArvore {
    private String nome;
    private String cor;
    private String textura;

    public TipoArvore(String nome, String cor, String textura) {
        this.nome = nome;
        this.cor = cor;
        this.textura = textura;
    }

    public void desenhar(int x, int y) {
        System.out.println("Desenhando " + nome + " na posição (" + x + "," + y + ")");
    }
}

// Fábrica Flyweight
class FabricaArvores {
    private static Map<String, TipoArvore> cache = new HashMap<>();

    public static TipoArvore getTipoArvore(String nome, String cor, String textura) {
        String chave = nome + cor + textura;
        if (!cache.containsKey(chave)) {
            cache.put(chave, new TipoArvore(nome, cor, textura));
        }
        return cache.get(chave);
    }
}

// Objeto que usa o Flyweight
class Arvore {
    private int x, y;
    private TipoArvore tipo;

    public Arvore(int x, int y, TipoArvore tipo) {
        this.x = x;
        this.y = y;
        this.tipo = tipo;
    }

    public void desenhar() {
        tipo.desenhar(x, y);
    }
}

// Uso
public class Flyweight {
    public static void main(String[] args) {
        TipoArvore tipoPinho = FabricaArvores.getTipoArvore("Pinho", "Verde", "Rugosa");
        Arvore a1 = new Arvore(10, 20, tipoPinho);
        Arvore a2 = new Arvore(15, 25, tipoPinho);

        a1.desenhar();
        a2.desenhar();
    }
}

