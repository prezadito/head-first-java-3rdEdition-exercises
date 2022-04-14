package sharpenpencil;

import java.util.Objects;

public class Television {

    // States
    int volume;
    int channelNum;
    int brightness;
    boolean power;

    // Behavior
    public int getVolume() {
        return volume;
    }

    public void setVolume(String upOrDown) {
        if (Objects.equals(upOrDown, "up") && volume != 100) {
            volume++;
            System.out.println(getVolume());
        } else if (Objects.equals(upOrDown, "down") && volume != 0) {
            volume--;
            System.out.println(getVolume());
        } else if (Objects.equals(upOrDown, "mute")) {
            volume = 0;
        }
    }

    public int getChannelNum() {
        return channelNum;
    }

    public void changeChannel(String upOrDown) {
        if (Objects.equals(upOrDown, "up")) {
            channelNum++;
            System.out.println(getChannelNum());
        } else if (Objects.equals(upOrDown, "down")) {
            channelNum--;
            System.out.println(getChannelNum());
        }
    }

    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(String upOrDown) {
        if (Objects.equals(upOrDown, "up")) {
            brightness++;
            System.out.println(getBrightness());
        } else if (Objects.equals(upOrDown, "down")) {
            brightness--;
            System.out.println(getBrightness());
        }
    }

    public boolean pressPower() {
        if (power) {
            return power = false;
        } else {
            return power = true;
        }
    }


}
