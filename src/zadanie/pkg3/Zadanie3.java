/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadanie.pkg3;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Zadanie3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Имя человека:  ");
        String Name = scanner.nextLine();
        
        System.out.println("Фамилия человека: ");
        String Surname = scanner.nextLine();
        
        System.out.println("День рождения: ");
        int Day = scanner.nextInt();
        
        scanner.nextLine();
        
        System.out.println("Месяц рождения(словами): ");
        String Mouth = scanner.nextLine();
        
        System.out.println("Год рождения: ");
        int Year = scanner.nextInt();
        
        System.out.println(Name + " " + Surname + " Родился " + Day + " " + Mouth + " в " + Year + " Году");
        
    }
    
}
