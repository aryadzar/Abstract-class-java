/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_prak10;

/**
 *
 * @author aryad
 */
public class MobilListrik extends mobil {
    private int Watt_mobil;
//    private String tahun;
//    private String warna;
//    private String merk;
    public MobilListrik(int Watt_mobil, String tahun, String warna, String merk ) {
        this.Watt_mobil = Watt_mobil;
        this.warna = warna;
        this.tahun = tahun;
        this.warna = warna;
        this.merk = merk;
   
    }

    public int getWatt_mobil() {
        return Watt_mobil;
    }

    public void setWatt_mobil(int Watt_mobil) {
        this.Watt_mobil = Watt_mobil;
    }

    public String getTahun() {
        return tahun;
    }

    public void setTahun(String tahun) {
        this.tahun = tahun;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
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
        System.out.println("Watt Mobil : " + this.getWatt_mobil());
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
