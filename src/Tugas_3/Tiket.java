package Tugas_3;

public class Tiket {
    private String user;
    private String pass;

    public Tiket (String user, String pass) {
        this.user = user;
        this.pass = pass;
    }

    public void setUser (String user) {
        this.user = user;
    }

    public void setPass (String pass) {
        this.pass = pass;
    }

    public String getUser() {
        return this.user;
    }

    public String getPass() {
        return this.pass;
    }
}
