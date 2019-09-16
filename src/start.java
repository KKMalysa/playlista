public class start {
    public static void main(String[] args) {

        Song song1 = new Song("Slow Cheetach", 320);
        Song song2 = new Song("Stadium Arcadium", 315);
        Song song3 = new Song("Dani California", 282);
        Song song4 = new Song("Snow (Hey oh)", 334);
        Song song5 = new Song("Especially in Michigan", 240);
        Song song6 = new Song("Hard to Concentrate", 241);
        Song song7 = new Song("Tell Me Baby", 247);

        int playlisLength = Playlist.countLength(song1, song2, song3, song7);
        System.out.printf("cała playlista trwa %d sekund, czyli: ", playlisLength);
        String formatedLength = Playlist.getFormatedLength(playlisLength);
        System.out.println(formatedLength);
    }
}
