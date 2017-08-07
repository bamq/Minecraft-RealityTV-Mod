package dt.realityshowmod.handlers;

import dt.realityshowmod.init.ItemInit;

public class RegistryHandler 
{
	public static void Client()
	{
		ItemInit.register();
	}
	
	public static void Common()
	{
		ItemInit.init();
	}
}
