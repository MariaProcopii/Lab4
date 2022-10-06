import java.util.ArrayList;

public class Player extends Human{
//    public ArrayList<Player> customersList = new ArrayList<>();
    private String food;
    private String supply;
    private String meal;
    private int money;
    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getSupply() {
        return supply;
    }

    public void setSupply(String supply) {
        this.supply = supply;
    }

    public String getMeal() {
        return meal;
    }

    public void setMeal(String meal) {
        this.meal = meal;
    }

    public int moneyAmount(){
        return money;
    }

    public void setMoney(int money){
        this.money += money;
    }

    public void pay(int bill){
        this.money -= bill;
    }

    public Player(){
        this.money = random.nextInt(201);
        setPlayerNr();
//        System.out.println("Player: " +  name + " has " + money + " $");
    }

    public void greeting(){
        System.out.println("Player: Hello, I am "
                           + name + ". I need a free table.");
    }

    public void speak(){
        int phrase = random.nextInt(phrases.length);
        System.out.println("Player: " + phrases[phrase] + ".");
        int nr = random.nextInt(3) + 1;
        switch (nr) {
            case 1 -> System.out.println("Player: Hmm, waiter is so slow...");
            case 2 -> System.out.println("Player: Waiter works good.");
            case 3 -> System.out.println("Player: Waiter works so fast." +
                                         "Maybe I should live him some money.");
        }
    }

    public void goodBye(){
        if(money > 0 && opinion > 3){
            System.out.println("Player: you worked good and I've decided to leave you some money.");
            
            int tip = random.nextInt(16);
            while(tip > money){
                tip = random.nextInt(16);
            }
            System.out.println("Player: Take " + tip + " $");
        }
        else{
            System.out.println("Player: I'm not so satisfied to leave you money. Good bye.");
        }
    }
}