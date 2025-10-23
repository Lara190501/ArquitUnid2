public class MainP {
    public static void main(String[] args) {
        Circulo c1 = new Circulo(10, "vermelho");
        Circulo c2 = (Circulo) c1.clone(); // cópia
        c2.cor = "azul";

        c1.desenhar(); 
        c2.desenhar();
    }
}