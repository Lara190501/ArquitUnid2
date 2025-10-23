class Main {
    public static void main(String[] args) {
        System.out.println("=== Canal TCP simples ===");
        Channel tcp = new TCPChannel();
        tcp.send();
        tcp.receive();

        System.out.println("\n=== Canal TCP com Log ===");
        Channel loggedTcp = new LogChannel(new TCPChannel());
        loggedTcp.send();
        loggedTcp.receive();

        System.out.println("\n=== Canal UDP com Buffer e Log ===");
        Channel udpBufferedLogged = new LogChannel(new BufferChannel(new UDPChannel()));
        udpBufferedLogged.send();
        udpBufferedLogged.receive();

        System.out.println("\n=== Canal TCP com Zip, Buffer e Log ===");
        Channel tcpFull = new LogChannel(new BufferChannel(new ZipChannel(new TCPChannel())));
        tcpFull.send();
        tcpFull.receive();
    }
}