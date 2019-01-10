package communa.romanoff.com.communa;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import java.util.List;

public class MainActivity extends AppCompatActivity {

  private Toolbar toolbar;



  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    toolbar = findViewById(R.id.toolbar);
    setSupportActionBar(toolbar);

    View rootView = findViewById(android.R.id.content);

    final List<TextInputLayout> textInputLayouts = Utils.findViewsWithType(
        rootView, TextInputLayout.class);

    Button button = findViewById(R.id.next_button);
    button.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        boolean noErrors = true;
        for (TextInputLayout textInputLayout : textInputLayouts) {
          String editTextString = textInputLayout.getEditText().getText().toString();
          if (editTextString.isEmpty()) {
            textInputLayout.setError(getResources().getString(R.string.error_string));
            noErrors = false;
          } else {
            textInputLayout.setError(null);
          }
        }

        if (noErrors) {
          // All fields are valid!
        }
      }
    });



  }
  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    getMenuInflater().inflate(R.menu.user_info_menu,menu);
    return true;
  }

}
