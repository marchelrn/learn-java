package lerch.mtthw.data;

public interface Car extends HasBrand, IsMaintenance{
    void drive();
    int getTier();
    boolean isMaintenance();
}
