package Connection;

public class ConnectionFactory {
    public static Connection createConnection(String type) {
        switch (type.toLowerCase()) {
            case "oracle":
                return new OracleConnection();
            case "postgresql":
                return new PostgreSQLConnection();
            case "mysql":
                return new MySQLConnection();
            default:
                throw new IllegalArgumentException("Tipo de conexão não suportado: " + type);
        }
    }
}
