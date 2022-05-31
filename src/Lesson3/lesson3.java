package Lesson3;

public class lesson3 {
  public static void main(String[] args) {

    homework5(3,3);


    int[] homework1 = {0, 1, 0, 1, 0};
    for (int i = 0; i < homework1.length; i++) {
      if (homework1[i] == 1){
         homework1[i] = 0;
      }
      else {
        homework1[i] = 1;
      }
    }

    int[] homework2 = new int[100];
    for (int i = 0; i < homework2.length; i++){
      int j = i;
      homework2[i] = j += 1;
    }

    int[] homework3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
    for (int i = 0; i < homework3.length; i++){
      if ( homework3[i] < 6 ){
        int i1 = homework3[i] * 2;
      }
    }

    int[][] homework4 = new int[3][3];
    for (int i = 0; i < 1; i++){
      homework4[0][0] = 1;
    }
    for (int i = 0; i < 2; i++){
      homework4[1][1] = 1;
    }
    for (int i = 0; i < 3; i++){
      homework4[2][2] = 1;
    }
    for (int i = 0; i < 3; i++){
      homework4[0][2] = 1;
    }
    for (int i = 0; i < 1; i++){
      homework4[2][0] = 1;
    }
  }

  public static int[] homework5(int len, int initialValue){
    int[] mass = new int[len];
    for (int i = 0; i < mass.length; i++){
      mass[i] = initialValue;
    }
    return mass;
  }
}