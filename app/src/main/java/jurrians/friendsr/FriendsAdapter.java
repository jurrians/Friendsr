package jurrians.friendsr;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;



public class FriendsAdapter extends ArrayAdapter<Friend> {

//    private int layoutResourceId;
    private ArrayList<Friend> friends;


    // change parameters of constructor to reflect the type of your list
    // (ArrayList<Friend> ipv List<Friend>
    // Friend(String name, String bio, int drawableId)

//    @NonNull
//    @Override

    public FriendsAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Friend> objects) {
        super(context, resource, objects);
        friends = objects;
    }


    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.grid_item, parent, false);
        }

        // --> load specific layout and show data

        // get access to layouts views by method convertView.findViewById()
        ImageView icon = (ImageView) convertView.findViewById(R.id.icons);
        TextView name = (TextView) convertView.findViewById(R.id.names);

        // get data fom arrayList friends using friends.get(), providing index of the friend we'd like to display
        Friend friend = friends.get(position);

        // to load a Drawable image for putting into the ImageView, use:
        // getContext().getResources().getDrawable( .. resource id of image ..)
        // we saved resource ids for each in the friends list already

//        Drawable drawableImage = getContext().getDrawable(friend.getDrawableId());
//
//        icon.setImageDrawable(drawableImage);
        icon.setImageResource(friend.getDrawableId());
        name.setText(friend.getName());

        return convertView;
    }

}
