package com.posl.beanslexis.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.posl.beanslexis.model.LessonsItem
import com.posl.beanslexis.R
import com.posl.beanslexis.adapters.LessonsAdapters
import com.posl.beanslexis.databinding.ActivityLessonsBinding

class LessonsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLessonsBinding
    private var lessonsItem: ArrayList<LessonsItem>? = null
    private var gridLayoutManager: GridLayoutManager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLessonsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Array
        lessonsItem = ArrayList()
        lessonsItem = setDataInfo()

        gridLayoutManager = GridLayoutManager(
            applicationContext, 2,
            LinearLayoutManager.VERTICAL, false
        )

        binding.recyclerviewItemsLessons.layoutManager = gridLayoutManager
        binding.recyclerviewItemsLessons.setHasFixedSize(true)
        binding.recyclerviewItemsLessons.adapter = LessonsAdapters(applicationContext,lessonsItem!!)
    }

    private fun setDataInfo(): ArrayList<LessonsItem> {
        val arrayList: ArrayList<LessonsItem> = ArrayList()
        arrayList.add(LessonsItem(R.drawable.ic_beans1, "Almonds","Миндаль"))
        arrayList.add(LessonsItem(R.drawable.ic_beans2, "Black eyed peas","Чорноокий горошок"))
        arrayList.add(LessonsItem(R.drawable.ic_beans3, "Cashew nuts","Орехи кешью"))
        arrayList.add(LessonsItem(R.drawable.ic_beans4, "Chestnuts","Каштаны"))
        arrayList.add(LessonsItem(R.drawable.ic_beans5, "Chickpeas","Нут"))
        arrayList.add(LessonsItem(R.drawable.ic_beans6, "Cocoa beans","Какао-бобов"))
        arrayList.add(LessonsItem(R.drawable.ic_beans7, "Coffee beans","Кофейные зёрна"))
        arrayList.add(LessonsItem(R.drawable.ic_beans8, "Haricot beans","Фасоль"))
        arrayList.add(LessonsItem(R.drawable.ic_beans9, "Peanuts","Арахис"))
        arrayList.add(LessonsItem(R.drawable.ic_beans10, "Walnuts","Грецкие орехи"))

        return arrayList
    }

}