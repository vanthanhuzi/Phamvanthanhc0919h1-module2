package doc.ghifile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadAndWriteFile {
    public static void main(String[] args) throws IOException {
        File file = new File("thanh.txt");
        if(!file.exists()){
            file.createNewFile();
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        fileInputStream.read();
        int c = fileInputStream.read();
        while (c != -1){
            System.out.println((char) c);
            c = fileInputStream.read();
        }
        fileInputStream.close();
    }

}
