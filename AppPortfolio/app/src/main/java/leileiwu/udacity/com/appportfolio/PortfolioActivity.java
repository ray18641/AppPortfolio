package leileiwu.udacity.com.appportfolio;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class PortfolioActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_porfolio);
    }

    public void popMovie(View v) {
        Toast.makeText(this, "This button will launch popular movies", Toast.LENGTH_LONG).show();
    }

    public void stockHawk(View v) {
        Toast.makeText(this, "This button will launch stock hawk", Toast.LENGTH_LONG).show();
    }

    public void buildBigger(View v) {
        Toast.makeText(this, "This button will launch build it bigger", Toast.LENGTH_LONG).show();
    }

    public void material(View v) {
        Toast.makeText(this, "This button will launch make your app material", Toast.LENGTH_LONG).show();
    }

    public void ubiquitous(View v) {
        Toast.makeText(this, "This button will launch go ubiquitous", Toast.LENGTH_LONG).show();
    }

    public void capstone(View v) {
        Toast.makeText(this, "This button will launch my capstone", Toast.LENGTH_LONG).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_porfolio, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
