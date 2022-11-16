package moves;

import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove {
    public Facade() {
        super(Type.NORMAL, 70, 100);
    }

    @Override
    protected void applyOppDamage(Pokemon def, double damage) {
        Status status = def.getCondition();
        if (status.equals(Status.BURN) || status.equals(Status.POISON) || status.equals(Status.PARALYZE)) {
            super.applyOppDamage(def, damage * 2);
        } else {
            super.applyOppDamage(def, damage);
        }
    }

    @Override
    protected String describe() {
        return "использует Facade";
    }
}
