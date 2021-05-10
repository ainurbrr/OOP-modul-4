package kegiatan1;

public class Tabung extends BangunRuang {
    final double phi = 3.14;
    double r, t;
    public Tabung (double r, double t){
        this.r = r;
        this.t = t;
    }
    @Override
    public double getLuaspermukaan() {
       return 2*phi*r*(r+t);
    }

    @Override
    public double getVolume() {
        return phi*r*r*t;
    }
}
