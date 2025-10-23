abstract class Forma implements Cloneable {
    String cor;
    public abstract void desenhar();

    @Override
    public Forma clone() {
        try {
            return (Forma) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}

// Implementações concretas
class Circulo extends Forma {
    int raio;
    public Circulo(int raio, String cor) {
        this.raio = raio;
        this.cor = cor;
    }
    public void desenhar() {
        System.out.println("Círculo " + cor + " com raio " + raio);
    }
}

class Quadrado extends Forma {
    int lado;
    public Quadrado(int lado, String cor) {
        this.lado = lado;
        this.cor = cor;
    }
    public void desenhar() {
        System.out.println("Quadrado " + cor + " com lado " + lado);
    }
}