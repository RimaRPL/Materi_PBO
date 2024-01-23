package ProduktifRPL.PBO;

public class PembayaranGaji {
    public int hitungGaji(Pegawai peg){
        int uang = peg.gaji();
        if (peg instanceof Direktur1)
            uang+=((Direktur1)peg).tunjangan();
        
        if (peg instanceof Staff)
            uang+=((Staff)peg).Bonus();
        
        return uang;
    }
    public static void main(String[] args) {
        PembayaranGaji pg = new PembayaranGaji();
        Staff ali = new Staff();
        Direktur1 Tony = new Direktur1();
        System.out.println("gaji staf = "+pg.hitungGaji(ali));
        System.out.println("gaji direktur = "+pg.hitungGaji(Tony));
    }

}
