package moves.Swinub;

import ru.ifmo.se.pokemon.*;

public class MudSlap extends SpecialMove {
    public MudSlap(double pow, double acc){
        super(Type.GROUND, pow, acc);
    }
    @Override
    protected void applyOppDamage(Pokemon def, double damage) {
        super.applyOppDamage(def, damage);}

    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);
        Effect EffectObject = new Effect().stat(Stat.ACCURACY, -1);
        p.addEffect(EffectObject);
    }


    @Override
    protected String describe(){
        String[] kuski = this.getClass().toString().split("\\.");
        return "совершает " + kuski[kuski.length-1] ;
    }
}
