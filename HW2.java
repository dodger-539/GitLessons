package GitLessons;

public class HW2 {

    public static void main(String[] args) {
  /*      for (int i =0; i < 12; i ++) {
            for (int j = 0; j < 3; j ++) {
                if (i < 2 || i > 9) {
                    System.out.print("* ");
                } else if (i % 2 == 0) {
                    if (j > 0) {
                        System.out.print("  ");
                    } else {
                    System.out.print("* ");
                    }
                 } else {
                        if (j < 2) {
                        System.out.print("  ");
                    } else {
                    System.out.print("* ");
                    }
                    }

                }
            System.out.println();
        }    */
        task1(11,9);
        task2(-6.6f);
        System.out.println(task3(3));
        task4(5, "строка ");
        System.out.println(task5(404));
    }
    public static void task1(int a, int b) {
       // int a = 11, b = 9;
        if (a + b > 9 && a + b < 21) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
    public static void task2(float a) {
       // float a = -6.6f;
        if (a >= 0) {
            System.out.println("положительное");
        } else {
            System.out.println("отрицательное");
        }
    }
    public static boolean task3(int a) {
      //  int a = -6;
        return (a >= 0);
    }

    public static void task4(int n, String s) {
      //  int n = 5;
      //  String s = "строка ";
        for (int i = 0; i < n; i++) {
            System.out.println(s + (i+1));
        }
    }

    public static boolean task5(int year) {
    //    int year = 404;
        return (year % 4 == 0 && year % 100 != 0 && year % 400 != 0);
    }
}
