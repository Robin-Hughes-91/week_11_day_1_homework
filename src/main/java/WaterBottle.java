public class WaterBottle {
    private int volume;



    public WaterBottle(int volume){
        this.volume = volume;
    }


    public int getVolume() {
        return volume;
    }

    public int drink(int volume) {
        return volume - 10;
    }

    public int empty(int volume) {
        return volume - volume;
    }

    public int fill(int volume) {
        return volume + 100;
    }
}

