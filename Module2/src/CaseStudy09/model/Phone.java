package CaseStudy09.model;

public abstract class Phone {
    private String idPhone;
    private String namePhone;
    private int pricePhone;
    private String quantilyPhone;
    private String Producer;

    public Phone() {
    }

    public Phone(String idPhone, String namePhone, int pricePhone, String quantilyPhone, String producer) {
        this.idPhone = idPhone;
        this.namePhone = namePhone;
        this.pricePhone = pricePhone;
        this.quantilyPhone = quantilyPhone;
        Producer = producer;
    }

    public String getIdPhone() {
        return idPhone;
    }

    public void setIdPhone(String idPhone) {
        this.idPhone = idPhone;
    }

    public String getNamePhone() {
        return namePhone;
    }

    public void setNamePhone(String namePhone) {
        this.namePhone = namePhone;
    }

    public int getPricePhone() {
        return pricePhone;
    }

    public void setPricePhone(int pricePhone) {
        this.pricePhone = pricePhone;
    }

    public String getQuantilyPhone() {
        return quantilyPhone;
    }

    public void setQuantilyPhone(String quantilyPhone) {
        this.quantilyPhone = quantilyPhone;
    }

    public String getProducer() {
        return Producer;
    }

    public void setProducer(String producer) {
        Producer = producer;
    }

    @Override
    public String toString() {
        return
                " idPhone='" + idPhone + '\'' +
                        ", namePhone='" + namePhone + '\'' +
                        ", pricePhone=" + pricePhone +
                        ", quantilyPhone='" + quantilyPhone + '\'' +
                        ", Producer='" + Producer + '\'';
    }
}
