package codemagnets;

//Desired output:
//bang bang ba-bang
//ding ding da-ding

public class DrumKitTestDrive {
    public static void main(String[] args) {

        class DrumKit {
            boolean topHat = true;
            boolean snare = true;
            void playSnare() {
                System.out.println("bang bang ba-bang");
            }
            void playTopHat() {
                System.out.println("ding ding da-ding");
            }
        }

        DrumKit d = new DrumKit();
        d.playSnare();
        d.snare = false;
        d.playTopHat();

        if (d.snare == true) {
            d.playSnare();
        }

    }
}
