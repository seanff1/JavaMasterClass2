package section7;

public class PC {

    private GraphicsCard graphicsCard;
    private  Motherboard motherboard;
    private RAM ram;

    public PC(GraphicsCard graphicsCard, Motherboard motherboard, RAM ram) {
        this.graphicsCard = graphicsCard;
        this.motherboard = motherboard;
        this.ram = ram;
    }

    public GraphicsCard getGraphicsCard() {
        return graphicsCard;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public RAM getRam() {
        return ram;
    }
}
