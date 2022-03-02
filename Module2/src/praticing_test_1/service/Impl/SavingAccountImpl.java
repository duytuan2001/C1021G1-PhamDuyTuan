package praticing_test_1.service.Impl;


import praticing_test_1.service.Service;


public class SavingAccountImpl implements Service {
//    static boolean check;
//    static Scanner scanner = new Scanner(System.in);
//    static List<SavingAccount> savingAccountList = new ArrayList<>();
//
//    //    private static final String REGEX_NAME = "[]";
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
//            SavingAccount savingAccount;
//            while ((Data = bufferedReader.readLine()) != null) {
//                temp = Data.split(",");
//                savingAccount = new SavingAccount(temp[1],
//                        temp[2],
//                        temp[3],
//                        temp[4],
//                        temp[5],
//                        temp[6],
//                        temp[7],
//                        temp[8]);
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
    @Override
    public void add() {

    }

    @Override
    public void remove() {

    }

    @Override
    public void display() {

    }

    @Override
    public void search() {

    }
}
