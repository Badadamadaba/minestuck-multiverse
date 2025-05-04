package com.badadamadaba.multiminestuck.data;

import com.badadamadaba.multiminestuck.MinestuckMultiverseMain;
import com.badadamadaba.multiminestuck.block.MsMBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

import java.util.function.Supplier;

public class MsMBlockStateProvider extends BlockStateProvider
{
    public MsMBlockStateProvider(PackOutput output, ExistingFileHelper existingFileHelper)
    {
        super(output, MinestuckMultiverseMain.MODID, existingFileHelper);
    }

    protected void registerStatesAndModels()
    {
        blockWithItem(MsMBlocks.HERO_STONE_BLOOD);
        slabBlock(MsMBlocks.HERO_STONE_SLAB_BLOOD.get(), blockTexture(MsMBlocks.HERO_STONE_BLOOD.get()), blockTexture(MsMBlocks.HERO_STONE_BLOOD.get()));
        wallBlock(MsMBlocks.HERO_STONE_WALL_BLOOD.get(), blockTexture(MsMBlocks.HERO_STONE_BLOOD.get()));
        stairsBlock(MsMBlocks.HERO_STONE_STAIRS_BLOOD.get(), blockTexture(MsMBlocks.HERO_STONE_BLOOD.get()));
        blockWithItem(MsMBlocks.CHISELED_HERO_STONE_BLOOD);
        blockItem(MsMBlocks.HERO_STONE_SLAB_BLOOD);
        blockItem(MsMBlocks.HERO_STONE_WALL_BLOOD);
        blockItem(MsMBlocks.HERO_STONE_STAIRS_BLOOD);

        blockWithItem(MsMBlocks.HERO_STONE_BREATH);
        slabBlock(MsMBlocks.HERO_STONE_SLAB_BREATH.get(), blockTexture(MsMBlocks.HERO_STONE_BREATH.get()), blockTexture(MsMBlocks.HERO_STONE_BREATH.get()));
        wallBlock(MsMBlocks.HERO_STONE_WALL_BREATH.get(), blockTexture(MsMBlocks.HERO_STONE_BREATH.get()));
        stairsBlock(MsMBlocks.HERO_STONE_STAIRS_BREATH.get(), blockTexture(MsMBlocks.HERO_STONE_BREATH.get()));
        blockWithItem(MsMBlocks.CHISELED_HERO_STONE_BREATH);
        blockItem(MsMBlocks.HERO_STONE_SLAB_BREATH);
        blockItem(MsMBlocks.HERO_STONE_WALL_BREATH);
        blockItem(MsMBlocks.HERO_STONE_STAIRS_BREATH);

        blockWithItem(MsMBlocks.HERO_STONE_DOOM);
        slabBlock(MsMBlocks.HERO_STONE_SLAB_DOOM.get(), blockTexture(MsMBlocks.HERO_STONE_DOOM.get()), blockTexture(MsMBlocks.HERO_STONE_DOOM.get()));
        wallBlock(MsMBlocks.HERO_STONE_WALL_DOOM.get(), blockTexture(MsMBlocks.HERO_STONE_DOOM.get()));
        stairsBlock(MsMBlocks.HERO_STONE_STAIRS_DOOM.get(), blockTexture(MsMBlocks.HERO_STONE_DOOM.get()));
        blockWithItem(MsMBlocks.CHISELED_HERO_STONE_DOOM);
        blockItem(MsMBlocks.HERO_STONE_SLAB_DOOM);
        blockItem(MsMBlocks.HERO_STONE_WALL_DOOM);
        blockItem(MsMBlocks.HERO_STONE_STAIRS_DOOM);

        blockWithItem(MsMBlocks.HERO_STONE_LIFE);
        slabBlock(MsMBlocks.HERO_STONE_SLAB_LIFE.get(), blockTexture(MsMBlocks.HERO_STONE_LIFE.get()), blockTexture(MsMBlocks.HERO_STONE_LIFE.get()));
        wallBlock(MsMBlocks.HERO_STONE_WALL_LIFE.get(), blockTexture(MsMBlocks.HERO_STONE_LIFE.get()));
        stairsBlock(MsMBlocks.HERO_STONE_STAIRS_LIFE.get(), blockTexture(MsMBlocks.HERO_STONE_LIFE.get()));
        blockWithItem(MsMBlocks.CHISELED_HERO_STONE_LIFE);
        blockItem(MsMBlocks.HERO_STONE_SLAB_LIFE);
        blockItem(MsMBlocks.HERO_STONE_WALL_LIFE);
        blockItem(MsMBlocks.HERO_STONE_STAIRS_LIFE);

        blockWithItem(MsMBlocks.HERO_STONE_HEART);
        slabBlock(MsMBlocks.HERO_STONE_SLAB_HEART.get(), blockTexture(MsMBlocks.HERO_STONE_HEART.get()), blockTexture(MsMBlocks.HERO_STONE_HEART.get()));
        wallBlock(MsMBlocks.HERO_STONE_WALL_HEART.get(), blockTexture(MsMBlocks.HERO_STONE_HEART.get()));
        stairsBlock(MsMBlocks.HERO_STONE_STAIRS_HEART.get(), blockTexture(MsMBlocks.HERO_STONE_HEART.get()));
        blockWithItem(MsMBlocks.CHISELED_HERO_STONE_HEART);
        blockItem(MsMBlocks.HERO_STONE_SLAB_HEART);
        blockItem(MsMBlocks.HERO_STONE_WALL_HEART);
        blockItem(MsMBlocks.HERO_STONE_STAIRS_HEART);

        blockWithItem(MsMBlocks.HERO_STONE_MIND);
        slabBlock(MsMBlocks.HERO_STONE_SLAB_MIND.get(), blockTexture(MsMBlocks.HERO_STONE_MIND.get()), blockTexture(MsMBlocks.HERO_STONE_MIND.get()));
        wallBlock(MsMBlocks.HERO_STONE_WALL_MIND.get(), blockTexture(MsMBlocks.HERO_STONE_MIND.get()));
        stairsBlock(MsMBlocks.HERO_STONE_STAIRS_MIND.get(), blockTexture(MsMBlocks.HERO_STONE_MIND.get()));
        blockWithItem(MsMBlocks.CHISELED_HERO_STONE_MIND);
        blockItem(MsMBlocks.HERO_STONE_SLAB_MIND);
        blockItem(MsMBlocks.HERO_STONE_WALL_MIND);
        blockItem(MsMBlocks.HERO_STONE_STAIRS_MIND);

        blockWithItem(MsMBlocks.HERO_STONE_HOPE);
        slabBlock(MsMBlocks.HERO_STONE_SLAB_HOPE.get(), blockTexture(MsMBlocks.HERO_STONE_HOPE.get()), blockTexture(MsMBlocks.HERO_STONE_HOPE.get()));
        wallBlock(MsMBlocks.HERO_STONE_WALL_HOPE.get(), blockTexture(MsMBlocks.HERO_STONE_HOPE.get()));
        stairsBlock(MsMBlocks.HERO_STONE_STAIRS_HOPE.get(), blockTexture(MsMBlocks.HERO_STONE_HOPE.get()));
        blockWithItem(MsMBlocks.CHISELED_HERO_STONE_HOPE);
        blockItem(MsMBlocks.HERO_STONE_SLAB_HOPE);
        blockItem(MsMBlocks.HERO_STONE_WALL_HOPE);
        blockItem(MsMBlocks.HERO_STONE_STAIRS_HOPE);

        blockWithItem(MsMBlocks.HERO_STONE_RAGE);
        slabBlock(MsMBlocks.HERO_STONE_SLAB_RAGE.get(), blockTexture(MsMBlocks.HERO_STONE_RAGE.get()), blockTexture(MsMBlocks.HERO_STONE_RAGE.get()));
        wallBlock(MsMBlocks.HERO_STONE_WALL_RAGE.get(), blockTexture(MsMBlocks.HERO_STONE_RAGE.get()));
        stairsBlock(MsMBlocks.HERO_STONE_STAIRS_RAGE.get(), blockTexture(MsMBlocks.HERO_STONE_RAGE.get()));
        blockWithItem(MsMBlocks.CHISELED_HERO_STONE_RAGE);
        blockItem(MsMBlocks.HERO_STONE_SLAB_RAGE);
        blockItem(MsMBlocks.HERO_STONE_WALL_RAGE);
        blockItem(MsMBlocks.HERO_STONE_STAIRS_RAGE);

        blockWithItem(MsMBlocks.HERO_STONE_LIGHT);
        slabBlock(MsMBlocks.HERO_STONE_SLAB_LIGHT.get(), blockTexture(MsMBlocks.HERO_STONE_LIGHT.get()), blockTexture(MsMBlocks.HERO_STONE_LIGHT.get()));
        wallBlock(MsMBlocks.HERO_STONE_WALL_LIGHT.get(), blockTexture(MsMBlocks.HERO_STONE_LIGHT.get()));
        stairsBlock(MsMBlocks.HERO_STONE_STAIRS_LIGHT.get(), blockTexture(MsMBlocks.HERO_STONE_LIGHT.get()));
        blockWithItem(MsMBlocks.CHISELED_HERO_STONE_LIGHT);
        blockItem(MsMBlocks.HERO_STONE_SLAB_LIGHT);
        blockItem(MsMBlocks.HERO_STONE_WALL_LIGHT);
        blockItem(MsMBlocks.HERO_STONE_STAIRS_LIGHT);

        blockWithItem(MsMBlocks.HERO_STONE_VOID);
        slabBlock(MsMBlocks.HERO_STONE_SLAB_VOID.get(), blockTexture(MsMBlocks.HERO_STONE_VOID.get()), blockTexture(MsMBlocks.HERO_STONE_VOID.get()));
        wallBlock(MsMBlocks.HERO_STONE_WALL_VOID.get(), blockTexture(MsMBlocks.HERO_STONE_VOID.get()));
        stairsBlock(MsMBlocks.HERO_STONE_STAIRS_VOID.get(), blockTexture(MsMBlocks.HERO_STONE_VOID.get()));
        blockWithItem(MsMBlocks.CHISELED_HERO_STONE_VOID);
        blockItem(MsMBlocks.HERO_STONE_SLAB_VOID);
        blockItem(MsMBlocks.HERO_STONE_WALL_VOID);
        blockItem(MsMBlocks.HERO_STONE_STAIRS_VOID);

        blockWithItem(MsMBlocks.HERO_STONE_TIME);
        slabBlock(MsMBlocks.HERO_STONE_SLAB_TIME.get(), blockTexture(MsMBlocks.HERO_STONE_TIME.get()), blockTexture(MsMBlocks.HERO_STONE_TIME.get()));
        wallBlock(MsMBlocks.HERO_STONE_WALL_TIME.get(), blockTexture(MsMBlocks.HERO_STONE_TIME.get()));
        stairsBlock(MsMBlocks.HERO_STONE_STAIRS_TIME.get(), blockTexture(MsMBlocks.HERO_STONE_TIME.get()));
        blockWithItem(MsMBlocks.CHISELED_HERO_STONE_TIME);
        blockItem(MsMBlocks.HERO_STONE_SLAB_TIME);
        blockItem(MsMBlocks.HERO_STONE_WALL_TIME);
        blockItem(MsMBlocks.HERO_STONE_STAIRS_TIME);

        blockWithItem(MsMBlocks.HERO_STONE_SPACE);
        slabBlock(MsMBlocks.HERO_STONE_SLAB_SPACE.get(), blockTexture(MsMBlocks.HERO_STONE_SPACE.get()), blockTexture(MsMBlocks.HERO_STONE_SPACE.get()));
        wallBlock(MsMBlocks.HERO_STONE_WALL_SPACE.get(), blockTexture(MsMBlocks.HERO_STONE_SPACE.get()));
        stairsBlock(MsMBlocks.HERO_STONE_STAIRS_SPACE.get(), blockTexture(MsMBlocks.HERO_STONE_SPACE.get()));
        blockWithItem(MsMBlocks.CHISELED_HERO_STONE_SPACE);
        blockItem(MsMBlocks.HERO_STONE_SLAB_SPACE);
        blockItem(MsMBlocks.HERO_STONE_WALL_SPACE);
        blockItem(MsMBlocks.HERO_STONE_STAIRS_SPACE);

        blockWithItem(MsMBlocks.GRIST_BLOCK_AMBER);
        blockWithItem(MsMBlocks.GRIST_BLOCK_AMETHYST);
        blockWithItem(MsMBlocks.GRIST_BLOCK_ARTIFACT);
        blockWithItem(MsMBlocks.GRIST_BLOCK_BUILD);
        blockWithItem(MsMBlocks.GRIST_BLOCK_CHALK);
        blockWithItem(MsMBlocks.GRIST_BLOCK_CAULK);
        blockWithItem(MsMBlocks.GRIST_BLOCK_COBALT);
        logBlock(((RotatedPillarBlock) MsMBlocks.GRIST_BLOCK_DIAMOND.get()));
        blockItem(MsMBlocks.GRIST_BLOCK_DIAMOND);
        blockWithItem(MsMBlocks.GRIST_BLOCK_GARNET);
        blockWithItem(MsMBlocks.GRIST_BLOCK_GOLD);
        blockWithItem(MsMBlocks.GRIST_BLOCK_IODINE);
        blockWithItem(MsMBlocks.GRIST_BLOCK_MARBLE);
        blockWithItem(MsMBlocks.GRIST_BLOCK_MERCURY);
        logBlock(((RotatedPillarBlock) MsMBlocks.GRIST_BLOCK_QUARTZ.get()));
        blockItem(MsMBlocks.GRIST_BLOCK_QUARTZ);
        blockWithItem(MsMBlocks.GRIST_BLOCK_RUBY);
        blockWithItem(MsMBlocks.GRIST_BLOCK_RUST);
        blockWithItem(MsMBlocks.GRIST_BLOCK_SHALE);
        blockWithItem(MsMBlocks.GRIST_BLOCK_SULFUR);
        blockWithItem(MsMBlocks.GRIST_BLOCK_TAR);
        blockWithItem(MsMBlocks.GRIST_BLOCK_URANIUM);
        blockWithItem(MsMBlocks.GRIST_BLOCK_ZILLIUM);

        blockWithItem(MsMBlocks.SBAHJ_BEDROCK);
        blockWithItem(MsMBlocks.ZILLYSTONE);
    }

    private void blockWithItem(DeferredBlock<?> deferredBlock)
    {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }

    private void blockItem(DeferredBlock<?> deferredBlock) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("multiminestuck:block/" + deferredBlock.getId().getPath()));
    }

    private void blockItem(DeferredBlock<?> deferredBlock, String appendix) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("multiminestuck:block/" + deferredBlock.getId().getPath() + appendix));
    }
}
