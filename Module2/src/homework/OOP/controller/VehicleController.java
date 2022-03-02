package homework.OOP.controller;

import homework.OOP.IVerhicle;
import homework.OOP.model.Vehicle;
import homework.OOP.service.VehicleService;

import java.util.Scanner;

public class VehicleController {
    public static void main(String[] args) {
        IVerhicle iVerhicle = new VehicleService();
        Scanner scanner = new Scanner(System.in);
        int choose;
        do{
            System.out.println("1. Tạo các đối tượng xe và nhập thông tin.");
            System.out.println("2. Xuất bảng kê khai tiền thuế của các xe.");
            System.out.println("3. Thoát");
            choose = scanner.nextInt();
            switch (choose){
                case 1:
                    System.out.println("Nhập id: ");
                    int ID = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Nhập Tên Xe: ");
                    String Name = scanner.nextLine();
                    System.out.println("Nhập dung tích xe: ");
                    long Capacity = scanner.nextLong();
                    System.out.println("Nhập giá xe: ");
                    double priceBy = scanner.nextDouble();
                    Vehicle vehicle = new Vehicle(ID, Name, Capacity, priceBy);
                    iVerhicle.addNewVerhicle(vehicle);
                    break;
                case 2:
//                    String result = iVerhicle.displayTax();
//                    System.out.println(result);
                    iVerhicle.displayTax();
                    break;
                case 3:
                    System.exit(0);
                    break;
            }

        }while (true);
    }
}
