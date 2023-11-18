/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas_prak10;

/**
 *
 * @author aryad
 */
public class Tugas_prak10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        mobil Jazz = new MobilBensin(1500, "Pertalite", "2015", "Putih", "Jazz");
        mobil Panther = new MobilDiesel(2500, "2020", "Hitam", "Panther");
        mobil Iqoniq = new MobilListrik(1230, "2021", "Hitam", "Iqoniq");
        mobil wuling = new MobilListrik(1540, "2022", " Merah", "Wuling");
      
        mobil mb [] = {Jazz, Panther, Iqoniq, wuling};
        
        Jazz.start();
        Jazz.openSunRoof();
//        Jazz.stop();
        Jazz.closeSunRoof();
//        Jazz.closeSunRoof();
        Jazz.accelerate(50);
        Jazz.decelerate(20);
        Panther.start();
        Panther.openSunRoof();
//        Panther.start();
//        Panther.openSunRoof();
//        Panther.accelerate(90);
        for (mobil mb1 : mb) {
            mb1.displayInfo();
            System.out.println();
        }
        
        
    }
    
}
