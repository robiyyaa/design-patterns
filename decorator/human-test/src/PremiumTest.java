public class PremiumTest extends TestDecorator{
    public PremiumTest(Test newTest) {
        super(newTest);
    }

    @Override
    public String startTest() {
        return "Premium " + super.startTest();
    }

    @Override
    public int price() {
        return super.price() + super.price()/2;
    }
}
