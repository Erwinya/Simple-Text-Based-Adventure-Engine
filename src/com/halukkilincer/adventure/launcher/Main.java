package com.halukkilincer.adventure.launcher;

import com.halukkilincer.adventure.engine.Game;
import com.halukkilincer.adventure.ui.GameFrame;
import javax.swing.SwingUtilities;
import java.util.logging.Logger;
import java.util.logging.Level;

public class Main {
    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try (Game game = new Game()) {
                game.login();
                game.startGame();
            } catch (InterruptedException e) {
                LOGGER.log(Level.SEVERE, "Oyun kesintiye uğradı", e);
                Thread.currentThread().interrupt();
            } catch (Exception e) {
                LOGGER.log(Level.SEVERE, "Beklenmeyen bir hata oluştu", e);
            }
        });
    }
}