package com.halukkilincer.adventure.map;

import com.halukkilincer.adventure.characters.Player;
import com.halukkilincer.adventure.utils.BattleLoc;
import com.halukkilincer.adventure.utils.Obstacle;
import com.halukkilincer.adventure.utils.monsters.EasyLevelMonster_1;

public class BasicLevelBattleMap extends BattleLoc {

	BasicLevelBattleMap(Player player) {
		super(player, "Karanlık Uçurum", new EasyLevelMonster_1());
		
		
	}

}
