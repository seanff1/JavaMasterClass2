package section6;

public class Dog extends Animal{

    private int eyes;
    private int legs;

    public Dog(String name, int brain, int body, int size,
               int weight, int eyes, int legs)
    {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
    }

    @Override
    public void move() {
        super.move();
        System.out.println("Move again");
    }
}
