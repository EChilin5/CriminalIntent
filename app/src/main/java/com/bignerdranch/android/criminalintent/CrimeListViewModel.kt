package com.bignerdranch.android.criminalintent

import androidx.lifecycle.ViewModel

class CrimeListViewModel : ViewModel() {
    //https://learning.oreilly.com/library/view/android-programming-the/9780135257555/ch09s01.html
    private val crimeRepository = CrimeRepository.get()
    val crimeListLiveData = crimeRepository.getCrimes()
    fun addCrime(crime: Crime) {
        crimeRepository.addCrime(crime)
    }

}