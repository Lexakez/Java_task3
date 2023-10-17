/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktv22task3kezerev;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
class App {

    void run() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введите ваше имя: ");
        String Name = scanner.nextLine();
        
        System.out.print("Введите вашу фамилию: ");
        String lastName = scanner.nextLine();
        
        System.out.print("Введите ваш личный код: ");
        String code = scanner.nextLine();
        
        String year = code.substring(1, 3);
        
        String month = code.substring(3, 5);
        
        String day = code.substring(5, 7);
        
        char firstnum = month.charAt(0);
        char secondnum = month.charAt(1);
        String monthName = " ";
        String[] monthNames = {
                "Января", "Февраля", "Марта", "Апреля", "Мая", "Июня",
                "Июля", "Августа", "Сентября", "Октября", "Ноября", "Декабря"
            };
         
        switch (firstnum) {
            case '0':
                monthName = monthNames[secondnum - '0' - 1];
                break;
            case '1':
                int monthNumber = Integer.parseInt(month);
                monthName = monthNames[monthNumber - 1];
                break;
        }
        
        System.out.println(Name + " " + lastName + " родился " + day + " " + monthName + " " + year + " года");
        
        scanner.close();
    }
    
}
