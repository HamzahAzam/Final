package course.java.ucl.loginactivity;

<<<<<<< HEAD
import android.content.Intent;
=======
>>>>>>> 3af91408c10a12c412e43b3fa4eebf36d4974cb5
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

<<<<<<< HEAD

    public  class LoginMenu extends Fragment
    {
        private static ArrayList<String> loggedInUsers = new ArrayList<String>();
        public static ArrayList<String> getLoggedInUsers() { return loggedInUsers; }


=======
/**
     * A placeholder fragment containing a simple view.
     */
    public  class LoginMenu extends Fragment {


        private static ArrayList<String> loggedInUsers = new ArrayList<String>();
        public static ArrayList<String> getLoggedInUsers() { return loggedInUsers; }

        /**
         *
         * @param user
         *
         * */
>>>>>>> 3af91408c10a12c412e43b3fa4eebf36d4974cb5
        private void addLoggedInUser(String user) {
            loggedInUsers.add(user);
        }

<<<<<<< HEAD
=======
    /**
     *
     * @param user
     * @return
     *
     */
    private boolean removeLoggedInUser(String user) {
           return loggedInUsers.remove(user);
        }

>>>>>>> 3af91408c10a12c412e43b3fa4eebf36d4974cb5

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
<<<<<<< HEAD
                                 Bundle savedInstanceState)
        {

            final EditText et_Username, et_Password;
=======
                                 Bundle savedInstanceState) {

            final EditText et_Username, et_Password, et_Email;
>>>>>>> 3af91408c10a12c412e43b3fa4eebf36d4974cb5

            final View rootView = inflater.inflate(R.layout.login_fragment,
                    container, false);

            Button b2 = (Button) rootView.findViewById(R.id.btn_login_quit);
            Button btn = (Button) rootView.findViewById(R.id.btn_login_login);
            Button btn_register = (Button) rootView.findViewById(R.id.btn_login_register);
<<<<<<< HEAD
            Button highScores = (Button) rootView.findViewById(R.id.highScoresBtn);
=======
>>>>>>> 3af91408c10a12c412e43b3fa4eebf36d4974cb5
            et_Username = (EditText)rootView.findViewById(R.id.et_login_Username);
            et_Username.setText(getArguments().getString("USER"));
            et_Password = (EditText)rootView.findViewById(R.id.et_login_Password);

            final DBHandler db = new DBHandler(getActivity());

<<<<<<< HEAD
            btn.setOnClickListener(new View.OnClickListener()
            {
                    @Override
                    public void onClick(View v)
                    {
=======
            btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
>>>>>>> 3af91408c10a12c412e43b3fa4eebf36d4974cb5

                    String username = String.valueOf(et_Username.getText());
                        // Stores Password

                       String password = String.valueOf(et_Password.getText());
                        // Validates the User name and Password for admin, admin
                       User retrievedUser = db.getUser(username);
<<<<<<< HEAD
                        if(retrievedUser!=null)
                        {
                            String storedPassword = retrievedUser.getPassword();
                            if (storedPassword!=null)
                            {
                              if (password.equals(storedPassword))
                              {
                                  Toast.makeText(getActivity(),
                                          "Logged in", Toast.LENGTH_SHORT).show();
=======
                        if(retrievedUser!=null) {
                            String storedPassword = retrievedUser.getPassword();
                            if (storedPassword!=null) {
                              if (password.equals(storedPassword)) {
                                  Toast.makeText(getActivity(),
                                          "Starting quiz...", Toast.LENGTH_SHORT).show();
>>>>>>> 3af91408c10a12c412e43b3fa4eebf36d4974cb5
                                  addLoggedInUser(username);
                                  et_Password.setText("");
                                  et_Username.setText("");
                                  et_Password.clearFocus();
                                  et_Username.clearFocus();
                                  rootView.clearFocus();
                                  getActivity().dispatchKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_BACK));
<<<<<<< HEAD
                                  FragmentManager manager = getFragmentManager();
                                  Fragment fragment = new MainFragment();
=======
                                  //getFragmentManager().popBackStack();
                                  FragmentManager manager = getFragmentManager();
                                  Fragment fragment = new LoggedInUsersList();
>>>>>>> 3af91408c10a12c412e43b3fa4eebf36d4974cb5
                                  Bundle b = new Bundle();
                                  b.putString("USER",username);
                                  fragment.setArguments(b);
                                  manager.beginTransaction().replace(R.id.fragment_container, fragment, fragment.getClass().getSimpleName()).addToBackStack(null).commit();
                              }
<<<<<<< HEAD
                                else
                              {
                                  Toast.makeText(getActivity(),
                                          "The username and password do not match", Toast.LENGTH_SHORT).show();
                              }
                           }
                        }
                        else
                        {
                            Toast.makeText(getActivity(),
                                    "That user does not exist!", Toast.LENGTH_SHORT).show();
                        }

                    }
                });

                btn_register.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                        {
                        FragmentManager manager = getFragmentManager();
                        Fragment fragment = new RegisterNewUser();
                        manager.beginTransaction().replace(R.id.fragment_container, fragment, fragment.getClass().getSimpleName()).addToBackStack(null).commit();
                        }
                });

            highScores.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v)
                {
                    FragmentManager manager = getFragmentManager();
                    Fragment fragment = new HighScores();
                    manager.beginTransaction().replace(R.id.fragment_container, fragment, fragment.getClass().getSimpleName()).addToBackStack(null).commit();
                }
            });

            b2.setOnClickListener(new View.OnClickListener()
            {
=======
                           }
                        }
                    }
                });

                btn_register.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    FragmentManager manager = getFragmentManager();
                    Fragment fragment = new RegisterNewUser();
                    manager.beginTransaction().replace(R.id.fragment_container, fragment, fragment.getClass().getSimpleName()).addToBackStack(null).commit();
                 }
            });

            b2.setOnClickListener(new View.OnClickListener() {
>>>>>>> 3af91408c10a12c412e43b3fa4eebf36d4974cb5
                @Override
                public void onClick(View v) {
                    getActivity().getSupportFragmentManager().popBackStack();
                    getActivity().finish();
                }
            });
            return rootView;
        }

    }

