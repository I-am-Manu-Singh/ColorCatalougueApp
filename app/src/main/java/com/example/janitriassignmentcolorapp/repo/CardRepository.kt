package com.example.janitriassignmentcolorapp.repo

import com.example.janitriassignmentcolorapp.data.CardDao
import com.example.janitriassignmentcolorapp.data.CardEntity
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class CardRepository @Inject constructor(
    private val cardDao: CardDao
) {
    suspend fun insertCard(color: String) {
        cardDao.insert(CardEntity(color = color))
    }

    fun getCards(): Flow<List<CardEntity>> = cardDao.getAllCards()
}