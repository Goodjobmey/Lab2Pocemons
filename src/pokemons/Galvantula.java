package pokemons;

import moves.Galvantula.Thunder;
import moves.Joltik.Absorb;
import moves.Joltik.EnergyBall;
import moves.Joltik.WildCharge;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Galvantula extends Pokemon {

    public Galvantula(String name, int level) {
        super(name, level);

        super.setType(Type.BUG, Type.ELECTRIC);
        setStats(70, 77, 60, 97, 60, 108);

        EnergyBall energyBall = new EnergyBall(90, 100);
        Absorb absorb = new Absorb(20, 100);
        WildCharge wildCharge = new WildCharge(90, 100);
        Thunder thunder = new Thunder(110, 70);


        setMove(energyBall, absorb, wildCharge);
    }
}