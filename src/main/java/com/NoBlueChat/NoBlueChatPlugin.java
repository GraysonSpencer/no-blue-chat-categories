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
	name = "No Flashing Chat Categories"
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
		log.info("Example started!");
	}

	@Override
	protected void shutDown() throws Exception
	{
		log.info("Example stopped!");
	}

//	@Subscribe
//	public void onGameStateChanged(GameStateChanged gameStateChanged)
//	{
//		if (gameStateChanged.getGameState() == GameState.LOGGED_IN)
//		{
//		}
//	}

	@Subscribe
	public void onScriptPreFired(ScriptPreFired event)
	{
		if(event.getScriptId() == 179)
		{
			client.getVarcMap().put( (Integer) 44, 0);
			client.getVarcMap().put( (Integer) 45, 0);
			client.getVarcMap().put( (Integer) 46, 0);
			client.getVarcMap().put( (Integer) 47, 0);
			client.getVarcMap().put( (Integer) 48, 0);
			client.getVarcMap().put( (Integer) 438, 0);
			client.getVarcMap().put( (Integer) 44, 0);
		}
	}

	@Provides
	NoBlueChatConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(NoBlueChatConfig.class);
	}
}
