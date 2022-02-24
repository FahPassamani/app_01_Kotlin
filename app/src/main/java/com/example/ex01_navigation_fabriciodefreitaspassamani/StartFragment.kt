package com.example.ex01_navigation_fabriciodefreitaspassamani

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.activity.addCallback
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.ex01_navigation_fabriciodefreitaspassamani.databinding.FragmentStartBinding

class StartFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding : FragmentStartBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_start, container, false)

        binding.btnIniciar.setOnClickListener { view : View ->
            view.findNavController().navigate(StartFragmentDirections.actionStartFragmentToQuestaoAFragment())
        }

        val callback = requireActivity().onBackPressedDispatcher.addCallback(this) {
            Toast.makeText(context, "Não é possivel retornar a tela anterior", Toast.LENGTH_SHORT).show()
        }

        return binding.root
    }

}