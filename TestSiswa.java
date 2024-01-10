package OOP;

public class TestSiswa {
    public static void main(String[] args) {
        
        encapsiswa siswa = new encapsiswa();
        siswa.setName("Agus");
        siswa.setAge(20);
        siswa.setAddress("Malang");

        System.out.println("Nama : "+siswa.getName()+"Alamat : "+siswa.getAddress()+ "Berumur "+siswa.getAge()+ "tahun");

    }
}
