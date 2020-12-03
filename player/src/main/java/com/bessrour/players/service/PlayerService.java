package com.bessrour.players.service;

import java.util.List;

import com.bessrour.players.entities.Player;

public interface PlayerService {

	Player savePlayer(Player p);
	Player updatePlayer(Player p);
	void deletePlayer(Player p);
	 void deletePlayerById(Long id);
	Player getPlayer(Long id);
	List<Player> getAllPlayers();
}
