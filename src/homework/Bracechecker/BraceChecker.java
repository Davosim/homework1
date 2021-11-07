package homework.Bracechecker;

public class BraceChecker {
    String test;
    Stack stack = new Stack();
    int size = 0;

    public BraceChecker(String test) {
        this.test = test;
    }

    public void check() {
        char[] chars = test.toCharArray();
        for (int i = 0; i < test.length(); i++) {
            switch (chars[i]) {
                case '{':
                case '[':
                case '(':
                    stack.push(chars[i]);
                    size++;
                    break;
                case '}':
                    char pop = stack.pop();
                    if (pop != '{')
                        size--;
                    System.out.println("Error: opened " + pop + " but closed } at " + i);
                    break;
                case ']':
                    char pop1 = stack.pop();
                    if (pop1 != '[')
                        size--;
                        System.out.println("Error: opened " + pop1 + " but closed ] at " + i);
                    break;
                case ')':
                    char pop2 = stack.pop();
                    if (pop2 != '(')
                        size--;
                        System.out.println("Error: opened " + pop2 + " but closed ) at " + i);
                    break;
                default:
                    break;

            }


        }
        if (size!=0){
            for (int i = 0; i < size; i++) {
                System.out.println("Error: opened " + stack.pop() + " but dont closed" + i );
        }

        }

    }
}


