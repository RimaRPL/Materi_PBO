package ProduktifRPL.PBO;

public class Staff extends Pegawai {

    private static final int gajiStaf=50000;
    private static final int bonusStaf=10000;

    @Override
    public int gaji() {
        // TODO Auto-generated method stub
        return gajiStaf;
    }

    public int Bonus(){
        return bonusStaf;
    }
    
}
