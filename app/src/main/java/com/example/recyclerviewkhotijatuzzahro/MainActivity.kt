package com.example.recyclerviewkhotijatuzzahro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

        class MainActivity : AppCompatActivity() {
            //variabel recycler
            private lateinit var recyclerView: RecyclerView
            private lateinit var recyclerAdapter: RecyclerView.Adapter<*>
            private lateinit var layoutManager: RecyclerView.LayoutManager

            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_main)

                recyclerView = findViewById(R.id.ListData)
                var data = ArrayList<DataGambar>()
                data.add(DataGambar(R.drawable.boba1,"Boba coklat" ,"20.000"))
                data.add(DataGambar(R.drawable.boba3,"Boba oreo", "24.000"))
                data.add(DataGambar(R.drawable.boba4,"Boba strobery","25.000"))
                data.add(DataGambar(R.drawable.balldrop1,"frappuccinoCoklat","30.000"))
                data.add(DataGambar(R.drawable.frappuccino1,"frappuccinoSatu","32.000"))
                data.add(DataGambar(R.drawable.frappuccino2,"frappuccinioDua","33.000"))
                data.add(DataGambar(R.drawable.boba1,"frappuccinioTiga","35.000"))
                data.add(DataGambar(R.drawable.boba2,"frappuccinioEmpat","37.000"))
                data.add(DataGambar(R.drawable.boba3,"frappuccinioLima","39.000"))
                data.add(DataGambar(R.drawable.boba4,"frappuccinioEnam","40.000"))
                data.add(DataGambar(R.drawable.frappuccino2,"frappuccinioDua","33.000"))
                data.add(DataGambar(R.drawable.boba1,"frappuccinioTiga","35.000"))
                data.add(DataGambar(R.drawable.boba2,"frappuccinioEmpat","37.000"))
                data.add(DataGambar(R.drawable.boba3,"frappuccinioLima","39.000"))
                data.add(DataGambar(R.drawable.boba4,"frappuccinioEnam","40.000"))


                //menambahkan data ke dalam adapter
                recyclerAdapter = zahro_adapter(data)
                //menambahkan layout manager
                layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
                //memanggil adapter
                recyclerView.adapter = recyclerAdapter
                //menampilkan data ke layout
                recyclerView.layoutManager = layoutManager

            }

        }





