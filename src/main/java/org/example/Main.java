public class UC4Hello {

    public static void main(String[] args) {
        if (args.length > 0) {
            // Print "Hello" + all command-line arguments
            System.out.print("Hello");
            for (String arg : args) {
                System.out.print(" " + arg);
            }
            System.out.println();
        } else {
            // Default message when no arguments are passed
            System.out.println("Hello, World!");
        }
    }
}
