import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Formatter {
    
 
    public static void main(String[] args) throws FileNotFoundException    
    {
        int width;
        do{
            System.out.println("Enter the output width: ");
            Scanner scanner = new Scanner(System.in);
            width = scanner.nextInt();
        } while (width < 30 || width > 100);

            Scanner inputName = new Scanner(System.in);
            File inputFile;

            do {
               System.out.print("Enter the input file name: ");
               inputFile = new File(inputName.nextLine());
               } while(!inputFile.exists());

            Scanner scan = new Scanner(System.in);
            Scanner output = new Scanner(System.in);
            File outputFile = null;
            String answer = null;
            
            do {
            System.out.println("Enter the name of the output file: ");
            outputFile = new File(scan.nextLine());
            PrintWriter outputWriter;
            if(outputFile.exists())
            {
                System.out.println("File name already exists.  Overwrite file?  (Y or N): ");
                answer = output.nextLine();
                if("y".equals(answer))
                    {
                    try {
                        Scanner scanner = new Scanner(new FileReader(inputFile));
                        outputWriter = new PrintWriter(new FileWriter(outputFile));
                        while (scanner.hasNext()) {
                            System.out.println(scanner.next());
                        }
                        outputWriter.close();
                        } catch (IOException e) {
                    System.out.println(e.toString());}
                    } 
                else
                    answer = "n";
            }
            else
            {
            try {
                Scanner scanner = new Scanner(new FileReader(inputFile));
                outputWriter = new PrintWriter(new FileWriter(outputFile));
                String line = "";
                String word;
                
                for(int n = 0; n < width; n++)
                    {
                        outputWriter.print("*");
                    }
                outputWriter.println("\n");
                while(scanner.hasNext())
                {
                   word = scanner.next();
                   if(line.length() + word.length() > width)
                   {outputWriter.println(line); line = word + " "; }
                   else line += word + " ";
                }
                outputWriter.println(line);
                outputWriter.close();
            } catch (IOException e) {
            System.out.println(e.toString());}
            }               
            } while("n".equals(answer));
    }
}
