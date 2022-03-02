//package practicing_test.model;
//
//
////Sản Phẩm Nhập Khẩu
//public class ImportedProducts extends Product{
//
//    private int id;
//    static int importedId = 0;
////    Giá nhập khẩu.
//    private double priceImportedProducts;
//
//    //- Tỉnh thành nhập.
//    private String provinceImportedProduct;
//
//    private double taxImported;
//
//    public ImportedProducts() {}
//
//    public ImportedProducts(String codeProduct,
//                            String nameProduct,
//                            double priceProduct,
//                            int numberOfProduct,
//                            String producer,
//                            double priceImportedProducts,
//                            String provinceImportedProduct,
//                            double taxImported) {
//        super(codeProduct, nameProduct, priceProduct, numberOfProduct, producer);
//        importedId++;
//        this.id = importedId;
//        this.priceImportedProducts = priceImportedProducts;
//        this.provinceImportedProduct = provinceImportedProduct;
//        this.taxImported = taxImported;
//    }
//
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public static int getImportedId() {
//        return importedId;
//    }
//
//    public static void setImportedId(int importedId) {
//        ImportedProducts.importedId = importedId;
//    }
//
//    public double getPriceImportedProducts() {
//        return priceImportedProducts;
//    }
//
//    public void setPriceImportedProducts(double priceImportedProducts) {
//        this.priceImportedProducts = priceImportedProducts;
//    }
//
//    public String getProvinceImportedProduct() {
//        return provinceImportedProduct;
//    }
//
//    public void setProvinceImportedProduct(String provinceImportedProduct) {
//        this.provinceImportedProduct = provinceImportedProduct;
//    }
//
//    public double getTaxImported() {
//        return taxImported;
//    }
//
//    public void setTaxImported(double taxImported) {
//        this.taxImported = taxImported;
//    }
//
//    @Override
//    public String toString() {
//        return "ImportedProducts{" + super.toString() +
//                "priceImportedProducts=" + priceImportedProducts +
//                ", provinceImportedProduct='" + provinceImportedProduct + '\'' +
//                ", taxImported=" + taxImported +
//                '}';
//    }
//}
