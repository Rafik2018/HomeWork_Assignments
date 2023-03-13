package class33;

public class Task4 {

/*4) Create a method checkUserName that will throw a runtime exception.
     Method should throw an exception when entered username is less than 5 characters.*/

    public static void checkUserName(String userName) {
        if (userName.length() < 5) {
            throw new RuntimeException("Username must be at least 5 'char' long ");
        } else {
            throw new RuntimeException("Username accepted ");
        }
    }

    public static void main(String[] args) {
        String userName = "Raf";
        try {
            checkUserName(userName);
        } catch (RuntimeException rte) {
            System.out.println("RuntimeException --> " + rte.getMessage());
        }
    }
}
