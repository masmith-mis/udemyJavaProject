package com.MattSmith;

public class EnhancedPlayer {
    private String name;
    private int health = 100;
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        if(name.length() > 0 && name.length() <= 20) {
            this.name = name;
        }

        //value of health cannot be above 100;
        if(health > 0 && health <= 100) {
            this.health = health;
        }

        this.weapon = weapon;
    }

    public void loseHealth(int damage){
        this.health -= damage;

        if(this.health <= 0){
            System.out.println("Player knocked out");
            //reduce number of remaining lives for player
        }
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }

    public String getWeapon() {
        return weapon;
    }
}
