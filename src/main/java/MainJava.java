import org.jooq.DSLContext;

public class MainJava {
    public static void main(String[] args) {
        DSLContext context = null;
        context.select().from // <- Works like Intellij.
    }
}
