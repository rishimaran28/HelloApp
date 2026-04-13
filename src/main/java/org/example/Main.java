public class UC3 {
    public static void main(String[] args) {

        if (args.length > 0) {
            // Option A: use only the first word
            System.out.println(args[0]);

            // Option B (if you want full message):
            // StringBuilder sb = new StringBuilder();
            // for (int i = 0; i < args.length; i++) {
            //     if (i > 0) sb.append(" ");
            //     sb.append(args[i]);
            // }
            // System.out.println(sb.toString());
        } else {
            System.out.println("Hello World"); // default message
        }
    }
}
