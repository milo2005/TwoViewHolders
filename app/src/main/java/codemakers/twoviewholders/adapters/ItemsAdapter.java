package codemakers.twoviewholders.adapters;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import codemakers.twoviewholders.R;
import codemakers.twoviewholders.databinding.TemplateItem1Binding;
import codemakers.twoviewholders.databinding.TemplateItem2Binding;
import codemakers.twoviewholders.model.Item;
import codemakers.twoviewholders.model.Item1;
import codemakers.twoviewholders.model.Item2;

public class ItemsAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<Item> data;

    public ItemsAdapter(List<Item> data) {
        this.data = data;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        RecyclerView.ViewHolder holder;
        if(viewType == Item.TIPO_UNO){
            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.template_item_1, parent, false);
            holder = new Item1Holder(v);
        }else{
            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.template_item_2, parent, false);
            holder = new Item2Holder(v);
        }
        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if(holder instanceof Item1Holder){
            ((Item1Holder) holder).binding.setItem((Item1) data.get(position));
        }else{
            ((Item2Holder) holder).binding.setItem((Item2) data.get(position));
        }
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    @Override
    public int getItemViewType(int position) {
        return data.get(position).getTipo();
    }

    class Item1Holder extends RecyclerView.ViewHolder{

        TemplateItem1Binding binding;

        public Item1Holder(View itemView) {
            super(itemView);
            binding = DataBindingUtil.bind(itemView);
        }
    }

    class Item2Holder extends RecyclerView.ViewHolder{

        TemplateItem2Binding binding;

        public Item2Holder(View itemView) {
            super(itemView);
            binding = DataBindingUtil.bind(itemView);
        }
    }

}
