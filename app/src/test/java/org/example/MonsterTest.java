package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MonsterTest {

  @Test
  public void rare2DoesNotEvolve() {
    Monster monster = new Monster(0, 2);

    assertEquals(
        "スライム:レア度[2]\n",
        monster.toString());
  }

  @Test
  public void rare3Evolves() {
    Monster monster = new Monster(0, 3);

    assertEquals(
        "キングスライム:レア度[3]\n",
        monster.toString());
  }
}
