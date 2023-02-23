package com.example.asanbekov_3_6


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.asanbekov_3_6.databinding.FragmentMusicBinding

class MusicFragment : Fragment(), OnItemClick {

    private lateinit var binding: FragmentMusicBinding
    private lateinit var musicList: ArrayList<Music>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMusicBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadData()
        val adapter = MusicAdapter(musicList, this)
        binding.recyclerView.adapter = adapter

    }

    private fun loadData() {
        musicList = ArrayList()
        musicList.add(Music("Мирбек Атабеков", "Кечки Бишкек", 133))
        musicList.add(Music("Нурмат Садыров", "Торгоюм", 156))
        musicList.add(Music("Арсен", "Тагдырын мага жазганда ", 149))
        musicList.add(Music("Айыма", "Заблокируй", 112))
        musicList.add(Music("Бегиш", "Бейбижан", 198))
        musicList.add(Music("Бекжан Темирхан", "Кантем", 176))
        musicList.add(Music("Толгонай Арзыкеева", "Махабат", 191))
        musicList.add(Music("Чолпон Талипбек", "Копологум", 165))
        musicList.add(Music("Айтурган Эрмекова", "Сенсиз", 155))
        musicList.add(Music("Нурила", "Кереметим", 147))

    }

    override fun onClick(name: String) {
        val bundle = Bundle()
        bundle.putString("MUSIC", name)
        val fragment: Fragment = MusicInfoFragment()
        fragment.arguments = bundle
        requireActivity().supportFragmentManager.beginTransaction()
            .replace(R.id.container, fragment).addToBackStack(null).commit()

    }
}