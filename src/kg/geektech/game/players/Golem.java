package kg.geektech.game.players;

public class Golem extends Hero{

    public Golem(int health, int damage, String name) {
        super(damage, health, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int[] heroesHealth = new int[0];
        for (int i = 0; i < heroesHealth.length; i++) {
            if (heroesHealth[4] > 0 && heroesHealth[i] > 0 && heroesHealth[7]!= heroesHealth[i]){
                int bossDamage = 0;
                heroesHealth[i] += bossDamage/5;
                heroesHealth[4] -= bossDamage/5;
            }

        }

    }

    }



