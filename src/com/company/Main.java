package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите оценку от 2 до 5:");
        int a = sc.nextInt();
        sc.close();

        if ( a == 5 )
            System.out.println("отлично");
        if ( a == 4 )
            System.out.println("хорошо");
        if ( a == 3 )
            System.out.println("удовлетворительно");
        if ( a == 2 )
            System.out.println("неудовлетворительно");
    }
}
