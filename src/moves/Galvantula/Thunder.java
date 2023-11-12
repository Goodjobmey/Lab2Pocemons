package moves.Galvantula;

import ru.ifmo.se.pokemon.*;
import util.Main;

public class Thunder extends SpecialMove {
    public Thunder(double pow, double acc){
        super(Type.ELECTRIC, pow, acc);
    }
    @Override
    protected void applyOppDamage(Pokemon def, double damage) {
        super.applyOppDamage(def, damage);}

    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);

        if (Main.chance(0.3)) {
            Effect.paralyze(p);
        }
    }

    @Override
    protected String describe(){
        String[] kuski = this.getClass().toString().split("\\.");
        return "совершает " + kuski[kuski.length-1] ;
    }
}
