public class Main {
    public static void main(String[] args) {

        Mahasiswa mhs1 = new Mahasiswa();
        System.out.println("Data Mahasiswa 1:");
        mhs1.tampilData();

        System.out.println();

        Mahasiswa mhs2 = new Mahasiswa("Shofi Qolbia", "2410020046", "Sistem Informasi");
        System.out.println("Data Mahasiswa 2:");
        mhs2.tampilData();

        System.out.println();

        System.out.println("Info Singkat:");
        System.out.println(mhs2.getInfo());
    }
}