package ru.aston.hometask.task3.builder;

public class SongMaker {

    public static void makeNewSong() {
        Song song = new Song.Builder()
                .setTitle("Bad Apple")
                .setArtist("ZUN")
                .setAlbum("Touhou")
                .setYear(1998)
                .setGenre("electronic")
                .build();

        System.out.println(song);
    }
}
