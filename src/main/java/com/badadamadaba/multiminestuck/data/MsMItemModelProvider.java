package com.badadamadaba.multiminestuck.data;

import com.badadamadaba.multiminestuck.MinestuckMultiverseMain;
import com.badadamadaba.multiminestuck.item.MsMItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class MsMItemModelProvider extends ItemModelProvider
{
    public MsMItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper)
    {
        super(output, MinestuckMultiverseMain.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels()
    {
        basicItem(MsMItems.IRON_MEDALLION.get());
        basicItem(MsMItems.ZILLYSTONE_SHARD.get());
        basicItem(MsMItems.MOONSTONE.get());
        basicItem(MsMItems.MOONSTONE_CHISEL.get());
    }
}
