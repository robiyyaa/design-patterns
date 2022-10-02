import java.io.IOException;
import java.util.Scanner;

public class Main {
    private static int  choice;
    public static void main(String args[]) throws NumberFormatException, IOException {
//        Test test = new TestWithConsulting(new PremiumTest(new PsychoTest()));
//        System.out.println(test.startTest());
//        System.out.println("Price: " + test.price());
        do{
            System.out.print("========= Test Options ============ \n");
            System.out.print("            1. General Test.   \n");
            System.out.print("            2. Professional orientation Test.\n");
            System.out.print("            3. Psychological Test.         \n");
            System.out.print("            4. Premium General Test.   \n");
            System.out.print("            5. Premium Professional orientation Test.\n");
            System.out.print("            6. Premium Psychological Test.         \n");
            System.out.print("            7. General Test with Consulting.   \n");
            System.out.print("            8. Professional orientation Test with Consulting.\n");
            System.out.print("            9. Psychological Test with Consulting.         \n");
            System.out.print("            0. Exit.         \n");
            System.out.print("Enter your choice: ");
            Scanner sc = new Scanner(System.in);
            choice=sc.nextInt();
            switch (choice) {
                case 1:{
                    GeneralTest generalTest = new GeneralTest();
                    System.out.println(generalTest.startTest());
                    System.out.println("Price: " + generalTest.price());
                }
                break;
                case 2:{
                    ProfTest profTest = new ProfTest();
                    System.out.println(profTest.startTest());
                    System.out.println("Price: " + profTest.price());
                }
                break;
                case 3:{
                    PsychoTest psychoTest = new PsychoTest();
                    System.out.println(psychoTest.startTest());
                    System.out.println("Price: " + psychoTest.price());
                }
                break;
                case 4:{
                    PremiumTest premiumTest = new PremiumTest(new GeneralTest());
                    System.out.println(premiumTest.startTest());
                    System.out.println("Price: " + premiumTest.price());
                }
                break;
                case 5:{
                    PremiumTest premiumTest = new PremiumTest(new ProfTest());
                    System.out.println(premiumTest.startTest());
                    System.out.println("Price: " + premiumTest.price());
                }
                break;
                case 6:{
                    PremiumTest premiumTest = new PremiumTest(new PsychoTest());
                    System.out.println(premiumTest.startTest());
                    System.out.println("Price: " + premiumTest.price());
                }
                break;
                case 7:{
                    TestWithConsulting premiumTest = new TestWithConsulting(new GeneralTest());
                    System.out.println(premiumTest.startTest());
                    System.out.println("Price: " + premiumTest.price());
                }
                break;
                case 8:{
                    TestWithConsulting premiumTest = new TestWithConsulting(new ProfTest());
                    System.out.println(premiumTest.startTest());
                    System.out.println("Price: " + premiumTest.price());
                }
                break;
                case 9:{
                    TestWithConsulting premiumTest = new TestWithConsulting(new PsychoTest());
                    System.out.println(premiumTest.startTest());
                    System.out.println("Price: " + premiumTest.price());
                }
                break;
                default:{
                    System.out.println("Other than these no tests available");
                }
                return;
            }

        }while(choice!=0);
    }

}
