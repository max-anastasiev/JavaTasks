package Reference;

import java.time.*;
import java.util.*;

public class Task6 {


    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        int dayofYear = now.getDayOfYear();

        if (now.isLeapYear()){
            if(360 - dayofYear > 0) {
                System.out.println(360 - dayofYear + " a ramas pina la Craciun");
            }
            else if(360 - dayofYear < 0){
                System.out.println((366 - dayofYear) + 360 + " a ramaas pina la Craciun");
            }
            else {
                System.out.println("Astazi e Craciun");
            }
        }
        else {
            if (359 - dayofYear > 0){
                System.out.println(359 - dayofYear + "a ramas pina la Craciun");
            }
            else if (359 - dayofYear < 0){
                System.out.println((365 - dayofYear) + 359 + " a ramas pina la Craciun");
            }
            else {
                System.out.println("Astazi e Craciun");
            }
        }
    }
}
