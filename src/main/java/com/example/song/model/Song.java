// Write your code here
package com.example.song.model;

public class Song {
    private int songId;
    private String SongName;
    private String Lyricist;
    private String Singer;
    private String MusicDirector;
    public Song(int songId, String SongName, String Lyricist,String Singer,String MusicDirector) {
        this.songId = songId;
        this.SongName = SongName;
        this.Lyricist = Lyricist;
        this.Singer=Singer;
        this.MusicDirector=MusicDirector;
    }

    public int getsongId() {
        return songId;
    }

    public void setsongId(int songId) {
        this.songId = songId;
    }

    public String getSongName() {
        return SongName;
    }

    public void setSongName(String SongName) {
        this.SongName = SongName;
    }

    public String getLyricist() {
        return Lyricist;
    }

    public void setLyricist(String Lyricist) {
        this.Lyricist = Lyricist;
    }
public String getSinger() {
        return Singer;
    }

    public void setSinger(String Singer) {
        this.Singer = Singer;
    }
    public String getMusicDirector() {
        return MusicDirector;
    }

    public void setMusicDirector(String MusicDirector) {
        this.MusicDirector = MusicDirector;
    }
}