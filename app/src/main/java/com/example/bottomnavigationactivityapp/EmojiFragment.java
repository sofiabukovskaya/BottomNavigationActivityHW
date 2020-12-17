package com.example.bottomnavigationactivityapp;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class EmojiFragment extends Fragment {
    final String LOG_TAG = "LifeCycleFragment";

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        Log.d(LOG_TAG, "Emoji Fragment onAttach");
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(LOG_TAG, "Emoji Fragment onCreate");
    }

    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d(LOG_TAG, "Emoji Fragment onActivityCreated");
    }

    public void onStart() {
        super.onStart();
        Log.d(LOG_TAG, "Emoji Fragment onStart");
    }

    public void onResume() {
        super.onResume();
        Log.d(LOG_TAG, "Emoji Fragment onResume");
    }

    public void onPause() {
        super.onPause();
        Log.d(LOG_TAG, "Emoji Fragment onPause");
    }

    public void onStop() {
        super.onStop();
        Log.d(LOG_TAG, "Emoji Fragment onStop");
    }

    public void onDestroyView() {
        super.onDestroyView();
        Log.d(LOG_TAG, "Emoji Fragment onDestroyView");
    }

    public void onDestroy() {
        super.onDestroy();
        Log.d(LOG_TAG, "Emoji Fragment onDestroy");
    }

    public void onDetach() {
        super.onDetach();
        Log.d(LOG_TAG, "Emoji Fragment onDetach");
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.d(LOG_TAG, "Emoji Fragment onCreateView");
        return inflater.inflate(R.layout.fragment_emoji,container,false);
    }
}
