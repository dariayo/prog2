import ru.ifmo.se.pokemon.*;
import pokemons.*;

public class Battleground {

    public static void main(String[] args) {
        Battle fight = new Battle();
        fight.addAlly(new Chinchou("Apple",40));
        fight.addAlly(new Komala("Banana",2));
        fight.addAlly(new Seedot("Peach",2));
        fight.addFoe(new Nuzleaf("Potato",1));
        fight.addFoe(new Lanturn("Carrot",48));
        fight.addFoe(new Shiftry("Tomato",1));
        fight.go();
    }
}
