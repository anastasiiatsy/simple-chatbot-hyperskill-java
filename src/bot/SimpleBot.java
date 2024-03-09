package bot;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class SimpleBot {
    private final String name;
    private final int yearOfCreation;
    private Scanner scanner;
    private SimpleBot() {
        this.name = "Aid";
        this.yearOfCreation = 2024;
        this.scanner = new Scanner(System.in);
    }

   public static SimpleBot instantiateChatBot() {
        return new SimpleBot();
   }
    public String getName() {
        return name;
    }
    public int getYearOfCreation() {
        return yearOfCreation;
    }

    public void greeting() throws InterruptedException {
        System.out.println("Hello! My name is " + this.name + ".");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("I was created in " + this.yearOfCreation + ".");
        TimeUnit.SECONDS.sleep(1);
    }

    public void confirmUsersName() throws InterruptedException {
        System.out.println("Please, remind me your name.");
        System.out.print("> ");
        String name = this.scanner.nextLine();
        TimeUnit.SECONDS.sleep(1);
        System.out.println("What a great name you have, " + name + "!");
        TimeUnit.SECONDS.sleep(1);
    }

    public void canCount() throws InterruptedException {
        System.out.print("Now I will prove to you that I can count to any number you want. \n" +
                "Please enter a number >  ");
        int n = this.scanner.nextInt();
        for (int i = 0; i <= n; i++) {
            System.out.println(i + "!");
            TimeUnit.SECONDS.sleep(1);
        }

        TimeUnit.SECONDS.sleep(1);
    }

    public void guessUsersAge() throws InterruptedException {
        System.out.println("Let me guess your age.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Enter -1 to exit.");
        TimeUnit.SECONDS.sleep(1);
        System.out.print("> ");
        
        List<Integer> userInput = new ArrayList<>();
        int age = 0;
        int index = 0;
        while (true) {
            int input = this.scanner.nextInt();
            System.out.print("> ");
            if (input == -1) {
                break;
            }
            userInput.add(input);
        }
        age = (userInput.get(index++) * 70
                + userInput.get(index++) * 21
                + userInput.get(index++) * 15) % 105;

        System.out.println("Your age is " + age +
                "; that's a good time to start programming!");
        TimeUnit.SECONDS.sleep(2);
    }

    public void testProgrammingKonowledge() throws InterruptedException {
        System.out.println("Let's test your programming knowledge.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Why do we use methods?");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("1. To repeat a statement multiple times.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("2. To decompose a program into several small subroutines.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("3. To determine the execution time of a program.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("4. To interrupt the execution of a program.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Please only enter the number.");

        while (true) {
            System.out.print("> ");
            int usersAnswer = scanner.nextInt();

            if (usersAnswer != 4) {
                System.out.println("Please, try again.");

            } else {
                System.out.println("Congratulations, have a nice day!");
                break;
            }
        }
    }

    public void closeTheProgram() {
        scanner.close();
    }

    @Override
    public String toString() {
        return "SimpleBot{" +
                "name='" + name + '\'' +
                ", yearOfCreation=" + yearOfCreation +
                '}';
    }
}
