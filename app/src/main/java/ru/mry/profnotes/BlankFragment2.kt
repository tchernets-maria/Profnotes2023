package ru.mry.profnotes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ru.mry.profnotes.databinding.FragmentBlank2Binding
import ru.mry.profnotes.databinding.FragmentBlankBinding

class BlankFragment2 : Fragment() {
    private var binding: FragmentBlank2Binding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBlank2Binding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}