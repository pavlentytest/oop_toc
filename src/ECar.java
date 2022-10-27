public class ECar extends Car {
    private double batteryCapacity;

    public ECar(String name, int power, double batteryCapacity) {
        super(name, power);
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public void doBeep() {
        System.out.println("Beep Ecar!");
    }
}
