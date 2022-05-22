package Lesson1;

public class lesson1  {

  public static void main(String[] args){
    printThreeWords();
    checkSumSign();
    printColor();
    compareNumbers();
  }

  public static void printThreeWords(){
    System.out.println("\nOrange\nBanana\nApple");
  }

  public static void checkSumSign(){
    int a = -3;
    int b = 2;
    int c = a + b;
    if ( c >= 0 )
      System.out.println("Сумма положительная");
    else
      System.out.println("Сумма отрицательная");

  }

  public static void printColor(){

    int value = 100;

    if (value <=0)
      System.out.println("Красный");
    if (value > 0 && value <= 100)
      System.out.println("Жёлтый");
    else
      System.out.println("Зелёный");

/*    if (value > 100)
      System.out.println("Зелёный");*/ //второй вариант решения задания - заменить else на if с третьим условием
  }

  public static void compareNumbers(){

    int a = 1;
    int b = 2;

    if (a >= b)
      System.out.println("a >= b");
    else
      System.out.println("a < b");
  }
}