package communa.romanoff.com.communa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class SecondActivity extends AppCompatActivity {

  private String userName;
  private String userCountry;
  private Toolbar toolbar;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_second);

    toolbar = findViewById(R.id.toolbar);
    setSupportActionBar(toolbar);
//    --------------------getting intent data--------------------
    User user = (User) getIntent().getSerializableExtra("userObject");
//    --------------------getting intent data--------------------

    userName = user.getName();
    userCountry = user.getCountry();

    displayUserName(userName);

  }


  private void displayUserName(String name) {
    getSupportActionBar().setTitle(name); //titling toolbar
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    getMenuInflater().inflate(R.menu.user_info_menu, menu);
    return true;
  }

  @Override
  public boolean onOptionsItemSelected(MenuItem item) {
    if (item.getItemId() == R.id.action_settings) {
      Intent intent = new Intent(this, SettingsActivity.class);
      startActivity(intent);
    }
    return true;
  }

}
