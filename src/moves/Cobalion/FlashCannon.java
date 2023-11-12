package moves.Cobalion;

import ru.ifmo.se.pokemon.*;
import util.Main;

public class FlashCannon extends SpecialMove {

    public FlashCannon(double pow, double acc){
        super(Type.STEEL, pow, acc);
    }

    @Override
    protected void applyOppDamage(Pokemon def, double damage) {
        super.applyOppDamage(def, damage);

        if (Main.chance(0.1)) {
            Effect e = new Effect().stat(Stat.SPECIAL_DEFENSE, -1);
            def.addEffect(e);
        }
    }


    @Override
    protected String describe(){
        String[] kuski = this.getClass().toString().split("\\.");
        return "совершает " + kuski[kuski.length-1] ;
    }

}
