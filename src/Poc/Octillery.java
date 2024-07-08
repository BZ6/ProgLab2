package Poc;

import Att.Ph.Gunk_Shot;
import ru.ifmo.se.pokemon.Type;

public class Octillery extends Remoraid {

    public Octillery() {
        setType(Type.WATER);
        setStats(35, 65, 35,65,35,65);
        addMove(new Gunk_Shot());
    }
}
