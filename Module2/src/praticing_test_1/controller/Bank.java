package praticing_test_1.controller;

import praticing_test_1.service.Impl.PaymentAccountImpl;
import praticing_test_1.service.Impl.SavingAccountImpl;

import java.util.Scanner;

public class Bank {
        static boolean check;
        static int choice = 0;
        static Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {         //Hiển thị displayMainMenu()
            displayBankMenu();
        }

        public static void displayBankMenu() {
            do {
                check = false;
                System.out.println("----Ngân Hàng----");
                System.out.println("1.\tTài khoản tiết kiệm");
                System.out.println("2.\tTài khoản thanh toán");
                System.out.println("3.\tExit");
                try {
                    choice = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Bạn đã nhập sai định dạng, vui lòng nhập lại.");
                    check = true;
                    continue;
                }
                switch (choice) {
                    case 1:
                        displaySavingMenu();
                        break;
                    case 2:
                        displayPaymentMenu();
                        break;
                    case 3:
                        System.exit(0);
                    default:
                        check = true;
                        break;
                }
            } while (check);
        }

        //Case 1:
        public static void displaySavingMenu() {
            SavingAccountImpl savingAccount = new SavingAccountImpl();
            do {
                check = false;
                System.out.println("----Tài Khoản Tiết Kiệm----");
                System.out.println("1.\tThêm mới tài khoản tiết kiệm");
                System.out.println("2.\tXóa tài khoản tiết kiệm");
                System.out.println("3.\tXem danh sách tài khoản tiết kiệm");
                System.out.println("4.\tTìm kiếm tài khoản tiết kiệm");
                System.out.println("5.\tQuay lại");

                try {
                    choice = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Bạn đã nhập sai định dạng, vui lòng nhập lại.");
                    check = true;
                    continue;
                }
                switch (choice) {
                    case 1:
                        savingAccount.add();
                        displaySavingMenu();
                        break;
                    case 2:
                        savingAccount.remove();
                        displaySavingMenu();
                        break;
                    case 3:
                        savingAccount.display();
                        displaySavingMenu();
                        break;
                    case 4:
                        savingAccount.search();
                        displaySavingMenu();
                        break;
                    case 5:
                        displayBankMenu();
                        break;
                    default:
                        check = true;
                        break;
                }
            } while (check);
        }


        //Case 2:
        public static void displayPaymentMenu() {
            PaymentAccountImpl paymentAccount = new PaymentAccountImpl();
            do {
                check = false;
                System.out.println("----Tài Khoản Thanh Toán----");
                System.out.println("1.\tThêm mới tài khoản thanh toán");
                System.out.println("2.\tXóa tài khoản thanh toán");
                System.out.println("3.\tXem danh sách tài khoản thanh toán");
                System.out.println("4.\tTìm kiếm tài khoản thanh toán");
                System.out.println("5.\tQuay lại");

                try {
                    choice = Integer.parseInt(scanner.nextLine());

                } catch (NumberFormatException e) {
                    System.out.println("Bạn đã nhập sai định dạng, vui lòng nhập lại.");
                    check = false;
                    continue;
                }
                switch (choice) {
                    case 1:
                        paymentAccount.add();
                        displayPaymentMenu();
                        break;
                    case 2:
                        paymentAccount.remove();
                        displayPaymentMenu();
                        break;
                    case 3:
                        paymentAccount.display();
                        displayPaymentMenu();
                        break;
                    case 4:
                        paymentAccount.search();
                        displayPaymentMenu();
                        break;
                    case 5:
                        displayBankMenu();
                        break;
                    default:
                        check = true;
                        break;
                }
            } while (check);
        }

}
