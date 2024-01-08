package net.ludwig.tutorialmod;

import net.fabricmc.api.ModInitializer;

import net.ludwig.tutorialmod.block.ModBlocks;
import net.ludwig.tutorialmod.item.ModItemGroups;
import net.ludwig.tutorialmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		LOGGER.info("Hello Fabric world!");
	}
}