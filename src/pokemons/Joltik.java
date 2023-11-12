package pokemons;

import moves.Joltik.Absorb;
import moves.Joltik.EnergyBall;
import moves.Joltik.WildCharge;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Joltik extends Pokemon {

    public Joltik(String name, int level) {
        super(name, level);

        super.setType(Type.BUG, Type.ELECTRIC);
        setStats(50, 47, 50, 57, 50, 65);

        EnergyBall energyBall = new EnergyBall(90, 100);
        Absorb absorb = new Absorb(20, 100);
        WildCharge wildCharge = new WildCharge(90, 100);
        setMove(energyBall, absorb, wildCharge);
    }
}