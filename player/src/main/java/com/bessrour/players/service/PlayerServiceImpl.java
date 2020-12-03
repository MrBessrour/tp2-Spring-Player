package com.bessrour.players.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bessrour.players.entities.Player;
import com.bessrour.players.repos.PlayerRepository;

@Service
public class PlayerServiceImpl implements PlayerService{
	@Autowired
	PlayerRepository PlayerRepository;
	@Override
	public Player savePlayer(Player p) {
	return PlayerRepository.save(p);
	}
	@Override
	public Player updatePlayer(Player p) {
	return PlayerRepository.save(p);
	}
	@Override
	public void deletePlayer(Player p) {
	PlayerRepository.delete(p);
	}
	 @Override
	public void deletePlayerById(Long id) {
	PlayerRepository.deleteById(id);
	}
	@Override
	public Player getPlayer(Long id) {
	return PlayerRepository.findById(id).get();
	}
	@Override
	public List<Player> getAllPlayers() {
	return PlayerRepository.findAll();
	}
}

