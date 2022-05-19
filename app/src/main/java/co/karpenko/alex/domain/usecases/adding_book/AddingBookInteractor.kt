package co.karpenko.alex.domain.usecases.adding_book

import co.karpenko.alex.data.mapper.Book
import co.karpenko.alex.domain.repository.BookRepository
import co.tiim.testkarpenkoalex.domain.base.BaseUseCase
import kotlinx.coroutines.CoroutineDispatcher
import javax.inject.Inject

/**
 * Created by Alexander Karpenko on 02.05.2022.
 * java.karpenko@gmail.com
 */

class AddingBookInteractor @Inject constructor(
    dispatcher: CoroutineDispatcher,
    private val repository: BookRepository,
) : BaseUseCase(dispatcher) {

    suspend fun addingBook(book: Book) = wrapResult {
        repository.addingBook(book)
    }
}
