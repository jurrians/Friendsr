package jurrians.friendsr;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        Intent intent = getIntent();
        final Friend clickedFriend = (Friend) intent.getSerializableExtra("clickedFriend");

        ImageView profileImage = findViewById(R.id.profileImage);
        TextView profileText = findViewById(R.id.profileText);
        TextView bioText = findViewById(R.id.bioText);
        RatingBar ratingBar = findViewById(R.id.ratingBar);

        profileImage.setImageResource(clickedFriend.getDrawableId());
        profileText.setText(clickedFriend.getName());
        bioText.setText(clickedFriend.getBio());
        loadFromSharedPrefs();

        RatingBar.OnRatingBarChangeListener barChangeListener = new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                Log.d("rating", "changed");

                SharedPreferences.Editor editor = getSharedPreferences("settings", MODE_PRIVATE).edit();
                editor.putFloat("rating", rating);
                editor.apply();
            }
        };

        ratingBar.setOnRatingBarChangeListener(barChangeListener);
    }

    public void loadFromSharedPrefs() {

        SharedPreferences prefs = this.getSharedPreferences("settings" ,this.MODE_PRIVATE);
        RatingBar ratingBar = findViewById(R.id.ratingBar);
        float  ratingRes = prefs.getFloat("rating", 0.0f);

        if (ratingRes != 0.0f){
            ratingBar.setRating(ratingRes);
        }
        else {
            ratingBar.setRating(0.0f);
        }
    }
}


