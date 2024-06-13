package com.example.unscramble.ui

data class GameUiState(
    val currentScrambledWord: String = "",      // Palabra actual (sin desordenar)
    val currentWordCount: Int = 1,              // Número de palabra actual
    val score: Int = 0,                         // Puntuación actual
    val isGuessedWordWrong: Boolean = false,    // Palabra errónea
    val isGameOver: Boolean = false             // Juego terminado
)
