package ProduktifRPL.PBO;

import java.util.Scanner;

public abstract class makanan {
    
    Scanner scan = new Scanner(System.in);

    public int jenisMakanan(){
        int harga=0;
        System.out.println("Tulis pilihan jenis : (Berkuah/Kering)");
        String pilihan=scan.nextLine();
        switch (pilihan){
            case "Berkuah" :harga=15000;
            break;
            case "Kering" :harga=75000;
            break;
            default: harga=0;
            break;
        }
        
        return harga;
    }

    public abstract void tampilJenis(String jenis);
}
