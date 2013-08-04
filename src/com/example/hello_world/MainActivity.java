package com.example.hello_world;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends Activity {
	WorldGen earth = new WorldGen("Earth", 5973, 9.78);		// Create a World object
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setStartUpWorldValues();
        setStartUpScreenText();
    }
    protected void setStartUpWorldValues() {
    	earth.setPlanetColonies(1);							// Set Planet Colonies to 1
        earth.setPlanetMilitary(1);							// Set Planet Military Bases to 1
        earth.setColonyImmigration(1000);					// Set Planet Population to 1,000
        earth.setBaseProtection(100);						// Set Planet Armed Forces to 100
        earth.turnForceFieldOn();							// Turn On the Planet Force Field
    }
    private void setStartUpScreenText() {
    	TextView planetNameValue = (TextView)findViewById(R.id.dataView1);			// dataView1
    	planetNameValue.setText(earth.planetName);
    	TextView planetMassValue = (TextView)findViewById(R.id.dataView2);			// dataView2
    	planetMassValue.setText(String.valueOf(earth.planetMass));
    	TextView planetGravityValue = (TextView)findViewById(R.id.dataView3);		// dataView3
    	planetGravityValue.setText(String.valueOf(earth.planetGravity));
    	TextView planetColoniesValue = (TextView)findViewById(R.id.dataView4);		// dataView4	
    	planetColoniesValue.setText(String.valueOf(earth.planetColonies));
    	TextView planetPopulationValue = (TextView)findViewById(R.id.dataView5);	// dataView5
    	planetPopulationValue.setText(String.valueOf(earth.planetPopulation));
    	TextView planetMilitaryValue = (TextView)findViewById(R.id.dataView6);		// dataView6
    	planetMilitaryValue.setText(String.valueOf(earth.planetMilitary));
    	TextView planetBasesValue = (TextView)findViewById(R.id.dataView7);			// dataView7
    	planetBasesValue.setText(String.valueOf(earth.planetBases));
    	TextView planetForceFieldValue = (TextView)findViewById(R.id.dataView8);	// dataView8
    	planetForceFieldValue.setText(String.valueOf(earth.planetProtection)); 	
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}
