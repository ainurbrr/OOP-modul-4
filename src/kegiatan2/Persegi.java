package kegiatan2;

public class Persegi implements SegiEmpat{
    protected int sisi;

    @Override
    public double Luas() {
        return sisi*sisi;
    }

    @Override
    public double keliling() {
        return 4*sisi;
    }
}
