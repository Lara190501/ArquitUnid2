class UDPChannel implements Channel {
    @Override
    public void send() {
        System.out.println("Enviando dados via UDP...");
    }

    @Override
    public void receive() {
        System.out.println("Recebendo dados via UDP...");
    }
}