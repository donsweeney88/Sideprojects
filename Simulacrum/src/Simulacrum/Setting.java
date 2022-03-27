package Simulacrum;

import java.util.Random;

public class Setting {

    Random random = new Random();

    public String createSimpleSetting() {
        String setting = "";
        String temperatureString = "";
        String precipitationString = "";
        String activityString = "";
        String moodString = "";
        int tempGenerator = random.nextInt(temperature.length +3);
        int precipitationGenerator = random.nextInt(10);
        int activityGenerator = random.nextInt(activity.length+2);
        int moodGenerator = random.nextInt(mood.length - 1);

        // temperature generation
        if (tempGenerator > temperature.length - 1) {
            tempGenerator = 3;
        }
        temperatureString = "The temperature is " + temperature[tempGenerator] + ", compared to the normal for the season. \n";

        //precipitation generation
        if (tempGenerator == 0 || tempGenerator == 6) {

            precipitationString = "";
        }

        //activity generation
        if (activityGenerator > activity.length - 1) {
            activityGenerator = 2;
        }if (activityGenerator == 0) {
                activityString = "There is not a single soul about. \n";
            } else {
            activityString = "There is a " + activity[activityGenerator] + " amount of humanoid activity about. \n";
        }

        if (activityGenerator == 0) {
            int subMoodGenerator = random.nextInt(noActivity.length - 1);
            moodString = "The day/area has a(n) " + noActivity[subMoodGenerator] + " feel. \n";
        } else {
            moodString = "Generally the people to be in a " + mood[moodGenerator] + " mood. \n";
        }

        setting = setting.concat(temperatureString + precipitationString + activityString + moodString);
        return setting;
    }


// Arrays

    private String[] temperature = {"extremely hot", "moderately hot", "warm", "moderate", "cool", "moderately cold",
            "extremely cold"};
    private String[] temperature2 = {"dangerous", "foggy", "very windy"};

    private String[] precipitation = {"none", "intermittent", "light", "moderate", "heavy"};
    private String[] precipitation2 = {"draught", "unnavigable snowfall"};

    private String[] activity = {"none", "scarce", "light", "moderate", "busy", "bustling"};
    private String[] noActivity = {"erie", "quiet", "tranquil", "uneasy", "gentle"};

    private String[] mood = {"nervous", "busy", "down trodden", "glum", "excited", "lost", "despair", "desperate", "celebratory", "normal", "irritated"};

    private String[] rumors = {"have been going missing", "a noble searches for the return of a stolen heirloom",
            "a local festival is set to start soon", "a local fairy tale used to scare children has been coming true",};

    private String[] missables = {"jewelry", "children", "the elderly", "crops", "servants", "corpses", "money",};

}