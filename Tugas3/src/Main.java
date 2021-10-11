import java.util.ArrayList;

class Jurusan{
    private String kode;
    private String nama;
    private ArrayList<Mahasiswa> mhs;

    Jurusan (String kode, String nama){
        this.kode = kode;
        this.nama = nama;
        this.mhs = new ArrayList<>();
    }

    void addMhs(Mahasiswa m){
        mhs.add(m);
    }

    String getKode(){
        return kode;
    }

    String getNama(){
        return nama;
    }

    public void Daftar (){
        for (Mahasiswa m : mhs){
            System.out.println(m.getNim()+  " - "  +m.getNama());
        }
    }

}

class Mahasiswa{
    private String nim;
    private String nama;

    Mahasiswa(String nim, String nama){
        this.nim = nim;
        this.nama = nama;
    }

    String getNim(){
        return nim;
    }

    String getNama(){
        return nama;
    }

}

public class Main {
    public static void main(String[] args) {
        //bentuk objek jurusan
        Jurusan jrs1= new Jurusan("D3IF", "Diploma 3 Rekayasa Perangkat Lunak Aplikasi");
        Jurusan jrs2 = new Jurusan("D3SI", "Diploma 3 Sistem Informasi");

        //bentuk objek mahasiswa
        Mahasiswa mhs1 = new Mahasiswa("6701", "Rendi");//D3RPLA
        Mahasiswa mhs2 = new Mahasiswa("6702", "Chaca");
        Mahasiswa mhs3 = new Mahasiswa("6703", "Agus");

        Mahasiswa mhs4 = new Mahasiswa("6301", "Ridwan");//D3SI
        Mahasiswa mhs5 = new Mahasiswa("6302", "Siska");
        Mahasiswa mhs6 = new Mahasiswa("6303", "Zayn");
        Mahasiswa mhs7 = new Mahasiswa("6304", "Rahmat");

        //hubungkan mhs dgn jurusan
        jrs1.addMhs(mhs1);
        jrs1.addMhs(mhs2);
        jrs1.addMhs(mhs3);

        jrs2.addMhs(mhs4);
        jrs2.addMhs(mhs5);
        jrs2.addMhs(mhs6);
        jrs2.addMhs(mhs7);

        System.out.println("Kode :" + jrs1.getKode());
        System.out.println("Nama :" + jrs1.getNama());
        System.out.println("Daftar Mahasiswa :");
        jrs1.Daftar();

        System.out.println();

        System.out.println("Kode :" + jrs2.getKode());
        System.out.println("Nama :" + jrs2.getNama());
        System.out.println("Daftar Mahasiswa :");
        jrs2.Daftar();

    }
}
