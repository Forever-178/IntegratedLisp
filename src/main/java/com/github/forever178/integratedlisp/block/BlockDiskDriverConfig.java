package com.github.forever178.integratedlisp.block;

import com.github.forever178.integratedlisp.IntegratedLisp;
import com.github.forever178.integratedlisp.item.ItemBlockDiskDriver;
import net.minecraft.item.ItemBlock;
import org.cyclops.cyclopscore.config.extendedconfig.BlockContainerConfig;

public class BlockDiskDriverConfig extends BlockContainerConfig {

    static public BlockDiskDriverConfig _instance;

    public BlockDiskDriverConfig() {
        super(
                IntegratedLisp._instance,
                true,
                "disk_driver",
                null,
                BlockDiskDriver.class
        );
    }
    @Override
    public Class<? extends ItemBlock> getItemBlockClass() {
        return ItemBlockDiskDriver.class; // 关联的 ItemBlock 类
    }



}
