package Lesson4;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.util.Random;
import java.util.Scanner;

public class lesson4 {

    public static void main(String[] args) {
        String[][] field = initField(3);
        printField(field);

        while (true) {
            humanTurn(field);
            printField(field);
            if (isDraw(field)) {
                break;
            }
            if (isWinner(field, "X")) {
                System.out.println("Вы победили");
                break;
            }

            aiTurn(field);
            printField(field);
            if (isDraw(field)) {
                break;
            }
            if (isWinner(field, "0")) {
                System.out.println("AI Win");
                break;
            }
        }
        System.out.println("Игра закончена");
    }

    public static String[][] initField(int size) {
        String[][] field = new String[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                field[i][j] = "*";
            }
        }
        return field;
    }

    public static void printField(String[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("-----");
    }

    public static void humanTurn(String[][] field) {
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("Укажите клетку по Х и Y");
            int x = scanner.nextInt() - 1;
            int y = scanner.nextInt() - 1;
            int size = field.length;

            if (x < size && y < size && x >= 0 && y >= 0) {
                if (field[x][y].equals(("*"))) {
                    field[x][y] = "X";
                    break;
                } else {
                    System.out.println("Вы сходили не туда");
                }

            } else {
                System.out.println("Вы тыкнули не игровое поле");
            }
        }
    }


    public static void aiTurn(String[][] field) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            Random random = new Random();
            int x = random.nextInt(field.length);
            int y = random.nextInt(field.length);
            int size = field.length;
            if (field[x][y].equals(("*"))) {
                field[x][y] = "0";
                break;
            }
        }
        System.out.println("AI выполнил ход");
    }

    public static boolean isDraw(String[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++) {
                if (field[i][j].equals("*")) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isWinner(String[][] field, String turn) {
        int horizontal, vertical;
        int leftdiag, righdiag;

        for (int i = 0; i < field.length; i++) {
            {
                horizontal = 0;
                vertical = 0;
                for (int j = 0; j < field.length; j++) {
                    if (field[i][j] == turn) {
                        horizontal++;
                    } else if (field[i][j] != turn && horizontal < 3) {
                        horizontal = 0;
                    }
                    {
                        if (field[j][i] == turn) {
                            vertical++;
                        } else if (field[i][j] != turn && vertical < 3) {
                            vertical = 0;
                        }
                    }
                }
                if (vertical == 3 || horizontal == 3) return true;
            }
        }
        return false;
    }
//        if (
//                field[0][0].equals(turn) && field[0][1].equals(turn) && field[0][2].equals(turn) ||
//                        field[1][0].equals(turn) && field[1][1].equals(turn) && field[1][2].equals(turn) ||
//                        field[2][0].equals(turn) && field[2][1].equals(turn) && field[2][2].equals(turn)
//        ) {
//            return true;
//        } else if (
//                field[0][0].equals(turn) && field[1][0].equals(turn) && field[2][0].equals(turn) ||
//                        field[0][1].equals(turn) && field[1][1].equals(turn) && field[2][1].equals(turn) ||
//                        field[0][2].equals(turn) && field[1][2].equals(turn) && field[2][2].equals(turn)
//        ) {
//            return true;
//        } else if (
//                field[0][0].equals(turn) && field[1][1].equals(turn) && field[2][2].equals(turn) ||
//                        field[2][0].equals(turn) && field[1][1].equals(turn) && field[0][2].equals(turn)
//        ) {
//            return true;
//        }
//        return false;

}


