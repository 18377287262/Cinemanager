package net.lzzy.cinemanager.activities;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Window;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import net.lzzy.cinemanager.R;
import net.lzzy.cinemanager.fragments.CinemaOrdersFragment;

/**
 *
 * @author lzzy_gxy
 * @date 2019/4/2
 * Description:
 */
@SuppressLint("Registered")
public class CinemaOrdersActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_cinema_orders);
        String cinamaId=getIntent().getStringExtra(MainActivity.EXTRA_CINEMA_ID);
        FragmentManager manager=getSupportFragmentManager();
        Fragment fragment=manager.findFragmentById(R.id.cinema_order_container);
        if (fragment==null){
            fragment= CinemaOrdersFragment.newInstance(cinamaId);
            manager.beginTransaction().add(R.id.cinema_order_container,fragment).commit();
        }


   }
}
