class Computador {
    private String cpu;
    private int ram;
    private int armazenamento;

    private Computador(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.armazenamento = builder.armazenamento;
    }

    public static class Builder {
        private String cpu;
        private int ram;
        private int armazenamento;

        public Builder cpu(String cpu) {
            this.cpu = cpu;
            return this;
        }
        public Builder ram(int ram) {
            this.ram = ram;
            return this;
        }
        public Builder armazenamento(int armazenamento) {
            this.armazenamento = armazenamento;
            return this;
        }
        public Computador build() {
            return new Computador(this);
        }
    }

    public void exibir() {
        System.out.println("CPU: " + cpu + " | RAM: " + ram + "GB | HD: " + armazenamento + "GB");
    }
}