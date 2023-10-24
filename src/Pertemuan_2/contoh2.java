package Pertemuan_2;

import java.io.*;

public class contoh2 {

        //membuat program untuk menghitung nilai akhir MK PBO per mahasiswa
        //NA = (uts * 20%) + (uas * 25%) + (tugas * 55%)
        /*
        NIM :
        NAMA :
        PRODI :
        MK :
        NA :
         */

        //atritbut
        private String nim, nama, prodi, MK;
        private double NA, uts, uas, tugas;

        //operasi
        //setter
            public void setNIM (String nim){
                this.nim = nim;

            }

            public void setNama (String nama) {
                this.nama = nama;
            }

            public void setUTS ( double uts){
                this.uts = uts;
            }

            public void setUAS ( double uas){
                this.uas = uas;
            }

            public void setTugas ( double t){
                tugas = t;
            }

            public void setMK (String MK){
                this.MK = MK;
            }

            public void setProdi (String prodi) {
                this.prodi = prodi;
            }
            //getter
            public String getNim() {
                return this.nim;
            }

            public String getNama(){
                return this.nama;
            }

            public String getProdi(){
                return this.prodi;
            }

            public String getMK(){
                return this.MK;
            }

            public double getUts(){
                return this.uts;
            }

            public double getUas(){
                return this.uas;
            }

            public double getTugas(){
                return this.tugas;
            }
            public double getNA(){
                NA = (getUts()*0.2) + (getUas()*0.25) + (getTugas()*0.55);
                return this.NA;
            }
}