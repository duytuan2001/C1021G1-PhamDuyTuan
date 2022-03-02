//package Auditions_1.service.Impl;
//
//import Auditions_1.model.Student;
//import Auditions_1.service.StudentService;
//import Auditions_1.until.MyException;
//import Auditions_1.until.RegexData;
//import java.io.*;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Random;
//import java.util.Scanner;
//
//public class StudentServiceImpl implements StudentService {
//    static Scanner scanner = new Scanner(System.in);
//    static boolean check;
//    static int choose;
//    static String sex = "";
//    private static final String BIRTHDAY_REGEX = "^(((0[1-9]|[12][0-9]|30)[-\\/](0[13-9]|1[012])|31[-\\/](0[13578]|1[02])|(0[1-9]|1[0-9]|2[0-8])[-\\/]02)" +
//            "[-\\/](19[0-9]{2}|200[012])|29[-\\/]02[-\\/]" +
//            "([0-9]{2}(([2468][048]|[02468][48])|[13579][26])|([13579][26]|[02468][048]|0[0-9]|1[0-6])00))$";
//
//    static List<Student> studentList = new ArrayList<>();
//
//    static {
//        ReaderStudent();
//    }
//
//    public static void ReaderStudent() {
//        try {
//            FileReader fileReader = new FileReader(new File("D:\\C1021G1-PhamDuyTuan\\Module2\\src\\Auditions_1\\data\\student.csv"));
//            BufferedReader bufferedReader = new BufferedReader(fileReader);
//            String Data;
//            String[] temp;
//            Student student;
//            while ((Data = bufferedReader.readLine()) != null) {
//                temp = Data.split(",");
//                student = new Student(temp[0], temp[1], temp[2], temp[3], Byte.parseByte(temp[4]), Byte.parseByte(temp[5]));
//                studentList.add(student);
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
//            FileWriter fileWriter = new FileWriter(new File("D:\\C1021G1-PhamDuyTuan\\Module2\\src\\Auditions_1\\data\\student.csv"));
//            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//            for (Student student : studentList) {
//
//                bufferedWriter.write(student.getId()
//                        + "," + student.getName()
//                        + "," + student.getDayOfBirth()
//                        + "," + student.getSex()
//                        + "," + student.getClassStudent()
//                        + "," + student.getPoint()
//                        + "\n");
//            }
//            bufferedWriter.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
////
////    private String inputAge(){
////        return RegexData.regexStr(scanner.nextLine(), BIRTHDAY_REGEX,
////                "nhập sai vui lòng nhập lại");
////    }
//
//
//    int randomId() {
//        int random;
//        Random rd = new Random();
//        random = rd.nextInt(10);
//        return random;
//    }
//
//    @Override
//    public void addStudent() {
//        String id = "SV-" + randomId() + randomId() + randomId() + randomId();
//
//        System.out.println("Nhập tên: ");
//        String name = scanner.nextLine();
//
////        System.out.println("Nhập ngày sinh: ");
////        String age = inputAge();
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
//        System.out.println("Nhập điểm: ");
//        byte point = Byte.parseByte(scanner.nextLine());
//        System.out.println("Nhập lớp: ");
//        byte classStudent = Byte.parseByte(scanner.nextLine());
////        Student student = new Student(id, name, age, sex, point, classStudent);
////        studentList.add(student);
//        write();
//        System.out.println("Đã thêm học viên thành công");
//    }
//
//    @Override
//    public void removeStudent() {
//        do {
//                check = true;
//                System.out.println("nhap tên hoc vien muon xoa");
//                String name = scanner.nextLine();
//                for (int i = 0; i < studentList.size(); i++) {
//                    if (studentList.get(i).getName().contains(name)) {
//                        System.out.println("ban co muon xoa khong?(1 yes 2 no)");
//                        int op = Integer.parseInt(scanner.nextLine());
//                        if (op == 1) {
//                            studentList.remove(i);
//                            System.out.println("Đã xóa thành công.");
//                            check = false;
//                            break;
//                        } else {
//                            check = false;
//                            break;
//                        }
//                    }
//                }
//                if (check == true){
//                    try {
//                        throw new MyException();
//                    } catch (MyException e) {
//                        e.HocSinh();
//                    }
//                    check = false;
//                }
//            write();
//        } while (check);
//    }
//
//
//    @Override
//    public void displayStudent() {
//        if (studentList.size() == 0) {
//            System.out.println("Hiện tại chưa có danh sách học viên");
//        } else {
//            for (Student student : studentList) {
//                System.out.println(student.toString());
//            }
//        }
//    }
//
//    @Override
//    public void searchStudent() {
//        System.out.println("Nhập id học viên cần tìm: ");
//        String strLecturers = scanner.nextLine();
//        for (int i = 0; i < studentList.size(); i++) {
//            if (studentList.get(i).getName().equals(strLecturers)) {
//                studentList.add(studentList.get(i));
//                write();
//            }
//        }
//        if (studentList.size() == 0) {
//            System.out.println("Không có học viên trong danh sách!");
//        } else {
//            for (Student student : studentList) {
//                System.out.println(student);
//            }
//
//        }
//    }
//}
