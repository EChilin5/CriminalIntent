package com.bignerdranch.android.criminalintent

import androidx.lifecycle.ViewModel

class CrimeListViewModel : ViewModel() {
    //https://learning.oreilly.com/library/view/android-programming-the/9780135257555/ch09s01.html

    val crimes = mutableListOf<Crime>()

    init{
        for(i in 0 until 100){
            val crime = Crime()
            crime.title = "Crime #$i"
            crime.isSolved = i % 2 == 0
            crimes += crime
        }
    }
}