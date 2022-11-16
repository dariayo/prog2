package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.*;

public class Komala extends Pokemon {
    public Komala(String name, int level) {
        super(name, level);
        setStats(65, 115, 65, 75, 95, 65);
        setType(Type.NORMAL);
        setMove(new TakeDown(), new DoubleTeam(), new RockPolish(), new Facade());
    }

}
