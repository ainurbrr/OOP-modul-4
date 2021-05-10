package kegiatan1;

public class driver {
    public static void main(String[] args) {
        Tabung tb = new Tabung(6,3);
        System.out.println("Luas permukaan tabung : "+tb.getLuaspermukaan());
        System.out.println("Volume tabung : "+tb.getVolume());
        Balok bl = new Balok(2,4,3);
        System.out.println("Luas permukaan balok : "+bl.getLuaspermukaan());
        System.out.println("Volume balok : "+bl.getVolume());
    }
}
