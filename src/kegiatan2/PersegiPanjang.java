package kegiatan2;

public class PersegiPanjang implements SegiEmpat {
    protected int Panjang;
    protected int Lebar;


    @Override
    public double Luas() {
        return Panjang*Lebar;
    }

    @Override
    public double keliling() {
        return 2*(Panjang+Lebar);
    }
}
