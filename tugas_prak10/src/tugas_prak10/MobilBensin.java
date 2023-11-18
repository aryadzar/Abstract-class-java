/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_prak10;

/**
 *
 * @author aryad
 */
public class MobilBensin extends mobil {
    private int cc_mobil;
    private String BahanBakar;
    public MobilBensin(int cc_mobil, String BahanBakar, String tahun, String warna, String merk ) {
        this.cc_mobil = cc_mobil;
        this.BahanBakar = BahanBakar;
        this.warna = warna;
        this.tahun = tahun;
        this.warna = warna;
        this.merk = merk;
   
    }

    public int getCc_mobil() {
        return cc_mobil;
    }

    public String getBahanBakar() {
        return BahanBakar;
    }

    public String getTahun() {
        return tahun;
    }

    public String getWarna() {
        return warna;
    }

    public String getMerk() {
        return merk;
    }

    public int getKecepatan() {
        return kecepatan;
    }

    public boolean isJalan_mobil() {
        return jalan_mobil;
    }

    public boolean isSun_Roof() {
        return Sun_Roof;
    }

    public static int getRodamobil() {
        return rodamobil;
    }

    @Override
    public void displayInfo(){
        System.out.println("Merk Mobil : " + this.getMerk());
        System.out.println("Warna Mobil " + this.getWarna());
        System.out.println("CC Mobil Bensin : " + this.getCc_mobil());
        System.out.println("Bahan Bakar yg digunakan : " + this.getBahanBakar());
        System.out.println("Tahun Keluar : " + this.getTahun());
        System.out.println("Kecepatan Mobil : " + this.getKecepatan());
        System.out.println("Kondisi Mobil :  " + (this.isJalan_mobil() ? "Mobil Hidup " : "Mobil Mati"));
        System.out.println("Kondisi Sunroof : " + (this.isSun_Roof() ? "Sunroof Kebuka " :  " Sunroof tertutup"));
        
    }
    @Override
    public void start(){
        this.jalan_mobil = true;
        this.kecepatan = 20;

    }
    @Override
    public void stop(){
        this.jalan_mobil = false;
        this.kecepatan = 0;
    }

    @Override
    public void openSunRoof(){
        this.Sun_Roof = true;
    }
    
    @Override
    public void closeSunRoof(){
        this.Sun_Roof = false;
    }
    
    @Override
    public void accelerate(int speed){
        this.kecepatan += speed;
    }
    
    @Override
    public void decelerate(int speed){
        this.kecepatan -= speed;
    }
}
