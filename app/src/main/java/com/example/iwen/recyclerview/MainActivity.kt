package com.example.iwen.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.LinearLayout.HORIZONTAL
import androidx.recyclerview.widget.*
import com.example.iwen.recyclerview.databinding.ActivityMainBinding

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
        mBinding?.mRecyclerView?.layoutManager = LinearLayoutManager(
            this,
            LinearLayoutManager.VERTICAL,
            false)
        // 分割线
//        mBinding?.mRecyclerView?.addItemDecoration(
//            DividerItemDecoration(this,DividerItemDecoration.VERTICAL))
        // 确定数据源
        for (i in 0..20){
            dataSource.add(R.drawable.bm)
        }
        // 确定适配器
        mBinding?.mRecyclerView?.adapter = MyAdapter(dataSource)
        // 设置滑动的帮助类：滑动到一定程度，会自动滑动到下一页
        LinearSnapHelper().attachToRecyclerView(mBinding?.mRecyclerView)
    }
}