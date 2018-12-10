public class Runner {

    public static void main(String[] args) {
        Calculator calculator = new Calculator(2, 4);
        System.out.println (calculator.getInteger1());
        System.out.println (calculator.getInteger2());
        System.out.println (calculator.add(2, 4));
        System.out.println (calculator.subtract(2, 4));
        System.out.println (calculator.multiply(2, 4));
        System.out.println (calculator.divide(2, 4));


        WaterBottle waterBottle = new WaterBottle(100);
        System.out.println (waterBottle.getVolume());
        System.out.println (waterBottle.drink(100));
        System.out.println (waterBottle.empty(100));
        System.out.println (waterBottle.fill(0));

    }

}
