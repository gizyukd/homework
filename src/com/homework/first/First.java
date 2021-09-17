package com.homework.first;

public class First {
    public void firstHomework(){
        //task2
        byte b;
        short s;
        int i = 12;
        int k = 5;
        int sum = i/k;
        int iCompare = k*sum;
        int ost = i%k;
        long l;
        float f;
        double d;
        char c;
        boolean bool;

        //task 3
        //System.out.println(sum);

        //task 4
        /* if (i>k){
            System.out.println(i);
        }
        else {
            System.out.println(k);
        }*/

        // task 5
        /*if (i%k != 0){
            System.out.print("Остаток от деления ");
            System.out.println(i%k);
            System.out.print("Целая часть ");
            System.out.println(i - i%k);
        }*/

        //task 6
        /*int num = 5468;
        System.out.print("Единиц ");
        System.out.println(num%10);
        System.out.print("Десятков ");
        System.out.println((num/10)%10);
        System.out.print("Сотен ");
        System.out.println((num/100)%10);
        System.out.print("Тысяч ");
        System.out.println((num/1000)%10);*/

        //task 7
        /*char a = 'a';
        a = (char) (a + 1);
        //a+=1
        System.out.println(a);
        System.out.println((int) a);
*/
        //task 8
        //byte ii = 128;
        /*byte ii = (byte) 128;
        System.out.println(ii);
*/
        //task 9
        float kk = 10f;
        System.out.println(kk/0);

    }
}
