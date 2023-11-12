package moves.Cobalion;

import ru.ifmo.se.pokemon.*;

public class CloseCombat extends PhysicalMove {

    public CloseCombat(double pow, double acc) {
        super(Type.FIGHTING, pow, acc);
    }

    @Override
    protected void applyOppDamage(Pokemon def, double damage){
        super.applyOppDamage(def, damage);

    }
    @Override
    protected void applySelfEffects(Pokemon p) {
        super.applySelfEffects(p);
        Effect EffectObject = new Effect().stat(Stat.SPECIAL_DEFENSE, -1);
        p.addEffect(EffectObject);
    }

    @Override
    protected String describe(){
        String[] kuski = this.getClass().toString().split("\\.");
        return "совершает " + kuski[kuski.length-1] ;
    }
}
