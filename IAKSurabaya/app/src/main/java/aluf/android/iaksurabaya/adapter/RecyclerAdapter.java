package aluf.android.iaksurabaya.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import aluf.android.iaksurabaya.R;
import aluf.android.iaksurabaya.model.RView;


/**
 * Created by wilda on 11/05/17.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder>{

    private List<RView> dataList;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView tvName;
        public TextView tvKeterangan;
        public ImageView img;

        public ViewHolder(View itemLayoutView) {
            super(itemLayoutView);
            tvName = (TextView) itemLayoutView.findViewById(R.id.item_name);
            tvKeterangan = (TextView) itemLayoutView.findViewById(R.id.item_keterangan);
            img = (ImageView) itemLayoutView.findViewById(R.id.item_icon);
        }
    }

    public RecyclerAdapter(List<RView> dataList) {
        this.dataList = dataList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int position) {
        //Create new view
        View itemLayoutView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_list_item, parent, false);
        return new ViewHolder(itemLayoutView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        RView data = dataList.get(position);
        holder.tvName.setText(data.getName());
        holder.tvKeterangan.setText(data.getKeterangan());
        holder.img.setImageResource(data.getImage());
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }


}
