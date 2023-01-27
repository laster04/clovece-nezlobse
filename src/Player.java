import java.util.ArrayList;
import java.util.List;

public class Player {
    private List<Figure> figures = new ArrayList<>();
    private String name;

    private boolean onField = false;

    public Player(String name) {
        this.name = name;
    }

    public List<Figure> getFigures() {
        return figures;
    }

    public void addFigure(Figure figure) {
        this.figures.add(figure);
    }

    public void setFigures(List<Figure> figures) {
        this.figures = figures;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isOnField() {
        return onField;
    }

    public void setOnField(boolean onField) {
        this.onField = onField;
    }
}
