package kg.geektech.game.players;

import java.util.Random;

public class Thor extends Hero{


    public Thor(int health, int damage, String name) {
        super(health, damage, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
            Random random  = new Random();
            boolean stun = random.nextBoolean();
            int bossDamage;
            if (stun){
                bossDamage = 0;
                System.out.println("Boss oglushon");
            }else{
                bossDamage = 50;
            }
        }
    }




