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

public class FavoriteFragment extends Fragment {
    final String LOG_TAG = "LifeCycleFragment";

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        Log.d(LOG_TAG, "Favorite Fragment onAttach");
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(LOG_TAG, "Favorite Fragment onCreate");
    }
    
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d(LOG_TAG, "Favorite Fragment onActivityCreated");
    }

    public void onStart() {
        super.onStart();
        Log.d(LOG_TAG, "Favorite Fragment onStart");
    }

    public void onResume() {
        super.onResume();
        Log.d(LOG_TAG, "Favorite Fragment onResume");
    }

    public void onPause() {
        super.onPause();
        Log.d(LOG_TAG, "Favorite Fragment onPause");
    }

    public void onStop() {
        super.onStop();
        Log.d(LOG_TAG, "Favorite Fragment onStop");
    }

    public void onDestroyView() {
        super.onDestroyView();
        Log.d(LOG_TAG, "Favorite Fragment onDestroyView");
    }

    public void onDestroy() {
        super.onDestroy();
        Log.d(LOG_TAG, "Favorite Fragment onDestroy");
    }

    public void onDetach() {
        super.onDetach();
        Log.d(LOG_TAG, "Favorite Fragment onDetach");
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.d(LOG_TAG, "Favorite Fragment onCreateView");
        return inflater.inflate(R.layout.fragment_favorite,container,false);
    }
}
