package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ip-адрес ");
        String add = scanner.nextLine();
        String input = add;
        boolean result = input.matches("^(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$");
        if (result) {
            System.out.println("ip-адрес корректный");
        } else {
            System.out.println("ip-адрес некорректный");
        }
    }

}