package ss22_Structural_Design_Pattern.practice.Facade;

public class Facebook implements SocialShare {
    private String message;

    @Override
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void share() {
        System.out.println("Sharing to Facebook: " + this.message);
    }
}
