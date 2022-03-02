package praticing_test_1.service.Impl;

import praticing_test_1.model.PaymentAccount;
import praticing_test_1.service.Service;
import praticing_test_1.until.NotFoundBankAccountException;
import praticing_test_1.until.RegexData;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PaymentAccountImpl implements Service {
    static boolean check;
    static Scanner scanner = new Scanner(System.in);
    static List<PaymentAccount> paymentAccountList = new ArrayList<>();

    private static final String PAY_DATE = "^(0?[1-9]|[12][0-9]|3[01])[\\/\\-](0?[1-9]|1[012])[\\/\\-]\\d{4}$";
    private static final String PAY_CODE = "^[0-9]{9}$";


    static {
        ReaderImported();
    }

    public static void ReaderImported() {
        try {
            FileReader fileReader = new FileReader("D:\\C1021G1-PhamDuyTuan\\Module2\\src\\praticing_test_1\\data\\bank_accounts.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String Data;
            String[] temp;
            PaymentAccount paymentAccount;
            while ((Data = bufferedReader.readLine()) != null) {
                temp = Data.split(",");
                paymentAccount = new PaymentAccount(temp[1],
                        temp[2],
                        temp[3],
                        temp[4],
                        temp[5]);
                paymentAccount.setId(Integer.parseInt(temp[0]));
                paymentAccountList.add(paymentAccount);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void write() {
        try {
            FileWriter fileWriter = new FileWriter("D:\\C1021G1-PhamDuyTuan\\Module2\\src\\praticing_test_1\\data\\bank_accounts.csv");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (PaymentAccount paymentAccount : paymentAccountList) {
                bufferedWriter.write(paymentAccount.getId()
                        + "," + paymentAccount.getCodeAccount()
                        + "," + paymentAccount.getNameAccount()
                        + "," + paymentAccount.getDateAccount()
                        + "," + paymentAccount.getCardNumber()
                        + "," + paymentAccount.getNumberBank()
                        + "\n");
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void add() {

        System.out.println("Nhập Mã Tài Khoản: ");
        String code = inputPAYCODE();

        System.out.println("Nhập Tên Chủ Tài Khoản: ");
        String name = scanner.nextLine();

        System.out.println("Nhập Ngày Tạo Tài Khoản: ");
        String dateCreated = inputPAYDATE();

        System.out.println("Nhập Số Thẻ: ");
        String number = scanner.nextLine();


        System.out.println("Nhập Số Tiền Trong Tài Khoản: ");
        String numberBank = scanner.nextLine();


        PaymentAccount paymentAccount = new PaymentAccount(code, name, dateCreated, number, numberBank);
        paymentAccountList.add(paymentAccount);
        System.out.println(paymentAccountList.size());
        write();
        System.out.println("Đã thêm thành công tài khoản Thanh Toán");
    }

    private String inputPAYCODE() {
        return RegexData.regexStr(scanner.nextLine(), PAY_CODE,
                "Bạn đã nhập sai vui lòng nhập lại, mã phải là 9 số");
    }

    private String inputPAYDATE() {
        return RegexData.regexStr(scanner.nextLine(), PAY_DATE,
                "Bạn đã nhập sai vui lòng nhập lại");
    }


    @Override
    public void remove() {
        do {
            check = true;
            System.out.println("Nhập id thanh toán cần xóa: ");
            int id = Integer.parseInt(scanner.nextLine());
            for (int i = 0; i < paymentAccountList.size(); i++) {
                if (paymentAccountList.get(i).getId() == id) {
                    System.out.println("Bạn có muốn xóa không? (1 YES 2 NO) ");
                    int choose = Integer.parseInt(scanner.nextLine());
                    if (choose == 1) {
                        paymentAccountList.remove(i);
                        System.out.println("Đã xóa thành công.");
                        check = false;
                        break;
                    } else {
                        check = false;
                        break;
                    }
                }
            }
            if (check == true) {
                try {
                    throw new NotFoundBankAccountException();
                } catch (NotFoundBankAccountException e) {
                    e.NotFoundBankAccountException();
                }
                check = false;
            }
            write();
        } while (check);
    }

    @Override
    public void display() {
        if (paymentAccountList.size() == 0) {
            System.out.println("Hiện tại chưa có danh sách");
        } else {
            for (PaymentAccount paymentAccount : paymentAccountList) {
                System.out.println(paymentAccount.toString());
            }
        }

    }

    @Override
    public void search() {
        System.out.println("Nhập tên tài khoản thanh toán: ");
        String name = scanner.nextLine();
        ArrayList<PaymentAccount> accountArrayList = new ArrayList<>();
        for (int i = 0; i < paymentAccountList.size(); i++) {
            if (paymentAccountList.get(i).getNameAccount().toLowerCase().contains(name.toLowerCase())) {
                accountArrayList.add(paymentAccountList.get(i));
            }
        }
        if (accountArrayList.size() == 0) {
            System.out.println("Không có tên trong danh sách!");
        } else {
            for (PaymentAccount paymentAccount : accountArrayList) {
                System.out.println(paymentAccount);
            }
        }
    }
}
