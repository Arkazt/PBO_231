//package Pertemuan_3;
//
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//
//public class MainClassPembeli {
//    public static void main(String[] args) {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        /*
//        1. Pendaftaran member
//        2. Transaksi pembelian barang
//            - punya member / tidak
//            - jika member (telp), cek no telp sama
//         */
//        Pembeli member = new Pembeli("","",0,"");
//
//        Pembeli transaksi = new Pembeli("",0,0);
//        try {
//            do {
//                System.out.println("--- MARET APRIL ---");
//                System.out.println("1. Pendaftaran Member");
//                System.out.println("2. Transaksi");
//                System.out.println("3. Keluar aplikasi");
//                System.out.println("pilih menu");
//                int menu = Integer.parseInt(br.readLine());
//                switch (menu) {
//                    case 1:
//                        //1. Pendaftaran member
//                        System.out.println("--- Daftar Member");
//                        System.out.println("Nama : ");
//                        namaPembeli = br.readLine();
//                        System.out.println("Alamat : ");
//
//                        System.out.println("No.Telp : ");
//                        System.out.println("Usia : ");
//
//                        member = new Pembeli(namaPembeli, alamat, usia, telp);
//                        break;
//                    case 2:
//                        //2. Transaksi
//                        System.out.println("--- Transaksi ---");
//                        System.out.println("Member? (Y/N)");
//                        String jawab = br.readLine();
//                        if (jawab.equalsIgnoreCase("Y")){
//                            System.out.println("Masukkan No Telp : ");
//                            telp = br.readLine();
//                        }
//                        break;
//                    default:
//                        //keluar program
//                        System.exit(0);
//                }
//            }
//        }
//    }
//}
