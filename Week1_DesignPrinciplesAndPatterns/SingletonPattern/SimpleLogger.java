public class SimpleLogger {
    // Eagerly create the only instance
    private static final SimpleLogger loggerInstance = new SimpleLogger();

    // Private constructor so no one else can create this
    private SimpleLogger() {
        System.out.println("SimpleLogger is ready!");
    }

    // Public method to access the instance
    public static SimpleLogger getLogger() {
        return loggerInstance;
    }
    public void show(String message) {
        System.out.println("LOG: " + message);
    }
}

