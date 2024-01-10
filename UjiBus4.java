package OOP;

public class UjiBus4 {
    public static void main(String[] args) {
        Bus4 bus = new Bus4(10);
        bus.addPenumpang(1);
        bus.cetak();
        bus.addPenumpang(2);
        bus.cetak();
        bus.addPenumpang(4);
        bus.cetak();

        System.out.println("Rata-rata Berat Penumpang: " + bus.getAverage());
    }
}
