package OOP;

public class Murid {
    public String nama = "Rima";
    private int usia = 16;
    protected String alamat = "Tulungagung";
    char jk = 'P';
    
    //mutator methods (set Nilai)
    public void setUsia(){
        this.usia=usia;
    }

    //asesor methods(get nilai)
    public int getUsia(){
        return usia;
    }

}
