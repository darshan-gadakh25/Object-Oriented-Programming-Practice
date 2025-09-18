
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.*;
import java.lang.*;

abstract class Game implements Comparable<Game> {
    protected int id;
    protected String name;
    protected String genre;
    protected int rating;
    protected String platform; 
    protected boolean isBorrowed;
    protected String borrowedBy; 

    public static int idCounter = 1; 
    public static int totalGames = 0;

    public Game() throws InvalidRatingException {
        this("Unknown Game", "Unknown", 1, "Unknown");
    }

    public Game(String name, String genre, int rating, String platform) throws InvalidRatingException {
        setRating(rating);
        this.id = idCounter++;
        this.name = name;
        this.genre = genre;
        this.platform = platform;
        this.isBorrowed = false;
        this.borrowedBy = null;
        totalGames++;
    }

    // getters
    public int getId() { return id; }
    public String getName() { return name; }
    public String getGenre() { return genre; }
    public int getRating() { return rating; }
    public String getPlatform() { return platform; }
    public boolean isBorrowed() { return isBorrowed; }
    public String getBorrowedBy() { return borrowedBy; }

    public void setName(String name) { this.name = name; }
    public void setGenre(String genre) { this.genre = genre; }

    public void setRating(int rating) throws InvalidRatingException {
        if (rating < 1 || rating > 5) throw new InvalidRatingException("Rating must be between 1 and 5.");
        this.rating = rating;
    }

    protected void markBorrowed(String username) {
        this.isBorrowed = true;
        this.borrowedBy = username;
    }

    protected void markReturned() {
        this.isBorrowed = false;
        this.borrowedBy = null;
    }

    public abstract void displayDetails();

    @Override
    public int compareTo(Game other) {
        return Integer.compare(this.id, other.id);
    }

    @Override
    public String toString() {
        return String.format("ID:%d | %s | Genre:%s | Rating:%d | Platform:%s%s",
                id, name, genre, rating, platform, isBorrowed ? " | BORROWED by " + borrowedBy : "");
    }
}

class ConsoleGame extends Game {
    private String consoleType; // e.g., PS5, Xbox Series X, Switch

    public ConsoleGame() throws InvalidRatingException {
        this("Unknown Console Game", "Unknown", 1, "Console", "Generic");
    }

    public ConsoleGame(String name, String genre, int rating, String platform, String consoleType)
            throws InvalidRatingException {
        super(name, genre, rating, platform);
        this.consoleType = consoleType;
    }

    public String getConsoleType() {
        return consoleType;
    }

    public void setConsoleType(String type) {
        this.consoleType = type;
    }

    @Override
    public void displayDetails() {
        System.out.println(toString());
        System.out.println("   [Console Type: " + consoleType + "]");
    }

    @Override
    public String toString() {
        return super.toString() + " | ConsoleType:" + consoleType;
    }
}

class PCGame extends Game {
    private String minimumSpecs;

    public PCGame() throws InvalidRatingException {
        this("Unknown PC Game", "Unknown", 1, "PC", "Min Specs: Unknown");
    }

    public PCGame(String name, String genre, int rating, String platform, String minimumSpecs)
            throws InvalidRatingException {
        super(name, genre, rating, platform);
        this.minimumSpecs = minimumSpecs;
    }

    public String getMinimumSpecs() {
        return minimumSpecs;
    }

    public void setMinimumSpecs(String s) {
        this.minimumSpecs = s;
    }

    @Override
    public void displayDetails() {
        System.out.println(toString());
        System.out.println("   [Min Specs: " + minimumSpecs + "]");
    }

    @Override
    public String toString() {
        return super.toString() + " | MinSpecs:" + minimumSpecs;
    }
}

// ------------------------------
// File: User.java
// ------------------------------
class User {
    private String username;
    private String email;
    private List<Integer> borrowedGameIds;
    private static int totalUsers = 0;

    public User() {
        this("unknown_user", "unknown@example.com");
    }

