package edu.np.ece.mapg.mp1.S10144390;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends Activity {

	int myNumber = 0;
	
	EditText etNumber;
	Button btGuess;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        btGuess = (Button) this.findViewById(R.id.btGuess);
        etNumber = (EditText) this.findViewById(R.id.etNumber);
        
		
        btGuess.setOnClickListener(buttonListener);
        
    }

    
    private View.OnClickListener buttonListener = new View.OnClickListener(){
    	@Override
		public void onClick(View v) {
    		String str1 = etNumber.getText().toString();
    		int v1 = Integer.parseInt(str1);
    		
			if (myNumber == v1)
			{
				Toast.makeText(MainActivity.this, "Bingo! Correct Number!", Toast.LENGTH_SHORT).show();
			}
			else
			{
				Toast.makeText(MainActivity.this, "Try again!", Toast.LENGTH_SHORT).show();
			}
			
		}
    };
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
