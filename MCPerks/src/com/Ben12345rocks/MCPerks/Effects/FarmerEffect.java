/*
 *
 */
package com.Ben12345rocks.MCPerks.Effects;

import org.bukkit.Material;
import org.bukkit.block.Block;

import com.Ben12345rocks.MCPerks.Perk.Effect;
import com.Ben12345rocks.MCPerks.Perk.Perk;

// TODO: Auto-generated Javadoc
/**
 * The Class FarmerEffect.
 */
public class FarmerEffect {

	/** The percent increase. */
	private int percentIncrease;

	/**
	 * Instantiates a new farmer effect.
	 *
	 * @param perk the perk
	 */
	public FarmerEffect(Perk perk) {
		percentIncrease = (int) perk.getIncreasePercent(Effect.Farmer);
	}

	/**
	 * Increase drops.
	 *
	 * @param ammount the ammount
	 * @return the int
	 */
	public int increaseDrops(int ammount) {
		return ammount * percentIncrease / 100;
	}

	/**
	 * Checks if is farmable.
	 *
	 * @param b the b
	 * @return true, if is farmable
	 */
	public boolean isFarmable(Block b) {
		return b.getType().equals(Material.POTATO) || b.getType().equals(Material.CARROT)
				|| b.getType().equals(Material.WHEAT) || b.getType().equals(Material.WHEAT_SEEDS);
	}
}
