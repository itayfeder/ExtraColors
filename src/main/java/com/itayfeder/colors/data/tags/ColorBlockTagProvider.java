package com.itayfeder.colors.data.tags;

import com.itayfeder.colors.ColorsMod;
import com.itayfeder.colors.init.BlockInit;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.common.data.ForgeBlockTagsProvider;

public class ColorBlockTagProvider extends BlockTagsProvider {
    public ColorBlockTagProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, ColorsMod.MODID, existingFileHelper);
    }

    @Override
    protected void addTags() {
        this.tag(BlockTags.WOOL).add(BlockInit.CORAL_WOOL.get(), BlockInit.BEIGE_WOOL.get(), BlockInit.OLIVE_WOOL.get());
        this.tag(BlockTags.WOOL_CARPETS).add(BlockInit.CORAL_CARPET.get(), BlockInit.BEIGE_CARPET.get(), BlockInit.OLIVE_CARPET.get());
        this.tag(BlockTags.BANNERS).add(BlockInit.CORAL_BANNER.get(), BlockInit.CORAL_WALL_BANNER.get(), BlockInit.BEIGE_BANNER.get(), BlockInit.BEIGE_WALL_BANNER.get(), BlockInit.OLIVE_BANNER.get(), BlockInit.OLIVE_WALL_BANNER.get());
        //this.tag(BlockTags.IMPERMEABLE).add(BlockInit.CORAL_STAINED_GLASS.get(), BlockInit.BEIGE_STAINED_GLASS.get(), BlockInit.OLIVE_STAINED_GLASS.get());
        this.tag(BlockTags.BEDS).add(BlockInit.CORAL_BED.get(), BlockInit.BEIGE_BED.get(), BlockInit.OLIVE_BED.get());
        this.tag(BlockTags.SHULKER_BOXES).add(BlockInit.CORAL_SHULKER_BOX.get(), BlockInit.BEIGE_SHULKER_BOX.get(), BlockInit.OLIVE_SHULKER_BOX.get());
        this.tag(BlockTags.CANDLES).add(BlockInit.CORAL_CANDLE.get(), BlockInit.BEIGE_CANDLE.get(), BlockInit.OLIVE_CANDLE.get());
        this.tag(BlockTags.CANDLE_CAKES).add(BlockInit.CORAL_CANDLE_CAKE.get(), BlockInit.BEIGE_CANDLE_CAKE.get(), BlockInit.OLIVE_CANDLE_CAKE.get());
        this.tag(BlockTags.TERRACOTTA).add(BlockInit.CORAL_TERRACOTTA.get(), BlockInit.BEIGE_TERRACOTTA.get(), BlockInit.OLIVE_TERRACOTTA.get());

        //this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BlockInit.CORAL_TERRACOTTA.get(), BlockInit.CORAL_CONCRETE.get(), BlockInit.BEIGE_TERRACOTTA.get(), BlockInit.BEIGE_CONCRETE.get(), BlockInit.OLIVE_TERRACOTTA.get(), BlockInit.OLIVE_CONCRETE.get());
        this.tag(BlockTags.MINEABLE_WITH_SHOVEL).add(BlockInit.CORAL_CONCRETE_POWDER.get(), BlockInit.BEIGE_CONCRETE_POWDER.get(), BlockInit.OLIVE_CONCRETE_POWDER.get());

        //this.tag(Tags.Blocks.GLASS).add(BlockInit.CORAL_STAINED_GLASS.get(), BlockInit.BEIGE_STAINED_GLASS.get(), BlockInit.OLIVE_STAINED_GLASS.get());
        this.tag(Tags.Blocks.STAINED_GLASS).add(BlockInit.CORAL_STAINED_GLASS.get(), BlockInit.BEIGE_STAINED_GLASS.get(), BlockInit.OLIVE_STAINED_GLASS.get());
        //this.tag(Tags.Blocks.GLASS_PANES).add(BlockInit.CORAL_STAINED_GLASS_PANE.get(), BlockInit.BEIGE_STAINED_GLASS_PANE.get(), BlockInit.OLIVE_STAINED_GLASS_PANE.get());
        this.tag(Tags.Blocks.STAINED_GLASS_PANES).add(BlockInit.CORAL_STAINED_GLASS_PANE.get(), BlockInit.BEIGE_STAINED_GLASS_PANE.get(), BlockInit.OLIVE_STAINED_GLASS_PANE.get());

    }
}
