package doc.ghifile;

import java.io.*;

public class CreatFile {
    public static void main(String[] args) throws IOException {
        File file = new File("hello");
        file.mkdir();
        File b = new File("hello/ti.txt");
        if(!b.exists()){
            b.createNewFile();
        }
        FileReader fileReader = new FileReader(b);
        int a = fileReader.read();
        while (a != -1){
            System.out.println((char) a);
            a = fileReader.read();
        }
        fileReader.close();
        String s = "thanh";
        FileWriter fileWriter = new FileWriter(b);
        fileWriter.write(s);
        fileWriter.close();
    }

}
