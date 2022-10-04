public class Context {

    private Calculation strategy;

    public Context(Calculation strategy){
        this.strategy = strategy;
    }

    public float executeStrategy(float num1, float num2){
        return strategy.calc(num1, num2);
    }
}