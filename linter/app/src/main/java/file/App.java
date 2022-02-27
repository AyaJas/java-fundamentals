/*
 * Note ===>  still, I'm working on the last question(File I/O)
 */
package file;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;



public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
//        fileDemoReader();
//        fileDemoReaderResourceFolder();
        fileDemoReader("C:/Users/ayoos/java-fundamentals/linter/app/src/main/resources/gates");
    }
   // C:\Users\ayoos\java-fundamentals\linter\app\src\main\resources\gates.js

    public static void fileDemoReader() {
        File file = new File("gates.js"); // will be relative to the root of the project

//        File file1 = new File("/home/jason/Desktop/class-names.txt"); // absolute paths

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println(fileNotFoundException.getMessage());
        }
    }

    public static void fileDemoReaderResourceFolder() {
        File file = new File("C:/Users/ayoos/java-fundamentals/linter/app/src/main/resources/gates.js"); // will be relative to the root of the project

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }

        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println(fileNotFoundException.getMessage());
        }
    }

    public static void fileDemoReader(String filename) {
        Path path = Paths.get(filename + ".js");

        try {
            BufferedReader reader = Files.newBufferedReader(path);
            String line = reader.readLine();
            while (line != null) {
//                System.out.println(line);

                if (line.length() > 0)
                {
                    if (line.contains(";"))
                    {
                        System.out.println("line having  simicolon ===> " + line.split(";")[0] + "Line number" + line);
                    }
                    else
                    {
                        System.out.println("Line "+line+": Missing semicolon ");
                    }
                }

                line = reader.readLine();
            }
        } catch (IOException exception) {
            System.err.println(exception.getMessage());
        } finally {
            System.out.println("Program executed"); // read up on why this is useful
        }
    }

}
