package com.alevel.modul02;

import java.io.*;

public class FindWorld {
    public static void main(String args[]) {

        if (args.length == 2) {
            System.out.println("Find word: " +
                    args[0] + " in file: " + args[1]);

            try {
                LineNumberReader lnr = new LineNumberReader(
                        new BufferedReader(
                                new FileReader(args[1])));

                String s;
                while (true) {
                    s = lnr.readLine();
                    if (s == null)
                        break;

                    if (s.indexOf(args[0]) != -1) {
                        System.out.println("<<< " +
                                lnr.getLineNumber() + " >>>" + s);
                    }
                }

                lnr.close();
            } catch (IOException ex) {
                System.out.println(ex.toString());
                System.exit(0);
            }
        } else
            System.out.println("Args: word file");
    }


}
