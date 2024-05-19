public class DatabaseController {
    private static DatabaseController self;
    private DatabaseController() {}

    public static DatabaseController getSelf() {
        if(self == null) {
            self = new DatabaseController();
        }
        return self;
    }
}
