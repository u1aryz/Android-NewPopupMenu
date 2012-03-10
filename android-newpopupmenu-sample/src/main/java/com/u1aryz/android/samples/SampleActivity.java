package com.u1aryz.android.samples;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.u1aryz.android.lib.newpopupmenu.MenuItem;
import com.u1aryz.android.lib.newpopupmenu.PopupMenu;
import com.u1aryz.android.lib.newpopupmenu.PopupMenu.OnItemSelectedListener;

public class SampleActivity extends ListActivity implements
        OnItemSelectedListener {

    private final static int PLAY_SELECTION = 0;
    private final static int ADD_TO_PLAYLIST = 1;
    private final static int SEARCH = 2;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String[] array = new String[] { "a", "b", "c", "d", "e", "f", "g", "h", "i" };
        setListAdapter(new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, array));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        // Create Instance
        PopupMenu menu = new PopupMenu(this);
        menu.setHeaderTitle("TitleTitleTitleTitleTitleTitle");
        // Set Listener
        menu.setOnItemSelectedListener(this);
        // Add Menu (Android menu like style)
        menu.add(PLAY_SELECTION, R.string.play).setIcon(
                getResources().getDrawable(R.drawable.ic_context_menu_play_normal));
        menu.add(ADD_TO_PLAYLIST, R.string.add_to_playlist).setIcon(
                getResources().getDrawable(R.drawable.ic_context_menu_add_to_playlist_normal));
        menu.add(SEARCH, R.string.search).setIcon(
                getResources().getDrawable(R.drawable.ic_context_menu_search_normal));
        menu.show(v);
    }

    @Override
    public void onItemSelected(MenuItem item) {
        switch (item.getItemId()) {
        case PLAY_SELECTION:
            break;

        case ADD_TO_PLAYLIST:
            break;

        case SEARCH:
            break;

        }
    }
}
