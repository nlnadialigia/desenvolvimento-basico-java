package javaDate;

import java.util.Date;

public class Exercicio001 {
    public static void main(String[] args) {

        Date birth = new Date(245679510000L);

        System.out.println(birth);

        Date newDate = new Date(1273925910000L);

        System.out.println(newDate);

        boolean before = birth.before(newDate);
        System.out.println("Antes? " + before);

        boolean after = birth.after(newDate);
        System.out.println("Depois? " + after);



    }

}
