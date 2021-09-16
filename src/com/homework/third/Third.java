package com.homework.third;

import java.util.Arrays;
import java.util.Scanner;

public class Third {

    public int[] createFibMas(){
        int prevC = 0;
        int nextC = 1;
        int [] mas;
        int count;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива, заполненного числами Фибоначи: ");
        count = scanner.nextInt();
        mas = new int[count];
        for (int i = 0; i<count ; i++){
            mas[i] = prevC + nextC;
            prevC = nextC;
            nextC = mas[i];
        }
        System.out.println(Arrays.toString(mas));
        return mas;
    }

    public void findMinMaxFibMas(int [] fibMas){
        int count = fibMas.length;
        int min = fibMas[0];
        int max = min;
        for (int i =0; i<count; i++){
            if(fibMas[i] > max){
                max = fibMas[i];
            }
            else if (fibMas[i] < min){
                min = fibMas[i];
            }
        }
        System.out.println("Минимальное число в массиве: " + min);
        System.out.println("Максимальное число в массиве: " + max);
    }

    public void findDifEvenOdd(int [] fibMas){
        int count = fibMas.length;
        int evenSum = 0; //четные
        int oddSum = 0; //нечетные
        if (count % 2 == 0){
            for (int i = 0; i<count; i +=2){ //если длина четная
                oddSum += fibMas[i];
                evenSum += fibMas[i+1];
            }
        }
        else {
            oddSum += fibMas[0];
            for (int i = 1; i < count; i += 2) { //если длина нечетная
                evenSum += fibMas[i];
                oddSum += fibMas[i + 1];
            }
        }
        System.out.println("Сумма нечетных: " + evenSum);
        System.out.println("Сумма четных: " + oddSum);
    }

    public void findMostFrequent(){
        int [] mas = {5, 7, 8, 10 , 12, 25, 7, 99, 3, 5, 5, 7, 0, 7};
        int i = 0;
        int j = 0;
        int cc;
        int counter;
        int mostFreq = mas[0];
        int mfCounter = 0;
        for (; i < mas.length; i++){
            counter = 0;
            cc = mas[i];
            j = i;
            for (; j < mas.length; j++){
                if (cc == mas[j]){
                    counter++;
                }
            }
            if (counter > mfCounter){
                mostFreq = cc;
                mfCounter = counter;
            }
        }
        System.out.println("Наиболее встречающееся число(одно из): " + mostFreq);
        System.out.println("Количество повторений: " + mfCounter);
    }




}
