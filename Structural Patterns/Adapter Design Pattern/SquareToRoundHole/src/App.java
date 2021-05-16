import Adapters.SquareToRoundAdapter;
import Round.RoundHole;
import Round.RoundPeg;
import Square.SquarePeg;

public class App {
    public static void main(String[] args) throws Exception {
        RoundHole rh1 = new RoundHole(5);
        RoundPeg rp1 = new RoundPeg(5);

        if(rh1.fits(rp1))
        {
            System.out.println("Round hole 1 fits round peg 1" );

        }

        SquarePeg sq1 = new SquarePeg(5);
        SquarePeg sq2 = new SquarePeg(2);

        SquareToRoundAdapter squareToRoundAdapter1 = new SquareToRoundAdapter(sq1);
        SquareToRoundAdapter squareToRoundAdapter2 = new SquareToRoundAdapter(sq2);

        if(rh1.fits(squareToRoundAdapter1))
        {
            System.out.println("Round hole 1 fits square peg 1" );
        }

        if(rh1.fits(squareToRoundAdapter2))
        {
            System.out.println("Round hole 1 fits square peg 2" );
        }
    }
}
