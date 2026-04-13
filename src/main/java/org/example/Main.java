public class UC6 {
    public static void main(String[] args) {
        String result = "Hello ";

        // Append each argument followed by a delimiter
        for (int i = 0; i < args.length; i++) {
            result = result + args[i] + ", ";
        }

        // Remove trailing delimiter if at least one argument was added
        if (args.length > 0) {
            result = result.substring(0, result.length() - 2); // remove last ", "
        }

        System.out.println(result);
    }
}
