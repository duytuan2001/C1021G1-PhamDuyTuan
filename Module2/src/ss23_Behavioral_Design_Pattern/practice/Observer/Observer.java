package ss23_Behavioral_Design_Pattern.practice.Observer;

import javax.security.auth.Subject;

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
