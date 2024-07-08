package Poc;

import Att.Sp.Mega_Drain;
import Att.Sp.Sludge_Bomb;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Oddish extends Pokemon {
    public Oddish() {
        setType(Type.GRASS, Type.POISON);
        setStats(45, 50, 55,75,65,30);
        addMove(new Sludge_Bomb());
        addMove(new Mega_Drain());
    }
}
