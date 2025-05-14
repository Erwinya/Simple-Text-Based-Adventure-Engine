package com.halukkilincer.adventure.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GameFrame extends JFrame {
    private JPanel contentPane;
    private CardLayout cardLayout;

    public GameFrame() {
        setTitle("Adventure Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);

        contentPane = new JPanel();
        cardLayout = new CardLayout();
        contentPane.setLayout(cardLayout);
        setContentPane(contentPane);

        initializeComponents();
    }

    private void initializeComponents() {
        contentPane.add(createLoginPanel(), "login");
        contentPane.add(createMenuPanel(), "menu");
        contentPane.add(createGamePanel(), "game");
        contentPane.add(createBattlePanel(), "battle");
        contentPane.add(createInventoryPanel(), "inventory");
        contentPane.add(createShopPanel(), "shop");
        contentPane.add(createStatsPanel(), "stats");
    }

    public void startGame() {
        try {
            initializeComponents();
            pack();
            setLocationRelativeTo(null);
            setVisible(true);
            login();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Oyun başlatılırken bir hata oluştu: " + e.getMessage());
            exitGame();
        }
    }


    public void login() {
        showPanel("login");
    }

    public void exitGame() {

        dispose();

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void showMenu() {
        showPanel("menu");
    }

    public void showGame() {
        showPanel("game");
    }

    public void showGameOver() {
        JOptionPane.showMessageDialog(this, "Game Over!");
        showMenu();
    }

    public void showWin() {
        JOptionPane.showMessageDialog(this, "You Won!");
        showMenu();
    }

    public void showLose() {
        JOptionPane.showMessageDialog(this, "You Lost!");
        showMenu();
    }

    public void showInventory() {
        showPanel("inventory");
    }

    public void showStats() {
        showPanel("stats");
    }

    public void showShop() {
        showPanel("shop");
    }

    public void showBattle() {
        showPanel("battle");
    }

    private void showPanel(String panelName) {
        cardLayout.show(contentPane, panelName);
    }

    private static final String CARD_LOGIN = "login";
    private static final String CARD_MENU = "menu";


private JPanel createLoginPanel() {
    JPanel panel = new JPanel(new GridBagLayout());
    GridBagConstraints gbc = new GridBagConstraints();
    
    JTextField usernameField = new JTextField(20);
    JPasswordField passwordField = new JPasswordField(20);
    JButton loginButton = new JButton("Login");
    
        loginButton.addActionListener(e -> {
            if ("admin".equals(usernameField.getText()) && "password".equals(new String(passwordField.getPassword()))) {
                showMenu();
            } else {
                JOptionPane.showMessageDialog(this, "Geçersiz kullanıcı adı veya şifre");
            }
        });

    
    return panel;
}

    private JPanel createMenuPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());

        JButton startButton = new JButton("Start Game");
        JButton exitButton = new JButton("Exit");

        startButton.addActionListener(e -> showGame());
        exitButton.addActionListener(e -> exitGame());

        panel.add(startButton);
        panel.add(exitButton);

        return panel;
    }

    private JPanel createGamePanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JButton battleButton = new JButton("Battle");
        JButton inventoryButton = new JButton("Inventory");
        JButton shopButton = new JButton("Shop");
        JButton statsButton = new JButton("Stats");

        battleButton.addActionListener(e -> showBattle());
        inventoryButton.addActionListener(e -> showInventory());
        shopButton.addActionListener(e -> showShop());
        statsButton.addActionListener(e -> showStats());

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(battleButton);
        buttonPanel.add(inventoryButton);
        buttonPanel.add(shopButton);
        buttonPanel.add(statsButton);

        panel.add(buttonPanel, BorderLayout.SOUTH);

        return panel;
    }

    private JPanel createBattlePanel() {
        JPanel panel = new JPanel();

        JButton attackButton = new JButton("Attack");
        JButton defendButton = new JButton("Defend");
        JButton fleeButton = new JButton("Flee");

        attackButton.addActionListener(e -> {

        });

        defendButton.addActionListener(e -> {

        });

        fleeButton.addActionListener(e -> showGame());

        panel.add(attackButton);
        panel.add(defendButton);
        panel.add(fleeButton);

        return panel;
    }

    private JPanel createInventoryPanel() {
        JPanel panel = new JPanel();

        JButton backButton = new JButton("Back");
        backButton.addActionListener(e -> showGame());

        panel.add(backButton);

        return panel;
    }

    private JPanel createShopPanel() {
        JPanel panel = new JPanel();

        JButton buyButton = new JButton("Buy");
        JButton sellButton = new JButton("Sell");
        JButton backButton = new JButton("Back");

        backButton.addActionListener(e -> showGame());

        panel.add(buyButton);
        panel.add(sellButton);
        panel.add(backButton);

        return panel;
    }

    private JPanel createStatsPanel() {
        JPanel panel = new JPanel();

        JButton backButton = new JButton("Back");
        backButton.addActionListener(e -> showGame());

        panel.add(backButton);

        return panel;
    }
}