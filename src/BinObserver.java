import javax.security.auth.Subject;

public class BinObserver extends Observer {
    public BinObserver(Subject subject) {
        this.subject = subject;
        this.subject.setReadOnly(this);
    }

    public void update() {
        System.out.print(" " + Integer.toBinaryString(subject.getPrincipals()));
    }
}
