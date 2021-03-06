package duoy.cn.fancydemo.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import duoy.cn.fancydemo.activity.BaseActivity;


public class BaseFragment extends android.support.v4.app.Fragment{
    private static final String TAG = BaseFragment.class.getSimpleName();

    private BaseActivity baseActivity;

    @Override
    public void onAttach(Context context) {//fragment已经关联到activity
        super.onAttach(context);
        baseActivity = (BaseActivity)context;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {//?
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}
