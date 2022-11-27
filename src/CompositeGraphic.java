import java.util.ArrayList;
import java.util.List;

class CompositeGraphic implements Graphic {
    String name;
    private final List<Graphic> childGraphics = new ArrayList<>();

    public CompositeGraphic(String newName) {
        name = newName;
    }

    public void add(Graphic graphic) {
        childGraphics.add(graphic);
    }

    @Override
    public void printAthletes() {
        System.out.println(name);
        for (Graphic graphic : childGraphics) {
            graphic.printAthletes();
        }
    }

    @Override
    public void printGoldMedals() {
        System.out.println(name);
        for (Graphic graphic : childGraphics) {
            graphic.printAthletes();
        }
    }
}