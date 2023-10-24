package Pertemuan_1;

public class contoh {//identitas

    //atribut = variabel
    //private/protected

    private String name;

    public double ipk;

    //operasi/fungsi
    //setter/constructor

    public void setName(String name){
        //jika nama atribut pada class sama dengan nama atribut pada parameter setter/getter
        //maka, beri keyword this
        this.name = name;
    }


    //getter
    public String getName(){
        return this.name;
    }

    public void setIpk(double ipk){
        this.ipk = ipk;
    }

    public double getIpk(){
        return this.ipk;
    }
    //custom method --> fungsi" lain


}
//getter = tipe data
//setter = void