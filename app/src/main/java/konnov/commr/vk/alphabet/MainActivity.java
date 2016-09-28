package konnov.commr.vk.alphabet;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    final int MENU_RUSSIAN_ID = 1;
    final int MENU_ENGLISH_ID = 2;
    final int MENU_REPORTS_ID = 3;
    final int MENU_QUIT_ID = 4;

    TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        output = (TextView) findViewById(R.id.output);
    }

    // создание меню
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
// TODO Auto-generated method stub
        menu.add(0, MENU_RUSSIAN_ID, 0, "Russian alphabet");
        menu.add(0, MENU_ENGLISH_ID, 0, "English alphabet");
        menu.add(0, MENU_REPORTS_ID, 0, "Feedback");
        menu.add(0, MENU_QUIT_ID, 0, "Quit");
        return super.onCreateOptionsMenu(menu);
    }

    // обработка нажатий на пункты меню
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
// TODO Auto-generated method stub
        switch (item.getItemId()) {
            case MENU_RUSSIAN_ID:
                output.setText(R.string.russian_alph);
                break;
            case MENU_ENGLISH_ID:
                output.setText(R.string.english_alph);
                break;
            case MENU_REPORTS_ID:
                Intent browseIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://vk.com/im?media=&sel=223582583"));
                startActivity(browseIntent);
                break;
            case MENU_QUIT_ID:
// выход из приложения
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
