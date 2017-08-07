package dt.realityshowmod.init;

import dt.realityshowmod.Reference;
import dt.realityshowmod.init.items.CustomEnvelope;
import dt.realityshowmod.init.items.Detour;
import dt.realityshowmod.init.items.RoadBlock;
import dt.realityshowmod.init.items.RouteInfo;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ItemInit 
{
	
	public static Item envelope;
	public static Item detour;
	public static Item roadblock;
	public static Item routeinfo;
	
	public static void init()
	{
		envelope = new CustomEnvelope("envelope");
		detour = new Detour("detour");
		roadblock = new RoadBlock("roadblock");
		routeinfo = new RouteInfo("routeinfo");
	}
	
	public static void register()
	{
		registerItem(envelope);
		registerItem(detour);
		registerItem(roadblock);
		registerItem(routeinfo);
	}
	
	public static void registerItem(Item item)
	{
		ForgeRegistries.ITEMS.register(item);
		
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MODID + ":" 
		+ item.getUnlocalizedName().substring(5), "inventory"));
	}
}
