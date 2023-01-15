package ReadWriteFiles;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

    public static void main(String[] args) throws IOException {

        String filesPath = System.getProperty("user.dir") + "\\Resources";

        File file = new File(filesPath+"\\WriteFile.txt");
        FileWriter wr = new FileWriter(file);
        String str = "Writing a File";

        for(int i=0;i<str.length();i++){
            wr.write(str.charAt(i));
        }
        wr.close();
        System.out.println("Writing completed");
    }
}
