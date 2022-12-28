package net.plyse.tftscraper.champion;

import lombok.AllArgsConstructor;

/**
 * @author Raphael Dichler on 28.12.2022.
 */
@AllArgsConstructor
public class Stats {

    private int[] healthPerLevel;
    private int mana;
    private int startingMana;
    private int armor;
    private int mr;
    private int[] dpsPerLevel;
    private int[] damagePerLevel;
    private int attackSpeed;
    private int criticalAttackRate;
    private int range;

}
