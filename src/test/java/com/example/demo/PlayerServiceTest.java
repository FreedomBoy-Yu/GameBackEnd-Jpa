package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.dao.PlayerDao;
import com.example.demo.model.Player;
import com.example.demo.server.impl.PlayerServiceImpl;

@SpringBootTest
public class PlayerServiceTest {
//	PlayerDao pd;
	@Autowired
	PlayerServiceImpl psi;
	@Test
	public void test() {
//		psi.addPlayer(new Player("1","2","3",1,1));
//		System.out.println(psi.allPlayer());
//		psi.updatePlayer(1, "8964", "愛吃數據線的貓", 0, 1);
		psi.deletePlayer(2);
		System.out.println("success");
	}
	
}
