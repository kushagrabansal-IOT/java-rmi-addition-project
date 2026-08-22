import java.rmi.Naming;

public class Client {

    public static void main(String[] args) {
        try {
            MyInterface obj =
                    (MyInterface) Naming.lookup("rmi://localhost/Add");

            int result = obj.add(10, 20);

            System.out.println("=================================");
            System.out.println("     RMI CLIENT");
            System.out.println("=================================");
            System.out.println("10 + 20 = " + result);

        } catch (Exception e) {
            System.out.println("Client Error: " + e.getMessage());
        }
    }
}
