package jatek;

import java.util.Random;

import java.util.Scanner;

public class KoPapirOllo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        Random rnd = new Random();        
         String jatek;
        do {
           
            System.out.print("Válassz: ");
            String choice = sc.nextLine();
            String tipp = "";
            int robot = rnd.nextInt(3)+1;

            if(robot == 1) {
                tipp = "kő";
            } else if (robot == 2) {
                tipp = "papír";
            } else if (robot == 3) {
                tipp = "olló";
            }

            System.out.println("Robot választása: " + tipp);

            if ("kő".equals(choice) && "papír".equals(tipp)) {
                System.out.println("Robot nyert");

            }
            else if ("kő".equals(choice) && "olló".equals(tipp)) {
                System.out.println("Te nyertél");
            }
            else if ("papír".equals(choice) && "olló".equals(tipp)) {
                System.out.println("Robot nyert");
            }
            else if ("papír".equals(choice) && "kő".equals(tipp)) {
                System.out.println("Te nyertél");
            }
            else if ("olló".equals(choice) && "papír".equals(tipp)) {
                System.out.println("Te nyertél");

            }
            else if ("olló".equals(choice) && "kő".equals(tipp)) {
                System.out.println("Robot nyert");
            }
            else if ("kő".equals(choice) && "kő".equals(tipp)) {
                System.out.println("Döntetlen");
            }
            else if ("papír".equals(choice) && "papír".equals(tipp)) {
                System.out.println("Döntetlen");
            }
            else if ("olló".equals(choice) && "olló".equals(tipp)) {
                System.out.println("Döntetlen");

            }
            System.out.print("Akarsz még játszani?:");
            jatek = sc.nextLine();

        } while ("igen".equals(jatek));
    }
    }
