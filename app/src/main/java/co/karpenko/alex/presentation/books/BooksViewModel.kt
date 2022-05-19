package co.karpenko.alex.presentation.books

import androidx.lifecycle.ViewModel
import androidx.paging.PagingData
import co.karpenko.alex.data.mapper.Book
import co.karpenko.alex.domain.usecases.book.BooksInteractor
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

/**
 * Created by Alexander Karpenko on 02.05.2022.
 * java.karpenko@gmail.com
 */

@HiltViewModel
class BooksViewModel @Inject constructor(
    rocketsInteractor: BooksInteractor,
) : ViewModel() {

    val booksData: Flow<PagingData<Book>> = rocketsInteractor.fetchBooks()
}
