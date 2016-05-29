/**
 * Created by Gleb on 29.05.2016.
 *
 * Необходимо разработать функцию для выборки определенного числа тест-кейсов из файла c расширением txt.
 *
 * На вход функции подаются 2 параметра: путь к исходному файлу(обязательный параметр),
 * который содержит таблицу в текстовом виде (разделителями являются табуляция и символ новой строки)
 * и необязательный параметр — количество строк, которые надо выбрать из файла.
 * По умолчанию необходимо выбрать 10 строк.
 */

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        String par1 = "", par2 = "";
        int number;
        Scanner user_input = new Scanner( System.in );
        System.out.print("Enter the full path of the file: ");
        par1 = user_input.next( );

        System.out.print("Do you want to enter number of lines to read? (Yes - enter 1, NO - any symbol): ");
        par2 = user_input.next( );
        System.out.println(par2);
        if (par2.equals("1")){
            System.out.print("Enter number of lines to read from file: ");
            String par3 = user_input.next( );
            number = Integer.parseInt(par3);
        }
        else {
            number = 10;
        }


        TestCase tc = new TestCase();
        tc.setPath(par1);
        String path = tc.getPath();
        tc.setLines(number);
        int lines = tc.getLines();

        String[] string ;
        string = tc.getLines(path, lines);


        for (int i=0; i<string.length; i++){
            System.out.println(string[i]);
        }

    }
}
