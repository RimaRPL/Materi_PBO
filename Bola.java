package OOP;

public class Bola {
        private double jariJari;
    
        public void setJariJari(double jariJari) {
            this.jariJari = jariJari;
        }
    
        public void showDiameter() {
            double diameter = 2 * jariJari;
            System.out.println("Diameter Bola: " + diameter);
        }
    
        public void showLuasPermukaan() {
            double luasPermukaan = 4 * Math.PI * jariJari * jariJari;
            System.out.println("Luas Permukaan Bola: " + luasPermukaan);
        }
    
        public void showVolume() {
            double volume = (4.0 / 3.0) * Math.PI * Math.pow(jariJari, 3);
            System.out.println("Volume Bola: " + volume);
        }
    
    
}
