package com.example.runtracker.ui.viewmodels

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.example.runtracker.repositories.MainRepository

class StatisticsViewModel @ViewModelInject constructor(
        val mainRepository: MainRepository
): ViewModel(){

        val totalTimeRun = mainRepository.getTotalTimeInMillis()
        val totalDistance = mainRepository.getTotalDistance()
        val totalCaloriesBurned = mainRepository.getTotalCaloriesBurned()
        val totalAvgSpeed = mainRepository.getTotalAvgSpeed()

        val runsSortedByDate = mainRepository.getAllRunsSortedByDate()
}