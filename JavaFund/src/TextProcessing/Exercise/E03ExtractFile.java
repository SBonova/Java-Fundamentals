package TextProcessing.Exercise;

import java.util.Scanner;

public class E03ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Write a program that reads the path to a file and subtracts the file name and its extension.

        //Прочитаме си входа
        String path = scanner.nextLine();//"C:\Internal\training-internal\Template.pptx"

        String[] parts = path.split("\\\\");
        String fullFileName = parts[parts.length - 1]; //"Template.pptx"//така се взема елемента на последна позиция
        String fileName =fullFileName.split("\\.")[0];
        String extension = fullFileName.split("\\.")[1];
        System.out.println("File name: " + fileName);
        System.out.println("File extension: " + extension);
    }
}
