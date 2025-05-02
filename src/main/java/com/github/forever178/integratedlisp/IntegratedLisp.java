package com.github.forever178.integratedlisp;

import com.github.forever178.integratedlisp.block.BlockDiskDriverConfig;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.cyclops.cyclopscore.config.ConfigHandler;
import org.cyclops.cyclopscore.init.ModBaseVersionable;
import org.cyclops.cyclopscore.init.RecipeHandler;
import org.cyclops.cyclopscore.proxy.ICommonProxy;
import org.cyclops.integrateddynamics.IntegratedDynamics;

/**
 * mod的主类
 * The main mod class of this mod.
 */
@Mod(
        modid = Tags.MOD_ID,
        name = Tags.MOD_NAME,
        version = Tags.VERSION
)
public class IntegratedLisp extends ModBaseVersionable {

    public static final Logger LOGGER = LogManager.getLogger(Tags.MOD_NAME);

    /**
     * 唯一的实例
     */
    @Mod.Instance(Tags.MOD_ID)
    public static IntegratedLisp _instance;

    public IntegratedLisp() {
        super(Tags.MOD_ID, Tags.MOD_NAME, Tags.VERSION);
    }

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        LOGGER.info("Hello From {}!", Tags.MOD_NAME);

        super.preInit(event);
    }

    @Override
    protected RecipeHandler constructRecipeHandler() {
        return null;
    }

    @Override
    public ICommonProxy getProxy() {
        return null;
    }

    @Override
    public CreativeTabs constructDefaultCreativeTab(){
        return IntegratedDynamics._instance.getDefaultCreativeTab();
    }

    @Override
    public void onMainConfigsRegister(ConfigHandler configHandler) {
        super.onMainConfigsRegister(configHandler);
        configHandler.add(new BlockDiskDriverConfig());

    }
}
