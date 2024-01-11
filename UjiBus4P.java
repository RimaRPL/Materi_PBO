package OOP;

public class UjiBus4P {
    public static void main(String[] args) {
        
        Bus4Praktek bus = new Bus4Praktek(10);
        bus.cetak();

        bus.addPenumpang(5);
        bus.plusBerat(10);
        bus.plusBerat(20);
        bus.plusBerat(30);
        bus.plusBerat(40);
        bus.plusBerat(50);
        bus.cetak();
        
    }
}
