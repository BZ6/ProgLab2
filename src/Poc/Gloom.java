package Poc;

import Att.Sp.Absorb;
import ru.ifmo.se.pokemon.Type;

public class Gloom extends Oddish {

    public Gloom() {
        setType(Type.GRASS, Type.POISON);
        setStats(60, 65, 70,85,75,40);
        addMove(new Absorb());
    }
}
