package net.plyse.tftscraper.ability;

import lombok.AllArgsConstructor;
import net.plyse.tftscraper.champion.Champion;

/**
 * @author Raphael Dichler on 28.12.2022.
 */
@AllArgsConstructor
public abstract class AbilityLevelBonus {

    protected Champion champion;

    /**
     *  Updates the champions states based on the current level of the champion
     */
    public abstract void update();

}
