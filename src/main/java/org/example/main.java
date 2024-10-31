package org.example;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("명령어 > ");
        String command = scanner.nextLine().trim();
        System.out.println(command);
    }
}

