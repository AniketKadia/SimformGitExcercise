package simform.gitexcercise.android.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.commit
import simform.gitexcercise.android.BR
import simform.gitexcercise.android.R
import simform.gitexcercise.android.databinding.FragmentLoginBinding

class LoginFragment : Fragment(), View.OnClickListener {

    private lateinit var binding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(layoutInflater, R.layout.fragment_login, container, false)
        binding.setVariable(BR.clickHandler, this)
        return binding.root
    }

    override fun onClick(v: View?) {
        when(v) {
            binding.textCreateAccount ->
                parentFragmentManager.commit {
                    replace(R.id.fragment_container_view, RegistrationFragment())
                }

            binding.textForgotPassword ->
                parentFragmentManager.commit {
                    replace(R.id.fragment_container_view, ForgotPasswordFragment())
                }
        }
    }
}