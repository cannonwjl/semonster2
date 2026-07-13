package org.example;

import java.util.Random;

public class App {
  private static final Random RANDOM = new Random();
  private static final int MONSTER_TYPE_COUNT = 5;
  private static final int MONSTER_COUNT = 5;

  public String getGreeting() {
    return "Hello SEMonster";
  }

  public static void main(String[] args) {
    System.out.println(new App().getGreeting());

    for (int i = 0; i < MONSTER_COUNT; i++) {
      int nameNumber = RANDOM.nextInt(MONSTER_TYPE_COUNT);
      int rareNumber = RANDOM.nextInt(MONSTER_TYPE_COUNT);

      Monster monster = new Monster(nameNumber, rareNumber);
      System.out.println(monster);
    }
  }
}
