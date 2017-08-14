package com.htc.eleven.learnrecyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        rv = new RecyclerView(this);

        setContentView(rv);

        rv.setLayoutManager(new LinearLayoutManager(this));

        rv.setAdapter(new RecyclerView.Adapter() {


            @Override
            public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//                return new LocalViewHolder(new TextView(parent.getContext()));

                // user layout xml file to create ! so we could customize our needed layout.
                return new LocalViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.cell_data,null));
            }

            @Override
            public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
                LocalViewHolder lvh = (LocalViewHolder) holder;
//                lvh.getTv().setText("item: " + position);
//                lvh.getTv().setText(data[position]);

                lvh.getTvTtile().setText(data[position].getmTitle());
                lvh.getTvContent().setText(data[position].getmContent());
            }

            @Override
            public int getItemCount() {
//                return 100;
                return data.length;
            }

//            private String[] data = {"a", "b", "c", "d", "e"};
            private CellData[] data = new CellData[]{ new CellData("新闻","这个是一个不错的新闻"), new CellData("娱乐","今日电影不错"), new CellData("体育","NBA今日战况")};
        });
    }

}
