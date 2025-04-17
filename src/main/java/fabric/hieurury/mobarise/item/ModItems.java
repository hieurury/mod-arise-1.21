package fabric.hieurury.mobarise.item;

import fabric.hieurury.mobarise.MobArise;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


//tạo item cho mod
public class ModItems {
    //đăng kí item
    public static final Item BIONIC_GEL = registerItem("bionic_gel", new Item(new Item.Settings()));


    //đăng kí item mới
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(MobArise.MOD_ID, name), item);
    }

    //đăng kí nhóm lưu trữ cho item
    public static void registerModItems() {
        MobArise.LOGGER.info("Registering Mod Items for " + MobArise.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(BIONIC_GEL);
        });
    }
}
