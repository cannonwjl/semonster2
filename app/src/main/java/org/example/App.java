package org.example;

import java.util.LinkedList;
import java.util.Random;

public class App {
  private static final Random RANDOM = new Random();
  private static final int MAX_RANDOM_NUMBER = 4;

  public String getGreeting() {
    return "Hello SEMonster";
  }

  public static void main(String[] args) {
    System.out.println(new App().getGreeting());

    Player player = new Player(createRandomList(10), "user");
    player.drawMonsters();

    System.out.print(player);
  }

  public static LinkedList<Integer> createRandomList(int count) {
    LinkedList<Integer> randomNumberList = new LinkedList<>();

    for (int i = 0; i < count; i++) {
      randomNumberList.add(RANDOM.nextInt(MAX_RANDOM_NUMBER + 1));
    }

    return randomNumberList;
  }
}
