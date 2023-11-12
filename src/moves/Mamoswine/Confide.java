package moves.Mamoswine;

import ru.ifmo.se.pokemon.*;

public class Confide extends StatusMove {
    public Confide(double pow, double acc){
        super(Type.NORMAL, pow, acc);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);
        Effect EffectObject = new Effect().stat(Stat.SPECIAL_ATTACK, -2);
        p.addEffect(EffectObject);
    }

    @Override
    protected String describe(){
        String[] kuski = this.getClass().toString().split("\\.");
        return "совершает " + kuski[kuski.length-1] ;
    }
}
