package Pertemuan_4;

public class employee extends Person {

    //atribut
    private String id_emp;

    public employee(String n, String a, String id_emp) {
        super(n, a);
        this.id_emp = id_emp;
    }

    public String getId_emp() {
        return id_emp;
    }

    @Override
    public String getNama() {
        return super.getNama();
    }

    @Override
    public String getAlamat() {
        return super.getAlamat();
    }
}
