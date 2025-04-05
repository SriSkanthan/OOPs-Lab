interface Streamable {
    void play();
    void pause();
}

class Movie implements Streamable {
    String title;

    Movie(String title) {
        this.title = title;
    }

    public void play() {
        System.out.println("Playing Movie: " + title);
    }

    public void pause() {
        System.out.println("Pausing Movie: " + title);
    }
}

class TVShow implements Streamable {
    String title;

    TVShow(String title) {
        this.title = title;
    }

    public void play() {
        System.out.println("Playing TV Show: " + title);
    }

    public void pause() {
        System.out.println("Pausing TV Show: " + title);
    }
}

class MusicTrack implements Streamable {
    String title;

    MusicTrack(String title) {
        this.title = title;
    }

    public void play() {
        System.out.println("Playing Music Track: " + title);
    }

    public void pause() {
        System.out.println("Pausing Music Track: " + title);
    }
}

public class intf4{
    public static void main(String[] args) {
        Streamable movie = new Movie("Inception");
        movie.play();
        movie.pause();

        Streamable tvShow = new TVShow("Breaking Bad");
        tvShow.play();
        tvShow.pause();

        Streamable music = new MusicTrack("Bohemian Rhapsody");
        music.play();
        music.pause();
    }
}
