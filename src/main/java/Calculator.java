public class Calculator {
    private int integer1;
    private int integer2;

    public Calculator(int integer1, int integer2){
        this.integer1 = integer1;
        this.integer2 = integer2;
    }


    public int getInteger1() {
        return integer1;
    }

    public int getInteger2() {
        return integer2;
    }

    public int add(int integer1, int integer2) {
        return integer1 + integer2;
    }

    public int subtract(int integer1, int integer2) {
        return integer1 - integer2;
    }

    public int multiply(int integer1, int integer2) {
        return integer1 * integer2;
    }

    public float divide(float integer1, float integer2) {
        return integer1 / integer2;
    }
}

