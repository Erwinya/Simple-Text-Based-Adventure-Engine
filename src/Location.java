import java.util.Scanner;

public abstract class Location {
		private Player player;
		private String name;
			
	
		Scanner scanner = new Scanner(System.in);
	public Location(Player player) {
		
			this.player = player;
		}

	public abstract boolean getLocation() throws InterruptedException;;

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
		
}
