package com.github.forever178.integratedlisp.block;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.inventory.Container;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import org.cyclops.cyclopscore.config.extendedconfig.BlockConfig;
import org.cyclops.cyclopscore.config.extendedconfig.ExtendedConfig;
import org.cyclops.cyclopscore.tileentity.CyclopsTileEntity;
import org.cyclops.integrateddynamics.core.block.BlockContainerGuiCabled;

import javax.annotation.Nonnull;

public class BlockDiskDriver extends BlockContainerGuiCabled {

    /**
     * Make a new block instance.
     *
     * @param eConfig    Config for this block.
     * @param tileEntity The part class
     */
    public BlockDiskDriver(ExtendedConfig<BlockConfig> eConfig, Class<? extends CyclopsTileEntity> tileEntity) {
        super(eConfig, tileEntity);
    }

    /**
     * Returns a new instance of a block's tile entity class. Called on placing the block.
     *
     * @param worldIn
     * @param meta
     */
    @Override
    public TileEntity createNewTileEntity(@Nonnull World worldIn, int meta) {
        return null;
    }

    /**
     * Get the container for this blockState.
     *
     * @return The container class.
     */
    @Override
    public Class<? extends Container> getContainer() {
        return null;
    }

    /**
     * Get the GUI for this blockState.
     *
     * @return The GUI class.
     */
    @Override
    public Class<? extends GuiScreen> getGui() {
        return null;
    }
}


