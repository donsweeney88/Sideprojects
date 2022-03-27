package Simulacrum;


import java.util.Scanner;

public class Simulacrum{

        private Setting setting = new Setting();
        private NPC npc = new NPC();
        private Menu menu;


        private static final String MAIN_MENU_OPTION_SETTING = "Location/Mood";
        private static final String MAIN_MENU_OPTION_NPC = "NPCs";
        private static final String MAIN_MENU_OPTION_EXIT = "Exit";
        private static final String[] MAIN_MENU_OPTIONS = {MAIN_MENU_OPTION_SETTING,
                MAIN_MENU_OPTION_NPC, MAIN_MENU_OPTION_EXIT};

        private static final String SETTING_OPTION_SIMPLE = "Simple (Weather/Human Activity)";
        private static final String SETTING_OPTION_NORMAL = "Normal (Weather/Human Activity/Rumors)";
        private static final String SETTING_OPTION_COMPLEX = "Complex (Used to generate towns for planning sessions)";
        private static final String SETTING_OPTION_EXIT = "Exit to Main Menu";
        private static final String[] SETTING_OPTIONS = {SETTING_OPTION_SIMPLE,
                SETTING_OPTION_NORMAL, SETTING_OPTION_COMPLEX, SETTING_OPTION_EXIT};


        private boolean isRunning = true;
        private boolean menuFinish;

        public Simulacrum(Menu menu) {
            this.menu = menu;
        }


        public void run() {
            System.out.println(createTitle());
            while (isRunning == true) {
                String choice = (String) menu.getChoiceFromOptions(MAIN_MENU_OPTIONS);

                if (choice.equals(MAIN_MENU_OPTION_SETTING)) {
                    menuFinish = true;
                    while (menuFinish) {
                        String secondChoice = (String) menu.getChoiceFromOptions(SETTING_OPTIONS);

                        if (secondChoice.equals(SETTING_OPTION_SIMPLE)) {
                            System.out.println();
                            System.out.println();
                            System.out.println(setting.createSimpleSetting());

                        } else if (secondChoice.equals(SETTING_OPTION_NORMAL)) {


                        } else if (secondChoice.equals(SETTING_OPTION_COMPLEX)) {

                        } else if (secondChoice.equals(SETTING_OPTION_EXIT)) {
                            menuFinish = false;
                        }
                    }

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
            Simulacrum cli = new Simulacrum(menu);
            cli.run();
        }

        public String createTitle() {
            String title = "\n" +
                    "  _________.__              .__                                     \n" +
                    " /   _____/|__| _____  __ __|  | _____    ___________ __ __  _____  \n" +
                    " \\_____  \\ |  |/     \\|  |  \\  | \\__  \\ _/ ___\\_  __ \\  |  \\/     \\ \n" +
                    " /        \\|  |  Y Y  \\  |  /  |__/ __ \\\\  \\___|  | \\/  |  /  Y Y  \\\n" +
                    "/_______  /|__|__|_|  /____/|____(____  /\\___  >__|  |____/|__|_|  /\n" +
                    "        \\/          \\/                \\/     \\/                  \\/ ";
        return title;
        }
    }
