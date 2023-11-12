package pokemons;
import moves.Cobalion.CloseCombat;
import moves.Cobalion.FlashCannon;
import moves.Cobalion.FocusBlast;
import moves.Cobalion.WorkUp;
import ru.ifmo.se.pokemon.*;

public class Cobalion extends Pokemon {

    public Cobalion(String name, int level) {
        super(name, level);

        super.setType(Type.STEEL, Type.FIGHTING);
        setStats(91,90,129,90,72,108);

        WorkUp workUp = new WorkUp(0,0);
        CloseCombat closeCombat = new CloseCombat(120,100);
        FlashCannon flashCannon = new FlashCannon(80,100);
        FocusBlast focusBlast = new FocusBlast(120, 70);

        setMove(workUp, closeCombat, flashCannon,focusBlast);
    }

}