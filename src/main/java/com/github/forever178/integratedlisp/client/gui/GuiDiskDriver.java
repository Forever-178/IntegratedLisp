package com.github.forever178.integratedlisp.client.gui;

import com.github.forever178.integratedlisp.inventory.container.ContainerDiskDriver;
import com.github.forever178.integratedlisp.tileentity.TileDiskDriver;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.tileentity.TileEntity;
import org.cyclops.integrateddynamics.core.client.gui.GuiActiveVariableBase;
import org.cyclops.integrateddynamics.core.inventory.container.ContainerActiveVariableBase;

public class GuiDiskDriver extends GuiActiveVariableBase<ContainerDiskDriver, TileDiskDriver> {

    /**
     * Make a new instance.
     *
     * @param container The container
     */
    public GuiDiskDriver(InventoryPlayer inventory, TileDiskDriver tile) {
        super(new ContainerDiskDriver(inventory, tile));
    }

    @Override
    protected int getErrorX() {
        return 0;
    }


    @Override
    protected int getErrorY() {
        return 0;
    }

    /**
     * Draws the background layer of this container (behind the items).
     *
     * @param partialTicks
     * @param mouseX
     * @param mouseY
     */
    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {

    }
}
