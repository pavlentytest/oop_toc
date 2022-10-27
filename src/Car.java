public class Car {
    private String name;
    private int power;
    public static final int ABC = 123;

    public void setName(String name) {
        this.name = name;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getName() {
        return this.name;
    }

    public int getPower() {
        return this.power;
    }

    public Car() {

    }

    public Car(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public void doBeep() {

    }

    public void doBeep(String str) {
        System.out.println(str);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + this.name + '\'' +
                ", power=" + this.power +
                '}';
    }
}
