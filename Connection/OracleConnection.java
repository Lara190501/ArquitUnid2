package Connection;
public class OracleConnection implements Connection {
    @Override
    public void connect() {
        System.out.println("Conectando ao banco de dados Oracle...");
    }

    @Override
    public String getType() {
        return "Oracle";
    }
}
