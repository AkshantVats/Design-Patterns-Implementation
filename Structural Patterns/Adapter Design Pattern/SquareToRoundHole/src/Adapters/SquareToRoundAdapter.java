package Adapters;

import Round.RoundPeg;
import Square.SquarePeg;

public class SquareToRoundAdapter extends RoundPeg{

    private SquarePeg squarePeg;

    public SquareToRoundAdapter(SquarePeg squarePeg) {
        this.squarePeg = squarePeg;
    }

    @Override
    public double getRadius()
    {
        return (Math.sqrt(Math.pow((squarePeg.getWidth() / 2), 2) * 2));
    }
}