//package practicing_test.service.Impl;
//
//import practicing_test.model.ExportProducts;
//import practicing_test.service.Service;
//import practicing_test.until.ProductException;
//import java.io.*;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class ExportProductsImpl implements Service {
//    static boolean check;
//    static Scanner scanner = new Scanner(System.in);
//    static List<ExportProducts> exportProductsList = new ArrayList<>();
//    private static final String REGEX_NAME = "[S][P][0-9]{5}";
//    private static final String REGEX_PRICE = "";
//    private static final String REGEX_PROVINCE = "";
//    private static final String REGEX_TAX = "";
//
//    static {
//        ReaderExport();
//    }
//
//    public static void ReaderExport() {
//        try {
//            FileReader fileReader = new FileReader("D:\\C1021G1-PhamDuyTuan\\Module2\\src\\practicing_test\\data\\Exportproducts.csv");
//            BufferedReader bufferedReader = new BufferedReader(fileReader);
//            String[] temp;
//            String Data;
//            ExportProducts exportProducts;
//            while ((Data = bufferedReader.readLine()) != null) {
//                temp = Data.split(",");
//                exportProducts = new ExportProducts(Integer.parseInt(temp[0]),
//                        temp[1],
//                        temp[2],
//                        Double.parseDouble(temp[3]),
//                        Integer.parseInt(temp[4]),
//                        temp[5],
//                        Double.parseDouble(temp[6]),
//                        temp[7]);
//                exportProductsList.add(exportProducts);
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
//            FileWriter fileWriter = new FileWriter("D:\\C1021G1-PhamDuyTuan\\Module2\\src\\practicing_test\\data\\Exportproducts.csv");
//            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//            for (ExportProducts exportProducts : exportProductsList) {
//
//                bufferedWriter.write(exportProducts.getId()
////                                          Mã Sản Phẩm
//                        + "," +  exportProducts.getNameProduct()
////                                          Tên Sản Phẩm
//                        + "," + exportProducts.getPriceProduct()
//                        + "," + exportProducts.getNumberOfProduct()
//                        + "," + exportProducts.getProducer()
//                        + "," + exportProducts.getExportPrice()
//                        + "," + exportProducts.getCountryOfEntryOfProduct()
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
//        int id = Integer.parseInt(scanner.nextLine());
//
//        System.out.println("Nhập Mã Sản Phẩm: ");
//        String code = scanner.nextLine();
//
//        System.out.println("Nhập Tên Sản Phẩm: ");
//        String name = scanner.nextLine();
//
//        System.out.println("Nhập Giá Sản Phẩm");
//        double price = Double.parseDouble(scanner.nextLine());
//        while (price < 0){
//            System.out.println("Nhập lại giá");
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
//        while (priceImported < 0){
//            System.out.println("nhập lại giá");
//            priceImported = Double.parseDouble(scanner.nextLine());
//        }
//
//        System.out.println("Nhập Tỉnh/Thành Nhập Khẩu: ");
//        String province = scanner.nextLine();
//
//        ExportProducts exportProducts = new ExportProducts(id, code, name, price, number, producer, priceImported, province);
//        exportProductsList.add(exportProducts);
//        write();
//        System.out.println("Đã Thêm Hàng Xuất Khẩu Thành Công");
//    }
//
//    @Override
//    public void remove() {
//        do {
//            check = true;
//            System.out.println("Nhập Hàng Nhập Khẩu: ");
//            String name = scanner.nextLine();
//            for (int i = 0; i < exportProductsList.size(); i++) {
//                if (exportProductsList.get(i).getNameProduct().contains(name)) {
//                    System.out.println("ban co muon xoa khong?(1 yes 2 no)");
//                    int op = Integer.parseInt(scanner.nextLine());
//                    if (op == 1) {
//                        exportProductsList.remove(i);
//                        System.out.println("Đã xóa thành công.");
//                        check = false;
//                        break;
//                    } else {
//                        check = false;
//                        break;
//                    }
//                }
//            }
//            if (check == true){
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
//
//    @Override
//    public void display() {
//        if (exportProductsList.size() == 0) {
//            System.out.println("Hiện tại chưa có danh sách");
//        } else {
//            for (ExportProducts exportProducts : exportProductsList) {
//                System.out.println(exportProducts.toString());
//            }
//        }
//    }
//
//    @Override
//    public void search() {
//        System.out.println("Nhập id sản phẩm cần tìm: ");
//        String strImported = scanner.nextLine();
//        for (int i = 0; i < exportProductsList.size(); i++) {
//            if (exportProductsList.get(i).getNameProduct().equals(strImported)) {
//                exportProductsList.add(exportProductsList.get(i));
//                write();
//            }
//        }
//        if (exportProductsList.size() == 0) {
//            System.out.println("Không có sản phẩm trong danh sách!");
//        } else {
//            for (ExportProducts exportProduct : exportProductsList) {
//                System.out.println(exportProduct);
//            }
//        }
//    }
//}
