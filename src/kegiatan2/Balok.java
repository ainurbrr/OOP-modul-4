package kegiatan2;

public class Balok extends PersegiPanjang{
    private int Tinggi;

    public Balok(int Panjang, int Lebar, int Tinggi){
        this.Panjang = Panjang;
        this.Lebar = Lebar;
        this.Tinggi = Tinggi;
    }
    public double getVolume(){
        return Panjang*Lebar*Tinggi;
    }
}
