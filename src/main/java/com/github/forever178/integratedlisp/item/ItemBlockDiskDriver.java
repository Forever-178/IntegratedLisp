package com.github.forever178.integratedlisp.item;

import net.minecraft.block.Block;
import org.cyclops.cyclopscore.item.ItemBlockNBT;

public class ItemBlockDiskDriver extends ItemBlockNBT {
    /**
     * Make a new instance.
     *
     * @param block The blockState instance.
     */
    public ItemBlockDiskDriver(Block block) {
        super(block);
        this.setMaxStackSize(64);
    }
}
