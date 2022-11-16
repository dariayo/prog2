package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.*;

public class Seedot extends Pokemon {
    public Seedot(String name, int level) {
        super(name, level);
        setStats(40, 40, 50, 30, 30, 30);
        setType(Type.GRASS);
        setMove(new DoubleTeam(), new SwordsDance());
    }
}
