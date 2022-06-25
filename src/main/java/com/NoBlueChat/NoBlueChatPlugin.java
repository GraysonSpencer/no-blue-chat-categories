package com.NoBlueChat;

import com.google.inject.Provides;
import javax.inject.Inject;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.api.events.ScriptPreFired;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;

@Slf4j
@PluginDescriptor(
	name = "No Blue Chat",
	description = "Prevents chat categories from turning blue",
	tags = {"ui", "chat"}
)
public class NoBlueChatPlugin extends Plugin
{
	@Inject
	private Client client;

	@Inject
	private NoBlueChatConfig config;

	@Override
	protected void startUp() throws Exception
	{
		log.info("No Blue Chat started!");
	}

	@Override
	protected void shutDown() throws Exception
	{
		log.info("No Blue Chat stopped!");
	}

	@Subscribe
	public void onScriptPreFired(ScriptPreFired event)
	{
		if (event.getScriptId() == 179)
		{
			if (config.gameChat())
			{
				client.setVarcIntValue(44, 0);
			}
			if (config.publicChat())
			{
				client.setVarcIntValue(45, 0);
			}
			if (config.privateChat())
			{
				client.setVarcIntValue(46, 0);
			}
			if (config.clanChat())
			{
				client.setVarcIntValue(47, 0);
			}
			if (config.tradeChat())
			{
				client.setVarcIntValue(48, 0);
			}
			if (config.channelChat())
			{
				client.setVarcIntValue(438, 0);
			}
		}
	}

	@Provides
	NoBlueChatConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(NoBlueChatConfig.class);
	}
}
