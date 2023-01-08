package OOPPrinciples.oopprinciples.abstraction;
public class Area extends Abstraction{

    @Override
    public double getAreaRectangle(int length ,int width) {
        return length * width;
    }

    @Override
    public double getAreaSquare(int edge) {

        return edge * edge;
    }
    
}
