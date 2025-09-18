
import java.util.*;
import java.lang.*;

abstract class Game implements Comparable<Game> {
	protected int id;
	protected String gameName;
	protected int gameRating;
	protected String platform;
	protected String genration;
	protected boolean isBorrowed;
	protected String borrowedBy;
	protected static int idCounter = 1;
	protected static int totalGames = 0;

	

	public Game() {
	}

	public Game(String gameName,  String genration, int gameRating, String platform) throws GameException {
		this.gameName = gameName;
		this.genration = genration;
		if (gameRating >= 1 || gameRating <= 5) {
			this.gameRating = gameRating;
		} else {
			throw new GameException("The rating is in between 1 to 5.");
		}
		this.platform = platform;

	}

	public int getId() {
		return id;
	}

	public String getGameName() {
		return gameName;
	}

	public int getGameRating() {
		return gameRating;
	}

	public String getPlatform() {
		return platform;
	}

	public String getGenration() {
		return genration;
	}

	public boolean isBorrowed() {
		return isBorrowed;
	}

	public String getBorrowedBy() {
		return borrowedBy;
	}

	public static int getIdCounter() {
		return idCounter;
	}

	public static int getTotalGames() {
		return totalGames;
	}

	public abstract void displayDetails();

	@Override
	public String toString() {
		return "Game [id=" + id + ", gameName=" + gameName + ", gameRating=" + gameRating + ", platform=" + platform
				+ ", genration=" + genration + ", isBorrowed=" + isBorrowed + ", borrowedBy=" + borrowedBy + "]";
	}

	@Override
	public int compareTo(Game g){
		return this.id - g.id;
	}

}

class ConsoleGame extends Game{
	

	private String consoleType;

	public ConsoleGame(String gameName, String genration, int gameRating, String platform) throws GameException {

		super(gameName,genration, gameRating, platform);
		this.consoleType=consoleType;
	}

	public void displayDetails(){

	}

	
	@Override
	public String toString() {
		return "Game [id=" + id + ", gameName=" + gameName + ", gameRating=" + gameRating + ", platform=" + platform
				+ ", genration=" + genration + ", isBorrowed=" + isBorrowed + ", borrowedBy=" + borrowedBy +", consoleType="+consoleType+ "]";
	}
	
}

 class PCGames extends Game {

	private String minimumSpaces;

	public PCGames(String gameName, String genration,int gameRating, String platform, String minimumSpaces) throws GameException {

		super(gameName, genration, gameRating, platform);
		this.minimumSpaces=minimumSpaces;
	}

	public void displayDetails(){

	}

	
	@Override
	public String toString() {
		return "Game [id=" + id + ", gameName=" + gameName + ", gameRating=" + gameRating + ", platform=" + platform
				+ ", genration=" + genration + ", isBorrowed=" + isBorrowed + ", borrowedBy=" + borrowedBy +", minimumSpaces="+minimumSpaces+ "]";
	}
	
	
}

class User {
	private String username;
	private String email;
	private List<Integer> borrowedGameId;

	private static int totalUsers = 0;

	User(String username, String email){
		this.username=username;
		this.email=email;
	}
}

class GameException extends Exception {
	GameException(String msg) {
		super(msg);
	}
}

public class GameHub {

}