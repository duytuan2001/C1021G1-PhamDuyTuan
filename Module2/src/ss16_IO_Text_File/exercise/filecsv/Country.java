package ss16_IO_Text_File.exercise.filecsv;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class Country {
    public static void main(String[] args) {

        File file=new File("D:\\C1021G1-PhamDuyTuan\\Module 2\\src\\ss16_IO_Text_File\\execise\\filecsv\\Test.txt");
        try {
            List<String> rd= Files.readAllLines(file.toPath());
            for( String line: rd){
                System.out.println(line);
            }
        } catch (IOException exception) {
            System.out.println("nhập sai");
        }

    }
}
