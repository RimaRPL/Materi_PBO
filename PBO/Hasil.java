package ProduktifRPL.PBO;

public class Hasil {
    public static void main(String[] args) {
        
        Admin a = new Admin ();
        a.tampilIdentitas("Admin");
        a.tampilNama();
        System.out.println("Gaji Pokok yang diterima: " +a.gaji(25000000));
        System.out.println("Gaji Tunjangan yang diterima: "+a.gaji(5000000));
        
    }
}
