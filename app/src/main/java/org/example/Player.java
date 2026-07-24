package org.example;

import java.util.ArrayList;
import java.util.LinkedList;

public class Player {
  private final String name;
  private final ArrayList<Monster> monsterDeck = new ArrayList<>();
  private final LinkedList<Integer> randomNumberList;
  private int hp;

  Player(LinkedList<Integer> randomNumberList, String playerName) {
    this.randomNumberList = randomNumberList;
    this.name = playerName;
    this.hp = 100;
  }

  public void drawMonsters() {
    for (int i = 0; i < 5; i++) {
      int nameNumber = randomNumberList.pop();
      int rareNumber = randomNumberList.pop();

      monsterDeck.add(new Monster(nameNumber, rareNumber));
    }
  }

  @Override
  public String toString() {
    StringBuilder result = new StringBuilder();

    result.append("HP: ").append(hp).append("\n");
    result.append("Deck:").append(name).append("\n");

    for (Monster monster : monsterDeck) {
      result.append(monster);
    }

    return result.toString();
  }
}
