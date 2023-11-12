package moves.Piloswine;

import ru.ifmo.se.pokemon.*;
import util.Main;

public class Amnesia extends StatusMove {
    public Amnesia(double pow, double acc) {
        super(Type.PSYCHIC, pow, acc);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        super.applySelfEffects(p);
        Effect EffectObject = new Effect().stat(Stat.ACCURACY, 2);
        p.addEffect(EffectObject);
    }

    @Override
    protected String describe(){
        String[] kuski = this.getClass().toString().split("\\.");
        return "совершает " + kuski[kuski.length-1] ;
}
}