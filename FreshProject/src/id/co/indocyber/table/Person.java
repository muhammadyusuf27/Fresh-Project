/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.indocyber.table;

import java.util.Arrays;

/**
 *
 * @author user
 */
public class Person {
   
    private List nasabah;
    private String nama;
    private String gender;
    private String married;
    private int Umur;
    private String alamat;
    private double jumlahPenghasilan;
    private int tanggungan;
    private double pinjaman;
    private double dp;
    private double bunga;
    private int lamaPinjaman;


    public Person(String nama, String gender, String married, int Umur, String alamat, double penghasilan, int tanggungan, double pinjaman, double dp, double bunga, int lamaPinjaman) {
        this.nama = nama;
        this.gender = gender;
        this.married = married;
        this.Umur = Umur;
        this.alamat = alamat;
        this.jumlahPenghasilan = penghasilan;
        this.tanggungan = tanggungan;
        this.pinjaman = pinjaman;
        this.dp = dp;
        this.bunga = bunga;
        this.lamaPinjaman = lamaPinjaman;
    }
       
  
    public Person() {
    }

    public double pokokCicilan() {
        return pinjaman - dp;
    }

    public double bungaCicilan() {
        return pokokCicilan() * (bunga / 100) * (lamaPinjaman / 12);
    }

    public double totalKredit() {
        return pokokCicilan() + bungaCicilan();
    }

    public double cicilanperBulan() {
        return totalKredit() / lamaPinjaman;
    }

   
    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the married
     */
    public String isMarried() {
        return married;
    }

    /**
     * @param married the married to set
     */
    public void setMarried(String married) {
        this.married = married;
    }

    /**
     * @return the Umur
     */
    public int getUmur() {
        return Umur;
    }

    /**
     * @param Umur the Umur to set
     */
    public void setUmur(String Umur) {
        this.setUmur(Umur);
    }

    /**
     * @param Umur the Umur to set
     */
    public void setUmur(int Umur) {
        this.Umur = Umur;
    }

    /**
     * @return the alamat
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * @param alamat the alamat to set
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    /**
     * @return the Penghasilan

    }

    /**
     * @return the tanggungan
     */
    public int getTanggungan() {
        return tanggungan;
    }

    /**
     * @param tanggungan the tanggungan to set
     */
    public void setTanggungan(int tanggungan) {
        this.tanggungan = tanggungan;
    }

    /**
     * @return the pinjaman
     */
    public double getPinjaman() {
        return pinjaman;
    }

    /**
     * @param pinjaman the pinjaman to set
     */
    public void setPinjaman(double pinjaman) {
        this.pinjaman = pinjaman;
    }

    /**
     * @return the dp
     */
    public double getDp() {
        return dp;
    }

    /**
     * @param dp the dp to set
     */
    public void setDp(double dp) {
        this.dp = dp;
    }

    /**
     * @return the bunga
     */
    public double getBunga() {
        return bunga;
    }

    /**
     * @param bunga the bunga to set
     */
    public void setBunga(double bunga) {
        this.bunga = bunga;
    }

    /**
     * @return the lamaPinjaman
     */
    public int getLamaPinjaman() {
        return lamaPinjaman;
    }

    /**
     * @param lamaPinjaman the lamaPinjaman to set
     */
    public void setLamaPinjaman(int lamaPinjaman) {
        this.lamaPinjaman = lamaPinjaman;
    }

    /**
     * @return the jumlahPenghasilan
     */
    public double getJumlahPenghasilan() {
        return jumlahPenghasilan;
    }

    /**
     * @param jumlahPenghasilan the jumlahPenghasilan to set
     */
    public void setJumlahPenghasilan(double jumlahPenghasilan) {
        this.jumlahPenghasilan = jumlahPenghasilan;
    }

    private static class List<T> {

        public List() {
        }
    }

    /**
     * @return the nasabah
     */
    public List getNasabah() {
        return nasabah;
    }

    /**
     * @param nasabah the nasabah to set
     */
    public void setNasabah(List nasabah) {
        this.nasabah = nasabah;
    }

}
