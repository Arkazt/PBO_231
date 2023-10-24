package Pertemuan_3;

public class Pembeli {
    private String namaPembeli, alamat, namaBarang, noTelp;
    private int usia, jumlah, total,harga, poin;

    //constructor
    //cons member

    public Pembeli(String namaPembeli, String alamat, int usia, String noTelp){
        this.namaPembeli = namaPembeli;
        this.alamat = alamat;
        this.usia = usia;
        this.noTelp = noTelp;
    }

    public Pembeli(String namaBarang, int jumlah, int harga){
        this.namaBarang = namaBarang;
        this.jumlah = jumlah;
        this.harga = harga;
    }

    //method
    //getter

    public String getNamaPembeli (){
        return this.namaPembeli;
    }

    public String getNamaBarang (){
        return this.namaBarang;
    }
    public String getAlamat () {
        return this.alamat;
    }
    public String getNoTelp (){
        return this.noTelp;
    }
    public int getUsia  (){
        return this.usia;
    }
    public int getJumlah  (){
        return this.jumlah;
    }
    public int getHarga  (){
        return this.harga;
    }


    //method tambahan
    /*dapat poin setiap :
    min belanja 50rb --> poin 10
    min belanja 100rb --> poin 20
     */
    public int getMemberPoin (){
        poin = 0;
        if (getTotal() >= 50000) {
            poin = 10;
        } else if (getTotal() >= 100000) {
            poin =20;
        }
        return poin;
    }
    public int getTotal  (){
        return getHarga() * getJumlah();
    }
}
