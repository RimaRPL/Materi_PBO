package OOP;

public class Bus4Praktek {
    
    private int penumpang,maxpenumpang;
    private double beratTotal;

    public Bus4Praktek(int maxpenumpang){
        this.maxpenumpang = maxpenumpang;
        penumpang = 0;
        beratTotal = 0;
    }

    public void addPenumpang(int penumpang){
        int temp;
        temp = this.penumpang + penumpang;
        if (temp >= maxpenumpang){
            System.out.println("Overload Penumpang ");
        }else{
            this.penumpang = temp;
        }
    }

    public double getPenumpang(){
        return penumpang;
    }

    public void plusBerat(double berat){
        beratTotal += berat ;
    }

    public double getAverage(){
        return beratTotal/getPenumpang();
    }

    public void cetak(){
        System.out.println("Penumpang sekarang = " + penumpang);
        System.out.println("Penumpang seharusnya adalah  = " + maxpenumpang);
        System.out.println("Berat sekarang = " + beratTotal);
        System.out.println("Penumpang sekarang = " + getAverage());
    }
}
