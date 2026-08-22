import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Server {

    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1099);

            MyRemote obj = new MyRemote();

            Naming.rebind("rmi://localhost/Add", obj);

            System.out.println("=================================");
            System.out.println("     RMI SERVER IS RUNNING");
            System.out.println("=================================");
            System.out.println("Remote object: Add");
            System.out.println("Port: 1099");
            System.out.println("Waiting for client...");
            
        } catch (Exception e) {
            System.out.println("Server Error: " + e.getMessage());
        }
    }
}
