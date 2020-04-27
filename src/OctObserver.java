import javax.security.auth.Subject;

public class OctObserver extends Observer {
    public OctObserver(Subject subject) {
        this.subject = subject;
        this.subject.setReadOnly(this );
    }

    public void update() {
        System.out.print(" " + Integer.toOctalString(subject.getPrincipals()));
    }
}
