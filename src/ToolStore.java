import java.util.Scanner;

public class ToolStore extends NormalLoc {
	
	public ToolStore(Player player, String name) {
		super(player, "Mağaza");
	}

	@Override
	public boolean getLocation() {
		System.out.println("Merhaba karanlık diyarların gizli ticaret merkezi Ghua Pazarındasın..");
		System.out.println("Coin : " + getPlayer().getMoneyStart());
		System.out.println("\t1- Silahlar ---------->>>\n"
				+ "\t2- Zırhlar ---------->>>\n"
				+ "3-Geri dön ---------->>>\\n");
		String inputMarketChoice = scanner.nextLine();
		switch (inputMarketChoice) {
		case "1": {
			System.out.println("Elimizde olan silahları senin için hazırladık. Istediğini seçebilirsin "
					+ "Aetherianın son yüce kahramanı" + getPlayer().getName());
		
			break;
			
		}case "2": {
			break;
			
		}case "3": {
			
			break;
		}
		default:
			System.out.println("Hatalı tuşlama yaptınız..");
		}
		return true;
	}

}
