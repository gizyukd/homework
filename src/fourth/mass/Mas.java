package fourth.mass;

import java.util.Arrays;

public class Mas {
    private int[] mas;

    public Mas() {
        this.mas = new int[]{5, 7, 8, 10, 12, 25, 7, 99, 3, 5, 5, 7, 0, 7}; // почему идея не дает инициализировать без new int[]
    }

    public void sortMas(){
        Arrays.sort(this.mas);
        printMas();
    }

    public void findMaxInMas() {
        int max = this.mas[0];
        for (int i = 0; i < this.mas.length; i++) {
            if (equalsMasNumWithTempMax(i, max)) {
                max = this.mas[i];
            }
            System.out.println("Максимальное число в массиве: " + max);
        }
    }

    public void findPosByValue(){
        int cc = 5;
        for (int j=0 ; j < this.mas.length; j++) {
            if (equalsMasNumWithNumb(cc, j)) {
                System.out.println("Позиция элемента в массиве: " + j);
                return;
            }
        }

        System.out.println("Числа нет в массиве");
    }

    private void printMas(){
        System.out.println(Arrays.toString(this.mas));
    }

    private boolean equalsMasNumWithNumb(int cc, int j){
        if (cc == mas[j]) return true;
        else return false;
    }

    private boolean equalsMasNumWithTempMax(int i, int max){
        if (this.mas[i] > max) return true;
        else return false;
    }

}
