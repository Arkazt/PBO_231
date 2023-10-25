package Pertemuan_4;

import java.io.*;
public class mainClass {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //instance of class
        subClass s = new subClass("", "", 0);

        System.out.println("---INPUT---");
        System.out.print("Masukkan Nama : ");
        String nama = br.readLine();
        System.out.print("Masukkan Keterangan : ");
        String ket = br.readLine();
        System.out.print("Masukkan Usia : ");
        int usia = Integer.parseInt(br.readLine());

        //masukkkan data ke object constructor
        s = new subClass(nama, ket, usia);

        System.out.println("Nama : " + s.getNama());
        System.out.println("Keterangan : " + s.getKeterangan());
        System.out.println("Usia : " + s.getUsia());
    }
}
