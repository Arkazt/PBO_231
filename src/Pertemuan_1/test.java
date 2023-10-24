package Pertemuan_1;

//tahapan I/O:
/*
1. Import I/O
2. Eror handling
3. Objek dari library I/O
 */

import java.io.*;
public class test {
    public static void main(String[] args){

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //instance of class
        contoh c = new contoh();

        try{

            System.out.println("----INPUT----");
            c.setName(br.readLine());

        }catch (Exception exc) {

            System.out.println(exc.getMessage());
        }
    }
}
