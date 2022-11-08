import ru.ifmo.se.pokemon.*;
import pokemons.*;

public class Battleground {

    public static void main(String[] args) {
        Battle fight = new Battle();
        fight.addAlly(new Chinchou("Apple",2));
        fight.addAlly(new Komala("Banana",2));
        fight.addAlly(new Seedot("Peach",2));
        fight.addFoe(new Nuzleaf("Potato",2));
        fight.addFoe(new Lanturn("Carrot",2));
        fight.addFoe(new Shiftry("Tomato",2));
        fight.go();
    }
}

