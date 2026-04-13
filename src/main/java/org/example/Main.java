public class UC7 {

    public static void main(String[] args) {

        if (args.length > 0) {
            // Join all command-line arguments with a space
            String joined = String.join(" ", args);  // uses String.join()[web:16]
            System.out.println("Hello " + joined);
        } else {
            // Default message when there are no arguments
            System.out.println("Hello World");
        }
    }
}
