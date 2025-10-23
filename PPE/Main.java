// Componente base
interface Forma {
    void desenhar();
}

// Folhas (objetos simples)
class Circulo implements Forma {
    public void desenhar() {
        System.out.println("Desenhando círculo");
    }
}

class Quadrado implements Forma {
    public void desenhar() {
        System.out.println("Desenhando quadrado");
    }
}

// Composto
import java.util.ArrayList;
import java.util.List;

class GrupoFormas implements Forma {
    private List<Forma> formas = new ArrayList<>();

    public void adicionar(Forma forma) {
        formas.add(forma);
    }

    public void desenhar() {
        for (Forma f : formas) {
            f.desenhar();
        }
    }
}

// Uso
public class Main {
    public static void main(String[] args) {
        Circulo c1 = new Circulo();
        Quadrado q1 = new Quadrado();

        GrupoFormas grupo = new GrupoFormas();
        grupo.adicionar(c1);
        grupo.adicionar(q1);

        grupo.desenhar(); // desenha todos os elementos
    }
}
