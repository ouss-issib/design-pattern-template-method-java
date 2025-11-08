package ouss.issib.templates;

public class SpainImpl extends Template{
    @Override
    public int param1() {
        return 9;
    }

    @Override
    public double compute(int a, int b) {
        return a*b;
    }
}
