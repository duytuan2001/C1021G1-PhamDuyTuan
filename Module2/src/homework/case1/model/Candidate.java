package homework.case1.model;


public class Candidate {
    private String code;
    private String fullName;
    private String dateOfBirth; //LocalDate
    private double pointOfMath;
    private double pointOfLiterature;
    private double pointOfEnglish;

    public Candidate(String code, String fullName, String dateOfBirth, double pointOfMath, double pointOfLiterature, double pointOfEnglish) {
        this.code = code;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.pointOfMath = pointOfMath;
        this.pointOfLiterature = pointOfLiterature;
        this.pointOfEnglish = pointOfEnglish;
    }

    public Candidate(){

    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public double getPointOfMath() {
        return pointOfMath;
    }

    public void setPointOfMath(double pointOfMath) {
        this.pointOfMath = pointOfMath;
    }

    public double getPointOfLiterature() {
        return pointOfLiterature;
    }

    public void setPointOfLiterature(double pointOfLiterature) {
        this.pointOfLiterature = pointOfLiterature;
    }

    public double getPointOfEnglish() {
        return pointOfEnglish;
    }

    public void setPointOfEnglish(double pointOfEnglish) {
        this.pointOfEnglish = pointOfEnglish;
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "code='" + code + '\'' +
                ", fullName='" + fullName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", pointOfMath=" + pointOfMath +
                ", pointOfLiterature=" + pointOfLiterature +
                ", pointOfEnglish=" + pointOfEnglish +
                '}';
    }
}