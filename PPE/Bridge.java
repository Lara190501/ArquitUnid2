// Implementação - interface da "ponte"
interface PlataformaDesenho {
    void desenharCirculo(int x, int y, int raio);
}

// Implementações concretas
class WindowsDesenho implements PlataformaDesenho {
    public void desenharCirculo(int x, int y, int raio) {
        System.out.println("Desenhando círculo no Windows");
    }
}
class LinuxDesenho implements PlataformaDesenho {
    public void desenharCirculo(int x, int y, int raio) {
        System.out.println("Desenhando círculo no Linux");
    }
}

// Abstração
abstract class Forma {
    protected PlataformaDesenho plataforma;
    protected Forma(PlataformaDesenho plataforma) {
        this.plataforma = plataforma;
    }
    abstract void desenhar();
}

// Abstração refinada
class Circulo extends Forma {
    private int x, y, raio;
    public Circulo(int x, int y, int raio, PlataformaDesenho plataforma) {
        super(plataforma);
        this.x = x; this.y = y; this.raio = raio;
    }
    void desenhar() {
        plataforma.desenharCirculo(x, y, raio);
    }
}

// Uso
public class Bridge {
    public static void main(String[] args) {
        Forma circuloWin = new Circulo(10, 20, 5, new WindowsDesenho());
        Forma circuloLinux = new Circulo(10, 20, 5, new LinuxDesenho());

        circuloWin.desenhar();
        circuloLinux.desenhar();
    }
}

