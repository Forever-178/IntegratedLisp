package com.github.forever178.integratedlisp.block;
import com.github.forever178.integratedlisp.tileentity.TileDiskDriver;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.inventory.Container;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import org.cyclops.cyclopscore.block.property.BlockProperty;
import org.cyclops.cyclopscore.config.extendedconfig.BlockConfig;
import org.cyclops.cyclopscore.config.extendedconfig.ExtendedConfig;
import org.cyclops.integrateddynamics.core.block.BlockContainerGuiCabled;

import javax.annotation.Nonnull;

public class BlockDiskDriver extends BlockContainerGuiCabled {

    private static BlockDiskDriver _instance = null;

    @BlockProperty
    public static final PropertyDirection FACING = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL);

    /**
     * Make a new block instance.
     *
     * @param eConfig    Config for this block.
     */
    public BlockDiskDriver(ExtendedConfig<BlockConfig> eConfig) {
        super(eConfig, TileDiskDriver.class);
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

    public static BlockDiskDriver getInstance() {
        return _instance;
    }
}


