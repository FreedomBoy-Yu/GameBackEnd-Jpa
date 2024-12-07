package com.example.demo.server;

import java.util.List;

import com.example.demo.model.Player;

public interface PlayerServiceDao {
	//create
	void addPlayer(Player p);
	//read
	List<Player> allPlayer();
	//update
	void updatePlayer(int id,String password,String name,int money,int level);
	//delete
	void deletePlayer(int id);
}
