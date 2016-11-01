package singulariteam.eternalsingularity;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;
import singulariteam.eternalsingularity.proxy.CommonProxy;

import static singulariteam.eternalsingularity.Reference.*;

@Mod(modid = MOD_ID, name = MOD_NAME, version = MOD_VERSION, acceptedMinecraftVersions = MC_VERSION, dependencies = "required-after:Avaritia;after:thermsingul;after:universalsingularities;after:aobdsingularities")
public class EternalSingularityMod
{
	@Mod.Instance(MOD_ID)
	public static EternalSingularityMod instance;

	public static Logger logger;

	@SidedProxy(serverSide = COMMON_PROXY, clientSide = CLIENT_PROXY)
	public static CommonProxy proxy;

	@Mod.EventHandler
	public void preInit(final FMLPreInitializationEvent event)
	{
		logger = event.getModLog();
		proxy.preInit(event.getSuggestedConfigurationFile());
	}

	@Mod.EventHandler
	public void init(final FMLInitializationEvent event)
	{
		proxy.init();
	}

	@Mod.EventHandler
	public void postInit(final FMLPostInitializationEvent event)
	{
		proxy.postInit();
	}
}