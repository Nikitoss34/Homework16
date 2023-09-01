import org.omg.PortableInterceptor.SUCCESSFUL;

public class Program {
    public static void main(String[] args) {
       User user  = new User("Alice", "qwerty");
        System.out.printf("Account Login successful! " + " Login : Alice , " +  "Password : qwerty");
    }
}