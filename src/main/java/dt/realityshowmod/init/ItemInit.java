package dt.realityshowmod.init;

import dt.realityshowmod.Reference;
import dt.realityshowmod.init.items.CustomEnvelope;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemInit 
{
	
	public static Item envelope;
	
	public static void init()
	{
		envelope = new CustomEnvelope("envelope");
	}
	
	public static void register()
	{
		registerItem(envelope);
	}
	
	public static void registerItem(Item item)
	{
		ForgeRegistries.ITEMS.register(item);
		
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MODID + ":" 
		+ item.getUnlocalizedName().substring(5), "inventory"));
	}
}
