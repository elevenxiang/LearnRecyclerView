package com.htc.eleven.learnrecyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
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


            class LocalViewHolder extends RecyclerView.ViewHolder {
                private TextView tv;

                public LocalViewHolder(TextView itemView) {
                    super(itemView);
                    tv=itemView;
                }

                public TextView getTv() {
                    return tv;
                }
            }

            @Override
            public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
                return new LocalViewHolder(new TextView(parent.getContext()));
            }

            @Override
            public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
                LocalViewHolder lvh = (LocalViewHolder) holder;
//                lvh.getTv().setText("item: " + position);
                lvh.getTv().setText(data[position]);
            }

            @Override
            public int getItemCount() {
//                return 100;
                return data.length;
            }

            private String[] data = {"a", "b", "c", "d", "e"};
        });
    }
}
