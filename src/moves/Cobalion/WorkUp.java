package moves.Cobalion;

import ru.ifmo.se.pokemon.*;

public class WorkUp extends StatusMove {
    public WorkUp(double pow, double acc){
        super(Type.NORMAL, pow, acc);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);
        Effect EffectObject = new Effect().stat(Stat.SPECIAL_ATTACK, 1);
        Effect EffectObject2 = new Effect().stat(Stat.ATTACK, 1);
        p.addEffect(EffectObject);
        p.addEffect(EffectObject2);
    }


    @Override
    protected String describe(){
        String[] kuski = this.getClass().toString().split("\\.");
        return "совершает " + kuski[kuski.length-1] ;
    }
}
