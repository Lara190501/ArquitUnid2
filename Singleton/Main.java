public class Main {

    public static void main(String[] args) {
        DBcon db1 = DBcon.getInstance();
        DBcon db2 = DBcon.getInstance();

        db1.connecta();

        System.out.println(db1 == db2);
    }

}    