    public User(String username, String email) {
        this.username = username;
        this.email = email;
        this.borrowedGameIds = new ArrayList<>();
        totalUsers++;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public List<Integer> getBorrowedGameIds() {
        return borrowedGameIds;
    }

    public void borrowGame(int gameId) {
        borrowedGameIds.add(gameId);
    }

    public boolean returnGame(int gameId) {
        return borrowedGameIds.remove((Integer) gameId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof User))
            return false;
        User other = (User) o;
        return Objects.equals(this.username, other.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username);
    }

    @Override
    public String toString() {
        return String.format("User: %s | Email: %s | Borrowed: %s",
                username, email, borrowedGameIds.toString());
    }

    public static int getTotalUsers() {
        return totalUsers;
    }
}

// ------------------------------
// File: NameComparator.java
// ------------------------------

class NameComparator implements Comparator<Game> {
    @Override
    public int compare(Game g1, Game g2) {
        return g1.getName().compareToIgnoreCase(g2.getName());
    }
}

// ------------------------------
// File: RatingComparator.java
// ------------------------------

class RatingComparator implements Comparator<Game> {
    @Override
    public int compare(Game g1, Game g2) {
        // higher rating first -> descending
        return Integer.compare(g2.getRating(), g1.getRating());
    }
}

// ------------------------------
// File: InvalidRatingException.java
// ------------------------------

class InvalidRatingException extends Exception {
    public InvalidRatingException(String msg) {
        super(msg);
    }
}

// ------------------------------
// File: GameNotFoundException.java
// ------------------------------

class GameNotFoundException extends Exception {
    public GameNotFoundException(String msg) {
        super(msg);
    }
}


class UserNotFoundException extends Exception {
    public UserNotFoundException(String msg) {
        super(msg);
    }
}

// ------------------------------
// File: GameActions.java
// ------------------------------

interface GameActions {
    void addGame(Game game) throws InvalidRatingException;

    void removeGame(int gameId) throws GameNotFoundException;

    List<Game> viewGames(Comparator<Game> comparator);

    List<Game> searchGames(String keyword);

    void registerUser(User user) throws IllegalArgumentException;

    Set<User> viewUsers();

    void issueGame(int gameId, String username)
            throws GameNotFoundException, UserNotFoundException, IllegalStateException;

    void returnGame(int gameId, String username)
            throws GameNotFoundException, UserNotFoundException, IllegalStateException;

    Queue<Game> displayBorrowedQueue();

    Map<String, Integer> getStatistics();
}

// ------------------------------
// File: GameHubManager.java
// ------------------------------

class GameHubManager implements GameActions {
    private List<Game> allGames;
    private LinkedList<Game> borrowedQueue;
    private Set<User> users;
    private Map<Integer, Game> gameMap;
    private Map<String, User> userMap; 

    public GameHubManager() {
        this.allGames = new ArrayList<>();
        this.borrowedQueue = new LinkedList<>();
        this.users = new HashSet<>();
        this.gameMap = new HashMap<>();
        this.userMap = new HashMap<>();
    }

    @Override
    public void addGame(Game game) throws InvalidRatingException {
        if (game == null)
            return;
        allGames.add(game);
        gameMap.put(game.getId(), game);
        System.out.println("Success: Game added with ID " + game.getId());
    }

    @Override
    public void removeGame(int gameId) throws GameNotFoundException {
        Game g = gameMap.get(gameId);
        if (g == null)
            throw new GameNotFoundException("Game ID " + gameId + " not found.");
        if (g.isBorrowed()) {
            System.out.println("Error: Cannot remove game. It is currently borrowed by " + g.getBorrowedBy());
            return;
        }
        allGames.remove(g);
        gameMap.remove(gameId);
        Game.totalGames--; // maintain static count
        System.out.println("Success: Game removed (ID " + gameId + ")");
    }

    @Override
    public List<Game> viewGames(Comparator<Game> comparator) {
        List<Game> copy = new ArrayList<>(allGames);
        if (comparator != null)
            copy.sort(comparator);
        else
            Collections.sort(copy);
        return copy;
    }

    @Override
    public List<Game> searchGames(String q) {
        String lower = q.toLowerCase();
        return allGames.stream()
                .filter(g -> g.getName().toLowerCase().contains(lower) || g.getGenre().toLowerCase().contains(lower))
                .collect(Collectors.toList());
    }

