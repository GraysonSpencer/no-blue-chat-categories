package com.NoBlueChat;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class NoBlueChatTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(NoBlueChatPlugin.class);
		RuneLite.main(args);
	}
}