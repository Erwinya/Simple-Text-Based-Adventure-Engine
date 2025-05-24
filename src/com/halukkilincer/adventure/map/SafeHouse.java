package com.halukkilincer.adventure.map;
import java.util.Scanner;

import com.halukkilincer.adventure.characters.Player;
import com.halukkilincer.adventure.utils.NormalLoc;
public class SafeHouse extends NormalLoc {
	Scanner scanner = new Scanner(System.in);
	private final int getFirstHealth;

	public SafeHouse(Player player, String name) {
		super(player, name);
		this.getFirstHealth = player.getFirstHealth();
	}

	@Override
	public boolean getLocation() throws InterruptedException {

		System.out
				.println("Evin sıcaklığını hissediyorsun.. \nSavaşın acımasız soğuğuna karşı burası senin tek sığınağın. "
						+ "Birkaç saatlik huzur, yaralarını iyileştirecek, gücünü yeniden toparlayacak tek yer..");
		Thread.sleep(3000);
		System.out.println("Kahramanın iyileşmesi için zamana ihtiyacı var. "
				+ "Onun yaralarını iyileştirmesine gücünü yeniden toplamasına izin ver...(lütfen bekleyiniz..)");
		Thread.sleep(3000);
		getPlayer().setHealth(getFirstHealth);
		System.out.println("Kahramanın kendini yeniden doğmuş gibi hissediyor.\n" + "HP :" + getPlayer().getHealth());
		System.out.print(
                "\t1- Savaş meydanına git ---------->>>\n" + "\t2- Ghua Pazarına git   ---------->>>\n" + 
		"\t3-Menüye dön           ---------->>>\n" +
                        "Ne yapmak istiyorsun ? : ");
		String inputMarketChoice = scanner.nextLine();
        switch (inputMarketChoice) {
            case "1": {
            	Thread.sleep(3000);
                System.out.print("Savaş Meydanına gidiliyor..");
                Thread.sleep(1500);
                return false;
            }
            case "2": {
            	Thread.sleep(3000);
                System.out.println("Ghua Pazarına gidiliyor..");
                NormalLoc toolStore = new ToolStore(getPlayer(), getName());
                toolStore.getLocation();
                Thread.sleep(1500);
                break; 
            }
            case "3": {
            	Thread.sleep(3000);
                System.out.println("Menüye dönülüyor...");
                Thread.sleep(1500);
                break; 
            }
            default:
                System.out.println("Hatalı tuşlama yaptınız..");
                Thread.sleep(1500);
                return false; 
	}
		return false;
	}
}
