package com.NoBlueChat;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("No Blue Chat")
public interface NoBlueChatConfig extends Config
{

	@ConfigItem(
		keyName = "gameChat",
		name = "Game Chat",
		description = "Stops game chat from turning blue.",
		position = 1
	)
	default boolean gameChat()
	{
		return true;
	}

	@ConfigItem(
		keyName = "publicChat",
		name = "Public Chat",
		description = "Stops public chat from turning blue.",
		position = 2
	)
	default boolean publicChat()
	{
		return true;
	}

	@ConfigItem(
		keyName = "privateChat",
		name = "Private Chat",
		description = "Stops private chat from turning blue.",
		position = 3
	)
	default boolean privateChat()
	{
		return true;
	}

	@ConfigItem(
		keyName = "channelChat",
		name = "Channel Chat",
		description = "Stops channel chat from turning blue.",
		position = 4
	)
	default boolean channelChat()
	{
		return true;
	}

	@ConfigItem(
		keyName = "clanChat",
		name = "Clan Chat",
		description = "Stops clan chat from turning blue.",
		position = 5
	)
	default boolean clanChat()
	{
		return true;
	}

	@ConfigItem(
		keyName = "tradeChat",
		name = "Trade Chat",
		description = "Stops trade chat from turning blue.",
		position = 6
	)
	default boolean tradeChat()
	{
		return true;
	}
}
