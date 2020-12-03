package com.bessrour.players.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bessrour.players.entities.Player;

public interface PlayerRepository extends JpaRepository<Player,Long>{

}
