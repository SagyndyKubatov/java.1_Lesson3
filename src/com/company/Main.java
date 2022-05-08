package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        double[] array = {1.1,-7.2,-1.3,1.4,1.5,-2.2,2.5,-6.3,-5.4,5.2,6.8,2.1,8.4,4.4,-5.5};

        sum(array);
        System.out.println(Arrays.toString(array));
        choiceToSort(array);
    }

    public static void sum (double[] array){
        double sum2 = 0;
        boolean leverArm2 = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0){
                leverArm2 = true;
            }
            else if (leverArm2 == true && array[i] < 0){
                sum2 = sum2 + array[i];
            }
        }
        System.out.println("Среднее арифметическое значение отрицательных чисел  "+ sum2/array.length);


        double sum1 = 0;
        boolean leverArm1 = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0){
                leverArm1 = true;
            }
            else if (leverArm1 == true && array[i] > 0){
                sum1 = sum1 + array[i];
            }
        }
        System.out.println("Среднее арифметическое значение положительных чисел  "+ sum1/array.length);

        double sum3 = sum1/ array.length +sum2/ array.length;
        System.out.println("Разница между положительными и отрицательными значениями  "+sum3);
    }






    public static void choiceToSort(double[] arrayToSort){
        int indexMin;
        for (int index = 0; index < arrayToSort.length-1; index++) {
            indexMin = index;
            for (int indexToScan = index; indexToScan < arrayToSort.length; indexToScan++) {
                if (arrayToSort[indexMin] > arrayToSort[indexToScan]){
                    indexMin = indexToScan;
                }
            }
            double temp = arrayToSort[index];
            arrayToSort[index] = arrayToSort[indexMin];
            arrayToSort[indexMin] = temp;
        }
        System.out.println(Arrays.toString(arrayToSort));
    }



}
