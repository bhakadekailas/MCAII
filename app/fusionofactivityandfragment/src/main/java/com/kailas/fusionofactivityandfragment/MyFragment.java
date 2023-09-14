package com.kailas.fusionofactivityandfragment;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class MyFragment extends Fragment {
    private final String TAG = "MyFragment";

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.e(TAG, "KAILASA onAttach: ");
        Toast.makeText(getActivity(), TAG+"onAttach", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e(TAG, "KAILASA onCreate: ");
        Toast.makeText(getActivity(), TAG+"onCreate", Toast.LENGTH_SHORT).show();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_my, container, false);
        Toast.makeText(getActivity(), TAG+"onCreateView", Toast.LENGTH_SHORT).show();
        Log.e(TAG, "KAILASA onCreateView: ");
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.e(TAG, "KAILASA onActivityCreated: ");
        Toast.makeText(getActivity(), TAG+"onActivityCreated", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.e(TAG, "KAILASA onStart: ");
        Toast.makeText(getActivity(), TAG+"onStart", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e(TAG, "KAILASA onResume: ");
        Toast.makeText(getActivity(), TAG+"onResume", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.e(TAG, "KAILASA onPause: ");
        Toast.makeText(getActivity(), TAG+"onPause", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.e(TAG, "KAILASA onStop: ");
        Toast.makeText(getActivity(), TAG+"onStop", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.e(TAG, "KAILASA onDestroyView: ");
        Toast.makeText(getActivity(), TAG+"onDestroyView", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(getActivity(), TAG+"onDestroy", Toast.LENGTH_SHORT).show();
        Log.e(TAG, "KAILASA onDestroy: ");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.e(TAG, "KAILASA onDetach: ");
        Toast.makeText(getActivity(), TAG+"onDetach", Toast.LENGTH_SHORT).show();
    }
}