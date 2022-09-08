public class Racecar {

    int wheels;
    String color;


    @Override
    public String toString() {
        return "Racecar{" +
                "wheels=" + wheels +
                ", color='" + color + '\'' +
                '}';
    }

    public int calculateMPG(int miles, int gallons){

        return miles/gallons;
    }

}
