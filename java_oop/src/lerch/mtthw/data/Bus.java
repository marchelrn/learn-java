package lerch.mtthw.data;

public class Bus implements Car{
    public void drive() {
        System.out.println("Bus drive");
    }

    public int getTier() {
        return 6;
    }

    public String getBrand() {
        return "Hino";
    }

    public boolean isMaintenance() {
        return false;
    }

    public boolean isBig() {
        return true;
    }
}
