/*
 * NAMA              : FATAHILLAH SATRIA BIMA SENO
 * KELAS             : IF-01
 * NIM               : 10118039
 * DESKRIPSI PROGRAM : Program ini berisi program untuk mencari volume beberapa bangun ruang  
 */

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("=====HITUNG VOLUME=====\n");

        Bola bola = new Bola();
        bola.setR(7);
        System.out.println("BOLA");
        System.out.printf("Jari-jari bola\t: %d%n", bola.getR());
        System.out.printf("Volume bola\t: %.1f%n%n", bola.hitungVolume());

        Tabung tabung = new Tabung();
        tabung.setR(10);
        tabung.setH(21);
        System.out.println("TABUNG");
        System.out.printf("Jari-jari tabung: %d%n", tabung.getR());
        System.out.printf("Tinggi tabung\t: %d%n", tabung.getH());
        System.out.printf("Volume tabung\t: %.2f%n%n", tabung.hitungVolume());

        Kerucut kerucut = new Kerucut();
        kerucut.setR(14);
        kerucut.setT(9);
        System.out.println("KERUCUT");
        System.out.printf("Jari-jari kerucut\t: %d%n", kerucut.getR());
        System.out.printf("Tinggi kerucut\t\t: %d%n", kerucut.getT());
        System.out.printf("Volume kerucut\t\t: %.2f%n", kerucut.hitungVolume());
    }

}
