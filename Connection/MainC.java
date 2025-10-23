package Connection;
public class MainC {
    public static void main(String[] args) {
        Connection oracle = ConnectionFactory.createConnection("oracle");
        oracle.connect();
        System.out.println("Tipo de conexão: " + oracle.getType());

        System.out.println();

        Connection postgresql = ConnectionFactory.createConnection("postgresql");
        postgresql.connect();
        System.out.println("Tipo de conexão: " + postgresql.getType());

        System.out.println();

        Connection mysql = ConnectionFactory.createConnection("mysql");
        mysql.connect();
        System.out.println("Tipo de conexão: " + mysql.getType());
    }
}
