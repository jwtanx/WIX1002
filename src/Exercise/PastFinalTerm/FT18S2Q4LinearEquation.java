/*
 * 4a. Define a class named LinearEquation for a 2 x 2 system of linear equations:

ax + by = e
cx + dy = f

where   x = (ed - bf) / (ad - bc);
        y = (af - ec) / (ad - bc);

The class contains: 
- private data fields a, b, c, d, e, and f. 
- a constructor with the arguments for a, b, c, d, e, and f. 
- a method named toString() that returns the 2x2 linear equation. 
- a method named isSolvable() that returns true if ad - bc is not 0.
- methods named computeX() and computeY() that returns the values for x and y as the solution for the equation.
 */
package Exercise.PastFinalTerm;

public class FT18S2Q4LinearEquation {
    
    private int a, b, c, d, e, f;

    public FT18S2Q4LinearEquation(int a, int b, int c, int d, int e, int f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public String toString() {
        String display = String.format("%dx + %dy = %d\n%dx + %dy = %d", a, b, c, d, e, f);
        return display;
    }
    
    public boolean isSolvable(){
        return ((a * d)-(b * c)) != 0;
    }

    public int computeX(){
        int x = (e*d - b*f) / (a*d - b*c);;
        return x;
    }
    
    public int computeY(){
        int y = (a*f - e*c) / (a*d - b*c);
        return y;
    }
    
}
