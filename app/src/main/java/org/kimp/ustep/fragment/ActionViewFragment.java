package org.kimp.ustep.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.android.material.button.MaterialButton;

import org.kimp.ustep.R;

/**
 * Fragment with start and options buttons
 */
public class ActionViewFragment extends Fragment {

    public ActionViewFragment() {
        super(R.layout.action_view_fragment);
    }

    @Nullable @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.action_view_fragment, container, false);

        view.findViewById(R.id.optionsButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle action = new Bundle();
                action.putString("action", "options");
                getParentFragmentManager().setFragmentResult("requestKey", action);
            }
        });

        view.findViewById(R.id.startButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle action = new Bundle();
                action.putString("action", "universities");
                getParentFragmentManager().setFragmentResult("requestKey", action);
            }
        });

        return view;
    }
}
