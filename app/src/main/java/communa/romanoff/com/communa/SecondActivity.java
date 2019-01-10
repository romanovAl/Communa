package communa.romanoff.com.communa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SecondActivity extends AppCompatActivity {

  private String username;
  private String country;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_second);

    username = (String)getIntent().getSerializableExtra("userName");
    country = (String)getIntent().getSerializableExtra("country");


  }
}
