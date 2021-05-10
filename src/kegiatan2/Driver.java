package kegiatan2;

public class Driver {
    public static void main(String[] args) {
        kubus k = new kubus(3);
        Balok b = new Balok(4,3,2);

        System.out.println ("Luas Persegi : "+k.Luas());
        System.out.println("keliling Persegi : "+k.keliling());
        System.out.println("Volume kubus : "+k.getVolume());
        System.out.println("Luas Persegi Panjang : "+b.Luas());
        System.out.println("Keliling Persegi Panjang : "+b.keliling());
        System.out.println("Volume Balok : "+b.getVolume());

    }
}
