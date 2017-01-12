package course.java.ucl.loginactivity;

<<<<<<< HEAD
import android.app.ActivityManager;
=======
>>>>>>> 3af91408c10a12c412e43b3fa4eebf36d4974cb5
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.ListFragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
<<<<<<< HEAD
import android.widget.AutoCompleteTextView;
=======
>>>>>>> 3af91408c10a12c412e43b3fa4eebf36d4974cb5
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;



public class questionsList extends ListFragment{
    private static ArrayList<TrueFalse> qKeyList;
    static boolean attemptAddedToList =true;
    static int positionLastAttempt=0;
    static boolean lastAnswerCorrect = false;
    public int m_Score;
    String m_UserName;

<<<<<<< HEAD
    Button finishBtn;

=======
>>>>>>> 3af91408c10a12c412e43b3fa4eebf36d4974cb5

    // Store Questions attempted and correct answers
    static int index;

    private HashMap<Integer, Boolean> answeredQuestions = new HashMap<Integer, Boolean>();

<<<<<<< HEAD
    public void setQuestionsAttempted(int questionNo, boolean result)
    {
        answeredQuestions.put(questionNo, result);
    }

    void addAnswerToAttemptedQuestions()
    {
        if(!attemptAddedToList)
        {
            if(!answeredQuestions.containsKey(positionLastAttempt))
            {
=======
    public void setQuestionsAttempted(int questionNo, boolean result) {
        answeredQuestions.put(questionNo, result);
    }

    void addAnswerToAttemptedQuestions() {
        if(!attemptAddedToList) {
            //if(lastAnswerCorrect) m_Score++;
            if(!answeredQuestions.containsKey(positionLastAttempt)) {
>>>>>>> 3af91408c10a12c412e43b3fa4eebf36d4974cb5
                answeredQuestions.put(positionLastAttempt, lastAnswerCorrect);
                attemptAddedToList = true;
            }
            attemptAddedToList = true;
        }
    }
    private void setIndex(int index) {
        this.index = index;
    }

    public static ArrayList <TrueFalse> getAnswerKey() {
        return qKeyList;
    }

    static int currentIndex() {
        return index;
    }

    public questionsList() {
        index = 0;
    }
<<<<<<< HEAD

    private String loadJsonFromAsset(String filename, Context context)
    {
        String json = null;
        try
        {
=======
    /**
     * @param filename
     * @param context
     *
     * @return
     */
    private String loadJsonFromAsset(String filename, Context context) {
        String json = null;
        try {
>>>>>>> 3af91408c10a12c412e43b3fa4eebf36d4974cb5
            InputStream is = context.getAssets().open(filename);
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, "UTF-8");
<<<<<<< HEAD
        }
        catch (java.io.IOException ex)
        {
=======
        } catch (java.io.IOException ex) {
>>>>>>> 3af91408c10a12c412e43b3fa4eebf36d4974cb5
            ex.printStackTrace();
            return null;
        }

        return json;
    }

<<<<<<< HEAD
    public ArrayList<TrueFalse> getQKeysFromFile(String filename, Context context)
    {
        final ArrayList<TrueFalse> qKeyList = new ArrayList<TrueFalse>();
        try
        {
=======
    public ArrayList<TrueFalse> getQKeysFromFile(String filename, Context context) {
        final ArrayList<TrueFalse> qKeyList = new ArrayList<TrueFalse>();
        try {
>>>>>>> 3af91408c10a12c412e43b3fa4eebf36d4974cb5
            // Load data
            String jsonString = loadJsonFromAsset(filename, context);
            JSONObject json = new JSONObject(jsonString);
            JSONArray questionKeys = json.getJSONArray("questions");

            // Get Recipe objects from data
<<<<<<< HEAD
            for (int i = 0; i < questionKeys.length(); i++)
            {
=======
            for (int i = 0; i < questionKeys.length(); i++) {
>>>>>>> 3af91408c10a12c412e43b3fa4eebf36d4974cb5
                TrueFalse qKey = new TrueFalse();
                qKey.setQuestion(questionKeys.getJSONObject(i).getString("question"));
                qKey.setTrueQuestion(questionKeys.getJSONObject(i).getBoolean("answer"));
                qKeyList.add(qKey);
            }
<<<<<<< HEAD
        }
        catch (JSONException e)
        {
=======
        } catch (JSONException e) {
>>>>>>> 3af91408c10a12c412e43b3fa4eebf36d4974cb5
            e.printStackTrace();
        }
        return qKeyList;
    }
    @Override
<<<<<<< HEAD
    public void onCreate(Bundle savedInstanceState)
    {
=======
    public void onCreate(Bundle savedInstanceState) {
>>>>>>> 3af91408c10a12c412e43b3fa4eebf36d4974cb5
        super.onCreate(savedInstanceState);
        qKeyList = getQKeysFromFile("questions.json", getContext());
        QuestionAdapter adapter = new QuestionAdapter(qKeyList);
        setListAdapter(adapter);
        m_UserName  = getArguments().getString("USER");
        m_Score = 0;
    }

    @Override
<<<<<<< HEAD
    public void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        ((QuestionAdapter)getListAdapter()).notifyDataSetChanged();
    }

    private class QuestionAdapter extends ArrayAdapter<TrueFalse>
    {

        public QuestionAdapter(ArrayList<TrueFalse> qKey)
        {
=======
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        ((QuestionAdapter)getListAdapter()).notifyDataSetChanged();
    }

    private class QuestionAdapter extends ArrayAdapter<TrueFalse> {

        public QuestionAdapter(ArrayList<TrueFalse> qKey) {
>>>>>>> 3af91408c10a12c412e43b3fa4eebf36d4974cb5
            super(getActivity(), android.R.layout.simple_list_item_1, qKey);
        }

        @Override
<<<<<<< HEAD
        public View getView(int position, View convertView, ViewGroup parent)
        {
=======
        public View getView(int position, View convertView, ViewGroup parent) {
>>>>>>> 3af91408c10a12c412e43b3fa4eebf36d4974cb5
            // if we weren't given a view, inflate one
            if (null == convertView) {
                convertView = getActivity().getLayoutInflater()
                        .inflate(R.layout.list_item_question, null);
            }

<<<<<<< HEAD
            finishBtn = (Button) convertView.findViewById(R.id.finishBtn);
            finishBtn.setOnClickListener(new View.OnClickListener()
            {

                @Override
                public void onClick(View v)
                {
                    getFragmentManager().popBackStackImmediate();
                }
            }
            );

            // configure the view for this question
            TrueFalse qk = getItem(position);
            TextView titleTextView = (TextView) convertView.findViewById(R.id.question_list_title);
=======
            // configure the view for this question
            TrueFalse qk = getItem(position);
            TextView titleTextView =
                    (TextView) convertView.findViewById(R.id.question_list_title);
>>>>>>> 3af91408c10a12c412e43b3fa4eebf36d4974cb5
            titleTextView.setText(qk.getQuestion());
            titleTextView.setTag(position);
            addAnswerToAttemptedQuestions();
            // start count from top of list-- check how many are correct
            if(position==0){
                m_Score=0;
            }
<<<<<<< HEAD

            if(answeredQuestions.containsKey(position))
            {
=======
            if(answeredQuestions.containsKey(position)) {
>>>>>>> 3af91408c10a12c412e43b3fa4eebf36d4974cb5
                boolean result = answeredQuestions.get(position);
                if (result) {
                    ImageView thumbnailImageView = (ImageView) convertView.findViewById(R.id.recipe_list_thumbnail);
                    Bitmap icon = BitmapFactory.decodeResource(getContext().getResources(), R.drawable.tick);
                    thumbnailImageView.setImageBitmap(icon);
                    convertView.setBackgroundColor(Color.GREEN);
                    m_Score++;

                }
                else {
                    ImageView thumbnailImageView = (ImageView) convertView.findViewById(R.id.recipe_list_thumbnail);
                    Bitmap icon = BitmapFactory.decodeResource(getContext().getResources(), R.drawable.incorrect);
                    thumbnailImageView.setImageBitmap(icon);
                    convertView.setBackgroundColor(Color.RED);
                }
            }
<<<<<<< HEAD
            convertView.setOnTouchListener(new View.OnTouchListener()
            {
=======
            convertView.setOnTouchListener(new View.OnTouchListener() {
>>>>>>> 3af91408c10a12c412e43b3fa4eebf36d4974cb5
                @Override
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    view.setBackgroundColor(Color.BLUE);
                    return false;
                }
            });

<<<<<<< HEAD
            convertView.setOnClickListener( new View.OnClickListener()
            {
=======
            convertView.setOnClickListener( new View.OnClickListener() {
>>>>>>> 3af91408c10a12c412e43b3fa4eebf36d4974cb5
                @Override
                public void onClick(View v) {
                    FragmentManager manager = getFragmentManager();
                    Fragment fragment = manager.findFragmentById(R.id.fragment_container);
                    v.setBackgroundColor(Color.GREEN);
                    Bundle b = new Bundle();
                    TextView titleTextView = (TextView) v.findViewById(R.id.question_list_title);
                    int position = (int) titleTextView.getTag();
                    b.putInt("position",position);
                    b.putString("USER",m_UserName);
                    fragment = new QuizActivity();
<<<<<<< HEAD
=======
                    //fragment = new questionsList();
>>>>>>> 3af91408c10a12c412e43b3fa4eebf36d4974cb5
                    fragment.setArguments(b);
                    manager.beginTransaction().replace(R.id.fragment_container, fragment, fragment.getClass().getSimpleName()).addToBackStack(null).commit();
                }
            });
            return convertView;
        }
    }



    @Override
<<<<<<< HEAD
    public void onDestroy()
    {
=======
    public void onDestroy() {
>>>>>>> 3af91408c10a12c412e43b3fa4eebf36d4974cb5
        super.onDestroy();
        Attempt thisAttempt = new Attempt();
        thisAttempt.setScore(m_Score);
        thisAttempt.setUserName(m_UserName);
        DBHandler db = new DBHandler(getActivity());
        db.addAttempt(thisAttempt);

    }
}