package com.github.forever178.integratedlisp.network;

import com.github.forever178.integratedlisp.tileentity.TileDiskDriver;
import org.cyclops.cyclopscore.datastructure.DimPos;
import org.cyclops.integrateddynamics.api.network.INetwork;
import org.cyclops.integrateddynamics.core.network.TileNetworkElement;

public class DiskDriverNetworkElement extends TileNetworkElement<TileDiskDriver> {

    public DiskDriverNetworkElement(DimPos pos) {
        super(pos);
    }

    @Override
    protected Class<TileDiskDriver> getTileClass() {
        return null;
    }


    @Override
    public void setPriorityAndChannel(INetwork network, int priority, int channel) {

    }


    @Override
    public int getPriority() {
        return 0;
    }


    @Override
    public int getChannel() {
        return 0;
    }
}
