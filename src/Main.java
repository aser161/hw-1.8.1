public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        int [] number = new int [3];
        number [0] = 1;
        number [1] = 2;
        number [2] = 3;

        float[] number1 = {1.57f, 7.654f, 9.986f};

        short [] hours = {2, 3, 4, 5};

        // Задача 2
        System.out.println("Задача 2");
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i]);
            if (i < number.length-1){
                System.out.print(", ");
            }else {
                System.out.println(" ");
            }
        }
        for (int i = 0; i < number1.length; i++) {
            System.out.print(number1[i]);
            if (i < number1.length-1){
                System.out.print(", ");
            } else  {
                System.out.println(" ");
            }
        }
        for (int i = 0; i < hours.length; i++) {
            System.out.print(hours[i]);
            if (i < hours.length-1){
                System.out.print(", ");
            } else  {
                System.out.println(" ");
            }
        }

        // Задача 3
        System.out.println("Задача 3");
        for (int i = number.length-1; i >= 0; i--) {
            System.out.print(number[i]);
            if (i > 0){
                System.out.print(", ");
            }else {
                System.out.println(" ");
            }
        }
        for (int i = number1.length-1; i >= 0; i--) {
            System.out.print(number1[i]);
            if (i >0){
                System.out.print(", ");
            } else  {
                System.out.println(" ");
            }
        }
        for (int i = hours.length-1; i >= 0; i--) {
            System.out.print(hours[i]);
            if (i >0){
                System.out.print(", ");
            } else  {
                System.out.println(" ");
            }
        }

          // Задача 4
        System.out.println("Задача 4");
        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 == 1){
             number[i]++;
            }
            System.out.print(number[i]);
            if (i < number.length-1){
                System.out.print(", ");
            }else {
                System.out.println(" ");
            }
        }
    }
}