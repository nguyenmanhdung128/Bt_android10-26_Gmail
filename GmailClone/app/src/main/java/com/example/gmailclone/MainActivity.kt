package com.example.gmailclone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.gmailclone.ui.theme.GmailCloneTheme
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            val emailList = generateDummyData() // Tạo dữ liệu mẫu

            val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
            recyclerView.layoutManager = LinearLayoutManager(this)
            recyclerView.adapter = EmailAdapter(emailList)
        }

        private fun generateDummyData(): List<EmailItem> {
            val dummyData = mutableListOf<EmailItem>()
            for (i in 1..20) {
                dummyData.add(EmailItem("Tiêu đề $i", "Nội dung email $i " +
                        "Nguyễn Mạnh Dũng 20204730"))
            }
            return dummyData
        }
    }
