package model;

public class Student {
    private int codeStudent;
    private String nameStudent;
    private String birthday;
    private String email;
    private double point;

    public Student(int codeStudent, String nameStudent, String birthday, String email, double point) {
        this.codeStudent = codeStudent;
        this.nameStudent = nameStudent;
        this.birthday = birthday;
        this.email = email;
        this.point = point;
    }

    public Student() {
    }

    public int getCodeStudent() {
        return codeStudent;
    }

    public void setCodeStudent(int codeStudent) {
        this.codeStudent = codeStudent;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }
}
