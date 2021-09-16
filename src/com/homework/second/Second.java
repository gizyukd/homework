package com.homework.second;

import java.util.Locale;
import java.util.Scanner;

public class Second {
    public void printLetterByIf(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку/букву на латинице: ");
        String str = scanner.next();
        char b = str.charAt(0);
        if (b=='a' || b=='e' || b=='i' || b=='o' || b=='u' || b=='y'){
            System.out.println("Первая введенная буква гласная: " + b);
        }
        else {
            System.out.println("Первая введенная буква согласная: " + b);
        }

       // System.out.println(b);
    }

    public void printLetterBySwitch() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку/букву на латинице: ");
        String str = scanner.next();
        char b = str.charAt(0);
        switch (b) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'y':
                System.out.println("Первая введенная буква гласная: " + b);
                break;
            default:
                System.out.println("Первая введенная буква согласная: " + b);
        }
    }

    public void checkMonth(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите месяц на русском: ");
        String str = scanner.next();
        str = str.toLowerCase(Locale.ROOT);
        switch(str){
            case "декабрь":
            case "февраль":
            case "январь":
                System.out.println("Месяц зимы");
                break;
            case "март":
            case "апрель":
            case "май":
                System.out.println("Месяц весны");
                break;
            case "июнь":
            case "июль":
            case "август":
                System.out.println("Месяц лета");
                break;
            case "сентябрь":
            case "октябрь":
            case "ноябрь":
                System.out.println("Месяц осени");
                break;
            default:
                System.out.println("Вы допустили опечатку в названии месяца");
        }
    }

    public void exitByDoWhile(){
        Scanner scanner = new Scanner(System.in);
        String str = new String();
        do {
            System.out.println(str);
            System.out.print("Введите слово в консоль (для выхода введите 'exit'): ");
            str = scanner.next();
        } while (!str.equals("exit"));
    }

    public void sumBetweenCounts(){
        int count1 = 20;
        int count2 = 10;
        int i;
        int k;
        int sum = 0;
        if (count2 < count1){
            i = count2;
            k = count1;
        }
        else{
            i = count1;
            k = count2;
        }
        for (; i<k; i++){
           if (i%3 == 0) {
               sum += i;
           }
        }
        System.out.println(sum);
    }

}
