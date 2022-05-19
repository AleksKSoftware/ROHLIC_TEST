package co.karpenko.alex.presentation.books.adapter

import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import co.karpenko.alex.data.mapper.Book
import co.karpenko.alex.presentation.widgets.simpleItemCallback

/**
 * Created by Alexander Karpenko on 02.05.2022.
 * java.karpenko@gmail.com
 */

class BooksListAdapter(
    val clickListener: (id: Int?) -> Unit,
) : PagingDataAdapter<Book, BooksViewHolder>(
    simpleItemCallback()
) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BooksViewHolder {
        return BooksViewHolder(parent).apply {
            itemView.setOnClickListener { clickListener(getItem(absoluteAdapterPosition)?.id) }
        }
    }

    override fun onBindViewHolder(holder: BooksViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}
