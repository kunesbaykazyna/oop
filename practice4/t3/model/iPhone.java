package practice4.t3.model;

public class iPhone implements SellableAndPluggable {

    @Override
    public void sell() {
        System.out.println("iPhone is sold");
    }

    @Override
    public void plugIn() {
        System.out.println("iPhone is charging");
    }
}
