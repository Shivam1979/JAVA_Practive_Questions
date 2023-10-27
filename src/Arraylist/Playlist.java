package Arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/*311.
        **Iterating through Collections:* 🔄 Create a class "Playlist" that manages a collection of songs.
        Implement methods to add songs to the playlist and iterate through the songs using iterators,
        demonstrating how to traverse the playlist in both forward and backward directions. 🎵🔁*/
public class Playlist {
/*step1 : first we create a arraylist then we add the song by making the method or
          directly by add method of collection class
 step2: after that we iterate the collection in forward direction by using list iterator
 step3: then by using same we iterate the value in reverse order */

    public static void main(String[] args) {
        ArrayList<String> Playlist  = new ArrayList();
        Playlist.add("Chaiyya Chaiyya");
        Playlist.add("Tum Hi Ho");
        Playlist.add("Kabira");
        Playlist.add("Kal Ho Naa Ho");
        Playlist.add("Lag Ja Gale");
        Playlist.add("Gerua");
        Playlist.add("Dil Diyan Gallan");
        Playlist.add("Tum Se Hi");
        Playlist.add("Zara Zara");
        Playlist.add("Pee Loon");
        System.out.println("Playing in forward direction....");
        ListIterator li = Playlist.listIterator();
        int i = 1;
        while (li.hasNext()){
            System.out.println(i+" "+li.next()+" ");
            i++;
        }
        System.out.println("Playing in reverse Direction .........");
        int j = 1;
        while (li.hasPrevious()){
            System.out.println(j+" "+li.previous()+" ");
        }


    }
}
