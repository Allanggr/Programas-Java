package com.AllanRibeiro;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Album {

    private String albumName;
    private String artist;
    private static ArrayList<Song> songs;

    public Album(String albumName, String artist) {
        this.albumName = albumName;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public boolean addSong(String title, double duration){
        if(findSong(title) == null){
            this.songs.add(new Song(title,duration));
            return true;
        }
        return false;
    }

    public Song findSong(String title){
        for(Song checkSong: this.songs){
            if(checkSong.getTitle().equals(title)){
                return checkSong;
            }
        }
        return null;
    }

    public boolean addToPlaylist(int trackNumber, List<Song> playlist){
        int index = trackNumber -1;
        if((index >= 0) &&(index <= this.songs.size())){
            playlist.add(this.songs.get(index));
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlaylist(String title, List<Song> playlist){
        Song checkedSong = findSong(title);
        if(checkedSong != null){
            playlist.add(checkedSong);
            return true;
        }
        System.out.println("The song  " + title + " is not in the album");
        return false;
    }

}
