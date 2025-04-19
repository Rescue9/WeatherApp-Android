package com.aniketjain.weatherapp.preferences;


import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.activity.R;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class SettingsDialogFragment extends DialogFragment {

    private int containerId;

    @Nullable
    @Override
    public android.view.View onCreateView(@NonNull android.view.LayoutInflater inflater,
                                          @Nullable android.view.ViewGroup container,
                                          @Nullable Bundle savedInstanceState) {
                                          
        FrameLayout frameLayout = new FrameLayout(requireContext());
        containerId = View.generateViewId();
        frameLayout.setId(containerId);
    
        // load the SettingsFragment inside this container
        if (savedInstanceState == null) {
            getChildFragmentManager()
                .beginTransaction()
                .replace(containerId, new SettingsFragment())
                .commit();
        }
        
        return frameLayout;
    }

    @Override
    public void onStart() {
        super.onStart();
        
        // Optional: Make dialog take up a bit more space
        if (getDialog() != null) {
            getDialog().getWindow().setLayout(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
            );
        }
    }

    @Override
    public int getTheme() {
        return R.xml.SettingsDialogTheme;
    }
}
