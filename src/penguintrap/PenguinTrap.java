package penguintrap;

import java.util.concurrent.ThreadLocalRandom;

public class PenguinTrap {

    private String[] opcje = {"NIEBIESKI", "BIAŁY", "DOWOLNY", "STRATA KOLEJKI"};

    public String getWynik() {
        return opcje[losujLiczbe()]; //opcje[1] => BIALY
    }

    private int losujLiczbe() {
        int min = 0;
        int max = 3;
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

}
