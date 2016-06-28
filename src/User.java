import java.util.HashMap;
import java.util.ArrayList;

public class User {
    private String mName;
    private HashMap<String, Playlist> mPlaylists;

    public User(String name){
        mName = name;

        mPlaylists = new HashMap<>();
    }

    public void addPlaylist(Playlist playlist){
        // add parameter playlist to mPlaylists
        mPlaylists.put(playlist.getName(), playlist);

    }

    //return a collection of all the user's playlist names
    public void getAllPlaylistNames(ArrayList<Song> playlist){

        for(int i = 0; i < mPlaylists.size(); i++){
            System.out.println(mPlaylists.get(i));
            //TODO: Try returning a list instead of printing elmeents
        }
    }

    public Playlist getPlaylistByName(String name){
        //return the playlist from the collection that matches the name parameter
        //if no match, then return null
        return mPlaylists.get(name);
    }


}
