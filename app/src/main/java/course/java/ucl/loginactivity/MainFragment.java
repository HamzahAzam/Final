package course.java.ucl.loginactivity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.View;
import android.util.Log;

import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.widget.Adapter;


<<<<<<< HEAD
public class MainFragment extends Fragment
{
    Button b1,b3;

    int selection = 0;

    int LoggedIn = 0;

=======
public class MainFragment extends Fragment  {
    Button b1,b2,b3;
    EditText et_Username, et_Password;

    TextView tx1;
    int counter = 3;
    int selection = 0;

    int LoggedIn = 0;
>>>>>>> 3af91408c10a12c412e43b3fa4eebf36d4974cb5
    Bundle bundle = new Bundle();

    public int getSelect() { return selection; }

    private static final String TAG = "COMP211P";


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
<<<<<<< HEAD
                             Bundle savedInstanceState)
    {
=======
                             Bundle savedInstanceState) {
>>>>>>> 3af91408c10a12c412e43b3fa4eebf36d4974cb5


       final View rootView = inflater.inflate(R.layout.activity_main,
                container, false);

        b1 = (Button) rootView.findViewById(R.id.btn_main_login);
<<<<<<< HEAD
        b3 = (Button)rootView.findViewById(R.id.btn_start_quiz);



        final DBHandler db = new DBHandler(getContext());

        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
=======


        b2 = (Button)rootView.findViewById(R.id.btn_main_quit);
        b3 = (Button)rootView.findViewById(R.id.btn_start_quiz);

       // FragmentManager manager = getSupportFragmentManager();
       // Fragment fragment = manager.findFragmentById(R.id.fragmentactivity);

        final DBHandler db = new DBHandler(getContext());

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
>>>>>>> 3af91408c10a12c412e43b3fa4eebf36d4974cb5

                FragmentManager manager = getFragmentManager();
                //Fragment fragment = manager.findFragmentById(R.id.fragment_container);

                bundle.putInt("loggedin",LoggedIn);
<<<<<<< HEAD
                Fragment fragment = new LoginMenu();
=======
                Fragment fragment = new RegistereUsersList();
>>>>>>> 3af91408c10a12c412e43b3fa4eebf36d4974cb5
                fragment.setArguments(bundle);
                manager.beginTransaction().replace(R.id.fragment_container, fragment, fragment.getClass().getSimpleName()).addToBackStack(null).commit();
            }
        });

<<<<<<< HEAD
        b3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {


                FragmentManager manager = getFragmentManager();
                Fragment fragment;
=======
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               // Intent intent = new Intent(getApplicationContext(), RegisterNewUser.class);
               // startActivity(intent);
                FragmentManager manager = getFragmentManager();
                Fragment fragment = manager.findFragmentById(R.id.fragment_container);
              //LoggedIn = fragment.getArguments().getInt("loggedin");


                 //   fragment = new QuizActivity();
                 //   fragment.setArguments(bundle);
                 //   manager.beginTransaction().replace(R.id.fragment_container, fragment, fragment.getClass().getSimpleName()).addToBackStack(null).commit();
              //  }
              //  else {
>>>>>>> 3af91408c10a12c412e43b3fa4eebf36d4974cb5
                /*
                    Start the quiz session for each logged in user...

                 */

                ArrayList<String> loggedInuser = LoginMenu.getLoggedInUsers();
<<<<<<< HEAD

                if(loggedInuser.isEmpty())
                {
=======
             /*   ArrayList<String> listItems=new ArrayList<String>();
                ArrayAdapter<String> adapter;

                loggedInUser.getAdapter().

                adapter = loggedInUser.getAdapter(); */
                if(loggedInuser.isEmpty()) {
>>>>>>> 3af91408c10a12c412e43b3fa4eebf36d4974cb5
                    Toast.makeText(getActivity(),
                            "Please Login First...", Toast.LENGTH_SHORT).show();
                }
                else {
                    for (String userName : loggedInuser) {
<<<<<<< HEAD

=======
                     /*   Intent intent = new Intent(fragment.getActivity(), QuizActivity.class);
                        Bundle b = new Bundle();
                        b.putString("USER",userName);
                        b.putString("USER",userName);
                        startActivity(intent); */
>>>>>>> 3af91408c10a12c412e43b3fa4eebf36d4974cb5
                        Bundle b = new Bundle();
                        b.putString("USER",userName);
                        fragment = new LoggedInUsersList();
                        fragment.setArguments(b);
                        manager.beginTransaction().replace(R.id.fragment_container, fragment, fragment.getClass().getSimpleName()).addToBackStack(null).commit();
                    }
              }
            }
        });
<<<<<<< HEAD
=======

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().finish();
                getActivity().getSupportFragmentManager().popBackStack();
            }
        });

        /*
        // Inserting Test Users
        Log.d(TAG, "Inserting users...");
        db.addUser(new User("Bernard", "bernard@email.com", "Host"));
        db.addUser(new User("Dolores", "dolores@email.com", "Wyatt"));
        db.addUser(new User("Teddy", "teddy@email.com", "Bear"));
        db.addUser(new User("Clementine", "clementine@email.com", "Stillstandingthere"));

        // Get total number of users
        int totalNumberOfUsers = db.getUsersCount();
        Log.d(TAG, "Total users: " + totalNumberOfUsers);

        // Reading all users
        Log.d(TAG, "Reading all users...");
        ArrayList<User> users = db.getAllUsers();

        for (User user : users) {
            String log = "Name: " + user.getUserName() + " , Email: " + user.getEmail() + " , Password: " + user.getPassword();
            // Writing users to log
            Log.d(TAG, log);
        }

        Log.d(TAG, "-----------------------------------------------");

        // Update user
        Log.d(TAG, "Updating a user...");
        User changedUser = db.getUser("Teddy");
        changedUser.setPassword("NotBear");
        db.updateUser(changedUser);

        // Delete a user
        Log.d(TAG, "Deleting a user...");
        db.deleteUser(db.getUser("Clementine"));

        // Re-read all users
        Log.d(TAG, "Re-reading all users...");
        ArrayList<User> users2 = db.getAllUsers();

        for (User user : users2) {
            String log = "Name: " + user.getUserName() + " , Email: " + user.getEmail() + " , Password: " + user.getPassword();
            // Writing users to log
            Log.d(TAG, log);
        }

        Log.d(TAG, "-----------------------------------------------");

        // Get stored users in database
        User retrievedUser = db.getUser("Bernard");
        User retrievedUser2 = db.getUser("Dolores");

        // Inserting Test Attempts
        int testScore = 8;
        int testScore2 = 10;
        Log.d(TAG, "Inserting attempts...");
        db.addAttempt(new Attempt(retrievedUser.getUserName(), testScore));
        db.addAttempt(new Attempt(retrievedUser2.getUserName(), testScore2));

        // Get total number of attempts
        int totalNumberOfAttempts = db.getAttemptsCount();
        Log.d(TAG, "Total attempts: " + totalNumberOfAttempts);

        // Reading all attempts
        Log.d(TAG, "Reading all attempts...");
        ArrayList<Attempt> attempts = db.getAllAttempts();

        for (Attempt attempt : attempts) {
            String log = "Name: " + attempt.getUserName() + " , Score: " + attempt.getScore();
            // Writing attempts to log
            Log.d(TAG, log);
        } */
>>>>>>> 3af91408c10a12c412e43b3fa4eebf36d4974cb5
        return rootView;
    }
}
