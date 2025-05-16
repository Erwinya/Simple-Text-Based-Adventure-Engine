package com.halukkilincer.adventure.map;

import com.halukkilincer.adventure.characters.Player;
import com.halukkilincer.adventure.utils.NormalLoc;

import java.util.Scanner;

public class ToolStore extends NormalLoc {

     Scanner scanner = new Scanner(System.in);

    public ToolStore(Player player, String name) {
        super(player,  player.getName());
        ///2 DEFA GIRILDIGI ZAMAN DONGUDEN CIKIYOR MENUYE DONMUYOR !!!!
    }

    @Override
    public boolean getLocation() throws InterruptedException {
        System.out.println("Merhaba karanlık diyarların gizli ticaret merkezi Ghua Pazarındasın..");
        System.out.println("Coin : " + getPlayer().getMoneyStart());
        System.out.print(
                "\t1- Silahlar  ----------->>>\n" + "\t2- Zırhlar   ----------->>>\n" + "\t3-Menüye dön ----------->>>\n" +
                        "Ne yapmak istiyorsun ? : ");
        String inputMarketChoice = scanner.nextLine();
        switch (inputMarketChoice) {
            case "1": {
                System.out.println("\t\nElimizde olan silahları senin için hazırladık.\nIstediğini seçebilirsin "
                        + "\nAetherianın son yüce kahramanı " + getPlayer().getName());
                Thread.sleep(1500);
               
                if (getPlayer().getCharName().equals("savaşçı")) {
					System.out.println(weaponMenuForWarrior());
					System.out.print("Tercihin nedir? : ");
					String choiceWeaponString = scanner.nextLine();
					switch (choiceWeaponString) {
					case "1" ->{
						if (getPlayer().getMoney() > 150) {
							getPlayer().setMoney(getPlayer().getMoney()-150);
							getPlayer().getInventory().setCharWeapon(250);
							Thread.sleep(1500);
							getPlayer().getTotalDamage();
							System.out.println("Ateşin Nefesi Kılıcı artık senin!\n");
							System.out.println("Yeninlenmiş Attack : " + getPlayer().getDamage());
							Thread.sleep(1500);
							System.out.println("Kalan altın : "+getPlayer().getMoney());
							Thread.sleep(3000);
							System.out.println("Menüye dönülüyor..");
						}else {
							Thread.sleep(1500);
							System.out.println("Altın yetersiz..");
							break;
						}
						
						
					}case "2" ->{
						if (getPlayer().getMoney() > 250) {
							getPlayer().setMoney(getPlayer().getMoney()-250);
							getPlayer().getInventory().setCharWeapon(400);
							Thread.sleep(1500);
							getPlayer().getTotalDamage();
							System.out.println("Yıldırımın Öfkesi Baltası artık senin!\n");
							System.out.println("Yeninlenmiş Attack : " + getPlayer().getDamage());
							Thread.sleep(1500);
							System.out.println("Kalan altın : "+getPlayer().getMoney());
							Thread.sleep(3000);
							System.out.println("Menüye dönülüyor..");
						}else {
							Thread.sleep(1500);
							System.out.println("Altın yetersiz..");
							break;
						}
					}case "3" ->{
						if (getPlayer().getMoney() > 450) {
							getPlayer().setMoney(getPlayer().getMoney()-450);
							getPlayer().getInventory().setCharWeapon(750);
							Thread.sleep(1500);
							getPlayer().getTotalDamage();
							System.out.println("Gölgelerin Fısıldadığı Gürz artık senin!\n");
							System.out.println("Yeninlenmiş Attack : " + getPlayer().getDamage());
							Thread.sleep(1500);
							System.out.println("Kalan altın : "+getPlayer().getMoney());
							Thread.sleep(3000);
							System.out.println("Menüye dönülüyor..");
						}else {
							Thread.sleep(1500);
							System.out.println("Altın yetersiz..");
							break;
						}
					}case "4" ->{
						if (getPlayer().getMoney() > 650) {
							getPlayer().setMoney(getPlayer().getMoney()-650);
							getPlayer().getInventory().setCharWeapon(1175);
							Thread.sleep(1500);
							getPlayer().getTotalDamage();
							System.out.println("Kaderin Kıranışı Çekici artık senin!\n");
							System.out.println("Yeninlenmiş Attack : " + getPlayer().getDamage());
							Thread.sleep(1500);
							System.out.println("Kalan altın : "+getPlayer().getMoney());
							Thread.sleep(3000);
							System.out.println("Menüye dönülüyor..");
						}else {
							Thread.sleep(1500);
							System.out.println("Altın yetersiz..");
							break;
						}
					}case "5" ->{
						if (getPlayer().getMoney() > 900) {
							getPlayer().setMoney(getPlayer().getMoney()-900);
							getPlayer().getInventory().setCharWeapon(1750);
							Thread.sleep(1500);
							getPlayer().getTotalDamage();
							System.out.println("Zümrüt Gözü Mızrağı artık senin!\n");
							System.out.println("Yeninlenmiş Attack : " + getPlayer().getDamage());
							Thread.sleep(1500);
							System.out.println("Kalan altın : "+getPlayer().getMoney());
							Thread.sleep(3000);
							System.out.println("Menüye dönülüyor..");
						}else {
							Thread.sleep(1500);
							System.out.println("Altın yetersiz..");
							break;
						}
					}case "q" ->{
						break;
					}
					
					default->
						System.out.println("Hatalı tuşlama yaptınız");					}
					
				}else if (getPlayer().getCharName().equals("suikastçı")) {
					System.out.println(weaponMenuForRogue());
					System.out.print("Tercihin nedir? : ");
					String choiceWeaponString = scanner.nextLine();
					switch (choiceWeaponString) {
					case "1" ->{
						if (getPlayer().getMoney() > 200) {
							getPlayer().setMoney(getPlayer().getMoney()-200);
							getPlayer().getInventory().setCharWeapon(315);
							Thread.sleep(1500);
							getPlayer().getTotalDamage();
							System.out.println("Sinsi Rüzgar Kılıcı artık senin!\n");
							System.out.println("Yeninlenmiş Attack : " + getPlayer().getDamage());
							Thread.sleep(1500);
							System.out.println("Kalan altın : "+getPlayer().getMoney());
							Thread.sleep(3000);
							System.out.println("Menüye dönülüyor..");
						}else {
							Thread.sleep(1500);
							System.out.println("Altın yetersiz..");
							break;
						}
						
					}case "2" ->{
						if (getPlayer().getMoney() > 350) {
							getPlayer().setMoney(getPlayer().getMoney()-350);
							getPlayer().getInventory().setCharWeapon(450);
							Thread.sleep(1500);
							getPlayer().getTotalDamage();
							System.out.println("Sis Örtüsü Rapier artık senin!\n");
							System.out.println("Yeninlenmiş Attack : " + getPlayer().getDamage());
							Thread.sleep(1500);
							System.out.println("Kalan altın : "+getPlayer().getMoney());
							Thread.sleep(3000);
							System.out.println("Menüye dönülüyor..");
						}else {
							Thread.sleep(1500);
							System.out.println("Altın yetersiz..");
							break;
						}
					}case "3" ->{
						if (getPlayer().getMoney() > 500) {
							getPlayer().setMoney(getPlayer().getMoney()-500);
							getPlayer().getInventory().setCharWeapon(850);
							Thread.sleep(1500);
							getPlayer().getTotalDamage();
							System.out.println("Gölgelerin Fısıltısı Hançeri artık senin!\n");
							System.out.println("Yeninlenmiş Attack : " + getPlayer().getDamage());
							Thread.sleep(1500);
							System.out.println("Kalan altın : "+getPlayer().getMoney());
							Thread.sleep(3000);
							System.out.println("Menüye dönülüyor..");
						}else {
							Thread.sleep(1500);
							System.out.println("Altın yetersiz..");
							break;
						}
					}case "4" ->{
						if (getPlayer().getMoney() > 750) {
							getPlayer().setMoney(getPlayer().getMoney()-750);
							getPlayer().getInventory().setCharWeapon(1350);
							Thread.sleep(1500);
							getPlayer().getTotalDamage();
							System.out.println("Karanlığın Suskunu Tabancası artık senin!\n");
							System.out.println("Yeninlenmiş Attack : " + getPlayer().getDamage());
							Thread.sleep(1500);
							System.out.println("Kalan altın : "+getPlayer().getMoney());
							Thread.sleep(3000);
							System.out.println("Menüye dönülüyor..");
						}else {
							Thread.sleep(1500);
							System.out.println("Altın yetersiz..");
							break;
						}
					}case "5" ->{
						if (getPlayer().getMoney() > 1150) {
							getPlayer().setMoney(getPlayer().getMoney()-1150);
							getPlayer().getInventory().setCharWeapon(2100);
							Thread.sleep(1500);
							getPlayer().getTotalDamage();
							System.out.println("Gecenin Yankısı Bıçağı artık senin!\n");
							System.out.println("Yeninlenmiş Attack : " + getPlayer().getDamage());
							Thread.sleep(1500);
							System.out.println("Kalan altın : "+getPlayer().getMoney());
							Thread.sleep(3000);
							System.out.println("Menüye dönülüyor..");
						}else {
							Thread.sleep(1500);
							System.out.println("Altın yetersiz..");
							break;
						}
					}case "q" ->{
						break;
					}
					
					default->
						System.out.println("Hatalı tuşlama yaptınız");					}
					
				}else if (getPlayer().getCharName().equals("büyücü")) {
					System.out.println(weaponMenuForMagician());
					System.out.print("Tercihin nedir? : ");
					String choiceWeaponString = scanner.nextLine();
					switch (choiceWeaponString) {
					case "1" ->{
						if (getPlayer().getMoney() > 350) {
							getPlayer().setMoney(getPlayer().getMoney()-350);
							getPlayer().getInventory().setCharWeapon(570);
							Thread.sleep(1500);
							getPlayer().getTotalDamage();
							System.out.println("Sırlı Element Asası artık senin!\n");
							System.out.println("Yeninlenmiş Attack : " + getPlayer().getDamage());
							Thread.sleep(1500);
							System.out.println("Kalan altın : "+getPlayer().getMoney());
							Thread.sleep(3000);
							System.out.println("Menüye dönülüyor..");
						}else {
							Thread.sleep(1500);
							System.out.println("Altın yetersiz..");
							break;
						}
					}case "2" ->{
						if (getPlayer().getMoney() > 550) {
							getPlayer().setMoney(getPlayer().getMoney()-550);
							getPlayer().getInventory().setCharWeapon(750);
							Thread.sleep(1500);
							getPlayer().getTotalDamage();
							System.out.println("Göksel Işığın Değneği artık senin!\n");
							System.out.println("Yeninlenmiş Attack : " + getPlayer().getDamage());
							Thread.sleep(1500);
							System.out.println("Kalan altın : "+getPlayer().getMoney());
							Thread.sleep(3000);
							System.out.println("Menüye dönülüyor..");
						}else {
							Thread.sleep(1500);
							System.out.println("Altın yetersiz..");
							break;
						}
					}case "3" ->{
						if (getPlayer().getMoney() > 800) {
							getPlayer().setMoney(getPlayer().getMoney()-800);
							getPlayer().getInventory().setCharWeapon(1100);
							Thread.sleep(1500);
							getPlayer().getTotalDamage();							System.out.println("Kozmik Bilgelik Tılsımı artık senin!\n");
							System.out.println("Yeninlenmiş Attack : " + getPlayer().getDamage());
							Thread.sleep(1500);
							System.out.println("Kalan altın : "+getPlayer().getMoney());
							Thread.sleep(3000);
							System.out.println("Menüye dönülüyor..");
						}else {
							Thread.sleep(1500);
							System.out.println("Altın yetersiz..");
							break;
						}
					}case "4" ->{
						if (getPlayer().getMoney() > 1200) {
							getPlayer().setMoney(getPlayer().getMoney()-1200);
							getPlayer().getInventory().setCharWeapon(1700);
							Thread.sleep(1500);
							getPlayer().getTotalDamage();							System.out.println("Zamanın Dokunuşu Kitabı artık senin!\n");
							System.out.println("Yeninlenmiş Attack : " + getPlayer().getDamage());
							Thread.sleep(1500);
							System.out.println("Kalan altın : "+getPlayer().getMoney());
							Thread.sleep(3000);
							System.out.println("Menüye dönülüyor..");
						}else {
							Thread.sleep(1500);
							System.out.println("Altın yetersiz..");
							break;
						}
					}case "5" ->{
						if (getPlayer().getMoney() > 1600) {
							getPlayer().setMoney(getPlayer().getMoney()-1600);
							getPlayer().getInventory().setCharWeapon(2400);
							Thread.sleep(1500);
							getPlayer().getTotalDamage();							System.out.println("Ruhların Yankısı Kristali artık senin!\n");
							System.out.println("Yeninlenmiş Attack : " + getPlayer().getDamage());
							Thread.sleep(1500);
							System.out.println("Kalan altın : "+getPlayer().getMoney());
							Thread.sleep(3000);
							System.out.println("Menüye dönülüyor..");
						}else {
							Thread.sleep(1500);
							System.out.println("Altın yetersiz..");
							break;
						}
					}case "q" ->{
						break;
					}
					
					default->
						System.out.println("Hatalı tuşlama yaptınız");					}
				}else if (getPlayer().getCharName().equals("şifacı")) {
					System.out.println(weaponMenuForPriest());
					System.out.print("Tercihin nedir? : ");
					String choiceWeaponString = scanner.nextLine();
					switch (choiceWeaponString) {
					case "1" ->{
						if (getPlayer().getMoney() > 100) {
							getPlayer().setMoney(getPlayer().getMoney()-100);
							getPlayer().getInventory().setCharWeapon(175);
							Thread.sleep(1500);
							getPlayer().getTotalDamage();							System.out.println("Mübarek Şifa Asası artık senin!\n");
							System.out.println("Yeninlenmiş Attack : " + getPlayer().getDamage());
							Thread.sleep(1500);
							System.out.println("Kalan altın : "+getPlayer().getMoney());
							Thread.sleep(3000);
							System.out.println("Menüye dönülüyor..");
						}else {
							Thread.sleep(1500);
							System.out.println("Altın yetersiz..");
							break;
						}
					}case "2" ->{
						if (getPlayer().getMoney() > 175) {
							getPlayer().setMoney(getPlayer().getMoney()-175);
							getPlayer().getInventory().setCharWeapon(275);
							Thread.sleep(1500);
							getPlayer().getTotalDamage();							System.out.println("Kutsal Çekiç artık senin!\n");
							System.out.println("Yeninlenmiş Attack : " + getPlayer().getDamage());
							Thread.sleep(1500);
							System.out.println("Kalan altın : "+getPlayer().getMoney());
							Thread.sleep(3000);
							System.out.println("Menüye dönülüyor..");
						}else {
							Thread.sleep(1500);
							System.out.println("Altın yetersiz..");
							break;
						}
					}case "3" ->{
						if (getPlayer().getMoney() > 300) {
							getPlayer().setMoney(getPlayer().getMoney()-300);
							getPlayer().getInventory().setCharWeapon(550);
							Thread.sleep(1500);
							getPlayer().getTotalDamage();							System.out.println("Işığın İncil Kılıcı artık senin!\n");
							System.out.println("Yeninlenmiş Attack : " + getPlayer().getDamage());
							Thread.sleep(1500);
							System.out.println("Kalan altın : "+getPlayer().getMoney());
							Thread.sleep(3000);
							System.out.println("Menüye dönülüyor..");
						}else {
							Thread.sleep(1500);
							System.out.println("Altın yetersiz..");
							break;
						}
					}case "4" ->{
						if (getPlayer().getMoney() > 450) {
							getPlayer().setMoney(getPlayer().getMoney()-450);
							getPlayer().getInventory().setCharWeapon(800);
							Thread.sleep(1500);
							getPlayer().getTotalDamage();							System.out.println("Ebedi Duaların Mızrağı artık senin!\n");
							System.out.println("Yeninlenmiş Attack : " + getPlayer().getDamage());
							Thread.sleep(1500);
							System.out.println("Kalan altın : "+getPlayer().getMoney());
							Thread.sleep(3000);
							System.out.println("Menüye dönülüyor..");
						}else {
							Thread.sleep(1500);
							System.out.println("Altın yetersiz..");
							break;
						}
					}case "5" ->{
						if (getPlayer().getMoney() > 750) {
							getPlayer().setMoney(getPlayer().getMoney()-750);
							getPlayer().getInventory().setCharWeapon(1100);
							Thread.sleep(1500);
							getPlayer().getTotalDamage();							System.out.println("Mesih'in Gözyaşı Kristali artık senin!\n");
							System.out.println("Yeninlenmiş Attack : " + getPlayer().getDamage());
							Thread.sleep(1500);
							System.out.println("Kalan altın : "+getPlayer().getMoney());
							Thread.sleep(3000);
							System.out.println("Menüye dönülüyor..");
						}else {
							Thread.sleep(1500);
							System.out.println("Altın yetersiz..");
							break;
						}
					}case "q" ->{
						break;
					}
					
					default->
						System.out.println("Hatalı tuşlama yaptınız");					}
				}
                break;

            }
            case "2": {
                System.out.println("Elimizde olan zırhları senin için hazırladık. Istediğini seçebilirsin "
                        + "Aetherianın son yüce kahramanı" + getPlayer().getName());
                if (getPlayer().getCharName().equals("savaşçı")) {
					System.out.println(armourMenuForWarrior());
					System.out.print("Tercihin nedir? : ");
					String choiceArmourString = scanner.nextLine();
					switch (choiceArmourString) {
					case "1" ->{
						if (getPlayer().getMoney() > 175) {
							getPlayer().setMoney(getPlayer().getMoney()-175);
							getPlayer().getInventory().setCharBodyArmour(300);
							Thread.sleep(1500);
							getPlayer().setDefense(getPlayer().getDefense()+getPlayer().getInventory().getCharBodyArmour());
							System.out.println("Titan Kale Zırhı artık senin!\n");
							System.out.println("Yeninlenmiş Defans : " + getPlayer().getDefense());
							Thread.sleep(1500);
							System.out.println("Kalan altın : "+getPlayer().getMoney());
							Thread.sleep(3000);
							System.out.println("Menüye dönülüyor..");
						}else {
							Thread.sleep(1500);
							System.out.println("Altın yetersiz..");
							break;
						}
					}case "2" ->{
						if (getPlayer().getMoney() > 315) {
							getPlayer().setMoney(getPlayer().getMoney()-315);
							getPlayer().getInventory().setCharBodyArmour(500);
							Thread.sleep(1500);
							getPlayer().setDefense(getPlayer().getDefense()+getPlayer().getInventory().getCharBodyArmour());							System.out.println("Ölüm dövücü Zırhı artık senin!\n");
							System.out.println("Yeninlenmiş Defans : " + getPlayer().getDefense());
							Thread.sleep(1500);
							System.out.println("Kalan altın : "+getPlayer().getMoney());
							Thread.sleep(3000);
							System.out.println("Menüye dönülüyor..");
						}else {
							Thread.sleep(1500);
							System.out.println("Altın yetersiz..");
							break;
						}
					}case "3" ->{
						if (getPlayer().getMoney() > 450) {
							getPlayer().setMoney(getPlayer().getMoney()-450);
							getPlayer().getInventory().setCharBodyArmour(750);
							Thread.sleep(1500);
							getPlayer().setDefense(getPlayer().getDefense()+getPlayer().getInventory().getCharBodyArmour());							System.out.println("Kara Demir Zırh artık senin!\n");
							System.out.println("Yeninlenmiş Defans : " + getPlayer().getDefense());
							Thread.sleep(1500);
							System.out.println("Kalan altın : "+getPlayer().getMoney());
							Thread.sleep(3000);
							System.out.println("Menüye dönülüyor..");
						}else {
							Thread.sleep(1500);
							System.out.println("Altın yetersiz..");
							break;
						}
					}case "4" ->{
						if (getPlayer().getMoney() > 600) {
							getPlayer().setMoney(getPlayer().getMoney()-600);
							getPlayer().getInventory().setCharBodyArmour(1000);
							Thread.sleep(1500);
							getPlayer().setDefense(getPlayer().getDefense()+getPlayer().getInventory().getCharBodyArmour());							System.out.println("Ejderha Derisi Zırhı artık senin!\n");
							System.out.println("Yeninlenmiş Defans : " + getPlayer().getDefense());
							Thread.sleep(1500);
							System.out.println("Kalan altın : "+getPlayer().getMoney());
							Thread.sleep(3000);
							System.out.println("Menüye dönülüyor..");
						}else {
							Thread.sleep(1500);
							System.out.println("Altın yetersiz..");
							break;
						}
					}case "5" ->{
						if (getPlayer().getMoney() > 850) {
							getPlayer().setMoney(getPlayer().getMoney()-850);
							getPlayer().getInventory().setCharBodyArmour(1500);
							Thread.sleep(1500);
							getPlayer().setDefense(getPlayer().getDefense()+getPlayer().getInventory().getCharBodyArmour());							System.out.println("Asil Muhafız Zırhı artık senin!\n");
							System.out.println("Yeninlenmiş Defans : " + getPlayer().getDefense());
							Thread.sleep(1500);
							System.out.println("Kalan altın : "+getPlayer().getMoney());
							Thread.sleep(3000);
							System.out.println("Menüye dönülüyor..");
						}else {
							Thread.sleep(1500);
							System.out.println("Altın yetersiz..");
							break;
						}
					}case "q" ->{
						break;
					}
					
					default->
						System.out.println("Hatalı tuşlama yaptınız");					}
				}else if (getPlayer().getCharName().equals("suikastçı")) {
					System.out.println(armourMenuForRogue());
					System.out.print("Tercihin nedir? : ");
					String choiceArmourString = scanner.nextLine();
					switch (choiceArmourString) {
					case "1" ->{
						if (getPlayer().getMoney() > 225) {
							getPlayer().setMoney(getPlayer().getMoney()-225);
							getPlayer().getInventory().setCharBodyArmour(250);
							Thread.sleep(1500);
							getPlayer().setDefense(getPlayer().getDefense()+getPlayer().getInventory().getCharBodyArmour());							System.out.println("Gölgelerin Pelerini artık senin!\n");
							System.out.println("Yeninlenmiş Defans : " + getPlayer().getDefense());
							Thread.sleep(1500);
							System.out.println("Kalan altın : "+getPlayer().getMoney());
							Thread.sleep(3000);
							System.out.println("Menüye dönülüyor..");
						}else {
							Thread.sleep(1500);
							System.out.println("Altın yetersiz..");
							break;
						}
					}case "2" ->{
						if (getPlayer().getMoney() > 345) {
							getPlayer().setMoney(getPlayer().getMoney()-345);
							getPlayer().getInventory().setCharBodyArmour(350);
							Thread.sleep(1500);
							getPlayer().setDefense(getPlayer().getDefense()+getPlayer().getInventory().getCharBodyArmour());							System.out.println("Sisli Zarafet artık senin!\n");
							System.out.println("Yeninlenmiş Defans : " + getPlayer().getDefense());
							Thread.sleep(1500);
							System.out.println("Kalan altın : "+getPlayer().getMoney());
							Thread.sleep(3000);
							System.out.println("Menüye dönülüyor..");
						}else {
							Thread.sleep(1500);
							System.out.println("Altın yetersiz..");
							break;
						}
					}case "3" ->{
						if (getPlayer().getMoney() > 575) {
							getPlayer().setMoney(getPlayer().getMoney()-575);
							getPlayer().getInventory().setCharBodyArmour(550);
							Thread.sleep(1500);
							getPlayer().setDefense(getPlayer().getDefense()+getPlayer().getInventory().getCharBodyArmour());							System.out.println("Sinsi Ruh Yeleği artık senin!\n");
							System.out.println("Yeninlenmiş Defans : " + getPlayer().getDefense());
							Thread.sleep(1500);
							System.out.println("Kalan altın : "+getPlayer().getMoney());
							Thread.sleep(3000);
							System.out.println("Menüye dönülüyor..");
						}else {
							Thread.sleep(1500);
							System.out.println("Altın yetersiz..");
							break;
						}
					}case "4" ->{
						if (getPlayer().getMoney() > 750) {
							getPlayer().setMoney(getPlayer().getMoney()-750);
							getPlayer().getInventory().setCharBodyArmour(800);
							Thread.sleep(1500);
							getPlayer().setDefense(getPlayer().getDefense()+getPlayer().getInventory().getCharBodyArmour());							System.out.println("Sessiz Adım Zırhı artık senin!\n");
							System.out.println("Yeninlenmiş Defans : " + getPlayer().getDefense());
							Thread.sleep(1500);
							System.out.println("Kalan altın : "+getPlayer().getMoney());
							Thread.sleep(3000);
							System.out.println("Menüye dönülüyor..");
						}else {
							Thread.sleep(1500);
							System.out.println("Altın yetersiz..");
							break;
						}
					}case "5" ->{
						if (getPlayer().getMoney() > 1000) {
							getPlayer().setMoney(getPlayer().getMoney()-1000);
							getPlayer().getInventory().setCharBodyArmour(1100);
							Thread.sleep(1500);
							getPlayer().setDefense(getPlayer().getDefense()+getPlayer().getInventory().getCharBodyArmour());							System.out.println("Karmaşık Yalınlık artık senin!\n");
							System.out.println("Yeninlenmiş Defans : " + getPlayer().getDefense());
							Thread.sleep(1500);
							System.out.println("Kalan altın : "+getPlayer().getMoney());
							Thread.sleep(3000);
							System.out.println("Menüye dönülüyor..");
						}else {
							Thread.sleep(1500);
							System.out.println("Altın yetersiz..");
							break;
						}
					}case "q" ->{
						break;
					}
					
					default->
						System.out.println("Hatalı tuşlama yaptınız");					}
				}else if (getPlayer().getCharName().equals("büyücü")) {
					System.out.println(armourMenuMagician());
					System.out.print("Tercihin nedir? : ");
					String choiceArmourString = scanner.nextLine();
					switch (choiceArmourString) {
					case "1" ->{
						if (getPlayer().getMoney() > 300) {
							getPlayer().setMoney(getPlayer().getMoney()-300);
							getPlayer().getInventory().setCharBodyArmour(200);
							Thread.sleep(1500);
							getPlayer().setDefense(getPlayer().getDefense()+getPlayer().getInventory().getCharBodyArmour());							System.out.println("Mistik Rüya Pelerini artık senin!\n");
							System.out.println("Yeninlenmiş Defans : " + getPlayer().getDefense());
							Thread.sleep(1500);
							System.out.println("Kalan altın : "+getPlayer().getMoney());
							Thread.sleep(3000);
							System.out.println("Menüye dönülüyor..");
						}else {
							Thread.sleep(1500);
							System.out.println("Altın yetersiz..");
							break;
						}
					}case "2" ->{
						if (getPlayer().getMoney() > 450) {
							getPlayer().setMoney(getPlayer().getMoney()-450);
							getPlayer().getInventory().setCharBodyArmour(300);
							Thread.sleep(1500);
							getPlayer().setDefense(getPlayer().getDefense()+getPlayer().getInventory().getCharBodyArmour());							System.out.println("Göksel İplerle Dokunmuş Zırh artık senin!\n");
							System.out.println("Yeninlenmiş Defans : " + getPlayer().getDefense());
							Thread.sleep(1500);
							System.out.println("Kalan altın : "+getPlayer().getMoney());
							Thread.sleep(3000);
							System.out.println("Menüye dönülüyor..");
						}else {
							Thread.sleep(1500);
							System.out.println("Altın yetersiz..");
							break;
						}
					}case "3" ->{
						if (getPlayer().getMoney() > 650) {
							getPlayer().setMoney(getPlayer().getMoney()-650);
							getPlayer().getInventory().setCharBodyArmour(450);
							Thread.sleep(1500);
							getPlayer().setDefense(getPlayer().getDefense()+getPlayer().getInventory().getCharBodyArmour());							System.out.println("Ateş ve Buz Örtüsü artık senin!\n");
							System.out.println("Yeninlenmiş Defans : " + getPlayer().getDefense());
							Thread.sleep(1500);
							System.out.println("Kalan altın : "+getPlayer().getMoney());
							Thread.sleep(3000);
							System.out.println("Menüye dönülüyor..");
						}else {
							Thread.sleep(1500);
							System.out.println("Altın yetersiz..");
							break;
						}
					}case "4" ->{
						if (getPlayer().getMoney() > 875) {
							getPlayer().setMoney(getPlayer().getMoney()-875);
							getPlayer().getInventory().setCharBodyArmour(700);
							Thread.sleep(1500);
							getPlayer().setDefense(getPlayer().getDefense()+getPlayer().getInventory().getCharBodyArmour());							System.out.println("Kadim Bilgelik Giysileri artık senin!\n");
							System.out.println("Yeninlenmiş Defans : " + getPlayer().getDefense());
							Thread.sleep(1500);
							System.out.println("Kalan altın : "+getPlayer().getMoney());
							Thread.sleep(3000);
							System.out.println("Menüye dönülüyor..");
						}else {
							Thread.sleep(1500);
							System.out.println("Altın yetersiz..");
							break;
						}
					}case "5" ->{
						if (getPlayer().getMoney() > 1200) {
							getPlayer().setMoney(getPlayer().getMoney()-1200);
							getPlayer().getInventory().setCharBodyArmour(900);
							Thread.sleep(1500);
							getPlayer().setDefense(getPlayer().getDefense()+getPlayer().getInventory().getCharBodyArmour());							System.out.println("Astral Cevher Tuniği artık senin!\n");
							System.out.println("Yeninlenmiş Defans : " + getPlayer().getDefense());
							Thread.sleep(1500);
							System.out.println("Kalan altın : "+getPlayer().getMoney());
							Thread.sleep(3000);
							System.out.println("Menüye dönülüyor..");
						}else {
							Thread.sleep(1500);
							System.out.println("Altın yetersiz..");
							break;
						}
					}case "q" ->{
						break;
					}
					
					default->
						System.out.println("Hatalı tuşlama yaptınız");					}
				}else if (getPlayer().getCharName().equals("şifacı")) {
					System.out.println(armourMenuPriest());
					System.out.print("Tercihin nedir? : ");
					String choiceArmourString = scanner.nextLine();
					switch (choiceArmourString) {
					case "1" ->{
						if (getPlayer().getMoney() > 150) {
							getPlayer().setMoney(getPlayer().getMoney()-150);
							getPlayer().getInventory().setCharBodyArmour(275);
							Thread.sleep(1500);
							getPlayer().setDefense(getPlayer().getDefense()+getPlayer().getInventory().getCharBodyArmour());							System.out.println("Kutsal Koruyucu Zırh artık senin!\n");
							System.out.println("Yeninlenmiş Defans : " + getPlayer().getDefense());
							Thread.sleep(1500);
							System.out.println("Kalan altın : "+getPlayer().getMoney());
							Thread.sleep(3000);
							System.out.println("Menüye dönülüyor..");
						}else {
							Thread.sleep(1500);
							System.out.println("Altın yetersiz..");
							break;
						}
					}case "2" ->{
						if (getPlayer().getMoney() > 275) {
							getPlayer().setMoney(getPlayer().getMoney()-275);
							getPlayer().getInventory().setCharBodyArmour(450);
							Thread.sleep(1500);
							getPlayer().setDefense(getPlayer().getDefense()+getPlayer().getInventory().getCharBodyArmour());							System.out.println("İlahi İnanç Örtüsü artık senin!\n");
							System.out.println("Yeninlenmiş Defans : " + getPlayer().getDefense());
							Thread.sleep(1500);
							System.out.println("Kalan altın : "+getPlayer().getMoney());
							Thread.sleep(3000);
							System.out.println("Menüye dönülüyor..");
						}else {
							Thread.sleep(1500);
							System.out.println("Altın yetersiz..");
							break;
						}
					}case "3" ->{
						if (getPlayer().getMoney() > 350) {
							getPlayer().setMoney(getPlayer().getMoney()-350);
							getPlayer().getInventory().setCharBodyArmour(650);
							Thread.sleep(1500);
							getPlayer().setDefense(getPlayer().getDefense() + getPlayer().getInventory().getCharBodyArmour());							System.out.println("Şevkatli Ruh Zırhı artık senin!\n");
							System.out.println("Yeninlenmiş Defans : " + getPlayer().getDefense());
							Thread.sleep(1500);
							System.out.println("Kalan altın : "+getPlayer().getMoney());
							Thread.sleep(3000);
							System.out.println("Menüye dönülüyor..");
						}else {
							Thread.sleep(1500);
							System.out.println("Altın yetersiz..");
							break;
						}
					}case "4" ->{
						if (getPlayer().getMoney() > 500) {
							getPlayer().setMoney(getPlayer().getMoney()-500);
							getPlayer().getInventory().setCharBodyArmour(900);
							Thread.sleep(1500);
							getPlayer().setDefense(getPlayer().getDefense()+getPlayer().getInventory().getCharBodyArmour());							System.out.println("Büyülü Mühr Üniforması artık senin!\n");
							System.out.println("Yeninlenmiş Defans : " + getPlayer().getDefense());
							Thread.sleep(1500);
							System.out.println("Kalan altın : "+getPlayer().getMoney());
							Thread.sleep(3000);
							System.out.println("Menüye dönülüyor..");
						}else {
							Thread.sleep(1500);
							System.out.println("Altın yetersiz..");
							break;
						}
					}case "5" ->{
						if (getPlayer().getMoney() > 725) {
							getPlayer().setMoney(getPlayer().getMoney()-725);
							getPlayer().getInventory().setCharBodyArmour(1300);
							Thread.sleep(1500);
							getPlayer().setDefense(getPlayer().getDefense()+getPlayer().getInventory().getCharBodyArmour());							System.out.println("Işığın Huzur Kıyafeti artık senin!\n");
							System.out.println("Yeninlenmiş Defans : " + getPlayer().getDefense());
							Thread.sleep(1500);
							System.out.println("Kalan altın : "+getPlayer().getMoney());
							Thread.sleep(3000);
							System.out.println("Menüye dönülüyor..");
						}else {
							Thread.sleep(1500);
							System.out.println("Altın yetersiz..");
							break;
						}
					}case "q" ->{
						break;
					}
					
					default->
						System.out.println("Hatalı tuşlama yaptınız");					}
				}
                
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
    	
    	public String weaponMenuForWarrior() {
    		return "\n\t1-Ateşin Nefesi Kılıcı (Saldırı: 250 Altın: 150): Sıcaklık ve alevin gücünü kucaklayan bu uzun kılıç, "
    			+ "\nher darbesinde düşmanlarına yakıcı bir öfke bırakır. "
    			+ "\n\t2-Yıldırımın Öfkesi Baltası (Saldırı: 400 Altın: 250): Göğün eleştir gibi kopan şimşeklerinden ilham alan devasa balta, "
    			+ "\nher sallandığında gök gürültüsü gibi yankılanır."
    			+ "\n\t3-Gölgelerin Fısıldadığı Gürz (Saldırı: 750 Altın: 450): Gecenin sessizliğinde sinsice hareket eden bu gürz, "
    			+ "\ndüşmanlarının farkında olmadan yaklaşır ve onları ölümcül darbelerle alt eder."
    			+ "\n\t4-Kaderin Kıranışı Çekici (Saldırı: 1175 Altın: 650): Efsanelerde “yenilmez” olarak anılan bu devasa çekici, "
    			+ "\ndüşmanın kaderini kırıp, savaş alanında iz bırakan darbeler indirir."
    			+ "\n\t5-Zümrüt Gözü Mızrağı (Saldırı: 1750 Altın: 900): Gizemli enerjilerle bezenmiş bu mızrak, "
    			+ "\nmistik ışıkları sayesinde hem yaklaşan tehlikeyi önceden haber verir hem de rakiplerini akılalmaz bir güçle deler."
    			+ "\nGeri dönmek için q ya basınız.";} 
    	
    	public String weaponMenuForRogue() {
    		return "\n\t1-Sinsi Rüzgar Kılıcı (Saldırı: 315 Altın: 200): Narin ama ölümcül bu kısa kılıç, rakiplerinin hareketlerini alt üst edecek hız ve çevikliğe sahiptir. "
    			+ "\nSanki rüzgarın ani esintisi gibi gelir, fark edilmeden vurur."
    			+ "\n\t2-Sis Örtüsü Rapier (Saldırı: 450 Altın: 350): Bu rapier, sislerin arasında adeta kaybolur; aniden ortadan çıkarak rakibine ölümcül darbe indirmek üzere tasarlanmıştır. "
    			+ "\nHem görünmezlik hem de ani saldırı için ideal bir seçimdir."
    			+ "\n\t3-Gölgelerin Fısıltısı Hançeri (Saldırı: 850 Altın: 500): Sessizliği mükemmelliğe dönüştüren bu zarif hançer, rakibin savunmasını aniden delmek için tasarlanmış. "
    			+ "\nHer darbesinde, düşmanında ölümün hemen habercisi olan ince bir hışırtı bırakır."
    			+ "\n\t4-Karanlığın Suskunu Tabancası (Saldırı: 1350 Altın: 750): Küçük ve etkili bu tabanca, gölgeler arasında sinsice süzülürken, "
    			+ "\nHedefinin en zayıf noktasına nüfuz eden bir iğne gibi, sessiz ve ölümcül atışlar yapmanı sağlar."
    			+ "\n\t5-Gecenin Yankısı bıçağı (Saldırı: 2100 Altın: 1150): Karanlık sokaklarda direnen bu bıçak, rakiplerine hızla yaklaşır ve sessizce öldürücü bir yankı bırakır. "
    			+ "\nHer vuruşu, gecenin derinliğinden gelen beklenmedik bir uyarı gibidir."
    			+ "\nGeri dönmek için q ya basınız.";}
    	
    	public String weaponMenuForMagician() { 
    	    return "\n\t1-Sırlı Element Asası (Saldırı: 570 Altın: 350): Büyücü, bu asayı kullanarak ateş, su, toprak ve havanın kadim gücünü çağırır. "
    			+ "\nHer büyü dalgasında doğanın derin sırlarına dokunan bu asa, evrenin elementlerini ustalıkla yönlendirir."
    			+ "\n\t2-Göksel Işığın Değneği (Saldırı: 750 Altın: 550): Ay ışığının ve yıldız tozunun büyülü enerjisini içine saklayan bu değnek, karanlığın pençesinde bile umut verir. "
    			+ "\nBüyücü, bu değnek sayesinde rakiplerine karşı parlayan ve sersemleten ışık patlamaları yaratır."
    			+ "\n\t3-Kozmik Bilgelik Tılsımı (Saldırı: 1100 Altın: 800): Evrenin derinliklerinden gelen enerjiyi barındıran bu tılsım, büyücünün aklını ve kudretini zirveye çıkarır. "
    			+ "\nHer büyüde, kozmosun sınırsız bilgeliğini açığa çıkararak, kontrolü eline almasını sağlar."
    			+ "\n\t4-Zamanın Dokunuşu Kitabı (Saldırı: 1700 Altın: 1200): Bu kadim grimuar, geçmişin sırlarını ve geleceğin kehanetlerini saklar. "
    			+ "\nBüyücü, her sayfasında mistik formülleri keşfederek zamanı, kaderi ve büyü gücünü bir araya getirir."
    			+ "\n\t5-Ruhların Yankısı Kristali (Saldırı: 2400 Altın: 1600): Ölenlerin ve unutulmuş ruhların enerjisini toplayan bu kristal, büyücünün mistik büyülerine ekstra güç katar. "
    			+ "\nHer kullanımda, rakiplerine bilinmeyen ve sarsıcı bir enerji dalgası gönderir."
    			+ "\nGeri dönmek için q ya basınız."; }
    	
    	public String weaponMenuForPriest() { 
    	    return "\n\t1-Mübarek Şifa Asası (Saldırı: 175 Altın: 100): Rahip, bu asayı kullanarak kutsal ışığı ve şifayı kanalize eder. "
    			+ "\nHer dokunuşu, yaraları sarar, ruhları arındırır ve karanlık güçlere karşı ilahi bir kalkan oluşturur."
    			+ "\n\t2-Kutsal Çekiç (Saldırı: 275 Altın: 175): Adaletin Sesi İlahi güçlerle yoğrulmuş bu çekici salladığı her darbe, kötülüğe meydan okuyan adaletin yankısını duyurur. "
    			+ "\nRahip, bu silahla kötüyü ezerken inancının gücünü simgeler."
    			+ "\n\t3-Işığın İncil Kılıcı (Saldırı: 550 Altın: 300): Kutsal metinlerden ilham alan bu kılıç, her vuruşunda umudun ve merhametin ateşini yansıtır. "
    			+ "\nKaranlık varlıkları dağıtan ve iyiliği aydınlatan, rahibin kudretini ortaya koyar."
    			+ "\n\t4-Ebedi Duaların Mızrağı (Saldırı: 800 Altın: 450): İnançla yoğrulmuş bu mızrak, rahibin kalbinden kopan dualarla güç kazanır. "
    			+ "\nHer saldırısı, kötülüğü ezecek kutsal enerjinin ve ilahi iradenin temsilcisidir."
    			+ "\n\t5-Mesih'in Gözyaşı Kristali (Saldırı: 1100 Altın: 750): Bu mistik kristal, rahibin şefkat ve bağlılığını somutlaştırır. "
    			+ "\nKutsal gözyaşlarının gücünü barındıran yapısıyla, düşmanlarına karşı merhametin ve umut ışığının silahı haline gelir."
    			+ "\nGeri dönmek için q ya basınız."; }
    	
    /**********************************************************************************/	
    	public String armourMenuForWarrior() {
    		    return "\n\t1-Titan Kale Zırhı (Defans: 300 Altın: 175): Efsanevi demir plakalardan dövülmüş, her darbe karşısında sarsılmaz bir kale gibi korur."
    				+ "\n\t2-Ölüm Dövücü Zırh (Defans: 500 Altın: 315): Ölüm kalım savaşlarında dirayeti simgeleyen, ağır ve dayanıklı bir koruma sağlar."
    				+ "\n\t3-Kara Demir Zırh (Defans: 750 Altın: 450): Karanlık demirin kudretiyle inşa edilmiş, düşman saldırılarını kıran sert bir zırh."
    				+ "\n\t4-Ejderha Derisi Zırhı (Defans: 1000 Altın: 600): Efsanevi ejderha derisinden üretilmiş, esnekliği ve yüksek dayanıklılığıyla öne çıkan bir savunma giysisi."
    				+ "\n\t5-Asil Muhafız Zırhı (Defans: 1500 Altın: 850): Savaşçının şanını yansıtan, zarif detaylara sahip ağır ve dimdik duran bir zırh."
    				+ "\nGeri dönmek için q ya basınız.";
    		
    		
    	}public String armourMenuForRogue() {
	      return "\n\t1-Gölge Pelerini (Defans: 250 Altın: 225): İnce, hafif kumaşlardan üretilen bu zırh, gölgeler arasında kaybolmanı sağlar; sessiz adımlarla düşmanlarına yaklaşırken çevikliğinden ödün vermez."
			+ "\n\t2-Sisli Zarafet (Defans: 350 Altın: 345): Esnek ve hafif malzemelerle tasarlanan bu set, sis perdesi gibi etrafı sarmalarken, rogue’un görünmezliğini artırarak ani saldırılar için ideal bir koruma sunar."
			+ "\n\t3-Sinsi Ruh Yeleği (Defans: 550 Altın: 575): Dikkat çekmeyen ama dayanıklı yapısıyla hazırlanmış bu yelek, düşman gözetiminden kaçmanı kolaylaştırır; gizli cepler ve ince işçilik, malzemenin hafifliğini korur."
			+ "\n\t4-Sessiz Adım Zırhı (Defans: 800 Altın: 750): Yüksek esneklik ve minimal ağırlık sunan bu donanım, rogue'un sessizce hareket etmesine olanak tanır; her adımında düşmanlarının dikkatini dağıtmadan ilerler."
			+ "\n\t5-Karmaşık Yalınlık (Defans: 1100 Altın: 1000): Zarif tasarımı ve hafif yapısı sayesinde rogue'un çevikliğini en üst düzeye çıkaran bu zırh, dar koridorlarda ve gölgeli alanlarda üstün hareket kabiliyeti sunar."
			+ "\nGeri dönmek için q ya basınız.";
	
	
    	}public String armourMenuMagician() {
    		return "\n\t1-Mistik Rüya Pelerini (Defans: 200 Altın: 300): Kadim enerjileri barındıran ipeksi dokusuyla, büyücünün büyü gücünü artıran ve ona ilahi bir zarafet katan bu pelerin, sihirli auraları dengelemeye yardımcı olur."
			+ "\n\t2-Göksel İplerle Dokunmuş Zırh (Defans: 300 Altın: 450): Yıldız tozundan ilham alınarak tasarlanan bu hafif zırh, büyücünün astral enerjilerini toplar ve mistik darbeler karşısında nazik bir kalkan görevi görür."
			+ "\n\t3-Ateş ve Buz Örtüsü (Defans: 450 Altın: 650): Elementlerin uyumunu simgeleyen bu örtü, hem serinleştirici hem de ısıtan büyü enerjilerini dengeler; büyücünün hem saldırı hem savunma yeteneklerini mistik bir güçle destekler."
			+ "\n\t4-Kadim Bilgelik Giysileri (Defans: 700 Altın: 875): Yüzyılların sırlarını taşıyan bu antik kıyafet seti, büyücünün engin bilgisini ve sihirsel korumasını ortaya koyarken, ona zamansız bir asalet katar."
			+ "\n\t5-Astral Cevher Tuniği (Defans: 900 Altın: 1200): Parlak enerjilerle işlenmiş bu tunik, mistik güçlerin yoğunluğunu yansıtır; büyücüye hem görsel bir etki sunar, hem de sihirli yeteneklerini güçlendiren hafif ama etkili bir kalkan sağlar."
			+ "\nGeri dönmek için q ya basınız.";


    	}public String armourMenuPriest() {
    		return "\n\t1-Kutsal Koruyucu Zırhı (Defans: 275 Altın: 150): İlahi dualarla dövülmüş bu zırh, rahibin kendini ve müttefiklerini karanlık güçlerden korumasına yardımcı olur; her darbe karşısında kutsal bir kalkan gibi görev yapar."
    				+ "\n\t2-İlahî İnanç Örtüsü (Defans: 450 Altın: 275): Altın işlemelerle süslenen hafif yapısı sayesinde, rahibin ruhani gücünü destekler ve kötülükle savaşırken ona manevi bir güç katar."
    				+ "\n\t3-Şefkatli Ruh Zırhı (Defans: 650 Altın: 350): Merhametin ve şifanın sembolü olan bu zırh, rahibin yüreğindeki kutsallığı dışa vurur; savunmada nazik ama etkili bir siper oluşturur."
    				+ "\n\t4-Büyülü Mühr Üniforması (Defans: 900 Altın: 500): Kutsal sembollerle bezenmiş bu üniforma, rahibin ilahi misyonunu vurgularken, aynı zamanda görsel asalet ve dayanıklılık sağlar."
    				+ "\n\t5-Işığın Huzur Kıyafeti (Defans: 1300 Altın: 725): İlahi enerjiyi yansıtan bu set, rahip için hem şifa hem de koruma sunar; savaş alanında kutsal bir varlık olarak öne çıkmasını sağlar."
    				+ "\nGeri dönmek için q ya basınız.";


}
    }
