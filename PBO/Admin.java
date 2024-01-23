package ProduktifRPL.PBO;

public class Admin extends Karyawan {

    @Override
    public void tampilIdentitas(String profesi) {
        // TODO Auto-generated method stub
        super.tampilIdentitas(profesi);
    }

    public void tampilNama() {
        super.nama="Rima";
        super.jk='p';
        super.nopeg=10234;
        System.out.println(super.nama);
        System.out.println(super.jk);
        System.out.println(super.nopeg);
    }
    
    public  double gaji (double pokok){
        return pokok;
    }

    public int gaji (int tunjangan){
        return tunjangan;
    } 
    
}
