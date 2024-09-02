public class stackTrace {
        public static void main(String[] args) {
            String text = null;
            printLength(text);
        }

        public static void printLength(String str) {
            // This will cause a NullPointerException if str is null
            System.out.println(str.length());
        }
    }


