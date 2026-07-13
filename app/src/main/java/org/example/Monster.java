package org.example;

public class Monster {
    private static final String[] MONSTERS = {
        "スライム",
        "サハギン",
        "ドラゴン",
        "デュラハン",
        "シーサーペント"
    };

    private static final String[] EVOLVED_MONSTERS = {
        "キングスライム",
        "サハギンロード",
        "エンシェントドラゴン",
        "デュラハンロード",
        "リヴァイアサン"
    };

    private final String name;
    private final int rare;

    Monster(int nameNumber, int rareNumber) {
        this.rare = rareNumber;

        if (rareNumber >= 3) {
            this.name = EVOLVED_MONSTERS[nameNumber];
        } else {
            this.name = MONSTERS[nameNumber];
        }
    }

    @Override
    public String toString() {
        return name + ":レア度[" + rare + "]\n";
    }
}
