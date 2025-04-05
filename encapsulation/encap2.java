class Playlist {
    private int volumeLevel;
    private boolean isMuted;

    public void setVolume(int level) {
        if (level >= 0 && level <= 100) {
            volumeLevel = level;
        }
    }

    public void toggleMute() {
        isMuted = !isMuted;
    }

    public String getPlaybackStatus() {
        if (isMuted) return "Muted 🔇";
        return "Playing at volume " + volumeLevel + " 🔊";
    }
}

public class encap2{
    public static void main(String[] args) {
        Playlist myPlaylist = new Playlist();
        myPlaylist.setVolume(65);
        System.out.println(myPlaylist.getPlaybackStatus());
        myPlaylist.toggleMute();
        System.out.println(myPlaylist.getPlaybackStatus());
    }
}
