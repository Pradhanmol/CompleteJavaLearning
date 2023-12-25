class CoffeeMachine {
    private float coffeQty;
    private float waterQty;
    private float milkQty;
    private float sugarQty;

    private static CoffeeMachine coffeeInstance = null;

    private static int count = 0;

    private CoffeeMachine(){
        coffeQty = 1;
        waterQty = 1;
        milkQty = 1;
        sugarQty = 1;
    }

    public void fillSugar(float qty){
        sugarQty = qty;
    }
    
    public void fillWater(float qty){
        waterQty = qty;
    }

    public void fillCoffee(float qty){
        coffeQty = qty;
    }

    public void fillMilk(float qty){
        milkQty = qty;
    }

    public float getCoffee(){
        return 0.15f;
    }


    static CoffeeMachine getInstance(){
        if(count < 2)
        {
        if(coffeeInstance == null)
        {
            coffeeInstance = new CoffeeMachine();
        }
            count++;
        }
        else
        {
            coffeeInstance = null;
            System.out.println("Counter get Exceed"+CoffeeMachine.getCounter());
        }
        return coffeeInstance;
    }

    private static int getCounter() {
        return count;
    }

}

public class Singelton{

    public static void main(String[] args) {

        CoffeeMachine customer1 = CoffeeMachine.getInstance();
        CoffeeMachine customer2 = CoffeeMachine.getInstance();
        CoffeeMachine customer3 = CoffeeMachine.getInstance();

        System.out.println(customer1);
        System.out.println(customer2);
        System.out.println(customer3);

        if(customer1 == customer2 && customer2 ==customer3){
            System.out.println("The Object address is same");
        }
    }
}
