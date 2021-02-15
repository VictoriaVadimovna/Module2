package com.alevel.modul02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FromConsol {
    public static void main(String[] args) throws IOException {


        //"src/main/resources"
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        String s = " ";


        while (!s.equals("find")){
            s = reader.readLine();
            stringBuilder.append(s).append("\n");

            System.out.println();



        }
reader.close();

    }
}
