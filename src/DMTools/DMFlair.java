package DMTools;

import com.techelevator.DMTools.Menu;

public class DMFlair {

    private Menu menu;
    private static final String MAIN_MENU_OPTION_SETTING = "Location/Mood";
    private static final String MAIN_MENU_OPTION_NPC = "NPCs";
    private static final String MAIN_MENU_OPTION_EXIT = "Exit";
    private static final String[] MAIN_MENU_OPTIONS = {MAIN_MENU_OPTION_SETTING,
            MAIN_MENU_OPTION_NPC, MAIN_MENU_OPTION_EXIT};

    private static final String SETTING_OPTION_SIMPLE = "Simple (Weather/Mood";
    private static final String SETTING_OPTION_NORMAL = "Normal (Weather/Mood/Rumors)";
    private static final String SETTING_OPTION_COMPLEX = "Complex (Used to generate towns for planning sessions)";
    private static final String SETTING_OPTION_EXIT = "Exit to Main Menu";
    private static final String[] SETTING_OPTIONS = {SETTING_OPTION_SIMPLE,
            SETTING_OPTION_NORMAL, SETTING_OPTION_COMPLEX, SETTING_OPTION_EXIT};


    private boolean isRunning = true;
    private boolean menuFinish;

    public DMFlair(Menu menu) {
        this.menu = menu;
    }


    public void run() {

        while (isRunning == true) {
            String choice = (String) menu.getChoiceFromOptions(MAIN_MENU_OPTIONS);

            if (choice.equals(MAIN_MENU_OPTION_SETTING)) {
                // Code to return setting values

            } else {
                menuFinish = true;
                while (menuFinish) {

                    if (choice.equals(MAIN_MENU_OPTION_NPC)) {

                        String secondChoice = (String) menu.getChoiceFromOptions(SETTING_OPTIONS);

                        if (secondChoice.equals(SETTING_OPTION_SIMPLE)) {


                        } else if (secondChoice.equals(SETTING_OPTION_NORMAL)) {



                        } else if (secondChoice.equals(SETTING_OPTION_COMPLEX)) {

                        } else if (secondChoice.equals(SETTING_OPTION_EXIT)) {
                            menuFinish = false;
                    }

                    } else if (choice.equals(MAIN_MENU_OPTION_EXIT)) {
                        isRunning = false;
                        break;
                    }
                }
            }
        }
        isRunning = false;
    }

    public static void main(String[] args) {
        Menu menu = new Menu(System.in, System.out);
        DMFlair cli = new DMFlair(menu);
        cli.run();
    }
}
