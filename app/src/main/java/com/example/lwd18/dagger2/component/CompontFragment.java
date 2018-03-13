package com.example.lwd18.dagger2.component;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.example.lwd18.dagger2.R;
import javax.inject.Inject;

/**
 * 创建者     李文东
 * 创建时间   2018/3/13 12:07
 * 描述
 * 更新者     $Author$
 * 更新时间   $Date$
 * 更新描述
 */

public class CompontFragment extends Fragment {

  @Inject
  RetrofitManager retrofitManager;
  private TextView tv;

  public CompontFragment(){};

  public static CompontFragment getInstance(){
    CompontFragment fragment=new CompontFragment();
    Bundle args = new Bundle();
    fragment.setArguments(args);
    return fragment;
  }

  @Override public void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
  }

  @Nullable @Override
  public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
      Bundle savedInstanceState) {
    View view = View.inflate(container.getContext(), R.layout.fragment,null);
    tv = view.findViewById(R.id.fragment_tv);
    return view;
  }

  @Override public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);

    //ComponentActivityComponent componentActivityComponent = ((ComponentActivity) getActivity()).getComponentActivityComponent();
    //
    //DaggerComponentFragmentComponent.builder().componentActivityComponent(componentActivityComponent).build().inject(this);

    /**
     * 第二种依赖
     */

    ((ComponentActivity) getActivity()).getComponentActivityComponent().componentFragmentComponent().inject(this);
    tv.setText("framgnet===="+retrofitManager.hashCode()+"====="+retrofitManager.getOkHttpClient().cache()+"====="+retrofitManager.getOkHttpClient().hashCode());
  }
}
