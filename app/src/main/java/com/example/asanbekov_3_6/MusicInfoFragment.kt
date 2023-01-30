package com.example.asanbekov_3_6

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.asanbekov_3_6.databinding.FragmentMusicInfoBinding

class MusicInfoFragment : Fragment() {

 private lateinit var binding: FragmentMusicInfoBinding

 override fun onCreateView(
  inflater: LayoutInflater, container: ViewGroup?,
  savedInstanceState: Bundle?
 ): View? {
  binding = FragmentMusicInfoBinding.inflate(layoutInflater)
  return binding.root
 }

 override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
  super.onViewCreated(view, savedInstanceState)
  binding.tvName.text = arguments?.getString("MUSIC")


 }

}