package com.github.forever178.integratedlisp.inventory.container;

import com.github.forever178.integratedlisp.tileentity.TileDiskDriver;
import net.minecraft.entity.player.InventoryPlayer;
import org.cyclops.integrateddynamics.core.inventory.container.ContainerActiveVariableBase;
import org.cyclops.integrateddynamics.core.tileentity.TileActiveVariableBase;

public class ContainerDiskDriver extends ContainerActiveVariableBase<TileDiskDriver> {
    /**
     * Make a new instance.
     *
     * @param inventory The player inventory.
     * @param tile      The part.
     */
    public ContainerDiskDriver(InventoryPlayer inventory, TileDiskDriver tile) {
        super(inventory, tile);
    }
}
