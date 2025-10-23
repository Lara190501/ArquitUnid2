class ZipChannel extends ChannelDecorator {

    public ZipChannel(Channel channel) {
        super(channel);
    }

    @Override
    public void send() {
        System.out.println("Compactando dados antes do envio...");
        super.send();
    }

    @Override
    public void receive() {
        super.receive();
        System.out.println("Descompactando dados após o recebimento...");
    }
}

class BufferChannel extends ChannelDecorator {

    public BufferChannel(Channel channel) {
        super(channel);
    }

    @Override
    public void send() {
        System.out.println("Armazenando dados em buffer antes do envio...");
        super.send();
    }

    @Override
    public void receive() {
        super.receive();
        System.out.println("Lendo dados do buffer após o recebimento...");
    }
}

class LogChannel extends ChannelDecorator {

    public LogChannel(Channel channel) {
        super(channel);
    }

    @Override
    public void send() {
        System.out.println("[LOG] Iniciando envio de dados...");
        super.send();
        System.out.println("[LOG] Envio concluído com sucesso!");
    }

    @Override
    public void receive() {
        System.out.println("[LOG] Aguardando recebimento...");
        super.receive();
        System.out.println("[LOG] Dados recebidos e registrados.");
    }
}
