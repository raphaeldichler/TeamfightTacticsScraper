package net.plyse.tftscraper.ability;

import lombok.AllArgsConstructor;

import java.util.List;

/**
 * @author Raphael Dichler on 28.12.2022.
 */
@AllArgsConstructor
public class Ability {

    private final String name;
    private final AbilityCost abilityCost;
    private final AbilityBonus abilityBonus;
    private final List<AbilityLevelBonus> abilityLevelBonuses;
}
