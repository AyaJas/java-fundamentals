/*
 * Note ===>  still, I'm working on the last question(File I/O)
 */
package file;

import java.io.*;
import java.io.IOException;


public class App {

    public static void main(String[] args) {

        finalSol("C:/Users/ayoos/java-fundamentals/linter/app/src/main/resources/gates.js");
    }

    public static String finalSol(String filePath)
    {
//        String filePath = "C:/Users/ayoos/java-fundamentals/linter/app/src/main/resources/gates.js";

        String result = "";

        try
        {
            LineNumberReader lineReader = new LineNumberReader(new FileReader(filePath));
            String lineText = null;

            while ((lineText = lineReader.readLine()) != null) {
                if(!(lineText.contains(";") || lineText.contains("if") || lineText.contains("else") || lineText.endsWith("{") || lineText.endsWith("}") || lineText.length() == 0)){
                    String aya = "Line "+ lineReader.getLineNumber() + ": " +"Missing semicolon.";
                    result += aya + "\n";

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

        return result;

    }
}


/*
resources:
- https://www.codejava.net/java-se/file-io/how-to-read-text-file-line-by-line-in-java
 */
