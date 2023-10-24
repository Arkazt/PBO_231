package Tugas_3;

import java.io.*;
public class Utama {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Tiket u = new Tiket("admin","123");

        System.out.print("Masukkan Username : ");
        String user = br.readLine();
        System.out.print("Masukkan Password : ");
        String pass = br.readLine();

        String hotel="", namPes="", tuj="";
        int harTik=0, jumKam=0, harPerKam=0, jumPen=0, harTikPes=0;

        if (user.equalsIgnoreCase(u.getUser() ) && pass.equalsIgnoreCase(u.getPass())){
            do{
                System.out.println("-----MENU TIKET-----");
                System.out.println("1. Input Data Transaksi");
                System.out.println("2. lihat Data Tiket");
                System.out.println("3. Keluar");
                System.out.println("");

                System.out.print("Masukkan pilihan (1-3) : ");
                int pilih = Integer.parseInt(br.readLine());
                System.out.print("");

                switch (pilih){
                    case 1 :
                        System.out.print("Nama Hotel : ");
                        hotel = br.readLine();
                        System.out.print("Jumlah Kamar : ");
                        jumKam = Integer.parseInt(br.readLine());
                        System.out.print("Harga Per Kamar : ");
                        harPerKam = Integer.parseInt(br.readLine());
                        System.out.print("Nama Pesawat : ");
                        namPes = br.readLine();
                        System.out.print("Jumlah Penumpang : ");
                        jumPen = Integer.parseInt(br.readLine());
                        System.out.print("Harga Tiket Pesawat : ");
                        harTikPes = Integer.parseInt(br.readLine());
                        System.out.print("Tujuan : ");
                        tuj = br.readLine();
                    break;

                    case 2 :
                        System.out.println("Tujuan : " + tuj);
                        System.out.println("Nama Hotel : " + hotel + "Jumlah Kamar : " + jumKam + "Harga Per Kamar :" + harPerKam);
                        System.out.println("Total Biaya Kamar Hotel dengan diskon 45% : " + ((harPerKam - ((45/100) * harPerKam))) * jumKam);
                        System.out.println("Nama Pesawat : " + namPes + "Jumlah Penumpang : " + jumPen + "Harga tiket Pesawat : " + harTikPes);
                        System.out.println("Total Harga Tiket Pesawat : " +  ((harTikPes * jumPen) + (jumPen * 29000)) + "dengan biaya asuransi 29.000/penumpang");
                    break;

                    case 3 :
                        System.exit(0);
                    break;
                }
            } while (true);
        }
        else{
            System.out.println("Login Gagal");
        }
    }
}
