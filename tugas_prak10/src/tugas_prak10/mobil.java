/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_prak10;

/**
 *
 * @author aryad
 */
public abstract class mobil implements kendaraan {
    protected String tahun;
    protected String warna;
    protected String merk;
    protected int kecepatan;
    protected boolean jalan_mobil;
    protected boolean Sun_Roof;
    public static final int rodamobil = 4;
    public abstract void displayInfo();
    
}
