package com.denisimusit.testtask.ui.holdersAndAdapters.home;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.denisimusit.testtask.R;
import com.denisimusit.testtask.models.Result;
import com.denisimusit.testtask.models.USA;

import java.util.List;


public class HomeAdapter extends RecyclerView.Adapter<HomeHolder> {
    private List<USA> usaList;

    public HomeAdapter(List<USA> persons) {
        this.usaList = persons;
    }

    @Override
    public void onBindViewHolder(HomeHolder homeHolder, int i) {
        //Получаем элемент набора данных для заполнения
        USA usa = usaList.get(i);
        //Заполняем поля viewHolder'а данными из элемента набора данных
        Result result = usa.getRestResponse().getResult().get(i);
        homeHolder.capitalTextView.append(" " + result.getCapital());
        homeHolder.eGUsaAlTextView.setText("e.g " + result.getCountry()+","+ result.getAbbr());
        homeHolder.usaStateAbbrTextView.setText( result.getCountry() + ",state abbr" );
        homeHolder.id_textView.append(": " + result.getId());
        homeHolder.largestCityTextView.append(" " + result.getLargestCity());
        homeHolder.nameOfStateTextView.append(" " + result.getName());
    }


    @Override
    public HomeHolder onCreateViewHolder(ViewGroup viewGroup, int i) {

        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_of_state,
                viewGroup, false);

        return new HomeHolder(itemView);
    }

    @Override
    public int getItemCount() {
        return usaList.size();
    }
}
