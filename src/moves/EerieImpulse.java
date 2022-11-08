package moves;

import ru.ifmo.se.pokemon.*;

public class EerieImpulse extends StatusMove {
    public EerieImpulse(){
        super(Type.ELECTRIC,0,100);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.SPECIAL_ATTACK,-2);
    }
    @Override
    protected String describe(){
        return "использует Eerie Impulse";
    }
}
