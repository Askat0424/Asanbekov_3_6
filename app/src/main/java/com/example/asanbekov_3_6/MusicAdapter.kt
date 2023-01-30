package com.example.asanbekov_3_6

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.asanbekov_3_6.databinding.ItemMusicBinding

class MusicAdapter(val musicList: ArrayList<Music>, val onItemClick: OnItemClick): Adapter<MusicAdapter.MusicViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MusicViewHolder {
        return MusicViewHolder(ItemMusicBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: MusicViewHolder, position: Int) {
        holder.bind()

        holder.itemView.setOnClickListener {
            onItemClick.onClick(musicList[position].name) }
    }

    override fun getItemCount() = musicList.size

    inner class MusicViewHolder(private val binding: ItemMusicBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(){
            val item = musicList[adapterPosition]

            binding.apply {
                tvName.text = item.name
                tvAuthor.text = item.author
                tvNumber.text = adapterPosition.inc().toString()
                tvTime.text = Music.createTime(item.time)
            }

        }
    }
}