package Assignments.What_is_object_assgn1;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        Plant p1 = new Plant();
        Scanner input = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("Hello, I am a Plant Magician :) ");
        System.out.println("HA HA HA HAAA ");
//        System.out.println("Tell me about your plant");
        System.out.println("What is the name of your plant?");
        p1.name = input.next();
        System.out.println("How old is your plant?");
        p1.age = input.nextInt();
        System.out.println("What is it from?");
        p1.origin = input.next();
        System.out.println("What is the color of its leaves?");
        p1.leaf.color = input.next();
        System.out.println("What is the size of its leaves?");
        p1.leaf.size = input.next();
        System.out.println("What is the color of its Flower?");
        p1.flower.color = input.next();
        System.out.println("How deep are your plant's roots in meters ?");
        p1.root.depth = input.nextInt();
        System.out.println("Well its my turn to show some magic of the plant");
        System.out.println("HA HA HA HAAA ");
        System.out.println("Alright is the sun out there?");
        String yon= input.next();
        p1.sun=false;
        if (yon.equals("yes")|| yon.equals("YES")) {
            p1.sun = true;
        }
        if (p1.sun)
        {
            System.out.println("Hey look");
            p1.sunlight();
        }
        System.out.println("");
        System.out.println("HA HA HA HAAA ");
        System.out.println("");
        System.out.println("Would you like to relax?");
        yon = input.next();
        boolean i=false;
        if (yon.equals("yes")|| yon.equals("YES")) {
            i = true;
        }
        if(i) {
            p1.relax();
        }

    }
}
