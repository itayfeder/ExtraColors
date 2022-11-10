package com.itayfeder.tinted.init;

import com.itayfeder.tinted.TintedMod;
import com.itayfeder.tinted.items.paintbrush.PaintbrushItem;
import com.itayfeder.tinted.items.parented.ParentedBannerItem;
import com.itayfeder.tinted.items.parented.ParentedBedItem;
import com.itayfeder.tinted.items.parented.ParentedBlockItem;
import com.itayfeder.tinted.items.parented.ParentedDyeItem;
import com.itayfeder.tinted.util.ExtraDyeColors;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TintedMod.MODID);

    public static final RegistryObject<Item> PAINTBRUSH = ITEMS.register("paintbrush", () -> new PaintbrushItem((new Item.Properties()).stacksTo(1).tab(CreativeModeTab.TAB_TOOLS)));

    public static final RegistryObject<Item> CORAL_WOOL = ITEMS.register("coral_wool", () -> new ParentedBlockItem(BlockInit.CORAL_WOOL.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_BUILDING_BLOCKS), Items.BLACK_WOOL));
    public static final RegistryObject<Item> CORAL_TERRACOTTA = ITEMS.register("coral_terracotta", () -> new ParentedBlockItem(BlockInit.CORAL_TERRACOTTA.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_BUILDING_BLOCKS), Items.BLACK_TERRACOTTA));
    public static final RegistryObject<Item> CORAL_STAINED_GLASS = ITEMS.register("coral_stained_glass", () -> new ParentedBlockItem(BlockInit.CORAL_STAINED_GLASS.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_BUILDING_BLOCKS), Items.BLACK_STAINED_GLASS));
    public static final RegistryObject<Item> CORAL_CONCRETE = ITEMS.register("coral_concrete", () -> new ParentedBlockItem(BlockInit.CORAL_CONCRETE.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_BUILDING_BLOCKS), Items.BLACK_CONCRETE));
    public static final RegistryObject<Item> CORAL_CONCRETE_POWDER = ITEMS.register("coral_concrete_powder", () -> new ParentedBlockItem(BlockInit.CORAL_CONCRETE_POWDER.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_BUILDING_BLOCKS), Items.BLACK_CONCRETE_POWDER));
    public static final RegistryObject<Item> CORAL_CARPET = ITEMS.register("coral_carpet", () -> new ParentedBlockItem(BlockInit.CORAL_CARPET.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_DECORATIONS), Items.BLACK_CARPET));
    public static final RegistryObject<Item> CORAL_STAINED_GLASS_PANE = ITEMS.register("coral_stained_glass_pane", () -> new ParentedBlockItem(BlockInit.CORAL_STAINED_GLASS_PANE.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_DECORATIONS), Items.BLACK_STAINED_GLASS_PANE));
    public static final RegistryObject<Item> CORAL_SHULKER_BOX = ITEMS.register("coral_shulker_box", () -> new ParentedBlockItem(BlockInit.CORAL_SHULKER_BOX.get(), (new Item.Properties()).stacksTo(1).tab(CreativeModeTab.TAB_DECORATIONS), Items.BLACK_SHULKER_BOX));
    public static final RegistryObject<Item> CORAL_BED = ITEMS.register("coral_bed", () -> new ParentedBedItem(BlockInit.CORAL_BED.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_DECORATIONS), Items.BLACK_BED));
    public static final RegistryObject<Item> CORAL_BANNER = ITEMS.register("coral_banner", () -> new ParentedBannerItem(BlockInit.CORAL_BANNER.get(), BlockInit.CORAL_WALL_BANNER.get(), (new Item.Properties()).stacksTo(16).tab(CreativeModeTab.TAB_DECORATIONS), Items.BLACK_BANNER));
    public static final RegistryObject<Item> CORAL_CANDLE = ITEMS.register("coral_candle", () -> new ParentedBlockItem(BlockInit.CORAL_CANDLE.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_DECORATIONS), Items.BLACK_CANDLE));
    public static final RegistryObject<Item> CORAL_DYE = ITEMS.register("coral_dye", () -> new ParentedDyeItem(ExtraDyeColors.CORAL, (new Item.Properties()).tab(CreativeModeTab.TAB_MATERIALS), Items.BLACK_DYE));

    public static final RegistryObject<Item> BEIGE_WOOL = ITEMS.register("beige_wool", () -> new ParentedBlockItem(BlockInit.BEIGE_WOOL.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_BUILDING_BLOCKS), Items.BLACK_WOOL));
    public static final RegistryObject<Item> BEIGE_TERRACOTTA = ITEMS.register("beige_terracotta", () -> new ParentedBlockItem(BlockInit.BEIGE_TERRACOTTA.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_BUILDING_BLOCKS), Items.BLACK_TERRACOTTA));
    public static final RegistryObject<Item> BEIGE_STAINED_GLASS = ITEMS.register("beige_stained_glass", () -> new ParentedBlockItem(BlockInit.BEIGE_STAINED_GLASS.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_BUILDING_BLOCKS), Items.BLACK_STAINED_GLASS));
    public static final RegistryObject<Item> BEIGE_CONCRETE = ITEMS.register("beige_concrete", () -> new ParentedBlockItem(BlockInit.BEIGE_CONCRETE.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_BUILDING_BLOCKS), Items.BLACK_CONCRETE));
    public static final RegistryObject<Item> BEIGE_CONCRETE_POWDER = ITEMS.register("beige_concrete_powder", () -> new ParentedBlockItem(BlockInit.BEIGE_CONCRETE_POWDER.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_BUILDING_BLOCKS), Items.BLACK_CONCRETE_POWDER));
    public static final RegistryObject<Item> BEIGE_CARPET = ITEMS.register("beige_carpet", () -> new ParentedBlockItem(BlockInit.BEIGE_CARPET.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_DECORATIONS), Items.BLACK_CARPET));
    public static final RegistryObject<Item> BEIGE_STAINED_GLASS_PANE = ITEMS.register("beige_stained_glass_pane", () -> new ParentedBlockItem(BlockInit.BEIGE_STAINED_GLASS_PANE.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_DECORATIONS), Items.BLACK_STAINED_GLASS_PANE));
    public static final RegistryObject<Item> BEIGE_SHULKER_BOX = ITEMS.register("beige_shulker_box", () -> new ParentedBlockItem(BlockInit.BEIGE_SHULKER_BOX.get(), (new Item.Properties()).stacksTo(1).tab(CreativeModeTab.TAB_DECORATIONS), Items.BLACK_SHULKER_BOX));
    public static final RegistryObject<Item> BEIGE_BED = ITEMS.register("beige_bed", () -> new ParentedBedItem(BlockInit.BEIGE_BED.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_DECORATIONS), Items.BLACK_BED));
    public static final RegistryObject<Item> BEIGE_BANNER = ITEMS.register("beige_banner", () -> new ParentedBannerItem(BlockInit.BEIGE_BANNER.get(), BlockInit.BEIGE_WALL_BANNER.get(), (new Item.Properties()).stacksTo(16).tab(CreativeModeTab.TAB_DECORATIONS), Items.BLACK_BANNER));
    public static final RegistryObject<Item> BEIGE_CANDLE = ITEMS.register("beige_candle", () -> new ParentedBlockItem(BlockInit.BEIGE_CANDLE.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_DECORATIONS), Items.BLACK_CANDLE));
    public static final RegistryObject<Item> BEIGE_DYE = ITEMS.register("beige_dye", () -> new ParentedDyeItem(ExtraDyeColors.BEIGE, (new Item.Properties()).tab(CreativeModeTab.TAB_MATERIALS), Items.BLACK_DYE));

    public static final RegistryObject<Item> OLIVE_WOOL = ITEMS.register("olive_wool", () -> new ParentedBlockItem(BlockInit.OLIVE_WOOL.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_BUILDING_BLOCKS), Items.BLACK_WOOL));
    public static final RegistryObject<Item> OLIVE_TERRACOTTA = ITEMS.register("olive_terracotta", () -> new ParentedBlockItem(BlockInit.OLIVE_TERRACOTTA.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_BUILDING_BLOCKS), Items.BLACK_TERRACOTTA));
    public static final RegistryObject<Item> OLIVE_STAINED_GLASS = ITEMS.register("olive_stained_glass", () -> new ParentedBlockItem(BlockInit.OLIVE_STAINED_GLASS.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_BUILDING_BLOCKS), Items.BLACK_STAINED_GLASS));
    public static final RegistryObject<Item> OLIVE_CONCRETE = ITEMS.register("olive_concrete", () -> new ParentedBlockItem(BlockInit.OLIVE_CONCRETE.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_BUILDING_BLOCKS), Items.BLACK_CONCRETE));
    public static final RegistryObject<Item> OLIVE_CONCRETE_POWDER = ITEMS.register("olive_concrete_powder", () -> new ParentedBlockItem(BlockInit.OLIVE_CONCRETE_POWDER.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_BUILDING_BLOCKS), Items.BLACK_CONCRETE_POWDER));
    public static final RegistryObject<Item> OLIVE_CARPET = ITEMS.register("olive_carpet", () -> new ParentedBlockItem(BlockInit.OLIVE_CARPET.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_DECORATIONS), Items.BLACK_CARPET));
    public static final RegistryObject<Item> OLIVE_STAINED_GLASS_PANE = ITEMS.register("olive_stained_glass_pane", () -> new ParentedBlockItem(BlockInit.OLIVE_STAINED_GLASS_PANE.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_DECORATIONS), Items.BLACK_STAINED_GLASS_PANE));
    public static final RegistryObject<Item> OLIVE_SHULKER_BOX = ITEMS.register("olive_shulker_box", () -> new ParentedBlockItem(BlockInit.OLIVE_SHULKER_BOX.get(), (new Item.Properties()).stacksTo(1).tab(CreativeModeTab.TAB_DECORATIONS), Items.BLACK_SHULKER_BOX));
    public static final RegistryObject<Item> OLIVE_BED = ITEMS.register("olive_bed", () -> new ParentedBedItem(BlockInit.OLIVE_BED.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_DECORATIONS), Items.BLACK_BED));
    public static final RegistryObject<Item> OLIVE_BANNER = ITEMS.register("olive_banner", () -> new ParentedBannerItem(BlockInit.OLIVE_BANNER.get(), BlockInit.OLIVE_WALL_BANNER.get(), (new Item.Properties()).stacksTo(16).tab(CreativeModeTab.TAB_DECORATIONS), Items.BLACK_BANNER));
    public static final RegistryObject<Item> OLIVE_CANDLE = ITEMS.register("olive_candle", () -> new ParentedBlockItem(BlockInit.OLIVE_CANDLE.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_DECORATIONS), Items.BLACK_CANDLE));
    public static final RegistryObject<Item> OLIVE_DYE = ITEMS.register("olive_dye", () -> new ParentedDyeItem(ExtraDyeColors.OLIVE, (new Item.Properties()).tab(CreativeModeTab.TAB_MATERIALS), Items.BLACK_DYE));

    public static final RegistryObject<Item> TURQUOISE_WOOL = ITEMS.register("turquoise_wool", () -> new ParentedBlockItem(BlockInit.TURQUOISE_WOOL.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_BUILDING_BLOCKS), Items.BLACK_WOOL));
    public static final RegistryObject<Item> TURQUOISE_TERRACOTTA = ITEMS.register("turquoise_terracotta", () -> new ParentedBlockItem(BlockInit.TURQUOISE_TERRACOTTA.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_BUILDING_BLOCKS), Items.BLACK_TERRACOTTA));
    public static final RegistryObject<Item> TURQUOISE_STAINED_GLASS = ITEMS.register("turquoise_stained_glass", () -> new ParentedBlockItem(BlockInit.TURQUOISE_STAINED_GLASS.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_BUILDING_BLOCKS), Items.BLACK_STAINED_GLASS));
    public static final RegistryObject<Item> TURQUOISE_CONCRETE = ITEMS.register("turquoise_concrete", () -> new ParentedBlockItem(BlockInit.TURQUOISE_CONCRETE.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_BUILDING_BLOCKS), Items.BLACK_CONCRETE));
    public static final RegistryObject<Item> TURQUOISE_CONCRETE_POWDER = ITEMS.register("turquoise_concrete_powder", () -> new ParentedBlockItem(BlockInit.TURQUOISE_CONCRETE_POWDER.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_BUILDING_BLOCKS), Items.BLACK_CONCRETE_POWDER));
    public static final RegistryObject<Item> TURQUOISE_CARPET = ITEMS.register("turquoise_carpet", () -> new ParentedBlockItem(BlockInit.TURQUOISE_CARPET.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_DECORATIONS), Items.BLACK_CARPET));
    public static final RegistryObject<Item> TURQUOISE_STAINED_GLASS_PANE = ITEMS.register("turquoise_stained_glass_pane", () -> new ParentedBlockItem(BlockInit.TURQUOISE_STAINED_GLASS_PANE.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_DECORATIONS), Items.BLACK_STAINED_GLASS_PANE));
    public static final RegistryObject<Item> TURQUOISE_SHULKER_BOX = ITEMS.register("turquoise_shulker_box", () -> new ParentedBlockItem(BlockInit.TURQUOISE_SHULKER_BOX.get(), (new Item.Properties()).stacksTo(1).tab(CreativeModeTab.TAB_DECORATIONS), Items.BLACK_SHULKER_BOX));
    public static final RegistryObject<Item> TURQUOISE_BED = ITEMS.register("turquoise_bed", () -> new ParentedBedItem(BlockInit.TURQUOISE_BED.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_DECORATIONS), Items.BLACK_BED));
    public static final RegistryObject<Item> TURQUOISE_BANNER = ITEMS.register("turquoise_banner", () -> new ParentedBannerItem(BlockInit.TURQUOISE_BANNER.get(), BlockInit.TURQUOISE_WALL_BANNER.get(), (new Item.Properties()).stacksTo(16).tab(CreativeModeTab.TAB_DECORATIONS), Items.BLACK_BANNER));
    public static final RegistryObject<Item> TURQUOISE_CANDLE = ITEMS.register("turquoise_candle", () -> new ParentedBlockItem(BlockInit.TURQUOISE_CANDLE.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_DECORATIONS), Items.BLACK_CANDLE));
    public static final RegistryObject<Item> TURQUOISE_DYE = ITEMS.register("turquoise_dye", () -> new ParentedDyeItem(ExtraDyeColors.TURQUOISE, (new Item.Properties()).tab(CreativeModeTab.TAB_MATERIALS), Items.BLACK_DYE));

    public static final RegistryObject<Item> AMBER_WOOL = ITEMS.register("amber_wool", () -> new ParentedBlockItem(BlockInit.AMBER_WOOL.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_BUILDING_BLOCKS), Items.BLACK_WOOL));
    public static final RegistryObject<Item> AMBER_TERRACOTTA = ITEMS.register("amber_terracotta", () -> new ParentedBlockItem(BlockInit.AMBER_TERRACOTTA.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_BUILDING_BLOCKS), Items.BLACK_TERRACOTTA));
    public static final RegistryObject<Item> AMBER_STAINED_GLASS = ITEMS.register("amber_stained_glass", () -> new ParentedBlockItem(BlockInit.AMBER_STAINED_GLASS.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_BUILDING_BLOCKS), Items.BLACK_STAINED_GLASS));
    public static final RegistryObject<Item> AMBER_CONCRETE = ITEMS.register("amber_concrete", () -> new ParentedBlockItem(BlockInit.AMBER_CONCRETE.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_BUILDING_BLOCKS), Items.BLACK_CONCRETE));
    public static final RegistryObject<Item> AMBER_CONCRETE_POWDER = ITEMS.register("amber_concrete_powder", () -> new ParentedBlockItem(BlockInit.AMBER_CONCRETE_POWDER.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_BUILDING_BLOCKS), Items.BLACK_CONCRETE_POWDER));
    public static final RegistryObject<Item> AMBER_CARPET = ITEMS.register("amber_carpet", () -> new ParentedBlockItem(BlockInit.AMBER_CARPET.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_DECORATIONS), Items.BLACK_CARPET));
    public static final RegistryObject<Item> AMBER_STAINED_GLASS_PANE = ITEMS.register("amber_stained_glass_pane", () -> new ParentedBlockItem(BlockInit.AMBER_STAINED_GLASS_PANE.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_DECORATIONS), Items.BLACK_STAINED_GLASS_PANE));
    public static final RegistryObject<Item> AMBER_SHULKER_BOX = ITEMS.register("amber_shulker_box", () -> new ParentedBlockItem(BlockInit.AMBER_SHULKER_BOX.get(), (new Item.Properties()).stacksTo(1).tab(CreativeModeTab.TAB_DECORATIONS), Items.BLACK_SHULKER_BOX));
    public static final RegistryObject<Item> AMBER_BED = ITEMS.register("amber_bed", () -> new ParentedBedItem(BlockInit.AMBER_BED.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_DECORATIONS), Items.BLACK_BED));
    public static final RegistryObject<Item> AMBER_BANNER = ITEMS.register("amber_banner", () -> new ParentedBannerItem(BlockInit.AMBER_BANNER.get(), BlockInit.AMBER_WALL_BANNER.get(), (new Item.Properties()).stacksTo(16).tab(CreativeModeTab.TAB_DECORATIONS), Items.BLACK_BANNER));
    public static final RegistryObject<Item> AMBER_CANDLE = ITEMS.register("amber_candle", () -> new ParentedBlockItem(BlockInit.AMBER_CANDLE.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_DECORATIONS), Items.BLACK_CANDLE));
    public static final RegistryObject<Item> AMBER_DYE = ITEMS.register("amber_dye", () -> new ParentedDyeItem(ExtraDyeColors.AMBER, (new Item.Properties()).tab(CreativeModeTab.TAB_MATERIALS), Items.BLACK_DYE));

    public static final RegistryObject<Item> BUBBLEGUM_WOOL = ITEMS.register("bubblegum_wool", () -> new ParentedBlockItem(BlockInit.BUBBLEGUM_WOOL.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_BUILDING_BLOCKS), Items.BLACK_WOOL));
    public static final RegistryObject<Item> BUBBLEGUM_TERRACOTTA = ITEMS.register("bubblegum_terracotta", () -> new ParentedBlockItem(BlockInit.BUBBLEGUM_TERRACOTTA.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_BUILDING_BLOCKS), Items.BLACK_TERRACOTTA));
    public static final RegistryObject<Item> BUBBLEGUM_STAINED_GLASS = ITEMS.register("bubblegum_stained_glass", () -> new ParentedBlockItem(BlockInit.BUBBLEGUM_STAINED_GLASS.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_BUILDING_BLOCKS), Items.BLACK_STAINED_GLASS));
    public static final RegistryObject<Item> BUBBLEGUM_CONCRETE = ITEMS.register("bubblegum_concrete", () -> new ParentedBlockItem(BlockInit.BUBBLEGUM_CONCRETE.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_BUILDING_BLOCKS), Items.BLACK_CONCRETE));
    public static final RegistryObject<Item> BUBBLEGUM_CONCRETE_POWDER = ITEMS.register("bubblegum_concrete_powder", () -> new ParentedBlockItem(BlockInit.BUBBLEGUM_CONCRETE_POWDER.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_BUILDING_BLOCKS), Items.BLACK_CONCRETE_POWDER));
    public static final RegistryObject<Item> BUBBLEGUM_CARPET = ITEMS.register("bubblegum_carpet", () -> new ParentedBlockItem(BlockInit.BUBBLEGUM_CARPET.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_DECORATIONS), Items.BLACK_CARPET));
    public static final RegistryObject<Item> BUBBLEGUM_STAINED_GLASS_PANE = ITEMS.register("bubblegum_stained_glass_pane", () -> new ParentedBlockItem(BlockInit.BUBBLEGUM_STAINED_GLASS_PANE.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_DECORATIONS), Items.BLACK_STAINED_GLASS_PANE));
    public static final RegistryObject<Item> BUBBLEGUM_SHULKER_BOX = ITEMS.register("bubblegum_shulker_box", () -> new ParentedBlockItem(BlockInit.BUBBLEGUM_SHULKER_BOX.get(), (new Item.Properties()).stacksTo(1).tab(CreativeModeTab.TAB_DECORATIONS), Items.BLACK_SHULKER_BOX));
    public static final RegistryObject<Item> BUBBLEGUM_BED = ITEMS.register("bubblegum_bed", () -> new ParentedBedItem(BlockInit.BUBBLEGUM_BED.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_DECORATIONS), Items.BLACK_BED));
    public static final RegistryObject<Item> BUBBLEGUM_BANNER = ITEMS.register("bubblegum_banner", () -> new ParentedBannerItem(BlockInit.BUBBLEGUM_BANNER.get(), BlockInit.BUBBLEGUM_WALL_BANNER.get(), (new Item.Properties()).stacksTo(16).tab(CreativeModeTab.TAB_DECORATIONS), Items.BLACK_BANNER));
    public static final RegistryObject<Item> BUBBLEGUM_CANDLE = ITEMS.register("bubblegum_candle", () -> new ParentedBlockItem(BlockInit.BUBBLEGUM_CANDLE.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_DECORATIONS), Items.BLACK_CANDLE));
    public static final RegistryObject<Item> BUBBLEGUM_DYE = ITEMS.register("bubblegum_dye", () -> new ParentedDyeItem(ExtraDyeColors.BUBBLEGUM, (new Item.Properties()).tab(CreativeModeTab.TAB_MATERIALS), Items.BLACK_DYE));

    public static final RegistryObject<Item> BORDEAUX_WOOL = ITEMS.register("bordeaux_wool", () -> new ParentedBlockItem(BlockInit.BORDEAUX_WOOL.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_BUILDING_BLOCKS), Items.BLACK_WOOL));
    public static final RegistryObject<Item> BORDEAUX_TERRACOTTA = ITEMS.register("bordeaux_terracotta", () -> new ParentedBlockItem(BlockInit.BORDEAUX_TERRACOTTA.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_BUILDING_BLOCKS), Items.BLACK_TERRACOTTA));
    public static final RegistryObject<Item> BORDEAUX_STAINED_GLASS = ITEMS.register("bordeaux_stained_glass", () -> new ParentedBlockItem(BlockInit.BORDEAUX_STAINED_GLASS.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_BUILDING_BLOCKS), Items.BLACK_STAINED_GLASS));
    public static final RegistryObject<Item> BORDEAUX_CONCRETE = ITEMS.register("bordeaux_concrete", () -> new ParentedBlockItem(BlockInit.BORDEAUX_CONCRETE.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_BUILDING_BLOCKS), Items.BLACK_CONCRETE));
    public static final RegistryObject<Item> BORDEAUX_CONCRETE_POWDER = ITEMS.register("bordeaux_concrete_powder", () -> new ParentedBlockItem(BlockInit.BORDEAUX_CONCRETE_POWDER.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_BUILDING_BLOCKS), Items.BLACK_CONCRETE_POWDER));
    public static final RegistryObject<Item> BORDEAUX_CARPET = ITEMS.register("bordeaux_carpet", () -> new ParentedBlockItem(BlockInit.BORDEAUX_CARPET.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_DECORATIONS), Items.BLACK_CARPET));
    public static final RegistryObject<Item> BORDEAUX_STAINED_GLASS_PANE = ITEMS.register("bordeaux_stained_glass_pane", () -> new ParentedBlockItem(BlockInit.BORDEAUX_STAINED_GLASS_PANE.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_DECORATIONS), Items.BLACK_STAINED_GLASS_PANE));
    public static final RegistryObject<Item> BORDEAUX_SHULKER_BOX = ITEMS.register("bordeaux_shulker_box", () -> new ParentedBlockItem(BlockInit.BORDEAUX_SHULKER_BOX.get(), (new Item.Properties()).stacksTo(1).tab(CreativeModeTab.TAB_DECORATIONS), Items.BLACK_SHULKER_BOX));
    public static final RegistryObject<Item> BORDEAUX_BED = ITEMS.register("bordeaux_bed", () -> new ParentedBedItem(BlockInit.BORDEAUX_BED.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_DECORATIONS), Items.BLACK_BED));
    public static final RegistryObject<Item> BORDEAUX_BANNER = ITEMS.register("bordeaux_banner", () -> new ParentedBannerItem(BlockInit.BORDEAUX_BANNER.get(), BlockInit.BORDEAUX_WALL_BANNER.get(), (new Item.Properties()).stacksTo(16).tab(CreativeModeTab.TAB_DECORATIONS), Items.BLACK_BANNER));
    public static final RegistryObject<Item> BORDEAUX_CANDLE = ITEMS.register("bordeaux_candle", () -> new ParentedBlockItem(BlockInit.BORDEAUX_CANDLE.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_DECORATIONS), Items.BLACK_CANDLE));
    public static final RegistryObject<Item> BORDEAUX_DYE = ITEMS.register("bordeaux_dye", () -> new ParentedDyeItem(ExtraDyeColors.BORDEAUX, (new Item.Properties()).tab(CreativeModeTab.TAB_MATERIALS), Items.BLACK_DYE));

    public static final RegistryObject<Item> ENDER_WOOL = ITEMS.register("ender_wool", () -> new ParentedBlockItem(BlockInit.ENDER_WOOL.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_BUILDING_BLOCKS), Items.BLACK_WOOL));
    public static final RegistryObject<Item> ENDER_TERRACOTTA = ITEMS.register("ender_terracotta", () -> new ParentedBlockItem(BlockInit.ENDER_TERRACOTTA.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_BUILDING_BLOCKS), Items.BLACK_TERRACOTTA));
    public static final RegistryObject<Item> ENDER_STAINED_GLASS = ITEMS.register("ender_stained_glass", () -> new ParentedBlockItem(BlockInit.ENDER_STAINED_GLASS.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_BUILDING_BLOCKS), Items.BLACK_STAINED_GLASS));
    public static final RegistryObject<Item> ENDER_CONCRETE = ITEMS.register("ender_concrete", () -> new ParentedBlockItem(BlockInit.ENDER_CONCRETE.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_BUILDING_BLOCKS), Items.BLACK_CONCRETE));
    public static final RegistryObject<Item> ENDER_CONCRETE_POWDER = ITEMS.register("ender_concrete_powder", () -> new ParentedBlockItem(BlockInit.ENDER_CONCRETE_POWDER.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_BUILDING_BLOCKS), Items.BLACK_CONCRETE_POWDER));
    public static final RegistryObject<Item> ENDER_CARPET = ITEMS.register("ender_carpet", () -> new ParentedBlockItem(BlockInit.ENDER_CARPET.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_DECORATIONS), Items.BLACK_CARPET));
    public static final RegistryObject<Item> ENDER_STAINED_GLASS_PANE = ITEMS.register("ender_stained_glass_pane", () -> new ParentedBlockItem(BlockInit.ENDER_STAINED_GLASS_PANE.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_DECORATIONS), Items.BLACK_STAINED_GLASS_PANE));
    public static final RegistryObject<Item> ENDER_SHULKER_BOX = ITEMS.register("ender_shulker_box", () -> new ParentedBlockItem(BlockInit.ENDER_SHULKER_BOX.get(), (new Item.Properties()).stacksTo(1).tab(CreativeModeTab.TAB_DECORATIONS), Items.BLACK_SHULKER_BOX));
    public static final RegistryObject<Item> ENDER_BED = ITEMS.register("ender_bed", () -> new ParentedBedItem(BlockInit.ENDER_BED.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_DECORATIONS), Items.BLACK_BED));
    public static final RegistryObject<Item> ENDER_BANNER = ITEMS.register("ender_banner", () -> new ParentedBannerItem(BlockInit.ENDER_BANNER.get(), BlockInit.ENDER_WALL_BANNER.get(), (new Item.Properties()).stacksTo(16).tab(CreativeModeTab.TAB_DECORATIONS), Items.BLACK_BANNER));
    public static final RegistryObject<Item> ENDER_CANDLE = ITEMS.register("ender_candle", () -> new ParentedBlockItem(BlockInit.ENDER_CANDLE.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_DECORATIONS), Items.BLACK_CANDLE));
    public static final RegistryObject<Item> ENDER_DYE = ITEMS.register("ender_dye", () -> new ParentedDyeItem(ExtraDyeColors.ENDER, (new Item.Properties()).tab(CreativeModeTab.TAB_MATERIALS), Items.BLACK_DYE));

    public static final RegistryObject<Item> MINT_WOOL = ITEMS.register("mint_wool", () -> new ParentedBlockItem(BlockInit.MINT_WOOL.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_BUILDING_BLOCKS), Items.BLACK_WOOL));
    public static final RegistryObject<Item> MINT_TERRACOTTA = ITEMS.register("mint_terracotta", () -> new ParentedBlockItem(BlockInit.MINT_TERRACOTTA.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_BUILDING_BLOCKS), Items.BLACK_TERRACOTTA));
    public static final RegistryObject<Item> MINT_STAINED_GLASS = ITEMS.register("mint_stained_glass", () -> new ParentedBlockItem(BlockInit.MINT_STAINED_GLASS.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_BUILDING_BLOCKS), Items.BLACK_STAINED_GLASS));
    public static final RegistryObject<Item> MINT_CONCRETE = ITEMS.register("mint_concrete", () -> new ParentedBlockItem(BlockInit.MINT_CONCRETE.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_BUILDING_BLOCKS), Items.BLACK_CONCRETE));
    public static final RegistryObject<Item> MINT_CONCRETE_POWDER = ITEMS.register("mint_concrete_powder", () -> new ParentedBlockItem(BlockInit.MINT_CONCRETE_POWDER.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_BUILDING_BLOCKS), Items.BLACK_CONCRETE_POWDER));
    public static final RegistryObject<Item> MINT_CARPET = ITEMS.register("mint_carpet", () -> new ParentedBlockItem(BlockInit.MINT_CARPET.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_DECORATIONS), Items.BLACK_CARPET));
    public static final RegistryObject<Item> MINT_STAINED_GLASS_PANE = ITEMS.register("mint_stained_glass_pane", () -> new ParentedBlockItem(BlockInit.MINT_STAINED_GLASS_PANE.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_DECORATIONS), Items.BLACK_STAINED_GLASS_PANE));
    public static final RegistryObject<Item> MINT_SHULKER_BOX = ITEMS.register("mint_shulker_box", () -> new ParentedBlockItem(BlockInit.MINT_SHULKER_BOX.get(), (new Item.Properties()).stacksTo(1).tab(CreativeModeTab.TAB_DECORATIONS), Items.BLACK_SHULKER_BOX));
    public static final RegistryObject<Item> MINT_BED = ITEMS.register("mint_bed", () -> new ParentedBedItem(BlockInit.MINT_BED.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_DECORATIONS), Items.BLACK_BED));
    public static final RegistryObject<Item> MINT_BANNER = ITEMS.register("mint_banner", () -> new ParentedBannerItem(BlockInit.MINT_BANNER.get(), BlockInit.MINT_WALL_BANNER.get(), (new Item.Properties()).stacksTo(16).tab(CreativeModeTab.TAB_DECORATIONS), Items.BLACK_BANNER));
    public static final RegistryObject<Item> MINT_CANDLE = ITEMS.register("mint_candle", () -> new ParentedBlockItem(BlockInit.MINT_CANDLE.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_DECORATIONS), Items.BLACK_CANDLE));
    public static final RegistryObject<Item> MINT_DYE = ITEMS.register("mint_dye", () -> new ParentedDyeItem(ExtraDyeColors.MINT, (new Item.Properties()).tab(CreativeModeTab.TAB_MATERIALS), Items.BLACK_DYE));

    public static final RegistryObject<Item> INDIGO_WOOL = ITEMS.register("indigo_wool", () -> new ParentedBlockItem(BlockInit.INDIGO_WOOL.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_BUILDING_BLOCKS), Items.BLACK_WOOL));
    public static final RegistryObject<Item> INDIGO_TERRACOTTA = ITEMS.register("indigo_terracotta", () -> new ParentedBlockItem(BlockInit.INDIGO_TERRACOTTA.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_BUILDING_BLOCKS), Items.BLACK_TERRACOTTA));
    public static final RegistryObject<Item> INDIGO_STAINED_GLASS = ITEMS.register("indigo_stained_glass", () -> new ParentedBlockItem(BlockInit.INDIGO_STAINED_GLASS.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_BUILDING_BLOCKS), Items.BLACK_STAINED_GLASS));
    public static final RegistryObject<Item> INDIGO_CONCRETE = ITEMS.register("indigo_concrete", () -> new ParentedBlockItem(BlockInit.INDIGO_CONCRETE.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_BUILDING_BLOCKS), Items.BLACK_CONCRETE));
    public static final RegistryObject<Item> INDIGO_CONCRETE_POWDER = ITEMS.register("indigo_concrete_powder", () -> new ParentedBlockItem(BlockInit.INDIGO_CONCRETE_POWDER.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_BUILDING_BLOCKS), Items.BLACK_CONCRETE_POWDER));
    public static final RegistryObject<Item> INDIGO_CARPET = ITEMS.register("indigo_carpet", () -> new ParentedBlockItem(BlockInit.INDIGO_CARPET.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_DECORATIONS), Items.BLACK_CARPET));
    public static final RegistryObject<Item> INDIGO_STAINED_GLASS_PANE = ITEMS.register("indigo_stained_glass_pane", () -> new ParentedBlockItem(BlockInit.INDIGO_STAINED_GLASS_PANE.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_DECORATIONS), Items.BLACK_STAINED_GLASS_PANE));
    public static final RegistryObject<Item> INDIGO_SHULKER_BOX = ITEMS.register("indigo_shulker_box", () -> new ParentedBlockItem(BlockInit.INDIGO_SHULKER_BOX.get(), (new Item.Properties()).stacksTo(1).tab(CreativeModeTab.TAB_DECORATIONS), Items.BLACK_SHULKER_BOX));
    public static final RegistryObject<Item> INDIGO_BED = ITEMS.register("indigo_bed", () -> new ParentedBedItem(BlockInit.INDIGO_BED.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_DECORATIONS), Items.BLACK_BED));
    public static final RegistryObject<Item> INDIGO_BANNER = ITEMS.register("indigo_banner", () -> new ParentedBannerItem(BlockInit.INDIGO_BANNER.get(), BlockInit.INDIGO_WALL_BANNER.get(), (new Item.Properties()).stacksTo(16).tab(CreativeModeTab.TAB_DECORATIONS), Items.BLACK_BANNER));
    public static final RegistryObject<Item> INDIGO_CANDLE = ITEMS.register("indigo_candle", () -> new ParentedBlockItem(BlockInit.INDIGO_CANDLE.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_DECORATIONS), Items.BLACK_CANDLE));
    public static final RegistryObject<Item> INDIGO_DYE = ITEMS.register("indigo_dye", () -> new ParentedDyeItem(ExtraDyeColors.INDIGO, (new Item.Properties()).tab(CreativeModeTab.TAB_MATERIALS), Items.BLACK_DYE));

    public static final RegistryObject<Item> OCHRE_WOOL = ITEMS.register("ochre_wool", () -> new ParentedBlockItem(BlockInit.OCHRE_WOOL.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_BUILDING_BLOCKS), Items.BLACK_WOOL));
    public static final RegistryObject<Item> OCHRE_TERRACOTTA = ITEMS.register("ochre_terracotta", () -> new ParentedBlockItem(BlockInit.OCHRE_TERRACOTTA.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_BUILDING_BLOCKS), Items.BLACK_TERRACOTTA));
    public static final RegistryObject<Item> OCHRE_STAINED_GLASS = ITEMS.register("ochre_stained_glass", () -> new ParentedBlockItem(BlockInit.OCHRE_STAINED_GLASS.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_BUILDING_BLOCKS), Items.BLACK_STAINED_GLASS));
    public static final RegistryObject<Item> OCHRE_CONCRETE = ITEMS.register("ochre_concrete", () -> new ParentedBlockItem(BlockInit.OCHRE_CONCRETE.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_BUILDING_BLOCKS), Items.BLACK_CONCRETE));
    public static final RegistryObject<Item> OCHRE_CONCRETE_POWDER = ITEMS.register("ochre_concrete_powder", () -> new ParentedBlockItem(BlockInit.OCHRE_CONCRETE_POWDER.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_BUILDING_BLOCKS), Items.BLACK_CONCRETE_POWDER));
    public static final RegistryObject<Item> OCHRE_CARPET = ITEMS.register("ochre_carpet", () -> new ParentedBlockItem(BlockInit.OCHRE_CARPET.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_DECORATIONS), Items.BLACK_CARPET));
    public static final RegistryObject<Item> OCHRE_STAINED_GLASS_PANE = ITEMS.register("ochre_stained_glass_pane", () -> new ParentedBlockItem(BlockInit.OCHRE_STAINED_GLASS_PANE.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_DECORATIONS), Items.BLACK_STAINED_GLASS_PANE));
    public static final RegistryObject<Item> OCHRE_SHULKER_BOX = ITEMS.register("ochre_shulker_box", () -> new ParentedBlockItem(BlockInit.OCHRE_SHULKER_BOX.get(), (new Item.Properties()).stacksTo(1).tab(CreativeModeTab.TAB_DECORATIONS), Items.BLACK_SHULKER_BOX));
    public static final RegistryObject<Item> OCHRE_BED = ITEMS.register("ochre_bed", () -> new ParentedBedItem(BlockInit.OCHRE_BED.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_DECORATIONS), Items.BLACK_BED));
    public static final RegistryObject<Item> OCHRE_BANNER = ITEMS.register("ochre_banner", () -> new ParentedBannerItem(BlockInit.OCHRE_BANNER.get(), BlockInit.OCHRE_WALL_BANNER.get(), (new Item.Properties()).stacksTo(16).tab(CreativeModeTab.TAB_DECORATIONS), Items.BLACK_BANNER));
    public static final RegistryObject<Item> OCHRE_CANDLE = ITEMS.register("ochre_candle", () -> new ParentedBlockItem(BlockInit.OCHRE_CANDLE.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_DECORATIONS), Items.BLACK_CANDLE));
    public static final RegistryObject<Item> OCHRE_DYE = ITEMS.register("ochre_dye", () -> new ParentedDyeItem(ExtraDyeColors.OCHRE, (new Item.Properties()).tab(CreativeModeTab.TAB_MATERIALS), Items.BLACK_DYE));

    public static final RegistryObject<Item> LAVENDER_WOOL = ITEMS.register("lavender_wool", () -> new ParentedBlockItem(BlockInit.LAVENDER_WOOL.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_BUILDING_BLOCKS), Items.BLACK_WOOL));
    public static final RegistryObject<Item> LAVENDER_TERRACOTTA = ITEMS.register("lavender_terracotta", () -> new ParentedBlockItem(BlockInit.LAVENDER_TERRACOTTA.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_BUILDING_BLOCKS), Items.BLACK_TERRACOTTA));
    public static final RegistryObject<Item> LAVENDER_STAINED_GLASS = ITEMS.register("lavender_stained_glass", () -> new ParentedBlockItem(BlockInit.LAVENDER_STAINED_GLASS.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_BUILDING_BLOCKS), Items.BLACK_STAINED_GLASS));
    public static final RegistryObject<Item> LAVENDER_CONCRETE = ITEMS.register("lavender_concrete", () -> new ParentedBlockItem(BlockInit.LAVENDER_CONCRETE.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_BUILDING_BLOCKS), Items.BLACK_CONCRETE));
    public static final RegistryObject<Item> LAVENDER_CONCRETE_POWDER = ITEMS.register("lavender_concrete_powder", () -> new ParentedBlockItem(BlockInit.LAVENDER_CONCRETE_POWDER.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_BUILDING_BLOCKS), Items.BLACK_CONCRETE_POWDER));
    public static final RegistryObject<Item> LAVENDER_CARPET = ITEMS.register("lavender_carpet", () -> new ParentedBlockItem(BlockInit.LAVENDER_CARPET.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_DECORATIONS), Items.BLACK_CARPET));
    public static final RegistryObject<Item> LAVENDER_STAINED_GLASS_PANE = ITEMS.register("lavender_stained_glass_pane", () -> new ParentedBlockItem(BlockInit.LAVENDER_STAINED_GLASS_PANE.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_DECORATIONS), Items.BLACK_STAINED_GLASS_PANE));
    public static final RegistryObject<Item> LAVENDER_SHULKER_BOX = ITEMS.register("lavender_shulker_box", () -> new ParentedBlockItem(BlockInit.LAVENDER_SHULKER_BOX.get(), (new Item.Properties()).stacksTo(1).tab(CreativeModeTab.TAB_DECORATIONS), Items.BLACK_SHULKER_BOX));
    public static final RegistryObject<Item> LAVENDER_BED = ITEMS.register("lavender_bed", () -> new ParentedBedItem(BlockInit.LAVENDER_BED.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_DECORATIONS), Items.BLACK_BED));
    public static final RegistryObject<Item> LAVENDER_BANNER = ITEMS.register("lavender_banner", () -> new ParentedBannerItem(BlockInit.LAVENDER_BANNER.get(), BlockInit.LAVENDER_WALL_BANNER.get(), (new Item.Properties()).stacksTo(16).tab(CreativeModeTab.TAB_DECORATIONS), Items.BLACK_BANNER));
    public static final RegistryObject<Item> LAVENDER_CANDLE = ITEMS.register("lavender_candle", () -> new ParentedBlockItem(BlockInit.LAVENDER_CANDLE.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_DECORATIONS), Items.BLACK_CANDLE));
    public static final RegistryObject<Item> LAVENDER_DYE = ITEMS.register("lavender_dye", () -> new ParentedDyeItem(ExtraDyeColors.LAVENDER, (new Item.Properties()).tab(CreativeModeTab.TAB_MATERIALS), Items.BLACK_DYE));

}
