package homework.FigurePainter;

// One
//*
//* *
//* * *
//* * * *
public class FigurePainter {
    void figureOne(int count, char x) {
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(x + " ");
            }
            System.out.println(x + " ");
        }
    }
// Two
//    *
//   **
//  ***
// ****

    void figureTwo(int count, char x) {
        for (int i = count; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j < count; j++) {
                System.out.print(x + "");
            }
            System.out.println(x + "");
        }
    }
// Three
//* * * *
//* * *
//* *
//*

    void figureThree(int count, char x) {
        for (int i = 0; i < count; i++) {
            for (int j = count; j > i; j--) {
                System.out.print(x + " ");
            }
            System.out.println(" ");
        }
    }
// Four
//    *
//   * *
//  * * *
// * * * *
//  * * *
//   * *
//    *

    void figureFour(int count, char x) {
        for (int i = count; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j < count; j++) {
                System.out.print(x + " ");
            }
            System.out.println(x + " ");
        }
        for (int i = 0; i <= count; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j < count; j++) {
                System.out.print(x + " ");
            }
            System.out.println(x + " ");
        }
    }

// Five
// * * * *
//   * * *
//     * *
//       *

    void figureFive(int count, char x) {
        for (int i = count; i > 0; i--) {
            for (int j = i; j < count; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(x + " ");
            }
            System.out.println(" ");
        }
    }
}

