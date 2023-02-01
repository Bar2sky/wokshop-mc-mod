package com.cmoiwesh.arrowmod.item;

import com.cmoiwesh.arrowmod.arrowmod;

public class wokshopitems {
        public static void setItemName (Item item, String name) {
            item.setRegistryName (arrowmod.MODID, name).setUnlocalizedName(arrowmod.MODID
                    + "." + name);
            ITEMS.add(item);
        }

        public static void setItemBlockName(Item item, Block block) {
            item.setRegistryName(block.getRegistryName());
            ITEMS.Add(item);
        }
        @SideOnly(Side,CLIENT)
    @SubscribeEvent
    protected static void registerItemModels(ModelRegistryEvent e) {
            ITEMS.forEach(item -> registerModel(item, 0));
        }

        @SideOnly(Side,CLIENT)
    protected static void registerModel(Item item, int metadata) {
            ModelLoader.setCustomModelResourceLocation(item, metadata, new
                    ModelResourceLocation(item.getRegistryName(), "inventory"));
        }
}
