import static spark.Spark.*;

/**
 * Created by Eason on 1/21/16.
 */
public class Main {
    public static void main(String[] args) {
        get("/hello", (req, res) -> "Hello World");
    }
}
