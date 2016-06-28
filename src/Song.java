
public
class Song {
    private String mSongName;
    private String mArtistName;
    private String mAlbumName;

    public Song(String song, String artist, String album){
        mSongName = song;
        mArtistName = artist;
        mAlbumName = album;
    }
    public void play(){
        System.out.println("Song: " + mSongName + " Artist: " + mAlbumName +" Album: " + mAlbumName);
    }

    public void setSongName(String name){
        mSongName = name;
    }

    public String getSongName(){
        return mSongName;
    }
    public void setArtistName(String name){
        mArtistName = name;
    }
    public String getArtistName(){
        return mArtistName;
    }

    public void setAlbumName(String name){
        mAlbumName = name;
    }
    public String getmAlbumName(){
        return mAlbumName;
    }
}
