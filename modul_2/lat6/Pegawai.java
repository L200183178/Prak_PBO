/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul_2.lat6;

/**
 *
 * @author Eza
 */
public class Pegawai {
    String nama;
    int nip;
    double gaji;
    public void setPegawai(String nama, int nip, double gaji) {
        this.nama = nama;
        this.nip = nip;
        this.gaji = gaji;
        System.out.println("Nama : " + nama + "\n" +
                            "NIP : " + nip + "\n" +
                            "Gaji : " + gaji + "\n");
    }
    public static void main(String[] args) {
        Pegawai pegawai1 = new Pegawai();
        Pegawai pegawai2 = new Pegawai();
        Pegawai pegawai3 = new Pegawai();
        Pegawai pegawai4 = new Pegawai();
        Pegawai pegawai5 = new Pegawai();
        pegawai1.setPegawai("Eza",15249,3000000);
        pegawai2.setPegawai("Aze",212510,3500000);
        pegawai3.setPegawai("Galan",612621,4000000);
        pegawai4.setPegawai("Sri",55216,4500000);
        pegawai5.setPegawai("Agus",723220,5000000);
    }   
}
