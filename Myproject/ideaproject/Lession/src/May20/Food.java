package May20;

public class Food {
    String name;
    public Food(){

    }

    public void eat(){
        System.out.println("吃饭很重要");
    }
    public void eat(String name){
        System.out.println("People loves eat meat！");
    }

    public static void main(String[] args) {
        Food f = new Food();
        f.eat();

        Food d = new Food();
        d.eat("people");
    }
}

