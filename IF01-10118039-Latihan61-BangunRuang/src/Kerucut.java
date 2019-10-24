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
public class Kerucut extends BangunRuang {

    private int r;
    private int t;

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getT() {
        return t;
    }

    public void setT(int t) {
        this.t = t;
    }

    @Override
    public double hitungVolume() {
        return (Math.PI * r * r * t) / 3;
    }

}
