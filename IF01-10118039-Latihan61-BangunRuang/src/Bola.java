/*
 * NAMA              : FATAHILLAH SATRIA BIMA SENO
 * KELAS             : IF-01
 * NIM               : 10118039
 * DESKRIPSI PROGRAM : Program ini berisi program untuk mencari volume beberapa bangun ruang    
 */

/**
 *
 * @author Fatahillah Seno
 */
public class Bola extends BangunRuang {

    private int r;

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    @Override
    public double hitungVolume() {
        return (4 * Math.PI * r * r * r) / 3;
    }

}
