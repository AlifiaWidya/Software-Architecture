import menu.*;

/**
 * Tugas APL, testing double expresso
 * 
 * @author Alifia Widya
 * @since 4/12/2019
 * @version 1.0
 */
public class StarbuzzCoffee {

    /**
     * @param args untuk menangkap perintah lanjutan dari command line
     */
    public static void main(String args[]) {
        //Testing untuk double Expresso + Milk
        Beverage beverage = new Espresso();
        beverage = new Espresso(beverage);
        beverage = new Milk(beverage);
        System.out.println("double " + beverage.getDescription() + " $" + beverage.cost());

        //Testing untuk double Expresso + double Milk
        Beverage beverage2 = new Espresso();
        beverage2 = new Espresso(beverage2);
        beverage2 = new Milk(beverage2);
        beverage2 = new Milk(beverage2);
        System.out.println("double " + beverage2.getDescription() + " $" + beverage2.cost());

        //Testing untuk double Expresso + Whip
        Beverage beverage3 = new Espresso();
        beverage3 = new Espresso(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println("double " + beverage3.getDescription() + " $" + beverage3.cost());

        //Testing untuk double Expresso + double Whip
        Beverage beverage4 = new Espresso();
        beverage4 = new Espresso(beverage4);
        beverage4 = new Whip(beverage4);
        beverage4 = new Whip(beverage4);
        System.out.println("double " + beverage4.getDescription() + " $" + beverage4.cost());

        //Testing untuk double Expresso
        Beverage beverage5 = new Espresso();
        beverage5 = new Espresso(beverage5);
        System.out.println("double " + beverage5.getDescription() + " $" + beverage5.cost());
    }
}
