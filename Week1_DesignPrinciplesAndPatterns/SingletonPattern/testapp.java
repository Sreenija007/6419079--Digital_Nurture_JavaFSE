public class testapp {
    public static void main(String[] args) {
        SimpleLogger logA = SimpleLogger.getLogger();
        SimpleLogger logB = SimpleLogger.getLogger();

        // Check if they are the same instance
        System.out.println("logA == logB ? " + (logA == logB));
        
        logA.show("First log message");
        logB.show("Second log message");
    }
}
