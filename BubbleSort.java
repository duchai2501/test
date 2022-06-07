/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p0001;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class BubbleSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BubbleSort sort = new BubbleSort();
        //Step1: Input size of Array
//        int size = inputSize("Enter number of array: ", 1, Integer.MAX_VALUE);

        //Step2: Random elements of Array in range
//        int[] arr = createArray(size);
//        Test
        int[] arr = {5, 1, 12, -5, 16};
        boolean test = true;

        //Step3: Display unsorted Array
        sort.display(arr, "Unsorted array: ");
//        sort.display(arr, "\tunsorted\n");
        //Step4: use Bubble sort to sort Array
        sort.bubbleSort(arr, true);

        //Step5: Display after sort 
        sort.display(arr, "\nSorted array: ");
//        sort.display(arr, "\tsorted");
    }

    private static int inputSize(String inptut_size, int min, int max) {
        Scanner sc = new Scanner(System.in);
        int size;
        do {
            System.out.println(inptut_size);
            String input = sc.nextLine();
            try {
                size = Integer.parseInt(input);
                if (size < 0) {
                    throw new Error();
                } else {
                    if (size == 0) {
                        throw new Exception();
                    } else {
                        return size;
                    }
                }
            } catch (NumberFormatException n) {
                System.out.println("Can not enter data other than integers,please enter a positive integer");
            } catch (Error r) {
                System.out.println("Can not enter negative integers, please enter a positive integer");

            } catch (Exception e) {
                System.out.println("Can not enter zero number, please enter a positive integer");
            }
        } while (true);
    }

    private static int[] createArray(int size) {
        int[] arr = new int[size];
        Random rd = new Random();
        //traverse from the beginning element to the end elements of array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(size);
        }
        return arr;
    }

    private static void bubbleSort(int[] arr, boolean test) {
        int temp;
        int i, j;
        //traverse from the beginning element to element before the end of array
        for (i = 0; i < arr.length - 1; i++) {
            // traverse from the beginning element to element before the end of unsorted array
            for (j = 0; j < arr.length - 1 - i; j++) {
                //compare two adjacent element of 
                if (arr[j] > arr[j + 1]) {
                    if (test == true) {
                        display(arr, "");
                        System.out.println("\t" + arr[j] + ">" + arr[j + 1] + ", swap");
                    }
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                else if (test == true) {
                    display(arr, "");
                    System.out.println("\t" + arr[j] + "<" + arr[j + 1] + ", ok");
                }
            }
            System.out.println();
        }
    }

    private static void display(int[] arr, String mes) {
        System.out.print(mes);
        String s = "[" + arr[0];
        //traverse from the beginning element to the end element of array
        for (int i = 1; i < arr.length; i++) {
            s += ", " + arr[i];
        }
        s += "]";
        System.out.print(s);
//        System.out.print(mes);
    }

}
