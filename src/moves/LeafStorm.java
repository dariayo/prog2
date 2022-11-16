package moves;

import ru.ifmo.se.pokemon.*;

public class LeafStorm extends SpecialMove {
    public LeafStorm() {
        super(Type.GRASS, 130, 90);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.SPECIAL_ATTACK, -2);
    }

    @Override
    protected String describe() {
        return "использует Leaf Storm";
    }
}
