
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
}
