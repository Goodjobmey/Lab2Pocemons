package moves.Joltik;

import ru.ifmo.se.pokemon.*;

public class Absorb extends SpecialMove {
    public Absorb(double pow, double acc){
        super(Type.GRASS, pow, acc);
    }

    @Override
    protected void applyOppDamage(Pokemon def, double damage) {
        super.applyOppDamage(def, damage);

    }


    @Override
    protected void applySelfEffects(Pokemon p) {
        int hp = (int) p.getStat(Stat.HP);
        int hp2 = (int) (hp * 0.5);
        Effect effectHP = new Effect().stat(Stat.HP, -hp2);
        p.addEffect(effectHP);
    }


    @Override
    protected String describe(){
        String[] kuski = this.getClass().toString().split("\\.");
        return "совершает " + kuski[kuski.length-1] ;
    }
}
