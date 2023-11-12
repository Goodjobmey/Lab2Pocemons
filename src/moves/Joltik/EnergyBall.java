package moves.Joltik;

import ru.ifmo.se.pokemon.*;
import util.Main;

public class EnergyBall extends SpecialMove {

    public EnergyBall(double pow, double acc){
        super(Type.GRASS, pow, acc);
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
