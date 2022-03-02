package ss16_IO_Text_File.exercise.copyfiletext;

import java.io.*;

public class CopyFileText {

    public static void main(String[] args) {
        File fileRead = new File("D:\\C1021G1-PhamDuyTuan\\Module 2\\src\\ss16_IO_Text_File\\execise\\fileinputread.txt");
        File fileWrite = new File("D:\\C1021G1-PhamDuyTuan\\Module 2\\src\\ss16_IO_Text_File\\execise\\fileoutputwrite.txt");

        try {

            if (!fileRead.exists() || !fileWrite.exists()) {
                throw new IOException();
            }
        } catch (IOException e) {
            System.out.println("Lỗi file");
        }

        try {
            FileReader fileReader = new FileReader(fileRead);
            FileWriter fileWriter = new FileWriter(fileWrite);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String data = "";
            while ((data = bufferedReader.readLine()) != null) {
                bufferedWriter.write(data);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}


