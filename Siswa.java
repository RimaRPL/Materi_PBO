package OOP;

public class Siswa {
    public static void main(String[] args) {
        Siswa s = new Siswa ();
        s.tampilNama();
        s.tampilKelas(5);
    }

    //parameter 
    public void tampilNama () {
        String nama = "Rima";
        char jeniskelamin = 'P';
        int usia = 16 ;
        String alamat = "Tulungagung";
        System.out.println("Nama : " +nama );
        System.out.println("Jenis Kelamin : " +jeniskelamin );
        System.out.println("Usia : " +usia );
        System.out.println("Alamat : " +alamat );

    }
    
    //interparamater
    public void tampilKelas (int kelas ){
        System.out.println("Kelas : "+kelas);
    }

}
