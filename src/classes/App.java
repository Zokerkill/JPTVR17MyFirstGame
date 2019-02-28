/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Melnikov
 */
public class App {
    public void run(){
        Random r = new Random();
        Scanner s = new Scanner(System.in);
        System.out.println("Задай диапазон задумывания чисел:");
        System.out.println("min = "); 
        int min = s.nextInt();
        System.out.println("max = "); 
        int max = s.nextInt();
        System.out.println("Сколько попыток тебе надо?");
        int attempt = s.nextInt();
        int n = 0;
        int myNumber = r.nextInt(max - min + 1) + min;
        do{
            if(n < 1){
                System.out.println(
                    "Программа задумала число от "+min+" до "+max+", угадай:"
                );
            }else{
                System.out.println(
                        "Попытка №"+(n+1)
                );
            }
            int yourNumber = s.nextInt();
            if(myNumber == yourNumber){
                System.out.println("Ты выиграл!");
                n=attempt;
            }else{
                if(n < attempt-1){
                    n++;
                    continue;
                }
                System.out.println("Ты проиграл!");
                System.out.println("Задумано число: "+myNumber);
                break;
            }
        }while(n < attempt);
    }
    
    
}
