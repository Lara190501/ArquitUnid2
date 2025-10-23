package Connection;
public class PostgreSQLConnection implements Connection {
    @Override
    public void connect() {
        System.out.println("Conectando ao banco de dados PostgreSQL...");
    }

    @Override
    public String getType() {
        return "PostgreSQL";
    }
}
