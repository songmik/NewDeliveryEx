package com.example.deliveryex.widget.adapter.viewholder

import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import com.example.deliveryex.model.Model
import com.example.deliveryex.screen.base.BaseViewModel
import com.example.deliveryex.util.provider.ResourceProvider
import com.example.deliveryex.widget.adapter.listener.AdapterListener

abstract class ModelViewHolder<M: Model>(
    binding: ViewBinding,
    protected val viewModel: BaseViewModel,
    protected val resourcesProvider: ResourceProvider
): RecyclerView.ViewHolder(binding.root){

    abstract fun reset()

    open fun bindData(model: M) {
        reset()

    }

    abstract fun bindViews(model: M, adapterListener : AdapterListener)
}