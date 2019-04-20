package br.com.roomwordsample.data

import androidx.annotation.WorkerThread

class WordRepository(private val wordDao: WordDao) {

    val allWords = wordDao.getAllWords()

    @WorkerThread
    suspend fun insert(word: Word) {
        wordDao.insert(word)
    }
}