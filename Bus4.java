package OOP;

public class Bus4 {
    private double penumpang,maxpenumpang,counter,penumpangBaru;
        
    // konstruktor
    public Bus4(double maxpenumpang){
        this.maxpenumpang=maxpenumpang;
        penumpang = 0;
    }
    
    //method mutator 
    public void addPenumpang(int penumpang){
        double temp = this.penumpang + penumpang;
        if (temp >= maxpenumpang) {
            this.penumpang = temp;
            this.penumpangBaru += penumpang;
            this.counter++;
        }else {
            this.penumpang=temp;
        }
        
    }

    public double getPenumpang(int penumpang){
        return penumpang;
    }

    public double getAverage() {
        if (counter == 0) {
            return 0;
        } else {
            return penumpangBaru / counter;
        }
    }

    public void cetak(){
        System.out.println("Penumpang sekarang = "+penumpang);
        System.out.println("penumpang seharusnya adalah ="+maxpenumpang);
    } 
}

