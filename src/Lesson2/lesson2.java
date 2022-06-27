package Lesson2;

public class lesson2 {
  public static void main(String[] args) {

    sumNumbers(5,2);
    checkNumber(0);
    checkBoolean(100);
    printSomeWords("Сломал мозг", 6);
  }

  public static boolean sumNumbers(int a, int b){
    int c = a + b;
    if (c > 10 && c <= 20){
     return true;
    }
    else {
      return false;
    }
//    return a + b > 10 && a + b <= 20;  // исходя из подсказки, можно сделать и так
  }

  public static void checkNumber(int a){
    if (a >= 0){
      System.out.println("Положительное число");
    }
    else {
      System.out.println("Отрицательное число");
    }
  }

  public static boolean checkBoolean(int a)

  {
    return a < 0;
  }

  public static void printSomeWords(String a, int b){
    int c;
    for (c = 0; c < b; c++){
      System.out.println(a);
    }
  }
}


