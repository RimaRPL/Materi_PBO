package OOP;

public class UjiBola {
    public static void main(String[] args) {
        double jariJari = 5.0;
        Bola bola = new Bola();

        System.out.println("Sebelum manipulasi:");
        bola.showDiameter();
        bola.showLuasPermukaan();
        bola.showVolume();
        
        bola.setJariJari(jariJari);
    
        System.out.println("Setelah manipulasi:");
        bola.showDiameter();
        bola.showLuasPermukaan();
        bola.showVolume();
        
        

    }
}
