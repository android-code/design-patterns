public class Proxy implements Subject {

    private Subject subject;
    private String password;

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public void action() {
    	if(password != null && password.equals("password")) {
    		if(subject == null)
    		    subject = new RealSubject();
            subject.action();
        }
        else {
        	//show message or do something else
        }
    }
}