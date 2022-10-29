package com.itayfeder.colors.init;

import com.itayfeder.colors.ColorsMod;
import com.itayfeder.colors.mixin.DyeColorMixin;
import com.itayfeder.colors.util.ExtraDyeColors;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ColorsMod.MODID);

    public static final RegistryObject<Item> CORAL_WOOL = ITEMS.register("coral_wool", () -> new BlockItem(BlockInit.CORAL_WOOL.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> CORAL_TERRACOTTA = ITEMS.register("coral_terracotta", () -> new BlockItem(BlockInit.CORAL_TERRACOTTA.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> CORAL_STAINED_GLASS = ITEMS.register("coral_stained_glass", () -> new BlockItem(BlockInit.CORAL_STAINED_GLASS.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> CORAL_CONCRETE = ITEMS.register("coral_concrete", () -> new BlockItem(BlockInit.CORAL_CONCRETE.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> CORAL_CONCRETE_POWDER = ITEMS.register("coral_concrete_powder", () -> new BlockItem(BlockInit.CORAL_CONCRETE_POWDER.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> CORAL_CARPET = ITEMS.register("coral_carpet", () -> new BlockItem(BlockInit.CORAL_CARPET.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> CORAL_STAINED_GLASS_PANE = ITEMS.register("coral_stained_glass_pane", () -> new BlockItem(BlockInit.CORAL_STAINED_GLASS_PANE.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> CORAL_SHULKER_BOX = ITEMS.register("coral_shulker_box", () -> new BlockItem(BlockInit.CORAL_SHULKER_BOX.get(), (new Item.Properties()).stacksTo(1).tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> CORAL_BED = ITEMS.register("coral_bed", () -> new BedItem(BlockInit.CORAL_BED.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> CORAL_BANNER = ITEMS.register("coral_banner", () -> new BannerItem(BlockInit.CORAL_BANNER.get(), BlockInit.CORAL_WALL_BANNER.get(), (new Item.Properties()).stacksTo(16).tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> CORAL_CANDLE = ITEMS.register("coral_candle", () -> new BlockItem(BlockInit.CORAL_CANDLE.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_DECORATIONS)));

    public static final RegistryObject<Item> CORAL_DYE = ITEMS.register("coral_dye", () -> new DyeItem(ExtraDyeColors.CORAL, (new Item.Properties()).tab(CreativeModeTab.TAB_MATERIALS)));


}
