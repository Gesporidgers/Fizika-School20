package com.teovr.fizikaschool20mobile

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.teovr.fizikaschool20mobile.databinding.BundleitemBinding

class BundleAdapter: RecyclerView.Adapter<BundleAdapter.BundleHolder>() {
     val deskList = ArrayList<Bundledesc>()
    class BundleHolder(item: View): RecyclerView.ViewHolder(item) {
        val binding = BundleitemBinding.bind(item)
        fun bind(bundledesc: Bundledesc) = with(binding){
            p1.text = bundledesc.p1
            p2.text = bundledesc.p2
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BundleHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.bundleitem,parent, false)
        return BundleHolder(view)
    }

    override fun onBindViewHolder(holder: BundleHolder, position: Int) {
        holder.bind(deskList[position])
    }

    override fun getItemCount(): Int {
        return deskList.size
    }
    fun addElement(bundledesc: Bundledesc){
        deskList.add(bundledesc)
        notifyDataSetChanged()
    }
}