    @Override
    public void registerUser(User user) throws IllegalArgumentException {
        if (user == null)
            throw new IllegalArgumentException("User is null.");
        if (userMap.containsKey(user.getUsername())) {
            throw new IllegalArgumentException("Username '" + user.getUsername() + "' already exists.");
        }
        users.add(user);
        userMap.put(user.getUsername(), user);
        System.out.println("User registered: " + user.getUsername());
    }

    @Override
    public Set<User> viewUsers() {
        return new HashSet<>(users);
    }

    private User getUserByUsername(String username) {
        return userMap.get(username);
    }

    @Override
    public void issueGame(int gameId, String username)
            throws GameNotFoundException, UserNotFoundException, IllegalStateException {
        Game g = gameMap.get(gameId);
        if (g == null)
            throw new GameNotFoundException("Game ID " + gameId + " not found.");
        User u = getUserByUsername(username);
        if (u == null)
            throw new UserNotFoundException("User '" + username + "' not found.");

        if (g.isBorrowed()) {
            throw new IllegalStateException("Game is currently borrowed by " + g.getBorrowedBy());
        }
        g.markBorrowed(username);
        borrowedQueue.addLast(g);
        u.borrowGame(gameId);
        System.out.println("Success: Game ID " + gameId + " issued to " + username);
    }

    @Override
    public void returnGame(int gameId, String username)
            throws GameNotFoundException, UserNotFoundException, IllegalStateException {
        Game g = gameMap.get(gameId);
        if (g == null)
            throw new GameNotFoundException("Game ID " + gameId + " not found.");
        User u = getUserByUsername(username);
        if (u == null)
            throw new UserNotFoundException("User '" + username + "' not found.");

        if (!g.isBorrowed() || !username.equals(g.getBorrowedBy())) {
            throw new IllegalStateException("This game is not borrowed by " + username + ". Cannot return.");
        }
        g.markReturned();
        borrowedQueue.removeFirstOccurrence(g);
        boolean removed = u.returnGame(gameId);
        System.out.println("Success: Game ID " + gameId + " returned by " + username
                + (removed ? "" : " (note: not found in user's borrowed list)"));
    }

    @Override
    public Queue<Game> displayBorrowedQueue() {
        return new LinkedList<>(borrowedQueue);
    }

