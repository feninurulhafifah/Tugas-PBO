public class Toshiba implements Laptop {
    private int volume = 50;

    @Override
    public void powerOn() {
        System.out.println("Toshiba menyala...");
    }

    @Override
    public void powerOff() {
        System.out.println("Toshiba mati...");
    }

    @Override
    public void volumeUp() {
        volume++;
        System.out.println("Volume Toshiba: " + volume);
    }

    @Override
    public void volumeDown() {
        volume--;
        System.out.println("Volume Toshiba: " + volume);
    }
}
