public class hw_2 {

    public static void main(String[] args) {

        //task_1();
        // task_2();
        //task_3();
        //task_4();
        //task_5();
        //task_6();
        //task_8();
        //task_10();

    }

    public static void task_1() {
        //Task 1. Write a Java program to sort a numeric array and a string array.
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
            System.out.print(arr[i]);
        }
        System.out.println(" ");
        for (int d = arr.length - 1; d > 0; d--) {
            for (int j = 0; j < d; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }

        }
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + "  ");
        }
    }

    public static void task_2() {
        //Task 2. Write a Java program to sum values of an array.
        int blo[] = {10, 20, 30, 40};
        int sum = 0;
        for (int k = 0; k < blo.length; k++) {
            sum += blo[k];
        }
        System.out.println("Сумма" + " " + sum);
    }

    public static void task_3() {
        //Task 3. Write a Java program to print the following grid
        String[] se = {"_", "_", "_"};
        for (int v = 0; v < se.length; v++) {
            System.out.print(se[v]);
        }
        String[] re = {"_", "_", "_"};
        for (int t = 0; t < re.length; t++) {
            System.out.print(re[t]);
        }

    }

    public static void task_4() {
        //Task 4.  Write a Java program to calculate the average value of array elements.
        double nums[] = {10.1, 11.2, 12.3, 13.4, 14.5};
        double result = 0;
        for (int l = 0; l < 5; l++)
            result = result + nums[l];
        System.out.println("Среднее значение равно " + result / 5);
    }

    public static void task_5() {
        int[] anArray;
        anArray = new int[10];
        anArray[0] = 11;
        anArray[1] = 22;
        anArray[2] = 33;
        anArray[3] = 44;
        anArray[4] = 55;
        anArray[5] = 66;
        anArray[6] = 77;
        anArray[7] = 88;
        anArray[8] = 99;
        anArray[9] = 10;
        int a = 77;
        for (int k : anArray) {
            if (k == a) {
                System.out.println(" Есть ");
            }
        }
    }

    public static void task_6() {
        int[] anArray;
        anArray = new int[10];
        anArray[0] = 11;
        anArray[1] = 22;
        anArray[2] = 33;
        anArray[3] = 44;
        anArray[4] = 55;
        anArray[5] = 66;
        anArray[6] = 77;
        anArray[7] = 88;
        anArray[8] = 99;
        anArray[9] = 10;
        int a = 77;
        for (int i = 0; i < anArray.length; i++) {
            if (anArray[i] == a) {
                System.out.println(i);
            }
        }
    }

    public static void task_8() {
        int[] anArray;
        anArray = new int[10];
        anArray[0] = 11;
        anArray[1] = 22;
        anArray[2] = 33;
        anArray[3] = 44;
        anArray[4] = 55;
        anArray[5] = 66;
        anArray[6] = 77;
        anArray[7] = 88;
        anArray[8] = 99;
        anArray[9] = 10;
        int[] array2 = new int[10];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = anArray[i];
            System.out.println(array2[i]);

        }


    }

    public static void task_10() {
        int[] anArray;
        anArray = new int[10];
        anArray[0] = 11;
        anArray[1] = 22;
        anArray[2] = 33;
        anArray[3] = 44;
        anArray[4] = 55;
        anArray[5] = 66;
        anArray[6] = 77;
        anArray[7] = 88;
        anArray[8] = 99;
        anArray[9] = 10;
        int min = anArray[0];
        int max = anArray[0];
        for (int i : anArray) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        System.out.println(" min = " + min + "\nmax = " + max);

    }

}


