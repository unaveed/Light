package edu.utah.cs4962.light;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Switch;

public class LightActivity extends Activity {

    ImageView _lightImageView;
    Switch _lightSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout rootLayout = new LinearLayout(this);
        rootLayout.setOrientation(LinearLayout.VERTICAL);

        _lightImageView = new ImageView(this);
        _lightImageView.setImageResource(R.drawable.off);
//        _lightImageView.setBackgroundColor(Color.RED);
        rootLayout.addView(_lightImageView, new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT, 2));

        _lightSwitch = new Switch(this);
//        _lightSwitch.setBackgroundColor(Color.GREEN);
        LinearLayout.LayoutParams lightSwitchLayoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, 0, 1);
        lightSwitchLayoutParams.gravity = Gravity.CENTER_HORIZONTAL;
        rootLayout.addView(_lightSwitch, lightSwitchLayoutParams);

        _lightSwitch.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (_lightSwitch.isChecked()) {
                    _lightImageView.setImageResource(R.drawable.on);
                }
                else {
                    _lightImageView.setImageResource(R.drawable.off);
                }
            }
        });

        setContentView(rootLayout);
    }
}
