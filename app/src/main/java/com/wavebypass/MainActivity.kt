package com.wavebypass

import android.graphics.Color
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Главный фон (темно-синий, как в твоем тестере)
        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            setBackgroundColor(Color.parseColor("#0a0f1f")) 
        }

        // Заголовок
        val title = TextView(this).apply {
            text = "WaveBypass 🌊"
            textSize = 36f
            setTextColor(Color.WHITE)
            setPadding(0, 0, 0, 100)
        }

        // Текст статуса
        val status = TextView(this).apply {
            text = "Статус: Выключено ❌"
            textSize = 18f
            setTextColor(Color.parseColor("#ff4d4d")) // Красный
            setPadding(0, 0, 0, 60)
        }

        // Кнопка
        val btnStart = Button(this).apply {
            text = "Включить обход"
            setBackgroundColor(Color.parseColor("#00a6ff")) // Голубой
            setTextColor(Color.WHITE)
            textSize = 20f
            setPadding(50, 30, 50, 30)
            
            setOnClickListener {
                text = "Подключение..."
                status.text = "Статус: Работает ✅"
                status.setTextColor(Color.parseColor("#2ecc71")) // Зеленый
                // Позже здесь мы дадим команду Rust-движку перехватывать пакеты!
            }
        }

        // Собираем всё вместе на экране
        layout.addView(title)
        layout.addView(status)
        layout.addView(btnStart)

        setContentView(layout)
    }
}
