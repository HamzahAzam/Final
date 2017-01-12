package course.java.ucl.loginactivity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;


<<<<<<< HEAD
public class MainActivityFragmentContainer extends FragmentActivity
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
=======
public class MainActivityFragmentContainer extends FragmentActivity  {
    @Override
    public void onCreate(Bundle savedInstanceState) {
>>>>>>> 3af91408c10a12c412e43b3fa4eebf36d4974cb5
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_conatiner);

        FragmentManager manager = getSupportFragmentManager();
        Fragment fragment = manager.findFragmentById(R.id.fragment_container);
        // Check that the activity is using the layout version with
        // the fragment_container FrameLayout
<<<<<<< HEAD
        if (fragment == null)
        {
=======
        if (fragment == null) {
            //fragment = new MainFragment();
>>>>>>> 3af91408c10a12c412e43b3fa4eebf36d4974cb5
            fragment = new RegistereUsersList();
            manager.beginTransaction()
                    .add(R.id.fragment_container, fragment)
                    .commit();
        }

    }

}
