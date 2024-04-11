package simform.gitexcercise.android.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import simform.gitexcercise.android.R
import simform.gitexcercise.android.databinding.FragmentForgotPasswordBinding

class ForgotPasswordFragment : Fragment() {

    private lateinit var binding: FragmentForgotPasswordBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(layoutInflater,
            R.layout.fragment_forgot_password,container,false)
        return binding.root
    }
}