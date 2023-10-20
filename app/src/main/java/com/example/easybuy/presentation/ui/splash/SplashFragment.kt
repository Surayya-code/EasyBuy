package com.example.easybuy.presentation.ui.splash

import android.os.Handler
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import com.example.easybuy.R
import com.example.easybuy.common.base.BaseFragment
import com.example.easybuy.databinding.FragmentSplashBinding


class SplashFragment : BaseFragment<FragmentSplashBinding>(FragmentSplashBinding::inflate) {
    private lateinit var fadeInAnimation: Animation
    private lateinit var textView1: TextView

    override fun onViewCreateFinish() {
         textView1 = binding.textViewSplash
        fadeInAnimation = AnimationUtils.loadAnimation(requireContext(), R.anim.fade_in)

        startAnimationn()

    }
    private fun startAnimationn() {
        textView1.startAnimation(fadeInAnimation)
        Handler().postDelayed({
            binding.textViewSplash.startAnimation(fadeInAnimation)
            findNavController().navigate(SplashFragmentDirections.toSignInFragment())
        }, 2000)
    }

    override fun observeEvents() {

//        viewModel.auth.observe(viewLifecycleOwner){
//            if (it){
//                findNavController().navigate(SplashFragmentDirections.towelcome())
//            }else{
//                findNavController().navigate(SplashFragmentDirections.tohomeFragment())
//            }
//        }
    }


}