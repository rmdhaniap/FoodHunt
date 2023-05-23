package com.example.foodhunt.ui.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.foodhunt.R
import com.example.foodhunt.camera.CameraActivity
import com.example.foodhunt.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root


//        val textView: TextView = binding.text
//        homeViewModel.text.observe(viewLifecycleOwner) {
//            textView.text = it
//        }
//        return root

        binding.foodhuntImageView.setImageResource(R.drawable.user_image)
        binding.categoriesMeat.setImageResource(R.drawable.meat)
        binding.categoriesHealthy.setImageResource(R.drawable.healthy)
        binding.categoriesSnacks.setImageResource(R.drawable.snacks)

        binding.traditionalSumatera.setImageResource(R.drawable.sumatera)
        binding.traditionalJawa.setImageResource(R.drawable.jawa)
        binding.traditionalKalimantan.setImageResource(R.drawable.kalimantan)
        binding.traditionalBali.setImageResource(R.drawable.bali)
        binding.traditionalSulawesi.setImageResource(R.drawable.sulawesi)
        binding.traditionalPapua.setImageResource(R.drawable.papua)


        action()

        return binding.root

    }

    private fun action() {
        binding.FABCamera.setOnClickListener {
            val intent = Intent(binding.root.context, CameraActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}