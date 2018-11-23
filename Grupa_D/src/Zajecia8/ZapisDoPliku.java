package Zajecia8;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ZapisDoPliku {
    public static void main(String[] args) throws IOException {


        PrintWriter printWriter = new PrintWriter(new FileOutputStream("info.csv", true));
        for (int i = 0; i < 10; i++) {
            printWriter.println(i+";"+i+1);
        }
        printWriter.close();

        List<String> allLines = Files.readAllLines(Paths.get("info.csv"));

        System.out.println(allLines.get(0));
        allLines.add("dasdasdas");
        System.out.println(allLines.get(allLines.size() - 1));
        System.out.println(allLines.contains("4;"));

        List<Integer> listaIntow = new ArrayList();

    }
}
