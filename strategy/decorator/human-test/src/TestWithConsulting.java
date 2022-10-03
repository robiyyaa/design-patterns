public class TestWithConsulting extends TestDecorator{
    public TestWithConsulting(Test newTest) {
        super(newTest);
    }

    @Override
    public String startTest() {
        return super.startTest() + " with Consulting";
    }

    @Override
    public int price() {
        return super.price() + 2000;
    }
}
