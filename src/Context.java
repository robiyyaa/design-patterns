public class Context {

    private Animal strategy;

    public Context(Animal strategy){
        this.strategy = strategy;
    }

    public String executeStrategy(){
        return strategy.makeSound();
    }
}