//package CaseStudy.service.Impl;
//
//import CaseStudy.model.Customer;
//import CaseStudy.model.Person;
//import CaseStudy.service.CustomerService;
//import CaseStudy.utils.RegexData;
//import java.io.*;
//import java.util.*;
//
//
//public class CustomerServiceImpl implements CustomerService {
//    private static List<Customer> customerList = new LinkedList<>();
//    private Scanner scanner = new Scanner(System.in);
//    private static final String BIRTHDAY_REGEX = "^(((0[1-9]|[12][0-9]|30)[-\\/](0[13-9]|1[012])|31[-\\/](0[13578]|1[02])|(0[1-9]|1[0-9]|2[0-8])[-\\/]02)" +
//            "[-\\/](19[0-9]{2}|200[012])|29[-\\/]02[-\\/]" +
//            "([0-9]{2}(([2468][048]|[02468][48])|[13579][26])|([13579][26]|[02468][048]|0[0-9]|1[0-6])00))$";
//    private static final String EY_IDCARD = "^[0-9]{9}$";
//    private static final String EY_NUMPHONE = "^09[0-9]{7}$";
//    private static final String EY_EMAIL = "^[A-Za-z0-9]+[A-Za-z0-9]*@gmail.com$";
//
//    static {
//        ReaderCustomer();
//    }
//
//    public static void ReaderCustomer() {
//        try {
//            FileReader fileReader = new FileReader(new File("D:\\C1021G1-PhamDuyTuan\\Module2\\src\\CaseStudy\\data\\customer.csv"));
//            BufferedReader bufferedReader = new BufferedReader(fileReader);
//            String Data;
//            String[] temp;
//            Customer customer;
//            while ((Data = bufferedReader.readLine()) != null) {
//                temp = Data.split(",");
//                customer = new Customer(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], temp[6], temp[7], temp[8]);
//                customerList.add(customer);
//            }
//            bufferedReader.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void write() {
//        try {
//            FileWriter fileWriter = new FileWriter(new File("D:\\C1021G1-PhamDuyTuan\\Module2\\src\\CaseStudy\\data\\customer.csv"));
//            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//            for (Customer customer : customerList) {
//
//                bufferedWriter.write(customer.getId()
//                        + "," + customer.getName()
//                        + "," + customer.getAge()
//                        + "," + customer.getSex()
//                        + "," + customer.getIdCard()
//                        + "," + customer.getNumBerPhone()
//                        + "," + customer.getEmail()
//                        + "," + customer.getTypeCustomer()
//                        + "," + customer.getAddress()
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
//        if (customerList.size() == 0) {
//            System.out.println("Hi???n t???i ch??a c?? danh s??ch kh??ch h??ng");
//        } else {
//            for (Customer customer : customerList) {
//                System.out.println(customer.toString());
//            }
//        }
//    }
//
//    @Override
//    public void addNew() {
//        boolean check;
//        int choose;
//        String sex = "";
//        String typeCustomer = "";
//
//        String id = "KH-" + randomId() + randomId();
//
//        System.out.println("Nh???p t??n: ");
//        String name = scanner.nextLine();
//
//        System.out.println("Nh???p ng??y sinh d???ng (dd/MM/yyy): ");
//        String age = inputEYBirthDay();
//
//        do {
//            check = false;
//            System.out.println("--Gi???i T??nh--");
//            System.out.println("1. Nam.");
//            System.out.println("2. N???");
//            System.out.println("3. 3D");
//            try {
//                choose = Integer.parseInt(scanner.nextLine());
//            } catch (NumberFormatException e) {
//                System.out.println("B???n ???? nh???p sai vui l??ng nh???p l???i");
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
//            check = true;
//            System.out.println("Lo???i kh??ch h??ng.");
//            System.out.println("1. Diamond.");
//            System.out.println("2. Platinium.");
//            System.out.println("3. Gold.");
//            System.out.println("4. Silver");
//            System.out.println("5. Member");
//            try {
//                choose = Integer.parseInt(scanner.nextLine());
//            } catch (NumberFormatException e) {
//                System.out.println("B???n nh???p sai ?????nh d???ng vui l??ng nh???p l???i");
//                check = true;
//                continue;
//            }
//            switch (choose) {
//                case 1:
//                    typeCustomer = "Diamond";
//                    break;
//                case 2:
//                    typeCustomer = "Platinium";
//                    break;
//                case 3:
//                    typeCustomer = "Gold";
//                    break;
//                case 4:
//                    typeCustomer = "Silver";
//                    break;
//                case 5:
//                    typeCustomer = "Member";
//                    break;
//                default:
//                    check =true;
//                    break;
//            }
//        } while (check);
//
//        System.out.println("?????a ch???");
//        String address = scanner.nextLine();
//
//        Customer customer = new Customer(id, name, age, sex, idCard, numberphone, email, typeCustomer, address);
//        customerList.add(customer);
//        write();
//        System.out.println("???? th??m danh s??ch kh??ch h??ng th??nh c??ng");
//    }
//
//    private String inputEYBirthDay() {
//        return RegexData.regexAge(scanner.nextLine(), BIRTHDAY_REGEX);
//    }
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
//
//
//    @Override
//    public void edit() {
//        System.out.println("Input your id");
//        String fixid = scanner.nextLine();
//        boolean check = false;
//        for (Person customer : customerList) {
//            System.out.println(customer.getId());
//            if (customer.getId().equals(fixid)) {
//                check = true;
//                System.out.println("DANH S??CH S???A TH??NG TIN");
//                System.out.println("2. name");
//                System.out.println("3. dateOfBirth");
//                System.out.println("4. sex");
//                System.out.println("5. idCard");
//                System.out.println("6. numberPhone");
//                System.out.println("7. email");
//                System.out.println("8. type");
//                System.out.println("9. address");
//                int choice = scanner.nextInt();
//                scanner.skip("\\R");
//                try {
//                    choice = Integer.parseInt(scanner.nextLine());
//                } catch (NumberFormatException e) {
//                    System.out.println("B???n ???? nh???p sai vui l??ng nh???p l???i");
//                }
//                switch (choice) {
//                    case 2:
//                        System.out.println("S???a t??n: ");
//                        String fixName = scanner.nextLine();
//                        customer.setName(fixName);
//                        break;
//
//                    case 3:
//                        System.out.println("sua ngay sinh");
//                        String fixAge = scanner.nextLine();
//                        customer.setAge(fixAge);
//                        break;
//
//                    case 4:
//                        System.out.println("sua gioi tinh");
//                        String fixSex = scanner.nextLine();
//                        customer.setSex(fixSex);
//                        break;
//
//                    case 5:
//                        System.out.println("sua cmnd");
//                        String fixIdcard = scanner.nextLine();
//                        customer.setIdCard(fixIdcard);
//                        break;
//
//                    case 6:
//                        System.out.println("sua sdt");
//                        String fixNumberPhone = scanner.nextLine();
//                        customer.setNumBerPhone(fixNumberPhone);
//                        break;
//
//                    case 7:
//                        System.out.println("S???a Email: ");
//                        String fixEmail = scanner.nextLine();
//                        customer.setEmail(fixEmail);
//                        break;
//
//                    case 8:
//                        System.out.println("S???a lo???i kh??ch h??ng: ");
//                        String fixType = scanner.nextLine();
//                        ((Customer) customer).setTypeCustomer(fixType);
//                        break;
//
//                    case 9:
//                        System.out.println("?????a ch???: ");
//                        String fixAddress = scanner.nextLine();
//                        ((Customer) customer).setAddress(fixAddress);
//                        break;
//                }
//            } else if (!check) {
//                System.out.println("ID not found!");
//            }
//        }
//        write();
//    }
//
//    int randomId() {
//        int random;
//        Random rd = new Random();
//        random = rd.nextInt(10);
//        return random;
//    }
//}
