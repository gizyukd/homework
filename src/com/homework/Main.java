package com.homework;

import fifth.Director;
import fifth.Employee;
import fifth.Worker;

public class Main {

    public static void main(String[] args){
//        Second sec = new Second();
//        Third thr = new Third();
//        sec.printLetterByIf();
//        sec.printLetterBySwitch();
//        sec.checkMonth();
//        sec.exitByDoWhile();
//        sec.sumBetweenCounts();

// fourth
//        int[] mas = thr.createFibMas();
//        thr.findMinMaxFibMas(mas);
//        thr.findDifEvenOdd(mas);
//        thr.findMostFrequent();

   //     ENUMSEASONS month = ENUMSEASONS.FEBRUARY;
   //     month.findSeason(month);

//        User user = new User(21, "Dima", "Gizyuk", true);
//        user.getFullInfoAboutUser();
//        user.getFIO();
//        user.increaseAge();

//        ConstructorClass con  = new ConstructorClass("string", 1);

//        Overload over = new Overload();
//        over.overloadMethod();
//        over.overloadMethod("www");
//        over.overloadMethod("sss", 1);

//        TheSameName theSameNameOne = new TheSameName();
//        fourth.difPackTwo.TheSameName theSameNameTwo = new fourth.difPackTwo.TheSameName();

        Employee worker1 = new Worker(1, "dima", "gizyuk");
        Employee worker2 = new Worker(2, "alina", "lestrewa");
        Employee worker3 = new Worker(3, "diana", "nebylitsa");
        Employee director = new Director(5, "Директор", "Красный");
        //System.out.println(worker1.toString() + "\n" + worker2.toString() + "\n" + worker3.toString() + "\n" + director.toString() );
        ((Director)director).addWorker(worker1);
        ((Director)director).addWorker(worker2);

        Employee director2 = new Director(4, "Монополист", "Из 90-х");
        ((Director)director2).addWorker(worker3);
        ((Director)director).addWorker(director2);

        System.out.println(director);
        System.out.println(director2);


    }

}
