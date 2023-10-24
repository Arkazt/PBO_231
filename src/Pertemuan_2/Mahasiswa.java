package Pertemuan_2;

import java.io.*;

public class Mahasiswa {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        contoh2 mahasiswa = new contoh2();

        System.out.print("Masukkan NIM : ");
        mahasiswa.setNIM(br.readLine());

        System.out.print("Masukkan Nama : ");
        mahasiswa.setNama(br.readLine());

        System.out.print("Masukkan Mata Kuliah : ");
        mahasiswa.setMK(br.readLine());

        System.out.print("Masukkan Prodi : ");
        mahasiswa.setProdi(br.readLine());

        System.out.print("Masukkan Nilai UTS : ");
        mahasiswa.setUTS(Double.parseDouble(br.readLine()));

        System.out.print("Masukkan Nilai UAS : ");
        mahasiswa.setUAS(Double.parseDouble(br.readLine()));

        System.out.print("Masukkan Nilai Tugas : ");
        mahasiswa.setTugas(Double.parseDouble(br.readLine()));

        System.out.println();

        System.out.println("NIM : " + mahasiswa.getNim());
        System.out.println("Nama : " + mahasiswa.getNama());
        System.out.println("Prodi : " + mahasiswa.getProdi());
        System.out.println("Mata Kuliah : " + mahasiswa.getMK());
        System.out.println("Nilai Akhir : " + mahasiswa.getNA());
    }
}
