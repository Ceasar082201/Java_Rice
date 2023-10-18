package Sample;
import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        String fname,mname,sname,fllname;
        int age,SE,ENTRE,AH,NET,SIA,IPT;
        float ave;
        Scanner nm = new Scanner(System.in);
       // System.out.println("Hello, World!");
        
        System.out.print("Name: ");
        fname = nm.nextLine();
        System.out.print("Middle Name / Initial: ");
        mname = nm.nextLine();
        System.out.print("Surname: ");
        sname = nm.nextLine();
        
        System.out.print("How old are you: ");
        age = nm.nextInt();
        
        fllname = sname +" "+ fname +" "+ mname;
        System.out.print("My Name is " + fllname);
        
        System.out.println("\nI am " + age + " years. old");
        
        System.out.print("Your Grades in the following Subs\n");
        System.out.print("Grade in Software Engineering: ");
        SE = nm.nextInt();
        System.out.print("Grade in Entrep: ");
        ENTRE = nm.nextInt();
        System.out.print("Grade in Arts and Humanities: ");
        AH = nm.nextInt();
        System.out.print("Grade in Networking-2: ");
        NET = nm.nextInt();
        System.out.print("Grade in System Integration and Architecture: ");
        SIA = nm.nextInt();
        System.out.print("Grade in Integrative Programming and Technology-2: ");
        IPT = nm.nextInt();
        //Average
        ave = ((SE + ENTRE + AH + NET + SIA + IPT)/6);
        
        System.out.print("Average: " + ave);
    }
    
}