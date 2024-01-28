package codeexamples;

public class ElectricGuitar {

    private String brand;
    private int numOfPickups = 3;
    private boolean rockStarUsesIt;
    private String rockstarUsage;

    String getBrand() {
        return brand;
    }

    void setBrand(String aBrand) {
        brand = aBrand;
    }

    int getNumOfPickups() {
        return numOfPickups;
    }

    void setNumOfPickups(int num) {
        if (num > 0 && num < 4) { // protect electric guitar from unacceptable pickup number changes
            numOfPickups = num;
        }
    }

    boolean getRockStarUsesIt() {
        return rockStarUsesIt;
    }

    void setRockStarUsesIt(boolean yesOrNo) {
        rockStarUsesIt = yesOrNo;
        setRockstarUsage(rockStarUsesIt);
    }

    String getRockstarUsage() {
        return rockstarUsage;
    }

    void setRockstarUsage(boolean trueOrFalse) {
        if (trueOrFalse) {
            rockstarUsage = "all the rockstars";
        } else {
            rockstarUsage = "no rockstars";
        }
    }


    public static class ElectricGuitarTest{
        public static void main(String[] args) {
            ElectricGuitar e = new ElectricGuitar();
            e.setBrand("Zepplin");
            e.setNumOfPickups(2);
            e.setRockStarUsesIt(false);
            ElectricGuitar f = new ElectricGuitar();
            f.setBrand("Fender");
            f.setNumOfPickups(3);
            f.setRockStarUsesIt(true);

            System.out.println("The electric guitar I'm thinking of getting is a " + e.getBrand() + "; it has " + e.getNumOfPickups() + " pickups, and " + e.getRockstarUsage() + " use it.");
            System.out.println("The electric guitar I'm thinking of getting is a " + f.getBrand() + "; it has " + f.getNumOfPickups() + " pickups, and " + f.getRockstarUsage() + " use it.");

            ElectricGuitar[] g = new ElectricGuitar[5];
            g[0] = new ElectricGuitar();
            g[0].setBrand("Walmart Brand");

        }
    }



}
