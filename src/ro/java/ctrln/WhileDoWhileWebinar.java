package ro.java.ctrln;

public class WhileDoWhileWebinar {

    public static void main(String[] args) {
        //1.Pot sa calculez suma numerelor pare/impare dintr-un vector sau o colectie
        //1.a Pot sa calc suma numerelor de pe pozitii pare/impare dintr-un vector/colectie
        //2.Pot sa aflu numele unor persoane dintr-o colectie de persoane
        //3.Tot ce implica repetitie e ok pt while si do while

        //1.
        int vector[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int index = 0;
        int sum = 0;
        while (index < 10) {
            System.out.println("Evaluez numarul + vector[index]");
            if (vector[index] % 2 == 0) {// asa testez ca un numar este par
                sum = sum + vector[index];
            }
            index = index+1; // index++, asemanator
        }
        System.out.println("Suma numerelor pare este:" + sum);
        System.out.println("----------------------------------");
    }
}


