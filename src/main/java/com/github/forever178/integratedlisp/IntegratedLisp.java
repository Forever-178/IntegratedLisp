package com.github.forever178.integratedlisp;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.cyclops.cyclopscore.init.ModBaseVersionable;
import org.cyclops.cyclopscore.init.RecipeHandler;
import org.cyclops.cyclopscore.proxy.ICommonProxy;

@Mod(
        modid = Tags.MOD_ID,
        name = Tags.MOD_NAME,
        version = Tags.VERSION
)
public class IntegratedLisp extends ModBaseVersionable {

    public static final Logger LOGGER = LogManager.getLogger(Tags.MOD_NAME);

    public IntegratedLisp(String modId, String modName, String modVersion) {
        super(modId, modName, modVersion);
    }

    /**
     * <a href="https://cleanroommc.com/wiki/forge-mod-development/event#overview">
     *     Take a look at how many FMLStateEvents you can listen to via the @Mod.EventHandler annotation here
     * </a>
     */
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        LOGGER.info("Hello From {}!", Tags.MOD_NAME);
    }

    @Override
    protected RecipeHandler constructRecipeHandler() {
        return null;
    }


    @Override
    public CreativeTabs constructDefaultCreativeTab() {
        return null;
    }

    @Override
    public ICommonProxy getProxy() {
        return null;
    }

}
