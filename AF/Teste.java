package AF;

interface Channel {
    void getMessage();
}


class TCPChannel implements Channel {
    public void getMessage() {
        System.out.println("Envia mensagem TCP");
    }
}

class UDPChannel implements Channel {
    public void getMessage() {
        System.out.println("Envia mensagem UDP");
    }
}


abstract class ChannelFactory {
    public abstract Channel create();
}


class TCPFactory extends ChannelFactory {
    public Channel create() {
        return new TCPChannel();
    }
}

class UDPFactory extends ChannelFactory {
    public Channel create() {
        return new UDPChannel();
    }
}