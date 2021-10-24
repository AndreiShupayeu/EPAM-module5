package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;


public class Test {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
while (true){
    int x = Integer.parseInt(in.nextLine());
    try {
        if (x != 0) {
            throw new IOException();
        }
    }catch (IOException e){
        System.out.println("You should enter only digit - 0");
    }
}

    }
}
