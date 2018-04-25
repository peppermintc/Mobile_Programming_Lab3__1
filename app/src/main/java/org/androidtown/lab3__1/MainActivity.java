package org.androidtown.lab3__1;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    //button declare
    Button mBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //inflate
        setContentView(R.layout.activity_main);
        mBtn = findViewById(R.id.btn1);

        //register context menu to button
        registerForContextMenu(mBtn);
    }

    public void onCreateContextMenu (ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);;

        //menu detail
        menu.setHeaderTitle("Button Menu");
        menu.add(0,1,1,"Red");
        menu.add(0,2,2,"Green");
        menu.add(0,3,3,"Blue");
    }
    public boolean onContextItemSelected (MenuItem item) {
        //get Item id and put it in int variable
        int curId = item.getItemId();

        //change text color according to ID
        switch(curId){
            case 1:
                mBtn.setTextColor(Color.RED);
                break;
            case 2:
                mBtn.setTextColor(Color.GREEN);
                break;
            case 3:
                mBtn.setTextColor(Color.BLUE);
                break;
            default:
                break;
        }

        return super.onContextItemSelected(item);
    }
}