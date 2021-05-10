package kegiatan2;

public class kubus extends Persegi{
    public int tinggi;


    public kubus(int sisi){
        this.sisi = sisi;
        this.tinggi = sisi;
    }
    public double getVolume(){
        return tinggi*tinggi*tinggi;
    }
}
