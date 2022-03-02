package practicing_test.model;

public abstract class Product {



    //     Mã sản phẩm
    private String codeProduct;

    //     Tên sản phẩm
    private String nameProduct;

    //     Giá bán
    private double priceProduct;

    //     Số lượng
    private int numberOfProduct;

    //    Nhà sản xuất
    private String producer;

    public Product() {
    }

    public Product( String codeProduct, String nameProduct, double priceProduct, int numberOfProduct, String producer) {

        this.codeProduct = codeProduct;
        this.nameProduct = nameProduct;
        this.priceProduct = priceProduct;
        this.numberOfProduct = numberOfProduct;
        this.producer = producer;
    }



    public String getCodeProduct() {
        return codeProduct;
    }

    public void setCodeProduct(String codeProduct) {
        this.codeProduct = codeProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(double priceProduct) {
        this.priceProduct = priceProduct;
    }

    public int getNumberOfProduct() {
        return numberOfProduct;
    }

    public void setNumberOfProduct(int numberOfProduct) {
        this.numberOfProduct = numberOfProduct;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    @Override
    public String toString() {
        return
                ", codeProduct='" + codeProduct + '\'' +
                ", nameProduct='" + nameProduct + '\'' +
                ", priceProduct=" + priceProduct +
                ", numberOfProduct=" + numberOfProduct +
                ", producer='" + producer + '\'';
    }
}