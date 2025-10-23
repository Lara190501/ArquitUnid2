package Connection;
public class MySQLConnection implements Connection {
    @Override
    public void connect() {
        System.out.println("Conectando ao banco de dados MySQL...");
    }

    @Override
    public String getType() {
        return "MySQL";
    }
}
