package com.github.forever178.integratedlisp.tileentity;

import com.github.forever178.integratedlisp.network.DiskDriverNetworkElement;
import net.minecraft.block.BlockAnvil;
import net.minecraft.block.BlockWorkbench;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.InventoryCraftResult;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntityBanner;
import net.minecraft.util.EnumFacing;
import org.cyclops.integrateddynamics.core.tileentity.TileActiveVariableBase;

public class TileDiskDriver extends TileActiveVariableBase<DiskDriverNetworkElement> {
    public TileDiskDriver(int inventorySize, String inventoryName) {
        super(inventorySize, inventoryName);
    }

    /**
     * @return
     */
    @Override
    public int getSlotRead() {
        return 0;
    }

    /**
     * @param side
     * @return
     */
    @Override
    public int[] getSlotsForFace(EnumFacing side) {
        return new int[0];
    }

    /**
     * Returns true if automation can insert the given item in the given slot from the given side.
     *
     * @param index
     * @param itemStackIn
     * @param direction
     */
    @Override
    public boolean canInsertItem(int index, ItemStack itemStackIn, EnumFacing direction) {
        return false;
    }

    /**
     * Returns true if automation can extract the given item in the given slot from the given side.
     *
     * @param index
     * @param stack
     * @param direction
     */
    @Override
    public boolean canExtractItem(int index, ItemStack stack, EnumFacing direction) {
        return false;
    }

    /**
     * Returns the number of slots in the inventory.
     */
    @Override
    public int getSizeInventory() {
        return 0;
    }

    /**
     * @return
     */
    @Override
    public boolean isEmpty() {
        return false;
    }

    /**
     * Returns the stack in the given slot.
     *
     * @param index
     */
    @Override
    public ItemStack getStackInSlot(int index) {
        return null;
    }

    /**
     * Removes up to a specified number of items from an inventory slot and returns them in a new stack.
     *
     * @param index
     * @param count
     */
    @Override
    public ItemStack decrStackSize(int index, int count) {
        return null;
    }

    /**
     * Removes a stack from the given slot and returns it.
     *
     * @param index
     */
    @Override
    public ItemStack removeStackFromSlot(int index) {
        return null;
    }

    /**
     * Sets the given item stack to the specified slot in the inventory (can be crafting or armor sections).
     *
     * @param index
     * @param stack
     */
    @Override
    public void setInventorySlotContents(int index, ItemStack stack) {

    }

    /**
     * Returns the maximum stack size for a inventory slot. Seems to always be 64, possibly will be extended.
     */
    @Override
    public int getInventoryStackLimit() {
        return 0;
    }

    /**
     * Don't rename this method to canInteractWith due to conflicts with Container
     *
     * @param player
     */
    @Override
    public boolean isUsableByPlayer(EntityPlayer player) {
        return false;
    }

    /**
     * @param player
     */
    @Override
    public void openInventory(EntityPlayer player) {

    }

    /**
     * @param player
     */
    @Override
    public void closeInventory(EntityPlayer player) {

    }

    /**
     * Returns true if automation is allowed to insert the given stack (ignoring stack size) into the given slot. For
     * guis use Slot.isItemValid
     *
     * @param index
     * @param stack
     */
    @Override
    public boolean isItemValidForSlot(int index, ItemStack stack) {
        return false;
    }

    /**
     * @param id
     * @return
     */
    @Override
    public int getField(int id) {
        return 0;
    }

    /**
     * @param id
     * @param value
     */
    @Override
    public void setField(int id, int value) {

    }

    /**
     * @return
     */
    @Override
    public int getFieldCount() {
        return 0;
    }

    /**
     *
     */
    @Override
    public void clear() {

    }

    /**
     * Like the old updateEntity(), except more generic.
     */
    @Override
    public void update() {

    }


    @Override
    public String getName() {
        return "";
    }


    @Override
    public boolean hasCustomName() {
        return false;
    }
}
