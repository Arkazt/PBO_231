package Pertemuan_4;

//class turunan / warisan dari class person (subclass)
public class Customer extends  Person {

    private String id;
    //constructor

    public Customer(String n, String a, String id) {
        super(n, a);
        this.id = id;
    }

    public String getId() {
        return id;
    }

    //overriding method

    @Override
    public String getNama() {
        return super.getNama();
    }

    @Override
    public String getAlamat() {
        return super.getAlamat();
    }
}
