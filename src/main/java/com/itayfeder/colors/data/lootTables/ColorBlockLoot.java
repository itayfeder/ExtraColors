package com.itayfeder.colors.data.lootTables;

import com.itayfeder.colors.init.BlockInit;
import net.minecraft.data.loot.BlockLoot;
import net.minecraft.world.level.block.BedBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.properties.BedPart;
import net.minecraftforge.registries.RegistryObject;

public class ColorBlockLoot extends BlockLoot {
    @Override
    protected void addTables() {
        this.dropSelf(BlockInit.CORAL_WOOL.get());
        this.dropSelf(BlockInit.CORAL_TERRACOTTA.get());
        this.dropSelf(BlockInit.CORAL_CARPET.get());
        this.dropSelf(BlockInit.CORAL_CONCRETE.get());
        this.dropSelf(BlockInit.CORAL_CONCRETE_POWDER.get());
        this.add(BlockInit.CORAL_BED.get(), (p_124201_) -> {
            return createSinglePropConditionTable(p_124201_, BedBlock.PART, BedPart.HEAD);
        });
        this.add(BlockInit.CORAL_CANDLE.get(), BlockLoot::createCandleDrops);
        this.add(BlockInit.CORAL_SHULKER_BOX.get(), BlockLoot::createShulkerBoxDrop);
        this.add(BlockInit.CORAL_BANNER.get(), BlockLoot::createBannerDrop);
        this.add(BlockInit.CORAL_WALL_BANNER.get(), BlockLoot::createBannerDrop);
        this.dropWhenSilkTouch(BlockInit.CORAL_STAINED_GLASS.get());
        this.dropWhenSilkTouch(BlockInit.CORAL_STAINED_GLASS_PANE.get());
        this.add(BlockInit.CORAL_CANDLE_CAKE.get(), createCandleCakeDrops(BlockInit.CORAL_CANDLE.get()));

        this.dropSelf(BlockInit.BEIGE_WOOL.get());
        this.dropSelf(BlockInit.BEIGE_TERRACOTTA.get());
        this.dropSelf(BlockInit.BEIGE_CARPET.get());
        this.dropSelf(BlockInit.BEIGE_CONCRETE.get());
        this.dropSelf(BlockInit.BEIGE_CONCRETE_POWDER.get());
        this.add(BlockInit.BEIGE_BED.get(), (p_124201_) -> {
            return createSinglePropConditionTable(p_124201_, BedBlock.PART, BedPart.HEAD);
        });
        this.add(BlockInit.BEIGE_CANDLE.get(), BlockLoot::createCandleDrops);
        this.add(BlockInit.BEIGE_SHULKER_BOX.get(), BlockLoot::createShulkerBoxDrop);
        this.add(BlockInit.BEIGE_BANNER.get(), BlockLoot::createBannerDrop);
        this.add(BlockInit.BEIGE_WALL_BANNER.get(), BlockLoot::createBannerDrop);
        this.dropWhenSilkTouch(BlockInit.BEIGE_STAINED_GLASS.get());
        this.dropWhenSilkTouch(BlockInit.BEIGE_STAINED_GLASS_PANE.get());
        this.add(BlockInit.BEIGE_CANDLE_CAKE.get(), createCandleCakeDrops(BlockInit.BEIGE_CANDLE.get()));

    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return BlockInit.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }

}
