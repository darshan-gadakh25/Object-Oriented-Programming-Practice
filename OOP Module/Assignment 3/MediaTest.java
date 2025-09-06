interface AudioPlayer {
    void playAudio(String song);
}

interface VideoPlayer {
    void playVideo(String movie);
}

class MediaPlayer implements AudioPlayer, VideoPlayer {
    @Override
    public void playAudio(String song) {
        System.out.println("Playing Audio: " + song);
    }

    @Override
    public void playVideo(String movie) {
        System.out.println("Playing Video: " + movie);
    }
}

public class MediaTest {
    public static void main(String[] args) {
        MediaPlayer player = new MediaPlayer();

        player.playAudio("Shape of You");
        player.playVideo("Inception");
    }
}