package AF;
public class Main {
    public static void main(String[] args) {
    
        ChannelFactory tcpFactory = new TCPFactory();
        Channel tcp = tcpFactory.create();
        tcp.getMessage();

        
        ChannelFactory udpFactory = new UDPFactory();
        Channel udp = udpFactory.create();
        udp.getMessage();
    }
}