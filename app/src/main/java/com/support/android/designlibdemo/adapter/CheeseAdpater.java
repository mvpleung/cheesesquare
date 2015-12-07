package com.support.android.designlibdemo.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.support.android.designlibdemo.Cheeses;
import com.support.android.designlibdemo.R;

/**
 * @author LiangZiChao
 * @Date 2015/11/20 16:01
 */
public class CheeseAdpater extends RecyclerView.Adapter<CheeseAdpater.ViewHolder> {

    private LayoutInflater mInflater;

    public CheeseAdpater() {
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (mInflater == null)
            mInflater = LayoutInflater.from(parent.getContext());
        return new ViewHolder(mInflater.inflate(R.layout.adapter_recyclerview, parent, false));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.setTitle(Cheeses.mCheeseTitles[position]);
    }

    @Override
    public int getItemCount() {
        return Cheeses.mCheeseTitles.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView mTextTitle;

        public ViewHolder(View itemView) {
            super(itemView);
            mTextTitle = (TextView) itemView.findViewById(R.id.tv_title);
        }

        public void setTitle(String mTitle) {
            mTextTitle.setText(mTitle);
        }
    }
}
