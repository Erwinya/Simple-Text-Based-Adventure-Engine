package com.halukkilincer.adventure.engine;

import com.halukkilincer.adventure.characters.*;
import com.halukkilincer.adventure.map.*;
import com.halukkilincer.adventure.ui.GameUI;
import com.halukkilincer.adventure.utils.GameLogger;
import com.halukkilincer.adventure.utils.GameSaveManager;
import com.halukkilincer.adventure.utils.Location;

import java.util.Scanner;

public class Game implements AutoCloseable {
	private AbstractCharacter player;
	private final Scanner scanner;
	private boolean isRunning;

	public Game() {
		this.scanner = new Scanner(System.in);
		this.isRunning = true;
	}

<<<<<<< HEAD
	public void selectChar() throws InterruptedException {

		System.out.println("Merhaba " + player.getName());
		System.out.print("Bir zamanlar Aetheria adlı kadim topraklarda, dört kahraman, "
				+ "dünyanın kaderini değiştirecek bir yolculuğa çıkmaya ant içmişti.\r\n" +

				"\t Savaşçı (HP:1500 Def:750 Attack:3100)\n"
				+ "Demir zırhı ve devasa baltasıyla, düşman ordularını tek başına devirebilecek kadar kudretliydi.\n"
				+ "Onun gücü, savaş meydanında yankılanan öfkeli kükreyişinde saklıydı.\n"
				+ "\t Suikastçı (HP:1200 Def:450 Attack:4200)\n"
				+ "Gölgelerin ustasıydı. Hızlı ve sessiz hareketleriyle düşmanlarını farkına varmadan saf dışı bırakırdı.\n "
				+ "Dagger'larının soğuk çeliği, bir anlık tereddütü bile affetmezdi.\n"
				+ "\t Büyücü (HP:800 Def:250 Attack:5500)\n"
				+ "Kadim büyülerin sırlarını keşfetmişti. Ateş fırtınaları yaratabilir, düşmanlarını dondurabilir ya da zamanı yavaşlatabilirdi.\n "
				+ "Onun gücü, bilgelik ve sezgiyle besleniyordu.\n" 
				+ "\t Şifacı (HP:1700 Def:850 Attack:2300)\n"
				+ "Kutsal ışığın savaşçısıydı. Yaralıları iyileştirir, lanetleri bozar ve müttefiklerini korurdu.\n "
				+ "Ona dokunan her varlık, içindeki iyiliğin sıcaklığını hissederdi.\r\n"
				+ "Bir gün, Void Lord adlı karanlık bir varlık Aetheria'yı yok etmeye ant içti. Kutsal Ebedi Kristal, "
				+ "onun kötülüğünü durdurabilecek tek güçtü.\n "
				+ "Dört kahraman, bu kadim kristali korumak ve Void Lord'u sonsuz karanlığa mühürlemek için güçlerini birleştirdi.\r\n"
				+ "Ancak onların zaferi sadece kılıçlar ve büyülerle değil, birliktelik ve sadakatle mümkün olacaktı…\r\n"
				+ "Şimdi, senin hikayen nasıl devam edecek? 🚀\r\n");
		int tryTime = 5; // Maksimum deneme hakkı

		while (tryTime > 0) {

			System.out.print("Lütfen karakter seçimi yapınız : ");
			String selectCharInput = scanner.nextLine();
			String eLCase = selectCharInput.toLowerCase();

			if (eLCase.equals("savaşçı") || eLCase.equals("suikastçı") || eLCase.equals("büyücü")
					|| eLCase.equals("şifacı")) {
				player.setCharName(eLCase);

				System.out.println("Karakteriniz hazırlanıyor...");
				Thread.sleep(3000);
				break;
			} else {

				tryTime--; 
				if (tryTime == 0) {
					System.out.println("Çok fazla yanlış deneme yaptınız. Menüye yönlendiriliyorsunuz..");
					break;
				} else {
					System.out.println("Hatalı seçim yaptınız. Kalan deneme hakkınız: " + tryTime);
				}

			}

		}
		player.initializeCharacter();
		startGame();
=======
	public void start() throws InterruptedException {
		initializeGame();
		gameLoop();
>>>>>>> b4e5e80 (Refactor and reorganize game architecture)
	}

	private void initializeGame() throws InterruptedException {
		// Load saved game if exists
		if (GameSaveManager.saveExists()) {
			System.out.println("\nKaydedilmiş oyun bulundu. Yüklemek ister misiniz? (E/H)");
			if (scanner.nextLine().equalsIgnoreCase("E")) {
				loadGame();
				return;
			}
		}

		// Create new game
		String playerName = GameUI.getPlayerName();
		String characterChoice = GameUI.showCharacterSelection();
		
<<<<<<< HEAD
		if (player.getCharName() == null || player.getCharName().isEmpty()) {
			System.out.println("Karakter adı belirlenmedi! Önce karakter seçmelisiniz.");
			return;
=======
		switch (characterChoice.toLowerCase()) {
			case "s" -> player = new Warrior(playerName);
			case "a" -> player = new Assassin(playerName);
			case "b" -> player = new Mage(playerName);
			case "h" -> player = new Healer(playerName);
			case "q" -> {
				isRunning = false;
				return;
			}
			default -> {
				System.out.println("Geçersiz karakter seçimi! Oyun kapatılıyor...");
				isRunning = false;
				return;
			}
		}

		GameLogger.log("New game started with character: " + player.getCharacterType());
		System.out.println(player.getDescription());
		Thread.sleep(3000);
	}

	private void gameLoop() throws InterruptedException {
		while (isRunning) {
			String choice = GameUI.showMainMenu();
			Location location = null;

			switch (choice) {
				case "1" -> location = new SafeHouse(player);
				case "2" -> location = new ToolStore(player);
				case "3" -> location = new ShadowForest(player);
				case "4" -> location = new DarkCaverns(player);
				case "5" -> location = new VoidRealmPortal(player);
				case "6" -> saveGame();
				case "q" -> {
					System.out.println("\n�� Oyundan çıkış yapılıyor...");
					isRunning = false;
					return;
				}
				default -> {
					System.out.println("\n❌ Geçersiz seçim!");
					continue;
				}
			}

			if (location != null) {
				if (!location.getLocation()) {
					System.out.println("\n💀 Oyun Bitti!");
					isRunning = false;
					return;
				}
			}
>>>>>>> b4e5e80 (Refactor and reorganize game architecture)
		}
	}

<<<<<<< HEAD
		switch (inputChoiceMenu) {
			case "1" -> {
				SafeHouse safeHouseLocation = new SafeHouse(player, player.getName());
				Thread.sleep(3000);
				System.out.println("Güvenli Eve gidiliyor..");
				Thread.sleep(3000);
				safeHouseLocation.getLocation();
			}
			case "2" -> {
				Thread.sleep(3000);
				System.out.println("mağazaya gidiliyor..");
				Thread.sleep(3000);
				ToolStore toolStoreLocation = new ToolStore(player, player.getName());
				toolStoreLocation.getLocation();
			}
			case "3" -> {
				Thread.sleep(3000);
				System.out.println("savaş bölgesine gidildi");
			}
			case "q" -> {
				Thread.sleep(3000);
				System.out.println("oyundan çıkış yapılıyor");
			}
			default -> {
				Thread.sleep(3000);
				System.out.println("Geçersiz giriş yapıldı. Tekrar deneyin.");
			}
=======
	private void saveGame() {
		try {
			GameSaveManager.saveGame(player);
			System.out.println("\n✨ Oyun başarıyla kaydedildi!");
		} catch (Exception e) {
			System.out.println("\n❌ Oyun kaydedilemedi: " + e.getMessage());
			GameLogger.logError("Failed to save game", e);
		}
	}

	private void loadGame() {
		try {
			GameSaveManager.loadGame(player);
			System.out.println("\n✨ Oyun başarıyla yüklendi!");
		} catch (Exception e) {
			System.out.println("\n❌ Oyun yüklenemedi: " + e.getMessage());
			GameLogger.logError("Failed to load game", e);
			isRunning = false;
>>>>>>> b4e5e80 (Refactor and reorganize game architecture)
		}
	}

	@Override
	public void close() {
		if (scanner != null) {
			scanner.close();
		}
		GameLogger.log("Game closed");
	}
}



