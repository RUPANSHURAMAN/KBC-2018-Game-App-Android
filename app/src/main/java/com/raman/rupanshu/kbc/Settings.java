package com.raman.rupanshu.kbc;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.SeekBar;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

import static com.raman.rupanshu.kbc.Util.topics;
import static com.raman.rupanshu.kbc.Util.topicsSize;

public class Settings extends Activity {
    SeekBar barVoice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Next three lines for Full Screen
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        this.setVolumeControlStream(AudioManager.STREAM_MUSIC);

        barVoice = (SeekBar) findViewById(R.id.seekBar);

        barVoice.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Log.d("Settings", "seek value at end is" + seekBar.getProgress());
                getSharedPreferences("myPrefs", MODE_PRIVATE).edit().putFloat("volume", (float) seekBar.getProgress() / seekBar.getMax()).apply();
            }
        });
        barVoice.setProgress((int) (getSharedPreferences("myPrefs", MODE_PRIVATE).getFloat("volume", 0.03f) * barVoice.getMax()));

    }

    public void showCredits(View v) {
        Intent credit_intent = new Intent(this, Credits.class);
        startActivity(credit_intent);
    }

    public void shareContent(View v) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, "http://play.google.com/store/apps/details?id=com.raman,rupanshu.kbc");
        startActivity(Intent.createChooser(intent, getString(R.string.download_share_link)));
    }

    public void marketIntent(View v) {
        Intent marketIntent = new Intent();
        marketIntent.setAction(Intent.ACTION_VIEW);
        marketIntent.setData(Uri.parse("market://details?id=com.raman.rupanshu.kbc"));
        startActivity(marketIntent);
    }

    public void sendFeedBack(View view) {
        Intent i = new Intent(Intent.ACTION_SEND);
        i.setType("plain/text");
        i.putExtra(Intent.EXTRA_EMAIL, "rupanshuraman@hotmail.com");
        i.putExtra(Intent.EXTRA_SUBJECT, "Feedback for KBC app");
        i.putExtra(Intent.EXTRA_TEXT, getString(R.string.email_body));
        startActivity(Intent.createChooser(i, "Send mail..."));
    }

    public void subjectPicker(View view) {
        ArrayList<Integer> mSelectedItems = new ArrayList<>();
        mSelectedItems = convertIntArrayToIntegerArrayList(Util.convertStringArrayToInts(getSharedPreferences("myPrefs", MODE_PRIVATE).getString("selectedTopics", "[1, 2, 3, 4]")), mSelectedItems);
        //add size to topics
        String[] topicsWithSize = addSizeToTopics(topics, topicsSize);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        // Set the dialog title
        boolean[] checkedTopics = Util.convertStringToBoolean(getSharedPreferences("myPrefs", MODE_PRIVATE).getString("selectedTopics", "[1, 2, 3, 4]"));
        final ArrayList<Integer> finalMSelectedItems = mSelectedItems;
        builder.setTitle(R.string.pick_topics)
                // Specify the list array, the items to be selected by default (null for none),
                // and the listener through which to receive callbacks when items are selected
                .setMultiChoiceItems(topicsWithSize, checkedTopics,
                        new DialogInterface.OnMultiChoiceClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which,
                                                boolean isChecked) {
                                if (isChecked) {
                                    // If the user checked the item, add it to the selected items
                                    finalMSelectedItems.add(which);
                                } else if (finalMSelectedItems.contains(which)) {
                                    // Else, if the item is already in the array, remove it
                                    finalMSelectedItems.remove(Integer.valueOf(which));
                                }
                                Log.d("Settings", String.valueOf(finalMSelectedItems));
                            }
                        })
                // Set the action buttons
                .setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        // User clicked OK, so save the mSelectedItems results somewhere
                        // or return them to the component that opened the dialog
                        //delete database
                        deleteDatabase("QuestionsManager");
                        saveSelection(finalMSelectedItems);
                        Log.d("Settings", String.valueOf(finalMSelectedItems));
                    }
                })
                .setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                    }
                });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    private String[] addSizeToTopics(String[] topics, int[] topicsSize) {
        String[] topicsWithSize = new String[topics.length];
        for (int i = 0; i < topics.length; i++)
            topicsWithSize[i] = topics[i] + " (" + topicsSize[i] + ")";
        return topicsWithSize;
    }

    private ArrayList<Integer> convertIntArrayToIntegerArrayList(int[] ints, ArrayList<Integer> mSelectedItems) {
        for (int i : ints)
            mSelectedItems.add(i);
        return mSelectedItems;
    }

    private void saveSelection(ArrayList<Integer> mSelectedItems) {
        if (mSelectedItems.isEmpty()) {
            Toast.makeText(this, "Current Affairs was selected as no options were selected.", Toast.LENGTH_LONG).show();
            mSelectedItems.add(0);
        }
        getSharedPreferences("myPrefs", MODE_PRIVATE).edit()
                .putString("selectedTopics", String.valueOf(mSelectedItems))
                .putInt("categoryPosition", 0)
                .putString("categoryPositionCounter", Arrays.toString(new int[mSelectedItems.size()]))
                .apply();
    }

    public void getInstructions(View view) {
        LayoutInflater layoutInflater
                = this.getLayoutInflater();
        View popupView = layoutInflater.inflate(R.layout.custom_instructions, null);
        final PopupWindow popupWindowPlayerName = new PopupWindow(
                popupView,
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);
        popupWindowPlayerName.setFocusable(true);
        popupWindowPlayerName.update();
        ImageView ok = (ImageView) popupView.findViewById(R.id.button_ok);
        ok.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                popupWindowPlayerName.dismiss();
            }
        });
        popupWindowPlayerName.showAtLocation(barVoice, Gravity.CENTER_HORIZONTAL, 0, 0);
    }
}