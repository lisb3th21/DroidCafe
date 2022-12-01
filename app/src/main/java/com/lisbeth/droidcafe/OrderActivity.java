package com.lisbeth.droidcafe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class OrderActivity extends AppCompatActivity {

    private static final String TAG_ACTIVITY = "tag";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
    }

    public void onRadioButtonClicked(View view) {
// Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
// Check which radio button was clicked
switch(view.getId()) {
        case R.id.same_day:
            if (checked) {
                Toast.makeText(this,"Chosen: " + getString(R.string.same_day), Toast.LENGTH_SHORT).show();
            }

        break;
    case R.id.next_day:

        if (checked) {
            Toast.makeText(this,"Chosen: " +getString(R.string.next_day), Toast.LENGTH_SHORT).show();
        }
        break;
        case R.id.pick_up:
            if (checked) {
                Toast.makeText(this,"Chosen: " + getString(R.string.pick_up), Toast.LENGTH_SHORT).show();
            }
        break;
            default:
        Log.d(TAG_ACTIVITY, getString(R.string.nothing_clicked)); break;
    }
}
}