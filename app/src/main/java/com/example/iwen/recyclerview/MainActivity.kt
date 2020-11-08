package com.example.iwen.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.iwen.recyclerview.databinding.ActivityMainBinding

/**
 *
 */
class MainActivity : AppCompatActivity() {
    private var mBinding: ActivityMainBinding? = null
    // 数据源的数组
    private val dataSource = mutableListOf<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // 使用viewBinding
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        val rootView = mBinding?.root
        setContentView(rootView)
        // 确定显示的样式
        mBinding?.mRecyclerView?.layoutManager = LinearLayoutManager(this)
        // 确定数据源
        for (i in 0..20){
            dataSource.add(R.drawable.bm)
        }
        // 确定适配器
        mBinding?.mRecyclerView?.adapter = MyAdapter(dataSource)
    }
}