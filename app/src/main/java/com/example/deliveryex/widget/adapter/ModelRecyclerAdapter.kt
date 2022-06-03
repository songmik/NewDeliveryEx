package com.example.deliveryex.widget.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.example.deliveryex.model.CellType
import com.example.deliveryex.model.Model
import com.example.deliveryex.screen.base.BaseViewModel
import com.example.deliveryex.util.mapper.ModelViewHolderMapper
import com.example.deliveryex.util.provider.ResourceProvider
import com.example.deliveryex.widget.adapter.listener.AdapterListener
import com.example.deliveryex.widget.adapter.viewholder.ModelViewHolder

class ModelRecyclerAdapter<M: Model, VM : BaseViewModel >(

    private var modeList : List<Model>,
    private val viewModel : VM,
    private val resourceProvider : ResourceProvider,
    private val adapterListener :  AdapterListener
): ListAdapter<Model, ModelViewHolder<M>>(Model.DIFF_CALLBACK) {

    override fun getItemCount(): Int = modeList.size

    override fun getItemViewType(position: Int): Int = modeList[position].type.ordinal

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ModelViewHolder<M> {
        return  ModelViewHolderMapper.map(parent, CellType.values()[viewType], viewModel, resourceProvider)
    }

    override fun onBindViewHolder(holder: ModelViewHolder<M>, position: Int) {
        with(holder) {
            bindData(modeList[position] as M)
            bindViews(modeList[position] as M, adapterListener)
        }
    }

    override fun submitList(list: MutableList<Model>?) {
        list?.let { modeList = it }

        super.submitList(list)
    }


}