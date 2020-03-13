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
    //Fácil legibilidade
    // Uso de recursos da linguagem
    private static ArrayList<String> storage;
    public static int end;
    public static Scanner input;



    public static void main(String [] args) {
        //Controller secomp = new Controller();
        //secomp.menu();
        // variaveis declaradas todas juntas
        storage = new ArrayList();
        end = 1;
        input = new Scanner(System.in);
        menu();
    }

/*
    public Controller()
    {
        end = 1;
    }
  */

    public static void menu(){
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

        // Maior utilizacao de metodos
        listar(storage);
    }


    public static void listar(ArrayList<String> storage){
        for(int i = 0; i<storage.size(); i++) {
            System.out.print(i + "- " + storage.get(i)+ "\n");
        }
    }
    public static void cls() {
        for (int i=0;i<100;i++)
            System.out.println();
    }
}
