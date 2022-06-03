package com.example.deliveryex.util.mapper

import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.ViewParent
import com.example.deliveryex.databinding.ViewholderEmptyBinding
import com.example.deliveryex.model.CellType
import com.example.deliveryex.model.Model
import com.example.deliveryex.screen.base.BaseViewModel
import com.example.deliveryex.util.provider.ResourceProvider
import com.example.deliveryex.widget.adapter.viewholder.EmptyViewHolder
import com.example.deliveryex.widget.adapter.viewholder.ModelViewHolder

object ModelViewHolderMapper {

    @Suppress("UNCHECKED_CAST")
    fun <M: Model> map(
        parent: ViewGroup,
        type : CellType,
        viewModel: BaseViewModel,
        resourceProvider: ResourceProvider
    ): ModelViewHolder<M> {
        val inflater = LayoutInflater.from(parent.context)
        val viewHolder = when (type) {
            CellType.EMPTY_CELL -> EmptyViewHolder(
                ViewholderEmptyBinding.inflate(inflater, parent, false),
                viewModel,
                resourceProvider
            )
        }

        return viewHolder as ModelViewHolder<M>
    }
}