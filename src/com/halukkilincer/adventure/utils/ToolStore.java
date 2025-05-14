package com.halukkilincer.adventure.utils;

import com.halukkilincer.adventure.characters.Player;

import java.security.PublicKey;
import java.util.Scanner;

public class ToolStore extends NormalLoc {

     Scanner scanner = new Scanner(System.in);

    public ToolStore(Player player, String name) {
        super(player,  player.getName());
        
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
                
                if (getPlayer().getCharName().equals("warrior")) {
					System.out.println(weaponMenuForWarrior());
					
				}else if (getPlayer().getCharName().equals("rogue")) {
					System.out.println(weaponMenuForRogue());
					
				}else if (getPlayer().getCharName().equals("magician")) {
					System.out.println(weaponMenuForMagician());
					
				}else if (getPlayer().getCharName().equals("priest")) {
					System.out.println(weaponMenuForPriest());
					
				}
                break;

            }
            case "2": {
                System.out.println("Elimizde olan zırhları senin için hazırladık. Istediğini seçebilirsin "
                        + "Aetherianın son yüce kahramanı" + getPlayer().getName());
                if (getPlayer().getCharName().equals("warrior")) {
					System.out.println(armourMenuForWarrior());
				}else if (getPlayer().getCharName().equals("rogue")) {
					System.out.println(armourMenuForRogue());
				}else if (getPlayer().getCharName().equals("magician")) {
					System.out.println(armourMenuMagician());
				}else if (getPlayer().getCharName().equals("priest")) {
					System.out.println(armourMenuPriest());
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
    		return "\n\t1-Ateşin Nefesi Kılıcı (Saldırı: 250): Sıcaklık ve alevin gücünü kucaklayan bu uzun kılıç, "
    			+ "\nher darbesinde düşmanlarına yakıcı bir öfke bırakır. "
    			+ "\n\t2-Yıldırımın Öfkesi Baltası (Saldırı: 400): Göğün eleştir gibi kopan şimşeklerinden ilham alan devasa balta, "
    			+ "\nher sallandığında gök gürültüsü gibi yankılanır."
    			+ "\n\t3-Gölgelerin Fısıldadığı Gürz (Saldırı: 750): Gecenin sessizliğinde sinsice hareket eden bu gürz, "
    			+ "\ndüşmanlarının farkında olmadan yaklaşır ve onları ölümcül darbelerle alt eder."
    			+ "\n\t4-Kaderin Kıranışı Çekici (Saldırı: 1175): Efsanelerde “yenilmez” olarak anılan bu devasa çekici, "
    			+ "\ndüşmanın kaderini kırıp, savaş alanında iz bırakan darbeler indirir."
    			+ "\n\t5-Zümrüt Gözü Mızrağı (Saldırı: 1750): Gizemli enerjilerle bezenmiş bu mızrak, "
    			+ "\nmistik ışıkları sayesinde hem yaklaşan tehlikeyi önceden haber verir hem de rakiplerini akılalmaz bir güçle deler."
    			+ "\nGeri dönmek için q ya basınız.";} 
    	
    	public String weaponMenuForRogue() {
    		return "\n\t1-Sinsi Rüzgar Kılıcı (Saldırı: 315): Narin ama ölümcül bu kısa kılıç, rakiplerinin hareketlerini alt üst edecek hız ve çevikliğe sahiptir. "
    			+ "\nSanki rüzgarın ani esintisi gibi gelir, fark edilmeden vurur."
    			+ "\n\t2-Sis Örtüsü Rapier (Saldırı: 450): Bu rapier, sislerin arasında adeta kaybolur; aniden ortadan çıkarak rakibine ölümcül darbe indirmek üzere tasarlanmıştır. "
    			+ "\nHem görünmezlik hem de ani saldırı için ideal bir seçimdir."
    			+ "\n\t3-Gölgelerin Fısıltısı Hançeri (Saldırı: 850): Sessizliği mükemmelliğe dönüştüren bu zarif hançer, rakibin savunmasını aniden delmek için tasarlanmış. "
    			+ "\nHer darbesinde, düşmanında ölümün hemen habercisi olan ince bir hışırtı bırakır."
    			+ "\n\t4-Karanlığın Suskunu Tabancası (Saldırı: 1350): Küçük ve etkili bu tabanca, gölgeler arasında sinsice süzülürken, "
    			+ "\nHedefinin en zayıf noktasına nüfuz eden bir iğne gibi, sessiz ve ölümcül atışlar yapmanı sağlar."
    			+ "\n\t5-Gecenin Yankısı bıçağı (Saldırı: 2100): Karanlık sokaklarda direnen bu bıçak, rakiplerine hızla yaklaşır ve sessizce öldürücü bir yankı bırakır. "
    			+ "\nHer vuruşu, gecenin derinliğinden gelen beklenmedik bir uyarı gibidir."
    			+ "\nGeri dönmek için q ya basınız.";}
    	
    	public String weaponMenuForMagician() { 
    	    return "\n\t1-Sırlı Element Asası (Saldırı: 570): Büyücü, bu asayı kullanarak ateş, su, toprak ve havanın kadim gücünü çağırır. "
    			+ "\nHer büyü dalgasında doğanın derin sırlarına dokunan bu asa, evrenin elementlerini ustalıkla yönlendirir."
    			+ "\n\t2-Göksel Işığın Değneği (Saldırı: 750): Ay ışığının ve yıldız tozunun büyülü enerjisini içine saklayan bu değnek, karanlığın pençesinde bile umut verir. "
    			+ "\nBüyücü, bu değnek sayesinde rakiplerine karşı parlayan ve sersemleten ışık patlamaları yaratır."
    			+ "\n\t3-Kozmik Bilgelik Tılsımı (Saldırı: 1100): Evrenin derinliklerinden gelen enerjiyi barındıran bu tılsım, büyücünün aklını ve kudretini zirveye çıkarır. "
    			+ "\nHer büyüde, kozmosun sınırsız bilgeliğini açığa çıkararak, kontrolü eline almasını sağlar."
    			+ "\n\t4-Zamanın Dokunuşu Kitabı (Saldırı: 1700): Bu kadim grimuar, geçmişin sırlarını ve geleceğin kehanetlerini saklar. "
    			+ "\nBüyücü, her sayfasında mistik formülleri keşfederek zamanı, kaderi ve büyü gücünü bir araya getirir."
    			+ "\n\t5-Ruhların Yankısı Kristali (Saldırı: 2400): Ölenlerin ve unutulmuş ruhların enerjisini toplayan bu kristal, büyücünün mistik büyülerine ekstra güç katar. "
    			+ "\nHer kullanımda, rakiplerine bilinmeyen ve sarsıcı bir enerji dalgası gönderir."
    			+ "\nGeri dönmek için q ya basınız."; }
    	
    	public String weaponMenuForPriest() { 
    	    return "\n\t1-Mübarek Şifa Asası (Saldırı: 175): Rahip, bu asayı kullanarak kutsal ışığı ve şifayı kanalize eder. "
    			+ "\nHer dokunuşu, yaraları sarar, ruhları arındırır ve karanlık güçlere karşı ilahi bir kalkan oluşturur."
    			+ "\n\t2-Kutsal Çekiç (Saldırı: 275): Adaletin Sesi İlahi güçlerle yoğrulmuş bu çekici salladığı her darbe, kötülüğe meydan okuyan adaletin yankısını duyurur. "
    			+ "\nRahip, bu silahla kötüyü ezerken inancının gücünü simgeler."
    			+ "\n\t3-Işığın İncil Kılıcı (Saldırı: 550): Kutsal metinlerden ilham alan bu kılıç, her vuruşunda umudun ve merhametin ateşini yansıtır. "
    			+ "\nKaranlık varlıkları dağıtan ve iyiliği aydınlatan, rahibin kudretini ortaya koyar."
    			+ "\n\t4-Ebedi Duaların Mızrağı (Saldırı: 800): İnançla yoğrulmuş bu mızrak, rahibin kalbinden kopan dualarla güç kazanır. "
    			+ "\nHer saldırısı, kötülüğü ezecek kutsal enerjinin ve ilahi iradenin temsilcisidir."
    			+ "\n\t5-Mesih'in Gözyaşı Kristali (Saldırı: 1100): Bu mistik kristal, rahibin şefkat ve bağlılığını somutlaştırır. "
    			+ "\nKutsal gözyaşlarının gücünü barındıran yapısıyla, düşmanlarına karşı merhametin ve umut ışığının silahı haline gelir."
    			+ "\nGeri dönmek için q ya basınız."; }
    	
    /**********************************************************************************/	
    	public String armourMenuForWarrior() {
    		    return "\n\t1-Titan Kale Zırhı (Altın: 175): Efsanevi demir plakalardan dövülmüş, her darbe karşısında sarsılmaz bir kale gibi korur."
    				+ "\n\t2-Ölüm Dövücü Zırh (Altın: 315): Ölüm kalım savaşlarında dirayeti simgeleyen, ağır ve dayanıklı bir koruma sağlar."
    				+ "\n\t3-Kara Demir Zırh (Altın: 450): Karanlık demirin kudretiyle inşa edilmiş, düşman saldırılarını kıran sert bir zırh."
    				+ "\n\t4-Ejderha Derisi Zırhı (Altın: 600): Efsanevi ejderha derisinden üretilmiş, esnekliği ve yüksek dayanıklılığıyla öne çıkan bir savunma giysisi."
    				+ "\n\t5-Asil Muhafız Zırhı (Altın: 850): Savaşçının şanını yansıtan, zarif detaylara sahip ağır ve dimdik duran bir zırh."
    				+ "\nGeri dönmek için q ya basınız.";
    		
    		
    	}public String armourMenuForRogue() {
	      return "\n\t1-Gölge Pelerini (Altın: 225): İnce, hafif kumaşlardan üretilen bu zırh, gölgeler arasında kaybolmanı sağlar; sessiz adımlarla düşmanlarına yaklaşırken çevikliğinden ödün vermez."
			+ "\n\t2-Sisli Zarafet (Altın: 345): Esnek ve hafif malzemelerle tasarlanan bu set, sis perdesi gibi etrafı sarmalarken, rogue’un görünmezliğini artırarak ani saldırılar için ideal bir koruma sunar."
			+ "\n\t3-Sinsi Ruh Yeleği (Altın: 575): Dikkat çekmeyen ama dayanıklı yapısıyla hazırlanmış bu yelek, düşman gözetiminden kaçmanı kolaylaştırır; gizli cepler ve ince işçilik, malzemenin hafifliğini korur."
			+ "\n\t4-Sessiz Adım Zırhı (Altın: 750): Yüksek esneklik ve minimal ağırlık sunan bu donanım, rogue'un sessizce hareket etmesine olanak tanır; her adımında düşmanlarının dikkatini dağıtmadan ilerler."
			+ "\n\t5-Karmaşık Yalınlık (Altın: 1000): Zarif tasarımı ve hafif yapısı sayesinde rogue'un çevikliğini en üst düzeye çıkaran bu zırh, dar koridorlarda ve gölgeli alanlarda üstün hareket kabiliyeti sunar."
			+ "\nGeri dönmek için q ya basınız.";
	
	
    	}public String armourMenuMagician() {
    		return "\n\t1-Mistik Rüya Pelerini (Altın: 300): Kadim enerjileri barındıran ipeksi dokusuyla, büyücünün büyü gücünü artıran ve ona ilahi bir zarafet katan bu pelerin, sihirli auraları dengelemeye yardımcı olur."
			+ "\n\t2-Göksel İplerle Dokunmuş Zırh (Altın: 450): Yıldız tozundan ilham alınarak tasarlanan bu hafif zırh, büyücünün astral enerjilerini toplar ve mistik darbeler karşısında nazik bir kalkan görevi görür."
			+ "\n\t3-Ateş ve Buz Örtüsü (Altın: 650): Elementlerin uyumunu simgeleyen bu örtü, hem serinleştirici hem de ısıtan büyü enerjilerini dengeler; büyücünün hem saldırı hem savunma yeteneklerini mistik bir güçle destekler."
			+ "\n\t4-Kadim Bilgelik Giysileri (Altın: 875): Yüzyılların sırlarını taşıyan bu antik kıyafet seti, büyücünün engin bilgisini ve sihirsel korumasını ortaya koyarken, ona zamansız bir asalet katar."
			+ "\n\t5-Astral Cevher Tuniği (Altın: 1200): Parlak enerjilerle işlenmiş bu tunik, mistik güçlerin yoğunluğunu yansıtır; büyücüye hem görsel bir etki sunar, hem de sihirli yeteneklerini güçlendiren hafif ama etkili bir kalkan sağlar."
			+ "\nGeri dönmek için q ya basınız.";


    	}public String armourMenuPriest() {
    		return "\n\t1-Kutsal Koruyucu Zırhı (Altın: 150): İlahi dualarla dövülmüş bu zırh, rahibin kendini ve müttefiklerini karanlık güçlerden korumasına yardımcı olur; her darbe karşısında kutsal bir kalkan gibi görev yapar."
    				+ "\n\t2-İlahî İnanç Örtüsü (Altın: 275): Altın işlemelerle süslenen hafif yapısı sayesinde, rahibin ruhani gücünü destekler ve kötülükle savaşırken ona manevi bir güç katar."
    				+ "\n\t3-Şefkatli Ruh Zırhı (Altın: 350): Merhametin ve şifanın sembolü olan bu zırh, rahibin yüreğindeki kutsallığı dışa vurur; savunmada nazik ama etkili bir siper oluşturur."
    				+ "\n\t4-Büyülü Mühr Üniforması (Altın: 500): Kutsal sembollerle bezenmiş bu üniforma, rahibin ilahi misyonunu vurgularken, aynı zamanda görsel asalet ve dayanıklılık sağlar."
    				+ "\n\t5-Işığın Huzur Kıyafeti (Altın: 725): İlahi enerjiyi yansıtan bu set, rahip için hem şifa hem de koruma sunar; savaş alanında kutsal bir varlık olarak öne çıkmasını sağlar."
    				+ "\nGeri dönmek için q ya basınız.";


}
    }
