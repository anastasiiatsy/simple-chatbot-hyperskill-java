package bot;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInterface {

    public static void main(String[] args) throws InterruptedException {
        startBot();
    }
    public static void startBot() throws InterruptedException {
        SimpleBot aid = SimpleBot.instantiateChatBot();
        aid.greeting();
        aid.confirmUsersName();
        aid.guessUsersAge();
        aid.canCount();
        aid.testProgrammingKonowledge();
        aid.closeTheProgram();
    }
}
