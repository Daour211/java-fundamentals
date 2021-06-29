package com.company;


import java.nio.file.*;
import java.io.*;

public class LogFileTest {

    public static void main(String[] args) {

        Path file = Paths.get("C:\\Users\\Home\\IdeaProjects\\Java Fundamentals\\src\\com\\company\\text.txt");
        try (InputStream in = Files.newInputStream(file);
             BufferedReader reader =
                     new BufferedReader(new InputStreamReader(in))) {
            String line = null;
            int i = 1;
            while ((line = reader.readLine()) != null )  {
               //System.out.println(line);
               i++;
               if(!line.endsWith(";") && !line.endsWith("{") && !line.endsWith("}") && !line.contains("if") && !line.contains("else") ){
                   System.out.println("Line " +i+" : Missing semicolon.");

               }
             
            }
        } catch (IOException x) {
            System.err.println(x);
        }
    }
}