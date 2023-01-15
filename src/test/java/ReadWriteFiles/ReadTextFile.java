package ReadWriteFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadTextFile {


    public static void main(String[] args) throws FileNotFoundException {
        String filesPath = System.getProperty("user.dir") + "\\Resources\\Resource_TXTFile.txt";

        File file = new File(filesPath);
        Scanner sc = new Scanner(file);

        while(sc.hasNextLine())
        {
            System.out.println(sc.nextLine());
        }

    }
}
