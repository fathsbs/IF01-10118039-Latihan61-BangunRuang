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
public class Tabung extends BangunRuang {

    private int r;
    private int h;

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    @Override
    public double hitungVolume() {
        return Math.PI * r * r * h;
    }

}
