package com.halukkilincer.adventure.Launcher;

import com.halukkilincer.adventure.engine.Game;
import com.halukkilincer.adventure.ui.GameFrame;

/**
 *
 * @author Erwinya /halukkilincer/
 */

public class Main {

	public static void main(String[] args) {
		
		try (Game game = new Game()) {
			game.login();
			game.startGame();
		} catch (InterruptedException e) {
			System.err.println("Game was interrupted: " + e.getMessage());
			Thread.currentThread().interrupt();
		} catch (Exception e) {
			System.err.println("An error occurred: " + e.getMessage());
		}

			/*

		GameFrame gameFrame = new GameFrame();
		gameFrame.setVisible(true);
		gameFrame.setLocationRelativeTo(null);
		gameFrame.setResizable(false);
		gameFrame.setDefaultCloseOperation(GameFrame.EXIT_ON_CLOSE);
		gameFrame.setTitle("Macera Oyunu");
		gameFrame.setIconImage(gameFrame.getIconImage());
		gameFrame.setFocusable(true);
		gameFrame.requestFocus();
		gameFrame.setFocusTraversalKeysEnabled(false);
		gameFrame.startGame();
*/


	}


}
