import java.awt.*;

public class Figure {
    private int figureIndex;
    private Player player;
    private Color color;
    private Field currentField;

    public Figure(int figureIndex, Player player, Color color) {
        this.figureIndex = figureIndex;
        this.player = player;
        this.color = color;
    }

    public int getFigureIndex() {
        return figureIndex;
    }

    public void setFigureIndex(int figureIndex) {
        this.figureIndex = figureIndex;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Field getCurrentField() {
        return currentField;
    }

    public void setCurrentField(Field currentField) {
        this.currentField = currentField;
    }
}
