package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.*;

public class Lanturn extends Pokemon {
    public Lanturn (String name, int level){
        super(name,level);
        setStats(125,58,58,76,76,67);
        setType(Type.WATER,Type.ELECTRIC);
        setMove(new Rest(), new BubbleBeam(),new TakeDown(), new EerieImpulse());
    }
}
