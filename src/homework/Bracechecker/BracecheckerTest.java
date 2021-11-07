package homework.Bracechecker;

public class BracecheckerTest {
    public static void main(String[] args) {
        BraceChecker braceChecker=new BraceChecker(" [[ARM}{[Hello]]]]");
        braceChecker.check();
    }
}
