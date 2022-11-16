package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.*;

public class Nuzleaf extends Seedot {
    public Nuzleaf(String name, int level) {
        super(name, level);
        setStats(70, 70, 40, 60, 40, 60);
        setType(Type.GRASS, Type.DARK);
        setMove(new Harden());
    }
}
