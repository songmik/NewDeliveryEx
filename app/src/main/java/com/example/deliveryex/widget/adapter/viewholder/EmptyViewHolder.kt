package com.example.deliveryex.widget.adapter.viewholder

import com.example.deliveryex.databinding.ViewholderEmptyBinding
import com.example.deliveryex.model.Model
import com.example.deliveryex.screen.base.BaseViewModel
import com.example.deliveryex.util.provider.ResourceProvider
import com.example.deliveryex.widget.adapter.listener.AdapterListener

class EmptyViewHolder(
    private val binding: ViewholderEmptyBinding,
    viewModel: BaseViewModel,
    resourceProvider: ResourceProvider
): ModelViewHolder<Model>(binding, viewModel, resourceProvider) {
    override fun reset() = Unit

    override fun bindViews(model: Model, adapterListener: AdapterListener) = Unit


}