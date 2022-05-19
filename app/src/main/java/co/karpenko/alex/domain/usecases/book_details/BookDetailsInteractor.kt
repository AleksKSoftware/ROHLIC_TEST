package co.karpenko.alex.domain.usecases.book_details

import co.karpenko.alex.domain.repository.BookRepository
import co.tiim.testkarpenkoalex.domain.base.BaseUseCase
import kotlinx.coroutines.CoroutineDispatcher
import javax.inject.Inject

/**
 * Created by Alexander Karpenko on 02.05.2022.
 * java.karpenko@gmail.com
 */
class BookDetailsInteractor @Inject constructor(
    dispatcher: CoroutineDispatcher,
    private val repository: BookRepository,
) : BaseUseCase(dispatcher) {

    suspend fun fetchBookDetails(id: Int) = wrapResult {
        repository.getBookDetails(id)
    }
}
