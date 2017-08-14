package com.htc.eleven.learnrecyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by eleven on 17-8-14.
 */
class LocalViewHolder extends RecyclerView.ViewHolder {
    private TextView tvTtile;
    private TextView tvContent;

    // root was from Constructor function, which will get the layout view from layout xml file.
    public LocalViewHolder(View root) {
        super(root);
        tvTtile = root.findViewById(R.id.tvTitle);
        tvContent = root.findViewById(R.id.tvContent);
    }

    public TextView getTvContent() {
        return tvContent;
    }

    public TextView getTvTtile() {
        return tvTtile;
    }
}
