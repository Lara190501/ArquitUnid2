public class DBcon {

    private DBcon(){}

    private static DBcon instance;

    public static DBcon getInstance(){
        if(instance == null){
            instance = new DBcon();
        }
        return instance;
    }
    

    public void connecta() {
        System.out.println("Deu tudo certo!");
    }
}