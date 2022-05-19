package co.karpenko.alex.presentation.books

import co.karpenko.alex.data.mapper.Book

sealed class Event {
    object EmptyDetails : Event()
    object EmptyFields : Event()
    object ErrorAddingDetails : Event()
    data class BookDetailsEvent(val bookDetails: Book) : Event()
    data class AddedItem(val book: Book) : Event()
}
