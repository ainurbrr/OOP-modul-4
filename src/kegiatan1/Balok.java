package kegiatan1;

public class Balok extends BangunRuang {
    double p, l, t;
    public Balok(double p, double l, double t){
        this.p = p;
        this.l = l;
        this.t = t;
    }
    @Override
    public double getLuaspermukaan() {
        return 2*((p*l)+(p*t)+(l*t));
    }

    @Override
    public double getVolume() {
        return p*l*t;
    }
}
