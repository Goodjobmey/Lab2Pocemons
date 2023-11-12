package moves.Swinub;

import ru.ifmo.se.pokemon.*;
import util.Main;

public class RockSlide extends PhysicalMove {

    public RockSlide(double pow, double acc){
        super(Type.ROCK, pow, acc);
    }

    @Override
    protected void applyOppDamage(Pokemon def, double damage) {
        super.applyOppDamage(def, damage);}

    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);

        if (Main.chance(0.3)) {
            Effect.flinch(p);
        }
    }

    @Override
    protected String describe(){
        String[] kuski = this.getClass().toString().split("\\.");
        return "совершает " + kuski[kuski.length-1] ;
    }


}
