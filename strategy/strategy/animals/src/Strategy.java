import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Strategy {

    public static void main(String[] args) throws NumberFormatException, IOException {
        Context context = new Context(new Dog());
        System.out.println("Dog = " + context.executeStrategy());

        context = new Context(new Cat());
        System.out.println("Cat = " + context.executeStrategy());

    }

}