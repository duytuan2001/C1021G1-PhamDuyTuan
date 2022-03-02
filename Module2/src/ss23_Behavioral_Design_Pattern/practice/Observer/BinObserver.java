//package ss23_Behavioral_Design_Pattern.practice.Observer;
//
//import javax.security.auth.Subject;
//
//public class BinObserver extends Observer {
//    public BinObserver(Subject subject) {
//        this.subject = subject;
//        this.subject.add(this);
//    }
//
//    public void update() {
//        System.out.print(" " + Integer.toBinaryString(subject.getState()));
//    }
//}