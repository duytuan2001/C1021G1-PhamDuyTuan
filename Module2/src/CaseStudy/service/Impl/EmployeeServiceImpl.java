//package CaseStudy.service.Impl;
//
//import CaseStudy.model.Employee;
//import CaseStudy.service.EmployeeService;
//import CaseStudy.utils.RegexData;
//import java.io.*;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Random;
//import java.util.Scanner;
//
//
//public class EmployeeServiceImpl implements EmployeeService {
//    private static List<Employee> employeeList = new ArrayList<>();
//    private static Scanner scanner = new Scanner(System.in);
//    private static final String BIRTHDAY_REGEX = "^(((0[1-9]|[12][0-9]|30)[-\\/](0[13-9]|1[012])|31[-\\/](0[13578]|1[02])|(0[1-9]|1[0-9]|2[0-8])[-\\/]02)" +
//            "[-\\/](19[0-9]{2}|200[012])|29[-\\/]02[-\\/]" +
//            "([0-9]{2}(([2468][048]|[02468][48])|[13579][26])|([13579][26]|[02468][048]|0[0-9]|1[0-6])00))$";
//    private static final String EY_IDCARD = "^[0-9]{9}$";
//    private static final String EY_NUMPHONE = "^09[0-9]{7}$";
//    private static final String EY_EMAIL = "^[A-Za-z0-9]+[A-Za-z0-9]*@gmail.com$";
//    private static final String EY_SALARY = "^[1-9][0-9]{2,}$";
//
//    static {
//         ReaderEmployee();
//    }
//
//    public static void ReaderEmployee() {
//        try {
//            FileReader fileReader = new FileReader(new File("D:\\C1021G1-PhamDuyTuan\\Module2\\src\\CaseStudy\\data\\employee.csv"));
//            BufferedReader bufferedReader = new BufferedReader(fileReader);
//            String Data;
//            String[] temp;
//            Employee employee;
//            while ((Data = bufferedReader.readLine()) != null) {
//                temp = Data.split(",");
//                employee = new Employee(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], temp[6], temp[7], temp[8], temp[9]);
//                employeeList.add(employee);
//
//            }
//            bufferedReader.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//    }
//
//    public void write() {
//        try {
//            FileWriter fileWriter = new FileWriter(new File("D:\\C1021G1-PhamDuyTuan\\Module2\\src\\CaseStudy\\data\\employee.csv"));
//            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//            for (Employee employee : employeeList) {
//
//                bufferedWriter.write(employee.getId()
//                        + "," + employee.getName()
//                        + "," + employee.getAge()
//                        + "," + employee.getSex()
//                        + "," + employee.getIdCard()
//                        + "," + employee.getNumBerPhone()
//                        + "," + employee.getEmail()
//                        + "," + employee.getLevel()
//                        + "," + employee.getPosition()
//                        + "," + employee.getSalary()
//                        + "\n");
//            }
//            bufferedWriter.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    @Override
//    public void display() {
//        if (employeeList.size() == 0) {
//            System.out.println("Hi???n t???i ch??a c?? danh s??ch nh??n vi??n");
//        } else {
//            for (Employee employee : employeeList) {
//                System.out.println(employee.toString());
//            }
//        }
//
//    }
//
//    @Override
//    public void addNew() {
//        boolean check = true;
//        int choose = 0;
//        String sex = "";
//        String level = "";
//        String position = "";
//
//        String id = "NV-" +randomId()+randomId();
//
//        System.out.println("Nh???p t??n: ");
//        String name = scanner.nextLine();
//
//        System.out.println("Nh???p ng??y sinh: ");
//        String age = RegexData.regexAge(scanner.nextLine(), BIRTHDAY_REGEX);
//
//        do {
//            check = false;
//            System.out.println("Gi???i T??nh");
//            System.out.println("1. Nam.");
//            System.out.println("2. N???");
//            System.out.println("3. 3D");
//            try {
//                choose = Integer.parseInt(scanner.nextLine());
//            } catch (NumberFormatException e) {
//                System.out.println("B???n ???? ch???n sai vui l??ng ch???n ????ng gi???i t??nh");
//                check = true;
//                continue;
//            }
//            switch (choose) {
//                case 1:
//                    sex = "Nam";
//                    break;
//                case 2:
//                    sex = "N???";
//                    break;
//                case 3:
//                    sex = "3D";
//                    break;
//                default:
//                    check = true;
//                    break;
//            }
//        } while (check);
//
//
//        System.out.println("Nh???p ch???ng minh: ");
//        String idCard = inputEYIDCard();
//
//        System.out.println("Nh???p s??? ??i???n tho???i: ");
//        String numberphone = inputEYPhone();
//
//        System.out.println("Nh???p email: ");
//        String email = inputEYEmail();
//
//        do {
//            check = false;
//            System.out.println("Tr??nh ?????");
//            System.out.println("1. Trung C???p.");
//            System.out.println("2. Cao ?????ng");
//            System.out.println("3. ?????i H???c");
//            System.out.println("4. Sau ?????i H???c");
//            try {
//                choose = Integer.parseInt(scanner.nextLine());
//            } catch (NumberFormatException e) {
//                System.out.println("B???n nh???p sai ?????nh d???ng vui l??ng nh???p ch??? s???");
//                check = true;
//                continue;
//            }
//            switch (choose) {
//                case 1:
//                    level = "Trung c???p";
//                    break;
//                case 2:
//                    level = "Cao ?????ng";
//                    break;
//                case 3:
//                    level = "?????i h???c";
//                    break;
//                case 4:
//                    level = "Sau ?????i H???c";
//                    break;
//                default:
//                    check = true;
//                    break;
//            }
//        } while (check);
//
//        do {
//            check = false;
//            System.out.println("V??? tr??");
//            System.out.println("1. L??? t??n.");
//            System.out.println("2. Ph???c v???");
//            System.out.println("3. Chuy??n vi??n.");
//            System.out.println("4. Gi??m s??t");
//            System.out.println("5. Qu???n l??");
//            System.out.println("6. Gi??m ?????c");
//            try {
//                choose = Integer.parseInt(scanner.nextLine());
//            } catch (NumberFormatException e) {
//                System.out.println("B???n ???? nh???p sai vui l??ng nh???p l???i");
//                check = true;
//                continue;
//            }
//            switch (choose) {
//                case 1:
//                    position = "L??? t??n";
//                    break;
//                case 2:
//                    position = "Cao ?????ng";
//                    break;
//                case 3:
//                    position = "?????i h???c";
//                    break;
//                case 4:
//                    position = "Sau ?????i H???c";
//                    break;
//                default:
//                    check = true;
//                    break;
//            }
//        } while (check);
//
//        System.out.println("Nh???p l????ng: ");
//        String salary = inputSalary();
//
//        Employee employee = new Employee(id, name, age, sex, idCard, numberphone, email, level, position, salary);
//        employeeList.add(employee);
//        System.out.println(employeeList.size());
//        write();
//        System.out.println("???? th??m th??nh c??ng nh??n vi??n");
//
//    }
//
//
//
//    private String inputEYIDCard() {
//        return RegexData.regexStr(scanner.nextLine(), EY_IDCARD,
//                "B???n ???? nh???p sai vui l??ng nh???p l???i, ch???ng minh g???m c?? 9 s???");
//    }
//
//    private String inputEYPhone() {
//        return RegexData.regexStr(scanner.nextLine(), EY_NUMPHONE,
//                "B???n ???? nh???p sai vui l??ng nh???p l???i, S??? ??i???n tho???i g???m 9 s??? v?? b???t ?????u b???ng 09");
//    }
//
//    private String inputEYEmail() {
//        return RegexData.regexStr(scanner.nextLine(), EY_EMAIL,
//                "B???n ???? nh???p sai ?????nh d???ng, vui l??ng nh???p l???i");
//    }
//
//    private String inputSalary() {
//        return RegexData.regexStr(scanner.nextLine(), EY_SALARY,
//                "B???n ph???i nh???p s???, vui l??ng nh???p l???i");
//    }
//
//    @Override
//    public void edit() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nh???p t??n nh??n vi??n m?? b???n mu???n s???a ?????i th??ng tin: ");
//        String name = scanner.nextLine();
//        List<Employee> editList = new ArrayList<>();
//        for (Employee employee : employeeList) {
//            if (employee.getName().contains(name)) {
//                editList.add(employee);
//            }
//        }
//        if (editList.size() < 1) {
//            System.out.println("Kh??ng c?? ng?????i b???n mu???n t??m.");
//        } else if (editList.size() == 1) {
//            Employee employee = editList.get(0);
//            for (Employee employee1 : employeeList) {
//                if (employee1.getId().equals(employee.getId())) {
//                    String oldID = employee1.getId();
//                    String numID = oldID.substring(2);
//                    String position = scanner.nextLine();
//                    String newID = position + numID;
//                    employee1.setId(newID);
//                    employee1.setName(scanner.nextLine());
//                    employee1.setAge(scanner.nextLine());
//                    employee1.setSex(scanner.nextLine());
//                    employee1.setIdCard(scanner.nextLine());
//                    employee1.setNumBerPhone(scanner.nextLine());
//                    employee1.setEmail(scanner.nextLine());
//                    employee1.setLevel(scanner.nextLine());
//                    employee1.setPosition(scanner.nextLine());
//                    employee1.setSalary(scanner.nextLine());
//                }
//            }
//            write();
//        }
//    }
//
//    int randomId(){
//        int random;
//        Random rd = new Random();
//        random = rd.nextInt(10);
//        return random;
//    }
//}
//
//
//
