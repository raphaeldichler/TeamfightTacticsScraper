package net.plyse.tftscraper.champion;

import lombok.AllArgsConstructor;
import net.plyse.tftscraper.ability.Ability;

import java.util.List;

/**
 * @author Raphael Dichler on 28.12.2022.
 */
@AllArgsConstructor
public class Champion {

    private final String name;
    private Tier tier;
    private Stats stats;
    private Ability[] ability;
    private List<Trade> trades;
    private List<Champion> synergies;

}
