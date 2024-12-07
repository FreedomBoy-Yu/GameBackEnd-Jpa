package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.Player;
import com.example.demo.server.PlayerServiceDao;

import java.util.List;

@RestController
@RequestMapping("/player")
public class PlayerController {

    @Autowired
    private PlayerServiceDao playerService;

    // 新增玩家
    @PostMapping("/addPlayer")
    public String addPlayer( @RequestBody Player p) {
        playerService.addPlayer(p);
        return "玩家以新創帳號";
    }

    // 查詢所有玩家
    @GetMapping("/allPlayer")
    public List<Player> getAllPlayers() {
        return playerService.allPlayer();
    }

    // 更新玩家
    @PutMapping("/updatePlayer/{id}/{password}/{name}/{money}/{level}")
    public String updatePlayer(@PathVariable int id,String password,String name,int money,int level) {
        playerService.updatePlayer(id, password, name, money, level);
        return "新的遊戲紀錄";
    }

    // 刪除玩家
    @DeleteMapping("/deletePlayer/{id}")
    public String deletePlayer(@PathVariable int id) {
        playerService.deletePlayer(id);
        return "玩家以刪除帳號";
    }
}
