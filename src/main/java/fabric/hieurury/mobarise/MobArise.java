package fabric.hieurury.mobarise;

import fabric.hieurury.mobarise.block.ModBlocks;
import fabric.hieurury.mobarise.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MobArise implements ModInitializer {
	public static final String MOD_ID = "mobarise";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		//đăng kí item với game
		ModItems.registerModItems();
		//đăng kí block với game
		ModBlocks.registerModBlocks();
	}
}