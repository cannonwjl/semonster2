package org.example;

public class Monster {
  private static final String[] MONSTERS = {
      "スライム",
      "サハギン",
      "ドラゴン",
      "デュラハン",
      "シーサーペント",
      "スズキ",
      "フェニックス",
      "ユニコーン"
  };

  private final String name;
  private final int rare;

  Monster(int nameNumber, int rareNumber) {
    name = MONSTERS[nameNumber];
    rare = rareNumber;
  }

  @Override
  public String toString() {
    return name + ":レア度[" + rare + "]\n";
  }
}