package org.example;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.LinkedList;

public class PlayerTest {

  @Test
  public void testPlayerHpAndToString() {
    // 1. 準備: drawMonsters() で必要な10個の整数リストを用意
    LinkedList<Integer> dummyList = new LinkedList<>();
    for (int i = 0; i < 10; i++) {
      dummyList.add(0); // ダミーデータ (すべて0)
    }

    // 2. 実行: Playerオブジェクトを作成してモンスターをドロー
    Player player = new Player(dummyList, "testUser");
    player.drawMonsters();

    // 3. 検証: toString() の出力結果を取得
    String result = player.toString();

    // HP初期値(100)とデッキ名(testUser)が文字列の先頭に正しく表示されているか検証
    assertTrue("HPとDeck名が正しいフォーマットで表示されること",
        result.startsWith("HP: 100\nDeck:testUser\n"));
  }
}
