import java.util.Scanner;

public class Nomor2{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int biayaPerKm = 13000;
        int beliauTrip = 0, merekaTrip = 0, kitaTrip = 0;
        String lanjut="";
        
        do {
            System.out.print("Masukan nama driver [Beliau/Mereka/Kita]: ");
            String driver = input.next();
            System.out.print("Lama trip (km): ");
            int trip = input.nextInt();

            switch (driver) {
                case "Beliau":
                    beliauTrip += trip;
                    break;
                case "Mereka":
                    merekaTrip += trip;
                    break;
                case "Kita":
                    kitaTrip += trip;
                    break;
                default:
                    System.out.println("Nama driver tidak valid. Masukkan lagi.");
                    continue; 
            }
            
            System.out.print("Input lagi (Y/N)?: ");
            lanjut = input.next();
            
        } while (lanjut.equalsIgnoreCase("Y"));
        
        int beliauOmzet = beliauTrip * biayaPerKm;
        int merekaOmzet = merekaTrip * biayaPerKm;
        int kitaOmzet = kitaTrip * biayaPerKm;
        
        int totalTrip = beliauTrip + merekaTrip + kitaTrip;
        
        String driverTertinggi;
        int omzetTertinggi;
        
        if (beliauOmzet > merekaOmzet && beliauOmzet > kitaOmzet) {
            driverTertinggi = "Beliau";
            omzetTertinggi = beliauOmzet;
        } else if (merekaOmzet > beliauOmzet && merekaOmzet > kitaOmzet) {
            driverTertinggi = "Mereka";
            omzetTertinggi = merekaOmzet;
        } else {
            driverTertinggi = "Kita";
            omzetTertinggi = kitaOmzet;
        }
        
        System.out.println("Total trip yang dilakukan driver = " + totalTrip);
        System.out.println("Omzet tertinggi diperoleh oleh " + driverTertinggi + " dengan total Omzet = " + omzetTertinggi);
        
        input.close();

    }
}
