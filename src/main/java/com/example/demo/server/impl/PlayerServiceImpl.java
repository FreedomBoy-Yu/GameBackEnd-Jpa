package com.example.demo.server.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.PlayerDao;
import com.example.demo.model.Player;
import com.example.demo.server.PlayerServiceDao;
@Service
public class PlayerServiceImpl implements PlayerServiceDao{
	@Autowired
	PlayerDao pd;
	@Override
	public void addPlayer(Player p) {
		pd.save(p);
		
	}

	@Override
	public List<Player> allPlayer() {
		return pd.findAll();
	}

	@Override
	public void updatePlayer(int id, String password, String name, int money, int level) {
		Player p = pd.findById(id);
		p.setPassword(password);
		p.setName(name);
		p.setMoney(money);
		p.setLevel(level);
		pd.save(p);
		
	}

	@Override
	public void deletePlayer(int id) {
		pd.deleteById(id);
		
	}

}
