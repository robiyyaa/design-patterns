public abstract class TestDecorator implements Test{
    private Test newTest;

    public TestDecorator(Test newTest){
        this.newTest = newTest;
    }

    @Override
    public String startTest() {
        return newTest.startTest();
    }

    @Override
    public int price() {
        return newTest.price();
    }
}
