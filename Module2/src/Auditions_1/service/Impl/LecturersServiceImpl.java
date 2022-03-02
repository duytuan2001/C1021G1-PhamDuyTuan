//package Auditions_1.service.Impl;
//
//import Auditions_1.model.Lecturers;
//import Auditions_1.service.LecturersService;
//import Auditions_1.until.MyException;
//import Auditions_1.until.RegexData;
//import java.io.*;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Random;
//import java.util.Scanner;
//
//public class LecturersServiceImpl implements LecturersService {
//    static Scanner scanner = new Scanner(System.in);
//
//    static boolean check;
//    static int choose;
//    static String sex = "";
//    private static final String BIRTHDAY_REGEX = "^(((0[1-9]|[12][0-9]|30)[-\\/](0[13-9]|1[012])|31[-\\/](0[13578]|1[02])|(0[1-9]|1[0-9]|2[0-8])[-\\/]02)" +
//            "[-\\/](19[0-9]{2}|200[012])|29[-\\/]02[-\\/]" +
//            "([0-9]{2}(([2468][048]|[02468][48])|[13579][26])|([13579][26]|[02468][048]|0[0-9]|1[0-6])00))$";
//
//    static List<Lecturers> lecturersList = new ArrayList<>();
//
//    static {
//        ReaderLecturers();
//    }
//
//    public static void ReaderLecturers() {
//        try {
//            FileReader fileReader = new FileReader("D:\\C1021G1-PhamDuyTuan\\Module2\\src\\Auditions_1\\data\\lecturers.csv");
//            BufferedReader bufferedReader = new BufferedReader(fileReader);
//
//            String[] temp;
//            String Data;
//            Lecturers lecturers;
//            while ((Data = bufferedReader.readLine()) != null) {
//                temp = Data.split(",");
//                lecturers = new Lecturers(temp[0], temp[1], temp[2], temp[3], temp[4]);
//                lecturersList.add(lecturers);
//            }
//            bufferedReader.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public static void write() {
//        try {
//            FileWriter fileWriter = new FileWriter("D:\\C1021G1-PhamDuyTuan\\Module2\\src\\Auditions_1\\data\\lecturers.csv");
//            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//            for (Lecturers lecturers : lecturersList) {
//
//                bufferedWriter.write(lecturers.getId()
//                        + "," + lecturers.getName()
//                        + "," + lecturers.getDayOfBirth()
//                        + "," + lecturers.getSex()
//                        + "," + lecturers.getSpecialized()
//                        + "\n");
//            }
//            bufferedWriter.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    private String inputAge() {
//        return RegexData.regexStr(scanner.nextLine(), BIRTHDAY_REGEX,
//                "nhập sai vui lòng nhập lại");
//    }
//
//
//    int randomId() {
//        int random;
//        Random rd = new Random();
//        random = rd.nextInt(10);
//        return random;
//    }
//
//
//    @Override
//    public void addLecturers() {
//        String id = "GV-" + randomId() + randomId() + randomId() + randomId();
//
//        System.out.println("Nhập tên: ");
//        String name = scanner.nextLine();
//
//        System.out.println("Nhập ngày sinh: ");
//        String age = inputAge();
//
//        do {
//            check = false;
//            System.out.println("---Giới Tính---");
//            System.out.println("1. Nam.");
//            System.out.println("2. Nữ");
//            System.out.println("3. Khác");
//            try {
//                choose = Integer.parseInt(scanner.nextLine());
//            } catch (NumberFormatException e) {
//                System.out.println("Bạn đã nhập sai vui lòng nhập lại");
//                check = true;
//                continue;
//            }
//            switch (choose) {
//                case 1:
//                    sex = "Nam";
//                    break;
//                case 2:
//                    sex = "Nữ";
//                    break;
//                case 3:
//                    sex = "Khác";
//                default:
//                    check = true;
//                    break;
//            }
//        } while (check);
//
//        System.out.println("Nhập chuyên môn");
//        String specialized = scanner.nextLine();
//        Lecturers lecturers = new Lecturers(id, name, age, sex, specialized);
//        lecturersList.add(lecturers);
//        write();
//        System.out.println("Đã thêm giảng viên thành công");
//    }
//
//
//    @Override
//    public void removeLecturers() {
//        loop :do {
//            check = true;
//            System.out.println("Nhập id Giảng viên bạn muốn xóa: ");
//            String id = scanner.nextLine();
//            for (int i = 0; i < lecturersList.size(); i++) {
//                if (lecturersList.get(i).getId().equals(id)) {
//                    try {
//                        System.out.println("1. yes" + "\n" + "2. no");
//                        choose = Integer.parseInt(scanner.nextLine());
//                        switch (choose) {
//                            case 1:
//                                lecturersList.remove(i);
//                                write();
//                                check = false;
//                                break;
//                            case 2:
//                                removeLecturers();
//                                check = false;
//                                break;
//                            default:
//                                check = true;
//                                break;
//                        }
//                    } catch (NumberFormatException e) {
//                        System.out.println("Bạn nhập sai vui lòng nhập lại");
//                        check = true;
//                        continue loop;
//                    }
//                }
//            }
//            if (check) {
//                try{
//                    throw new MyException();
//                }catch (MyException e){
//                    e.GiangVien();
//                }
//            }
//        } while (check) ;
//    }
//
//
//
//
//    @Override
//    public void displayLecturers() {
//        if (lecturersList.size() == 0) {
//            System.out.println("Hiện tại chưa có danh sách Giảng viên");
//        } else {
//            for (Lecturers lecturers : lecturersList) {
//                System.out.println(lecturers.toString());
//            }
//        }
//    }
//
//
//    @Override
//    public void searchLecturers() {
//        System.out.println("Nhập id giảng viên cần tìm: ");
//        String idLecturers = scanner.nextLine();
//        for (int i = 0; i < lecturersList.size(); i++) {
//            if (lecturersList.get(i).getId().equals(idLecturers)) {
//                lecturersList.add(lecturersList.get(i));
//                write();
//            } else {
//                try {
//                    throw new MyException();
//                } catch (MyException e) {
//                    System.out.println(e.getMessage());
//                }
//            }
//        }
//    }
//}