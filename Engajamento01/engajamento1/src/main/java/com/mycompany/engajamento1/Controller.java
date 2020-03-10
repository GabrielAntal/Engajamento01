/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.engajamento1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */

public class Controller {
    public Controller() {
        end = 1;
    }
    private final ArrayList<String> storage = new ArrayList();
    public int end;
    public  Scanner input = new Scanner(System.in); 
    public void menu(){
        while(end != 0){
            System.out.println("Secomp 2020-2\nStudents List:\nName: ");
            input.nextLine();
            if(!storage.contains(input.next())){
                storage.add(input.next());
                System.out.println("Has the event ended??(0 to yes and 1 to no)");
                end = input.nextInt();
                cls();
            }    
        }
        for(int i = 0; i<storage.size(); i++) {   
        System.out.print(i + "- " + storage.get(i)+ "\n");
        }    
    }
    public void cls() {
        for (int i=0;i<100;i++)
            System.out.println();
    }
}
