import java.lang.reflect.Array;
import java.util.ArrayList;

public class Playlist {
    private String mName;
    private ArrayList<Song> mSongs;

    public Playlist(String name){
        mName = name;

        mSongs = new ArrayList<>();
    }

    public String getName(){
        return mName;
    }

    public int getSize(ArrayList a){
        return a.size();
    }

    public void addSong(Song song){
        mSongs.add(song);
    }

    public void playAll(ArrayList<Song> songs){
        for(int i = 0; i < mSongs.size(); i++){
            mSongs.get(i).play();
        }
    }

}
