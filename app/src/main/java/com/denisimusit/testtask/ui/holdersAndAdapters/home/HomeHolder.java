package com.denisimusit.testtask.ui.holdersAndAdapters.home;

import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.denisimusit.testtask.R;

import butterknife.BindView;
import butterknife.ButterKnife;


public class HomeHolder extends RecyclerView.ViewHolder {
    //объявим поля, созданные в файле интерфейса itemView.xml
    @Nullable
    @BindView(R.id.name_of_state_textView)
    public TextView nameOfStateTextView;
    @Nullable
    @BindView(R.id.usa_state_abbr_textView)
    public TextView usaStateAbbrTextView;
    @Nullable
    @BindView(R.id.e_g_usa_al_textView)
    public TextView eGUsaAlTextView;
    @Nullable
    @BindView(R.id.capital_textView)
    public TextView capitalTextView;
    @Nullable
    @BindView(R.id.largest_city_textView)
    public TextView largestCityTextView;
    @Nullable
    @BindView(R.id.id_textView)
    public TextView id_textView;

    //объявляем конструктор
    public HomeHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);

    }
}