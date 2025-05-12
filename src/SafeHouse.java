
public class SafeHouse extends NormalLoc {

	

	private int getFirstHealth = getPlayer().getFirstHealth();

	public SafeHouse(Player player) {
		super(player, "Güvenli Ev");

	}

	@Override
	public void getLocation() throws InterruptedException {
		
		System.out.println("Evin sıcaklığını hissediyorsun.. Savaşın acımasız soğuğuna karşı burası senin tek sığınağın. "
				+ "Birkaç saatlik huzur, yaralarını iyileştirecek, gücünü yeniden toparlayacak tek yer..");
		Thread.sleep(3000);
		System.out.println("Kahramanın iyileşmesi için zamana ihtiyacı var. "
				+ "Onun yaralarını iyileştirmesine gücünü yeniden toplamasına izin ver...(lütfen bekleyiniz..)");
		Thread.sleep(3000);
		getPlayer().setHealth(getFirstHealth );
		System.out.println("Kahramanın kendini yeniden doğmuş gibi hissediyor.\n"
				+ "HP :" + getPlayer().getHealth());
		
	}

	
	
}
