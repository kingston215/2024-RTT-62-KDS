package Slides_303_13;

import java.io.File;
import java.io.IOException;
public class FileExample {
    public static void main(String[] args) {
    //    File file = new file()
        // // .. means go up one directory from where you are
        // // . means the current directory where I am right now


        File code = new File("/Users/kennethsmith/Desktop/2024-RTT-62-KDS/Java Class Work/Java Class Work");

        File relative = new File("Java Class Work/Java Class Work.");


        try {
            File f = new File(".");
            System.out.println(f.getCanonicalPath());

            File[] files = f.listFiles();
            for (File file : files) {
                System.out.print("     " + file.getCanonicalPath());
                if (file.isDirectory()) {
                    System.out.println(" is a directory");
                } else {
                    System.out.println(" is a file");
                }
            }


            File file = new File("./newfile.txt");
            file.createNewFile();

        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }


    }
}




