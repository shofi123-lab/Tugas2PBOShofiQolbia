public class Mahasiswa {
    String nama;
    String nim;
    String jurusan;

    public Mahasiswa() {
        nama = "Yoona";
        nim = "2210056567";
        jurusan = "Teknik Informatika";
    }

    public Mahasiswa(String nama, String nim, String jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
    }

    public void tampilData() {
        System.out.println("Nama     : " + nama);
        System.out.println("NIM      : " + nim);
        System.out.println("Jurusan  : " + jurusan);
    }

    public String getInfo() {
        return nama + " (" + nim + ") - " + jurusan;
    }
}