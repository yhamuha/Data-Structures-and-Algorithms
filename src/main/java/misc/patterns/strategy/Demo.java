package misc.patterns.strategy;

/**
 *
 */
public class Demo {
    public static void main(String[] args) {

        double startPrice = 100;
        StrategyContext context = new StrategyContext(new FullPrice());
        double price = context.getPrice(startPrice);
        System.out.println(price);

    }
}

interface Strategy {
    double getPrice( double price);
}

class FullPrice implements Strategy {
    @Override
    public double getPrice(double price) {
        return price;
    }
}

class HalfPrice implements Strategy {
    @Override
    public double getPrice(double price) {
        return price  * 0.5;
    }
}

class StrategyContext {
    Strategy strategy;

    public StrategyContext(Strategy strategy) {
        this.strategy = strategy;
    }

    public double getPrice (double price) {
        return strategy.getPrice(price);
    }
}
