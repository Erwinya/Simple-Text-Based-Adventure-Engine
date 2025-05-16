package com.halukkilincer.adventure.utils;
import com.halukkilincer.adventure.characters.Player;

public abstract class BattleLoc extends Location {
	Obstacle obstacle;

	public BattleLoc(Player player, String name, Obstacle obstacle) {
		super(player);
		this.obstacle = obstacle;
		this.setName(name); 
	}

	public boolean getLocation() {
		int spawnMC = obstacle.spawnMonsterCount();
		return true;

	}
	public boolean choiceRandomBM() {
		
		
		return true;
	}
	
	
	public void introBattle () {
		String introBattleStory = "Aetheria'nın Efsane Yolculuğu"
				+ "Bir zamanlar Aetheria topraklarında, kadim kehanetler ve unutulmuş mitler arasında, "
				+ "dörtlü kahraman – Warrior, Rogue, Magician ve Priest – kutsal Ebedi Kristal’in gücünü korumak için yola çıktı. "
				+ "Fakat yolculuk, yalnızca dostluk ve cesaretle değil, aynı zamanda her adımda karanlık güçlerin direndiği şaşırtıcı engellerle doluydu."
				+"İlk durakları, uçurumun kenarında yankılanan korkunç çığlıklarla anılan Abyssal Kâbus’un hüküm sürdüğü derin vadiydi. Kahramanlarımız, "
				+ "bu dehşetin pençesinden sıyrılarak yola devam etti. Gece çöktüğünde, ormanın karanlıklıklarında sinsice adım atan Kara Pençe Kurt’un gölgesi peşlerini bırakmadı."

				+"Harabelerin küllerinin arasında yükselen Kül Ruhu, geçmişin kayıplarını anlatan sessiz bir şahit gibi belirdi. "
				+ "Dağların sivri zirvelerinde, buz gibi saldırılarla aniden ortaya çıkan Donmuş Kılıç, düşmanlarına acımasızca hükmetti. "
				+ "Sis perdesi gibi yayılan ormanlarda, ansızın beliren Gölge Sürüngeni kahramanlarımızı sürpriz bir saldırıya hazırladı."

				+"Yolculukları, rüzgârın hızlı adımlarını andıran Fırtına Zağar Geyik ve çevresine korku saçan Kanlı Rüzgâr Şabril ile daha da zorlu hale geldi. "
				+ "Sisli vadilerde, sessiz adımlarla iz süren Sisli Ruh Avcısı’nın tehdidi altında, kahramanlarımız yer altı geçitlerine sığınmak zorunda kaldılar."

				+"Mağaraların derinliklerinde, unutulmuş dehşetin vücut bulmuş hali Yeraltı Kâbusu ile karşılaştılar; zamanın akışını bozan acı dolu bir mücadele verildi. "
				+ "Öte yandan, kaderin cilvesi gibi gelen Kaderin Çivisi, nihai düşmanlarının üzerine ölümcül darbeler indirebilme gücüyle durumu özetledi."

				+"Yolculuğun son aşamasında, karanlık sırların çağına şahitlik eden Aetheria'nın Lanetlisi nihai engel olarak ortaya çıktı. "
				+ "Ve sonunda, göklerde dolanan, alev ve duman içinde yükselen Göksel Yıkım Ejderhası ile nihai savaş başladı. "
				+ "Void Lord’un karanlık hizmetkarı olan bu devasa ejderha, kahramanların en zorlu sınavıydı."

				+"Dörtlü kahraman, her bir canavarı yırtıcı güçleri ve sarsılmaz inançlarıyla alt ederken, Aetheria toprakları adım adım aydınlığa kavuştu. "
				+"Bu büyük efsane, sadece kutsal kristalin korunmasının değil, aynı zamanda birlik, cesaret ve fedakarlık ile şekillenen bir medeniyetin dirilişinin öyküsüne dönüştü.";
		String MapsStory = "Karanlık Uçurum Hikaye: Uçurumun derinliklerinde, kadim enerjiler ve karanlık güçler iç içe geçmiş. Abyssal Kâbus’un esrarengiz varlığı bu yarığın her köşesini sarmış durumda. "
				+ "Kahramanlar, bu uçurumdan geçerken, yerçekiminin ve acımasız düşman saldırılarının etkisini hissetmek, her adımda hayat ve ölüm arasında ince çizgide yürümek zorundalar.\r\n"
				+ "\r\n"
				+ "Sislerin Gölgeler Ormanı Hikaye: Yoğun sisin perdeleri altında, ağaçların arasında kaybolmuş eski medeniyetlerin izleri kalan bu ormanda, düşman gölgeleri sessizce pusuda bekler. "
				+ "Gölge Sürüngeni ve Sisli Ruh Avcısı’nın sinsice düzenlediği pusu, kahramanların dikkatini sürekli olarak test eder. Ormanın uğursuz atmosferinde, her adım hem keşif hem de hayatta kalma mücadelesine dönüşür.\r\n"
				+ "\r\n"
				+ "Donmuş Yıkım Düzlüğü Hikaye: Aetheria’nın kuzeyinde, sonbaharın bile yetersiz kaldığı aşırı soğuk rüzgarların estiği bu buzla kaplı düzlük, doğanın acımasız yüzünü gözler önüne serer. "
				+ "Donmuş Kılıç’ın efsanevi soğuğu ve buz kristallerinin keskin yüzü arasında, kahramanlar hem düşman canavarlarıyla hem de doğanın yıkıcı gücüyle mücadele etmek zorunda kalırlar. Her adım, ölümcül fırtınaların altında atılan bir meydan okuma gibidir.\r\n"
				+ "\r\n"
				+ "Göksel Kristal Kalesi Hikaye: Gökyüzüne asılı devasa kayaların üzerinde inşa edilmiş bu kutsal kale, Ebedi Kristal’in ve Aetheria’nın umudunun sembolüdür."
				+ "Void Lord’un karanlık hizmetkarları ve Göksel Yıkım Ejderhası’nın pençesi altında, kale son direnişi temsil eder. Kahramanlarımız, bu efsanevi kaledeki nihai savaşta, kutsal ışığın gücüyle karanlığa son vermek için bütün yeteneklerini ortaya koyar. "
				+ "Işık ile karanlık arasındaki bu destansı hesaplaşma, evrenin kaderini nihai olarak belirleyecektir.\r\n"
				+ "\r\n"
				+ "Bu dört savaş haritası, Aetheria’nın dört bir yanında sizi bekleyen benzersiz meydan okumaları ve destansı mücadeleleri simgeliyor. "
				+ "Her biri, kahramanların yükseleceği, fedakarlık yapacağı ve kaderi yeniden yazacağı unutulmaz birer sahne sunuyor.";
	}
}
