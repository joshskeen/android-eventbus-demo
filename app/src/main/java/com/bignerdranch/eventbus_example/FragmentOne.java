package com.bignerdranch.eventbus_example;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.bignerdranch.eventbus_example.event.EventFromFragmentOne;
import com.bignerdranch.eventbus_example.event.EventFromFragmentTwo;

import de.greenrobot.event.EventBus;

/**
 * Created by joshskeen on 10/16/14.
 */
public class FragmentOne extends Fragment {

    private Button mSendMessageButton;
    private TextView mStatus;

    @Override
    public void onPause() {
        super.onPause();
        EventBus.getDefault().unregister(this);
    }

    @Override
    public void onResume() {
        super.onResume();
        EventBus.getDefault().register(this);
    }

    public void onEvent(EventFromFragmentTwo event) {
        mStatus.setText("got event! " + event.toString());
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_one, container, false);
        mSendMessageButton = (Button) view.findViewById(R.id.fragment_one_send_message_button);
        mStatus = (TextView) view.findViewById(R.id.fragment_one_status);

        mSendMessageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EventBus.getDefault().post(new EventFromFragmentOne(RandomString.makeRandom()));
            }
        });

        return view;
    }

}
