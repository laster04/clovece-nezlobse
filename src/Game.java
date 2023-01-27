import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Game {

    private List<Player> players = new ArrayList<>();
    private List<Field> fields = new ArrayList<>();

    public Game() {
        this(2,30);
    }

    public Game(int playersCount, int fieldsCount) {
        this.players = IntStream.range(0, playersCount)
                .mapToObj(index -> {
                    Player p = new Player(String.format("Player%s", index));
                    List<Figure> figs = IntStream.range(0, 4)
                            .mapToObj(o -> new Figure(o, p, Dice.rgbColor()))
                            .collect(Collectors.toList());
                    p.setFigures(figs);
                    return p;
                })
                .collect(Collectors.toList());
        this.fields = IntStream.range(0, fieldsCount)
                .mapToObj(index -> new Field())
                .collect(Collectors.toList());
    }

    public void play() {
        while(true) {
            for (Player player : this.players) {
                int roll = Dice.roll();
                if (!player.isOnField() && roll != 6) {
                    continue;
                } else {
                    player.setOnField(true);
                    roll = Dice.roll();
                    Figure playerFigure = player.getFigures().get(0);

                }
            }
        }
    }

    private void setFigureOnFields(Figure figure, int steps) {
        for (Field field : this.fields) {

        }
    }

    public List<Player> getPlayers() {
        return players;
    }
    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public List<Field> getFields() {
        return fields;
    }

    public void addField(Field field) {
        this.fields.add(field);
    }

    public void setFields(List<Field> fields) {
        this.fields = fields;
    }
}
