package homework.Bracechecker;

public class BraceCheckerTest {
    public static void main(String[] args) {
        BraceChecker braceChecker = new BraceChecker("{I am a} [((java] biginner[]) {developer}{{[");

        braceChecker.check();
    }
}
