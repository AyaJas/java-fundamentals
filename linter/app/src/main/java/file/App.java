/*
 * Note ===>  still, I'm working on the last question(File I/O)
 */
package file;

import java.io.*;
import java.io.IOException;


public class App {

    public static void main(String[] args) {

        finalSol();
    }

    public static void finalSol()
    {
        String filePath = "C:/Users/ayoos/java-fundamentals/linter/app/src/main/resources/gates.js";

        try
        {
            LineNumberReader lineReader = new LineNumberReader(new FileReader(filePath));
            String lineText = null;

            while ((lineText = lineReader.readLine()) != null) {
                if(!lineText.contains(";")) {
                    System.out.println("Line "+ lineReader.getLineNumber() + ": " +"Missing semicolon." + "   "+ lineText );
                    System.out.println();
                }
            }

            lineReader.close();
        }
        catch (IOException exception)
        {
            System.err.println(exception.getMessage());
        }
        finally
        {
            System.out.println("Program executed");
        }
    }

}


/*
resources:
- https://www.codejava.net/java-se/file-io/how-to-read-text-file-line-by-line-in-java
 */
