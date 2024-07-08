package Poc;

import Att.Ph.Double_Slap;
import Att.St.Double_Team;
import Att.St.Confide;
import Att.St.Tickle;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Alomomola extends Pokemon {
    public Alomomola() {
        setType(Type.WATER);
        setStats(165, 75, 80,40,45,65);
        addMove(new Double_Slap());
        addMove(new Double_Team());
        addMove(new Confide());
        addMove(new Tickle());
    }
}
