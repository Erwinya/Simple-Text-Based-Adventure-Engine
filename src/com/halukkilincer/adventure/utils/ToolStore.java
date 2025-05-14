package com.halukkilincer.adventure.utils;

import com.halukkilincer.adventure.characters.Player;

import java.util.Scanner;

public class ToolStore extends NormalLoc {

    private final Scanner scanner;

    public ToolStore(Player player, String name) {
        super(player,  player.getName());
        this.scanner = new Scanner(System.in);
    }

    @Override
    public boolean getLocation() throws InterruptedException {
        System.out.println("Merhaba karanlık diyarların gizli ticaret merkezi Ghua Pazarındasın..");
        System.out.println("Coin : " + getPlayer().getMoneyStart());
        System.out.print(
                "\t1- Silahlar  q"
                + "---------->>>\n" + "\t2- Zırhlar   ----------->>>\n" + "\t3-Menüye dön ----------->>>\n" +
                        "Ne yapmak istiyorsun ? : ");
        String inputMarketChoice = scanner.nextLine();
        switch (inputMarketChoice) {
            case "1": {
                System.out.println("Elimizde olan silahları senin için hazırladık. Istediğini seçebilirsin "
                        + "Aetherianın son yüce kahramanı " + getPlayer().getName());

                break;

            }
            case "2": {
                System.out.println("Elimizde olan zırhları senin için hazırladık. Istediğini seçebilirsin "
                        + "Aetherianın son yüce kahramanı" + getPlayer().getName());

                break;

            }
            case "3": {
                System.out.println("Menüye dönülüyor...");
                Thread.sleep(1500);
                break; 
            }
            default:
                System.out.println("Hatalı tuşlama yaptınız..");
                break; 
        }
        return true;
    }

}
