package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] intArray = { 1, 2, 3, 5 };
        System.out.println(intArray[0]+ ", " + intArray[1] + ", " + intArray[2] + ", " + intArray[3]);

        String str1 = "Мама мила раму";
        System.out.println(str1);
        String[] str1Array = str1.split(" ");
        for (String word : str1Array) {
            System.out.println(word);
        }

        String str2 = "Я хочу перенесення рядків";
        System.out.println(str2);
        String str3 = str2.replace(" ", "\n");
        System.out.println(str3);


        int [] intArray2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        for (int number : intArray2) {
            System.out.println(number);
        }

        for (int i = 0; i < intArray2.length; i++) {
            intArray2[i] += 1;
        }

        for (int number : intArray2) {
            System.out.println(number);
        }


        double[] doubleArray = {0.1, 0.2, 0.3, 0.4, 0.5};
        for (double number : doubleArray) {
            System.out.println(number);
        }


        byte a = 13;
        int b = 33;
        long c = 133L;
        int[] intArray3 = new int[3];

        // intArray[0] = a;
        // intArray[1] = b;
        // intArray[2] = c;
        for (int number : intArray3) {
             System.out.println(number);
        }


        int[][] intArray4 = { { 1, 2, 3 }, { 4, 5, 6 } };
        for (int i = 0; i < intArray4.length; i++) {
            for (int h = 0; h < intArray4[i].length; h++) {
                System.out.print(intArray4[i][h] + " ");
            }
            System.out.println();
        }



    }
}