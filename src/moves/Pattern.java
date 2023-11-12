package moves;

import ru.ifmo.se.pokemon.*;

public class Pattern extends PhysicalMove {

    public Pattern(double pow, double acc){
        super(Type.NORMAL, pow, acc);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);
        Effect EffectObject = new Effect().stat(Stat.SPECIAL_DEFENSE, 1);
        p.addEffect(EffectObject);
    }


    @Override
    protected String describe(){
        String[] kuski = this.getClass().toString().split("\\.");
        return "совершает " + kuski[kuski.length-1] ;
    }

}

