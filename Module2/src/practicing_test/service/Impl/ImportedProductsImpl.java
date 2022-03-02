//package practicing_test.service.Impl;
//
//import practicing_test.model.ImportedProducts;
//import practicing_test.service.Service;
//import practicing_test.until.ProductException;
//import java.io.*;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class ImportedProductsImpl implements Service {
//    static boolean check;
//    static Scanner scanner = new Scanner(System.in);
//    static List<ImportedProducts> importedProductsList = new ArrayList<>();
//    private static final String REGEX_NAME = "[]";
//    private static final String REGEX_PRICE = "";
//    private static final String REGEX_PROVINCE = "";
//    private static final String REGEX_TAX = "";
//
//
//    static {
//        ReaderImported();
//    }
//
//    public static void ReaderImported() {
//        try {
//            FileReader fileReader = new FileReader("D:\\C1021G1-PhamDuyTuan\\Module2\\src\\practicing_test\\data\\importedproducts.csv");
//            BufferedReader bufferedReader = new BufferedReader(fileReader);
//            String Data;
//            String[] temp;
//            ImportedProducts importedProducts;
//            while ((Data = bufferedReader.readLine()) != null) {
//                temp = Data.split(",");
//                importedProducts = new ImportedProducts(temp[1],
//                        temp[2],
//                        Double.parseDouble(temp[3]),
//                        Integer.parseInt(temp[4]),
//                        temp[5],
//                        Double.parseDouble(temp[6]),
//                        temp[7],
//                        Double.parseDouble(temp[8]));
//                importedProducts.setId(Integer.parseInt(temp[0]));
//                importedProductsList.add(importedProducts);
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
//            FileWriter fileWriter = new FileWriter("D:\\C1021G1-PhamDuyTuan\\Module2\\src\\practicing_test\\data\\importedproducts.csv");
//            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//            for (ImportedProducts importedProducts : importedProductsList) {
////                                            ID Tăng
//                bufferedWriter.write(importedProducts.getId()
////                                          Mã Sản Phẩm
//                        + "," + importedProducts.getCodeProduct()
////                                          Tên Sản Phẩm
//                        + "," + importedProducts.getNameProduct()
//
//                        + "," + importedProducts.getPriceProduct()
//                        + "," + importedProducts.getNumberOfProduct()
//                        + "," + importedProducts.getProducer()
//                        + "," + importedProducts.getPriceImportedProducts()
//                        + "," + importedProducts.getProvinceImportedProduct()
//                        + "\n");
//            }
//            bufferedWriter.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    @Override
//    public void add() {
//
//        System.out.println("Nhập Mã Sản Phẩm: ");
//        String code = scanner.nextLine();
//
//        System.out.println("Nhập Tên Sản Phẩm: ");
//        String name = scanner.nextLine();
//
//        System.out.println("Nhập Giá Sản Phẩm");
//        double price;
//        price = Double.parseDouble(scanner.nextLine());
//        while (price < 0) {
//            System.out.println("nhập lại giá");
//            price = Double.parseDouble(scanner.nextLine());
//        }
//
//        System.out.println("Nhập Số lượng Sản Phẩm: ");
//        int number = Integer.parseInt(scanner.nextLine());
//
//        System.out.println("Nhập Nhà Sản Xuất: ");
//        String producer = scanner.nextLine();
//
//        System.out.println("Nhập Giá Nhập Khẩu: ");
//        double priceImported = Double.parseDouble(scanner.nextLine());
//        while (priceImported < 0) {
//            System.out.println("nhap lai gia ban");
//            priceImported = Double.parseDouble(scanner.nextLine());
//        }
//
//        System.out.println("Nhập Tỉnh/Thành Nhập Khẩu: ");
//        String province = scanner.nextLine();
//
//        System.out.println("Nhập Thuế Nhập Khẩu");
//        double tax = Double.parseDouble(scanner.nextLine());
//
//        ImportedProducts importedProducts = new ImportedProducts(code, name, price, number, producer, priceImported, province, tax);
//        importedProductsList.add(importedProducts);
//        write();
//        System.out.println("Đã Thêm Hàng Nhập Khẩu Thành Công");
//    }
//
//    @Override
//    public void remove() {
//        do {
//            check = true;
//            System.out.println("Nhập Hàng Nhập Khẩu: ");
//            String name = scanner.nextLine();
//            for (int i = 0; i < importedProductsList.size(); i++) {
//                if (importedProductsList.get(i).getNameProduct().contains(name)) {
//                    System.out.println("ban co muon xoa khong?(1 yes 2 no)");
//                    int op = Integer.parseInt(scanner.nextLine());
//                    if (op == 1) {
//                        importedProductsList.remove(i);
//                        System.out.println("Đã xóa thành công.");
//                        check = false;
//                        break;
//                    } else {
//                        check = false;
//                        break;
//                    }
//                }
//            }
//            if (check == true) {
//                try {
//                    throw new ProductException();
//                } catch (ProductException e) {
//                    e.ProductException();
//                }
//                check = false;
//            }
//            write();
//        } while (check);
//    }
//
//    @Override
//    public void display() {
//        if (importedProductsList.size() == 0) {
//            System.out.println("Hiện tại chưa có danh sách");
//        } else {
//            for (ImportedProducts importedProducts : importedProductsList) {
//                System.out.println(importedProducts.toString());
//            }
//        }
//    }
//
//    @Override
//    public void search() {
//        System.out.println("Nhập id sản phẩm cần tìm: ");
//        String strImported = scanner.nextLine();
//        for (int i = 0; i < importedProductsList.size(); i++) {
//            if (importedProductsList.get(i).getNameProduct().equals(strImported)) {
//                importedProductsList.add(importedProductsList.get(i));
//                write();
//            }
//        }
//        if (importedProductsList.size() == 0) {
//            System.out.println("Không có sản phẩm trong danh sách!");
//        } else {
//            for (ImportedProducts importedProducts : importedProductsList) {
//                System.out.println(importedProducts);
//            }
//
//        }
//    }
//}
