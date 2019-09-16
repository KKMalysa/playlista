/**
 * W programie stwórz klasę reprezentującą pojedynczą piosenkę. Każda piosenka powinna mieć informację o nazwie oraz czasie trwania wyrażoną w sekundach.
 *
 * W osobnej klasie, np. Playlist, zdefiniuj metodę, która przyjmuje dowolną liczbę piosenek (jako osobne argumenty) i zwraca łączny czas odtwarzania w sekundach. Powinno więc być możliwe wywołanie metody w dowolny z przedstawionych poniżej sposobów:
 * -----------------------------------------------------------------
 * Song song1 = new Song("Ulalala", 320);
 * int playlistLength = Playlist.playlistLength(song1);
 * -----------------------------------------------------------------
 * lub
 * -----------------------------------------------------------------
 * Song song1 = new Song("Ulalala", 320);
 * Song song2 = new Song("Nothing else matters", 320);
 * int playlistLength = Playlist.playlistLength(song1, song2);
 * -----------------------------------------------------------------
 * Stwórz klasę testową, w której wyświetlisz czas odtwarzania w postaci HH:mm:ss gdzie H to godziny, m to minuty, a s to sekundy.
 *
 * Zagadnienia przydatne do rozwiązania: definiowanie klas, metod i obiektów, tablice, zmienna liczba argumentów, pętle, instrukcje sterujące.
 */
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
