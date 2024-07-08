package Att.Ph;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;


public class Double_Slap extends PhysicalMove {
    public Double_Slap() {
        super(Type.NORMAL, 15, 0.85, 0, probably_hits());
    }

    private static int probably_hits() {
         double random_number = Math.random() * 8;
        if (random_number < 3) {
            return 2;
        } else if (random_number < 6) {
            return 3;
        } else if (random_number < 7) {
            return 4;
        } else {
            return 5;
        }
    }

    @Override
    protected String describe() {
        return "Double Slap";
    }
}
