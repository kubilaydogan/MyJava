package Coding;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Scanner_createList {
    public static void main(String[] args) {

        createAList(4);

    }

    public static List createAList(int size) {
        List list = new ArrayList<>();
        System.out.println("Create a list: ");
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (count<size) {
            list.add(scanner.nextLine());
            count++;
        }
        System.out.println("List is full!");
        System.out.println("Our list: " + list);
        return list;
    }
}