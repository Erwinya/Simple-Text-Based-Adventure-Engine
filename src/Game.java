import java.util.Scanner;

public class Game {
	Player player = new Player();
	Scanner scanner = new Scanner(System.in);
	

	public void login() throws InterruptedException {
		
		System.out.println("Macera Oyununa Hoşgeldiniz...");
		System.out.print("Oyuncu isminizi Giriniz : ");
	    String playerName = scanner.nextLine();
	    
	    player.setName(playerName);
	  
	    System.out.println("Karakter isminiz oluşturuluyor...");
	    Thread.sleep(3000);
	    
	    selectChar();
	}
	public void selectChar() throws InterruptedException {
		
		System.out.println("Merhaba " + player.getName());
		System.out.print("Bir zamanlar Aetheria adlı kadim topraklarda, dört kahraman, "
				+ "dünyanın kaderini değiştirecek bir yolculuğa çıkmaya ant içmişti.\r\n"+
			
				 "\t Warrior (HP:1500 Def:750 Attack:3100)\n"
				+ "Demir zırhı ve devasa baltasıyla, düşman ordularını tek başına devirebilecek kadar kudretliydi.\n"
				+ "Onun gücü, savaş meydanında yankılanan öfkeli kükreyişinde saklıydı.\n"
				+ "\t Rogue (HP:1200 Def:450 Attack:4200)\n"
				+ "Gölgelerin ustasıydı. Hızlı ve sessiz hareketleriyle düşmanlarını farkına varmadan saf dışı bırakırdı.\n "
				+ "Dagger'larının soğuk çeliği, bir anlık tereddütü bile affetmezdi.\n"
				+ "\t Magician (HP:800 Def:250 Attack:5500)\n"
				+ "Kadim büyülerin sırlarını keşfetmişti. Ateş fırtınaları yaratabilir, düşmanlarını dondurabilir ya da zamanı yavaşlatabilirdi.\n "
				+ "Onun gücü, bilgelik ve sezgiyle besleniyordu.\n"
				+ "\t Priest (HP:1700 Def:850 Attack:2300)\n"
				+ "Kutsal ışığın savaşçısıydı. Yaralıları iyileştirir, lanetleri bozar ve müttefiklerini korurdu.\n "
				+ "Ona dokunan her varlık, içindeki iyiliğin sıcaklığını hissederdi.\r\n"
				+"Bir gün, Void Lord adlı karanlık bir varlık Aetheria’yı yok etmeye ant içti. Kutsal Ebedi Kristal, "
				+ "onun kötülüğünü durdurabilecek tek güçtü.\n "
				+ "Dört kahraman, bu kadim kristali korumak ve Void Lord’u sonsuz karanlığa mühürlemek için güçlerini birleştirdi.\r\n"
				+ "Ancak onların zaferi sadece kılıçlar ve büyülerle değil, birliktelik ve sadakatle mümkün olacaktı…\r\n"
				+ "Şimdi, senin hikayen nasıl devam edecek? 🚀\r\n"	);
		int tryTime = 5; // Maksimum deneme hakkı

		while (tryTime > 0) {

			System.out.print("Lütfen karakter seçimi yapınız : ");
			String selectCharInput = scanner.nextLine();
			String eLCase = selectCharInput.toLowerCase();
			
			if (eLCase.equals("warrior") || eLCase.equals("rogue")
					|| eLCase.equals("magician") || eLCase.equals("priest")) {
				player.setCharName(eLCase);
				
				System.out.println("Karakteriniz hazırlanıyor...");
			    Thread.sleep(3000);
				break;
			}else {
				
			        tryTime--; // Yanlış seçimde deneme hakkını azalt
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
			}
	public void startGame() throws InterruptedException {
		
		System.out.println("Aetheria, son umudunu " + player.getName() + " isimli kahramana bağlamıştı. "
				+ "Şimdi, kaderin kalemi senin ellerinde... Kahramanın yolculuğu başlıyor! 🚀✨\r\n"
				);
		
		Thread.sleep(3000);
		
	   gameMenu();
		
	}
	public void gameMenu() throws InterruptedException {
		String gameMenuStringFirst = ("\tGecenin derin sessizliği, kadim topraklarda yankılanıyor.\n" 
				+"Fırtına yaklaşırken, savaşın gölgesi giderek büyüyor.\n" 
				+"Ancak kaderin yazılacağı bu anda, seçim senin ellerinde…\n"
				+"\t🏠 1. Eve Dön ve Dinlen\n"
				+"Zırhın yıpranmış, bedenin yara içinde olabilir.\n"
				+"Evin sıcaklığı, savaşın acımasız soğuğuna karşı tek sığınağın.\n"
				+ "Birkaç saatlik huzur, yaralarını iyileştirecek, gücünü yeniden toparlayacak.\n"
				+ "Belki de rüyalarında geleceğin ipuçlarını göreceksin…\n"
				+"\t🛒 2. Mağazaya Git ve Destansı Eşyalar Satın Al\n"
				+"Kaderini şekillendirecek silahlar burada.\n"
				+ "Altınlarını sayarken, raflarda parlayan kutsal kılıçlar,\n"
				+ "büyülü tılsımlar ve efsanevi zırhlar seni bekliyor.\n"
				+ "Doğru seçim, gelecekteki savaşını kazanmana yardımcı olacak.\n"
				+ "Ancak dikkatli ol ! her eşyanın bir bedeli var.\n"
				+"\t⚔️ 3. Savaş Meydanına Çık ve Karanlık Canavarlarla Yüzleş !\n"
				+"Karanlığın güçleri artık durdurulamaz hale geldi.\n"
				+"Savaş meydanında bekleyen yaratıklar,\n"
				+ "korkunun vücut bulmuş hali. Çelik gibi sert durmalı,\n"
				+ "büyünün gücüne güvenmeli ve sadık ruhunu korumalısın.\n"
				+ "Burada yenilgi, unutulmaya yüz tutmuş bir kahraman demek…\n"
				+ "Ama zafer? İşte o, tarihin satırlarına yazılacak.\n"
				+"\tVe şimdi… Hikayen nasıl devam edecek? 🚀✨(1-2-3 arasında seçim yapabilirsin)\n"
				+ "\t\tOyundan çıkmak için q tuşuna basabilirsin.\n"
				+ "Tercihin nedir ? : ");
				System.out.print(gameMenuStringFirst);
				String inputChoiceMenu = scanner.nextLine();
		
		while (true) {
			
				   String gameMenuStringSecond = ("\n\t🏠 1. Eve Dön ve Dinlen\n\r\n"
						 
				   		+ "\tZırhın yıpranmış, bedenin yara içinde olabilir.\n\r"
				   		+ "\tEvin sıcaklığı, savaşın acımasız soğuğuna karşı tek sığınağın.\n\r"
				   		+ "\tBirkaç saatlik huzur, yaralarını iyileştirecek, gücünü yeniden toparlayacak.\n\r"
				   		+ "\tBelki de rüyalarında geleceğin ipuçlarını göreceksin…\n\r"
				   		+ "\t🛒 2. Mağazaya Git ve Destansı Eşyalar Satın Al\n\r\n"
				   		+"\tKaderini şekillendirecek silahlar burada.\n\r"
				   		+"\tAltınlarını sayarken, raflarda parlayan kutsal kılıçlar,\n\r"
				   		+"\tbüyülü tılsımlar ve efsanevi zırhlar seni bekliyor.\n\r"
				   		+"\tDoğru seçim, gelecekteki savaşını kazanmana yardımcı olacak.\n\r"
				   		+"\tAncak dikkatli ol ! her eşyanın bir bedeli var.\n\r"
				   		+"\t⚔️ 3. Savaş Meydanına Çık ve Karanlık Canavarlarla Yüzleş !\n\r\n"
				   		+"\tKaranlığın güçleri artık durdurulamaz hale geldi.\n\r"
				   		+"\tSavaş meydanında bekleyen yaratıklar,\n\r"
				   		+"\tkorkunun vücut bulmuş hali. Çelik gibi sert durmalı,\n\r"
				   		+"\tbüyünün gücüne güvenmeli ve sadık ruhunu korumalısın.\n\r"
				   		+"\tBurada yenilgi, unutulmaya yüz tutmuş bir kahraman demek…\n\r"
				   		+"\tAma zafer? İşte o, tarihin satırlarına yazılacak.\n\r"
				   		+"\tVe şimdi… Hikayen nasıl devam edecek? 🚀✨(1-2-3 arasında seçim yapabilirsin)\n\r\n"
				   		+"\t\tOyundan çıkmak için q tuşuna basabilirsin.\n\r\n"
				   		+"Tercihin nedir ? : " );
				   String inputChoiceMenu2 = scanner.nextLine();
				   
				  
				   if (player.getCharName() == null || player.getCharName().isEmpty()) {
					    System.out.println("Karakter adı belirlenmedi! Önce karakter seçmelisiniz.");
					    return;
					    
					}
				   SafeHouse safeHouseLocation = new SafeHouse(player); 
				  
					
					switch (inputChoiceMenu) {
					case "1" -> {
						Thread.sleep(1000);
						System.out.println("Güvenli Eve gidildi..");
						Thread.sleep(3000);
						safeHouseLocation.getLocation();
						Thread.sleep(3000);
						if (!safeHouseLocation.getLocation()) {
							System.out.println("✨✨✨ Oyun bitti !✨✨✨");
							System.exit(0);
						}
						
					
					}
					
					case "2" -> {	
						Thread.sleep(3000);
					System.out.println("mağazaya gidildi");
					}
					
					case "3" -> {
						Thread.sleep(3000);
					System.out.println("savaş haritasına gidildi");
					}
					
					case "q" -> {
						Thread.sleep(3000);
					System.out.println("oyundan çıkış yapılıyor");
					 System.exit(0);
					}
					
					default  -> {
						Thread.sleep(3000);
						System.out.println("Geçersiz giriş yapıldı. Tekrar deneyin.");
						
					
					}}
				
					
				}
				
				
		}
		}




			
			
			
			
		
		
		
	
	

