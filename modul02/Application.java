package com.alevel.modul02;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class Application {
    public static void main(String[] args) {

        File project = new File("src/main/resources");
        List<File> files = Arrays.asList(project.listFiles());
        showList(files);
files.sort(new CompareSize());



    }
    private static  List<File> createSortedFileList(File file) {
        List<File> files = Arrays.asList(file.listFiles());
        files.sort(new FileComparator());

        return files;
    }

    private static void showList(List<File> files) {
        for (File item : files) {
            if (item.isFile()) {
                System.out.println( "File: " + item.getAbsolutePath());
            } else {
                System.out.println( "Directory : " + item.getAbsolutePath());
                showList(createSortedFileList(item));
            }
        }
    }
}
