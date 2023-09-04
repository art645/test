import java.util.function.DoubleBinaryOperator;

public enum Operation  {
    PLUS("+", (x, у) -> x + у) ,
    MINUS("-", (x, у) -> x - у) ,
    TIMES("*", (х, у) -> х * у) ,
    DIVIDE("/", (х, у) -> х / у) ;
    private final String symbol;
    private final DoubleBinaryOperator op;
    Operation(String symbol, DoubleBinaryOperator op) {
        this.symbol = symbol;
        this.op = op;
    }
    @Override public String toString() {
        return symbol;
    }
    public double apply(double x, double y)
    {
        return op.applyAsDouble(x, y) ;
    }
}
