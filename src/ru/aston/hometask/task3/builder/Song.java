package ru.aston.hometask.task3.builder;

public class Song {
    private final String title;
    private final String artist;
    private final String album;
    private final int year;
    private final String genre;

    private Song(Builder builder) {
        this.title = builder.title;
        this.artist = builder.artist;
        this.album = builder.album;
        this.year = builder.year;
        this.genre = builder.genre;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getAlbum() {
        return album;
    }

    public int getYear() {
        return year;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return String.format("Song{title='%s', artist='%s', album='%s', year=%d, genre='%s'}",
                title, artist, album, year, genre);
    }

    public static class Builder {
        private String title;
        private String artist;
        private String album;
        private int year;
        private String genre;

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setArtist(String artist) {
            this.artist = artist;
            return this;
        }

        public Builder setAlbum(String album) {
            this.album = album;
            return this;
        }

        public Builder setYear(int year) {
            this.year = year;
            return this;
        }

        public Builder setGenre(String genre) {
            this.genre = genre;
            return this;
        }

        public Song build() {
            if (title == null || title.isEmpty()) {
                throw new IllegalStateException("title required");
            }
            return new Song(this);
        }
    }
}
