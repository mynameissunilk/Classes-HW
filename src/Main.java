
public class Main {

    public static void main(String[] args){
        // create a new user
        User Sunil = new User("Sunil");

        //create at least 5 instances of song, assign each to a variable
        Song personaljesus = new Song("Personal Jesus", "Depeche Mode", "Violator");
        Song planetmars = new Song("Mars", "Gustav Holst", "The Planets");
        Song checkphone = new Song("Can't Keep Checking my Phone", "UMO", "Multi-Love");
        Song enolagay = new Song("Enola Gay", "OMD", "The Best of OMD");
        Song halcyon = new Song ("Halcyon & On & On", "Orbital", "Mortal Kombat OST");
        Song cantataorb = new Song("Cantata Orbis", "Various Artists", "The Ideon: OST");

        // Create & Add songs to two playlists
        Playlist oldSongs = new Playlist("Frequenly Played");
        oldSongs.addSong(personaljesus);
        oldSongs.addSong(enolagay);
        oldSongs.addSong(halcyon);
        //test
        System.out.println(oldSongs.getName());

        Playlist newSongs = new Playlist("Recent Downloads");
        newSongs.addSong(checkphone);
        newSongs.addSong(planetmars);
        newSongs.addSong(cantataorb);
        //test
        System.out.println(newSongs.getName());

        //add playlists to user

        // I'm doing this wrong...
        Sunil.addPlaylist(oldSongs);
        System.out.println(Sunil.getPlaylistByName("Frequently Played"));
        System.out.println(Sunil.getPlaylistByName("Recent Downloads"));

//        for(int i = 0; i < newSongs.getSize(); i++){ //
            //TODO: going to have to come back to this... can't access size because I made member variables private?

 //       }
    }

}
