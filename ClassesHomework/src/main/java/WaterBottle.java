public class WaterBottle {

    private int volume;
    private int drink;

    public WaterBottle(int volume, int drink) {
        this.volume = volume;
        this.drink = drink;
    }

   public int getVolume(){
    return volume;
   }

   public int takeDrink(int volume, int drink) {
        return volume - drink;
   }

   public int emptyWaterBottle(int volume) {
        return volume;
   }

   public int fillWaterBottle(int volume) {
        return volume;
   }
}