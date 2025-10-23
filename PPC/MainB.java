public class Main {
    public static void main(String[] args) {
        Computador pc = new Computador.Builder()
                            .cpu("Intel i9")
                            .ram(32)
                            .armazenamento(1000)
                            .build();
        pc.exibir();
    }
}