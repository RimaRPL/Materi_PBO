package OOP;

public class Bus2 {
    private int penumpang,maxpenumpang;

    //konstruktor 
    public Bus2(int maxpenumpang){
        this.maxpenumpang=maxpenumpang;    // nilai maxpenumpang sama dengan input maxpenumpang baru
        penumpang=0;
    }

    //methot mutator 
    public void pluspenumpang(int penumpang){
        int temp;
        temp=this.penumpang+penumpang; //
        if (temp>=maxpenumpang){
            System.out.println("Overload penumpang");
        }
        else {
            this.penumpang=temp;
        }
    }

    public void cetak(){
        System.out.println("Penumpang sekarang = " +penumpang);
        System.out.println("Penumpang seharusnya adalah : " +maxpenumpang);
    }
    
}
