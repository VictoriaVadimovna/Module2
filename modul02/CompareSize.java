package com.alevel.modul02;

import java.io.File;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class CompareSize implements Comparator<File> {
    Map<String, Long> map = new TreeMap<>();


    @Override
    public int compare(File fileLeft, File fileRight) {

        return (int) (fileLeft.length() - fileRight.length());
    }
}