    @Override
    public Map<String, Integer> getStatistics() {
        Map<String, Integer> stats = new LinkedHashMap<>();
        int total = Game.totalGames;
        int borrowed = borrowedQueue.size();
        int available = (int) allGames.stream().filter(g -> !g.isBorrowed()).count();
        int usersCount = users.size();
        stats.put("TotalGames", total);
        stats.put("AvailableGames", available);
        stats.put("BorrowedGames", borrowed);
        stats.put("TotalUsers", usersCount);
        return stats;
    }
}

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GameHubManager manager = new GameHubManager();

        out er: while (true) {
            printMenu();
            System.out.print("Choice: ");
            String choice = sc.nextLine().trim();
            try {
                switch (choice) {
                    case "1":
                        handleAddGame(manager, sc);
                        break;
                    case "2":
                        System.out.print("Enter Game ID to remove: ");
                        int rid = Integer.parseInt(sc.nextLine().trim());
                        try {
                            manager.removeGame(rid);
                        } catch (GameNotFoundException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case "3":
                        handleViewGames(manager, sc);
                        break;
                    case "4":
                        System.out.print("Enter name or genre to search: ");
                        String q = sc.nextLine().trim();
                        List<Game> found = manager.searchGames(q);
                        if (found.isEmpty())
                            System.out.println("No matching games.");
                        else
                            found.forEach(Game::displayDetails);
                        break;
                    case "5":
                        System.out.print("Enter username: ");
                        String uname = sc.nextLine().trim();
                        System.out.print("Enter email: ");
                        String email = sc.nextLine().trim();
                        try {
                            manager.registerUser(new User(uname, email));
                        } catch (IllegalArgumentException e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                        break;
                    case "6":
                        Set<User> us = manager.viewUsers();
                        if (us.isEmpty())
                            System.out.println("No users registered.");
                        else
                            us.forEach(u -> System.out.println(u.toString()));
                        break;
                    case "7":
                        System.out.print("Enter Game ID to issue: ");
                        int ig = Integer.parseInt(sc.nextLine().trim());
                        System.out.print("Enter username: ");
                        String iu = sc.nextLine().trim();
                        try {
                            manager.issueGame(ig, iu);
                        } catch (GameNotFoundException | UserNotFoundException | IllegalStateException e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                        break;
                    case "8":
                        System.out.print("Enter Game ID to return: ");
                        int rg = Integer.parseInt(sc.nextLine().trim());
                        System.out.print("Enter username: ");
                        String ru = sc.nextLine().trim();
                        try {
                            manager.returnGame(rg, ru);
                        } catch (GameNotFoundException | UserNotFoundException | IllegalStateException e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                        break;
                    case "9":
                        Queue<Game> qlist = manager.displayBorrowedQueue();
                        if (qlist.isEmpty())
                            System.out.println("Borrowed queue is empty.");
                        else {
                            System.out.println("Borrowed Queue (oldest first):");
                            qlist.forEach(g -> System.out.println(g.toString()));
                        }
                        break;
                    case "10":
                        Map<String, Integer> stats = manager.getStatistics();
                        stats.forEach((k, v) -> System.out.println(k + ": " + v));
                        break;
                    case "0":
                        System.out.println("Exiting. Bye!");
                        break outer;
                    default:
                        System.out.println("Invalid choice.");
                }
            } catch (InvalidRatingException e) {
                System.out.println("Invalid rating: " + e.getMessage());
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid number entered.");
            } catch (Exception ex) {
                System.out.println("Unhandled error: " + ex.getMessage());
            }
            System.out.println("--------------------------------------------------");
        }
        sc.close();
    }

    private static void printMenu() {
        System.out.println("\n--- Game Hub Manager ---");
        System.out.println("1  - Add Game");
        System.out.println("2  - Remove Game");
        System.out.println("3  - View Games (sort options)");
        System.out.println("4  - Search Game (by name/genre)");
        System.out.println("5  - Register User");
        System.out.println("6  - View Users");
        System.out.println("7  - Issue Game");
        System.out.println("8  - Return Game");
        System.out.println("9  - Borrowed Games Queue");
        System.out.println("10 - Collection & User Stats");
        System.out.println("0  - Exit");
    }

    private static void handleAddGame(GameHubManager manager, Scanner sc) throws InvalidRatingException {
        System.out.print("Enter Game Name: ");
        String name = sc.nextLine().trim();
        System.out.print("Enter Genre: ");
        String genre = sc.nextLine().trim();
        System.out.print("Enter Rating (1-5): ");
        int rating = Integer.parseInt(sc.nextLine().trim());
        System.out.print("Platform (1-Console, 2-PC): ");
        String pch = sc.nextLine().trim();
        if ("1".equals(pch)) {
            System.out.print("Console Type (e.g., PS5, Xbox): ");
            String console = sc.nextLine().trim();
            ConsoleGame cg = new ConsoleGame(name, genre, rating, "Console", console);
            manager.addGame(cg);
        } else {
            System.out.print("Minimum Specs (e.g., 8GB RAM, GTX 1060): ");
            String specs = sc.nextLine().trim();
            PCGame pg = new PCGame(name, genre, rating, "PC", specs);
            manager.addGame(pg);
        }
    }

    private static void handleViewGames(GameHubManager manager, Scanner sc) {
        System.out.println("Sort by: 1-ID (default), 2-Name, 3-Rating");
        String s = sc.nextLine().trim();
        Comparator<Game> comp = null;
        if ("2".equals(s))
            comp = new NameComparator();
        else if ("3".equals(s))
            comp = new RatingComparator();
        List<Game> list = manager.viewGames(comp);
        if (list.isEmpty())
            System.out.println("No games in collection.");
        else
            list.forEach(Game::displayDetails);
    }
}
