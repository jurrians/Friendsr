package jurrians.friendsr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.Arrays;




public class MainActivity extends AppCompatActivity {

    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int armisticeID = getResources().getIdentifier("armistice", "drawable", getPackageName());
        int arnoldWeberID = getResources().getIdentifier("arnoldweber", "drawable", getPackageName());
        int ashleyStubbsID = getResources().getIdentifier("ashleystubbs", "drawable", getPackageName());
        int bernardLoweID = getResources().getIdentifier("bernardlowe", "drawable", getPackageName());
        int charlotteHaleID = getResources().getIdentifier("charlottehale", "drawable", getPackageName());
        int clementinePennyfeatherID = getResources().getIdentifier("clementinepennyfeather", "drawable", getPackageName());
        int doloresAbernathyID = getResources().getIdentifier("doloresabernathy", "drawable", getPackageName());
        int elsieHughesID = getResources().getIdentifier("elsiehughes", "drawable", getPackageName());
        int hectorEscatonID = getResources().getIdentifier("hectorescaton", "drawable", getPackageName());
        int karlStrandID = getResources().getIdentifier("karlstrand", "drawable", getPackageName());
        int loganID = getResources().getIdentifier("logan", "drawable", getPackageName());
        int maeveMillayID = getResources().getIdentifier("maevemillay", "drawable", getPackageName());
        int manInBlackID = getResources().getIdentifier("maninblack", "drawable", getPackageName());
        int peterAbernathyID = getResources().getIdentifier("peterabernathy", "drawable", getPackageName());
        int robertFordID = getResources().getIdentifier("robertford", "drawable", getPackageName());
        int teddyFloodID = getResources().getIdentifier("teddyflood", "drawable", getPackageName());
        int thereseCullenID = getResources().getIdentifier("theresecullen", "drawable", getPackageName());

        Friend armistice = new Friend("Armistice","“\tThe Gods are pussies.\t”\n" +
                "–Armistice", armisticeID);
        Friend arnoldWeber = new Friend("Arnold Weber", "“\tHe died, here in the park. His personal life was marked by tragedy. He put all his hopes into his work...his search for consciousness consumed him totally: barely spoke to anyone, except to the hosts. In his alienation he saw something in them. He saw something that wasn't there. We called it an accident, but I knew Arnold and he was very, very careful.\t”\n" +
                "–Dr. Robert Ford (on Arnold)", arnoldWeberID);
        Friend ashleyStubbs = new Friend("Ashley Stubbs", "“\tThe only thing stopping the hosts from hacking us to pieces is one line of your code.\t”\n" +
                "–Ashley Stubbs, to Elsie Hughes", ashleyStubbsID);
        Friend bernardLowe = new Friend("Bernard Lowe", "“\tSelf-delusion is a gift of natural selection.\t”\n" +
                "–Bernard Lowe", bernardLoweID);
        Friend charlotteHale = new Friend("Charlotte Hale", "“\tOur interest in this place is entirely in the intellectual property. The code.\t”\n" +
                "–Charlotte Hale", charlotteHaleID);
        Friend clementinePennyfeather = new Friend("Clementine Pennyfeather", "“\tClementine Pennyfeather is one of the beautiful women who works at Westworld’s Mariposa brothel. To ensure your experience meets all your needs, the role of Clementine is played by a revolving cast of hosts.\t”\n" +
                "–Aeden", clementinePennyfeatherID);
        Friend doloresAbernathy = new Friend("Dolores Abernathy", "“\t Dolores sees the beauty in her everyday life and routine. Her optimism and enthusiasm makes her the perfect partner for a variety of adventures.\t”\n" +
                "–Aeden", doloresAbernathyID);
        Friend elsieHughes = new Friend("Elsie Hughes", "“\tDreams are mainly memories. You imagine how fucked we’d be if these poor assholes ever remembered what the guests do to them?\t”\n" +
                "–Elsie Hughes", elsieHughesID);
        Friend hectorEscaton = new Friend("Hector Escaton", "“\tI believe that only the truly brave can look at the world and understand that all of it, gods, men, everything else, will end badly. No one will be saved.\t”\n" +
                "–Hector Escaton", hectorEscatonID);
        Friend karlStrand = new Friend("Karl Strand", "Karl Strand is a character in HBO's Westworld. He is the Head of Operations at Delos and the leader of the Delos Extraction Team. He is played by Swedish Actor Gustaf Skarsgård.", karlStrandID);
        Friend logan = new Friend("Logan", "“\tI know that you think you have a handle on what this is gonna be. Guns and tits and all that. Mindless shit that I usually enjoy. You have no idea. This place seduces everybody eventually.\t”\n" +
                "–Logan, to William", loganID);
        Friend maeveMillay = new Friend("Maeve Millay", "“\tThe cunning and seductive Mariposa madam Maeve Millay is finely attuned to your desires; her intuition and perception will surely impress.\t”\n" +
                "–Aeden", maeveMillayID);
        Friend manInBlack = new Friend("Man In Black", "“\tThis whole world is a story. I've read every page except the last one. I need to find out how it ends. I want to know what this all means.\n" +
                "–The Man in Black", manInBlackID);
        Friend peterAbernathy = new Friend("Peter Abernathy", "“\tThese violent delights have violent ends.\t”\n" +
                "– Peter Abernathy (whispered to Dolores Abernathy)", peterAbernathyID);
        Friend robertFord = new Friend("Dr. Robert Ford", "“\tThe hosts are the ones who are free. Free. Here. Under my control.\t”\n" +
                "– Dr. Robert Ford", robertFordID);
        Friend teddyFlood = new Friend("Teddy Flood", "“\tThe maze, itself, is a sum of a man’s life, the choices he makes, the dreams he hangs onto.\t”\n" +
                "–Teddy Flood", teddyFloodID);
        Friend thereseCullen = new Friend("Theresa Cullen", "“\tThey're only yours until they stop working, Bernie. Then they're mine.\t”\n" +
                "–Theresa Cullen", thereseCullenID);

        ArrayList<Friend> friends = new ArrayList<>(Arrays.asList(
                armistice,
                arnoldWeber,
                ashleyStubbs,
                bernardLowe,
                charlotteHale,
                clementinePennyfeather,
                doloresAbernathy,
                elsieHughes,
                hectorEscaton,
                karlStrand,
                logan,
                maeveMillay,
                manInBlack,
                peterAbernathy,
                robertFord,
                teddyFlood,
                thereseCullen
        ));

        GridView gridView = findViewById(R.id.gridView);

        FriendsAdapter adapter = new FriendsAdapter(this, R.layout.grid_item, friends);
        gridView.setAdapter(adapter);

        GridItemListener listener = new GridItemListener();
        gridView.setOnItemClickListener(listener);
    }

    private class GridItemListener implements AdapterView.OnItemClickListener {

        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            Friend clickedFriend = (Friend) parent.getItemAtPosition(position);
            Log.d("OnItemClick", clickedFriend.getName());

            Intent intent = new Intent(MainActivity.this, ProfileActivity.class);

            intent.putExtra("clickedFriend", clickedFriend);
            startActivity(intent);
        }
    }


}
