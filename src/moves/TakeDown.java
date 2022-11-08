package moves;

import ru.ifmo.se.pokemon.*;


public class TakeDown extends PhysicalMove {
    public TakeDown(){
        super(Type.NORMAL,90,85);
    }
    @Override
    protected void applySelfDamage(Pokemon att, double damage) {
        //Метод, применяющий вычисленное повреждение к атакующему покемону.
        att.setMod(Stat.HP, (int) Math.round(damage/4));
    }
    @Override
    protected String describe(){
        return" использует Take Down";
    }

}
