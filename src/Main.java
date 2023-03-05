public class Main{
    public static void main(String[] args) {
        
        MusicBox mbox = new MusicBox("S34TG65", 'Y', "Raindrops", "Misty", 
        "The path less traveled", "Country", "BZEE Music", "Rhythm Divine");

        PlaySongs player1 = new PlaySongs();

        System.out.println("Now playing the song");
        player1.playSong(mbox.getSongID(), mbox.getPremiumSong(), 2);

        MusicBox nbox = new MusicBox("S34TG63", 'N', "Rain", "Misty", 
        "The path less traveled", "Country", "BZEE Music", "Rhythm Divine");

        PlaySongs player2 = new PlaySongs();

        System.out.println("Now playing the song");
        player2.playSong(nbox.getSongID(), nbox.getPremiumSong(), 1);
        
        // --- TODO

        /* Repeat the above code to create another object  
         * Pass different parameters to the MusicBox constructor, but initialise premiumSong to N and when calling the
         * playSong method, pass ads parameter as just 1
         * 
         * 
        */
        

    }
}




