package com.example.janitriassignmentcolorapp.viewmodel
import androidx.lifecycle.ViewModel
import com.example.janitriassignmentcolorapp.data.ColorCard
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale
import javax.inject.Inject

@HiltViewModel
class CardViewModel @Inject constructor() : ViewModel() {
    private val _cards = MutableStateFlow<List<ColorCard>>(emptyList())
    val cards: StateFlow<List<ColorCard>> = _cards

    fun addRandomCard() {
        val newCard = ColorCard(
            color = getRandomColor(),
            createdAt = SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(Date())
        )
        _cards.value = _cards.value + newCard
    }

    fun refreshColors() {
        _cards.value = emptyList()
    }

    private fun getRandomColor(): String {
        val r = (0..255).random()
        val g = (0..255).random()
        val b = (0..255).random()
        return String.format("#%02X%02X%02X", r, g, b)
    }
}