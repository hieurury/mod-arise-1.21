package fabric.hieurury.mobarise.block;

import fabric.hieurury.mobarise.MobArise;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

//tạo block cho mod
public class ModBlocks {
    //tạo block
    public static final Block BIONIC_GEL_BLOCK = registerBlock("bionic_gel_block",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.GRASS)));


    //đăng kí khối thực thể
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(MobArise.MOD_ID, name), block);
    }
    //đăng kí khối dạng item
    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(MobArise.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    //đăng kí nhóm lưu trữ kối
    public static void registerModBlocks() {
        MobArise.LOGGER.info("Registering Mod Blocks for " + MobArise.MOD_ID);
        //dang ki block
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(BIONIC_GEL_BLOCK);
        });
    }
}
