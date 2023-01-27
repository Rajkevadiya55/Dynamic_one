package com.example.dynamic_one

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.example.dynamic_one.databinding.ActivityMainBinding
import com.example.dynamic_one.databinding.FragmentOneBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       var binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

binding.One.setOnClickListener {

  //  var OneFragment:OneFragment= OneFragment()
    //var manager:FragmentManager=supportFragmentManager
   // var transaction:FragmentTransaction=manager.beginTransaction()
   // transaction.replace(R.id.fragFrame,OneFragment)
   // transaction.commit();
    loadFragment(OneFragment())
}

binding.Two.setOnClickListener {

    loadFragment(TwoFragment())

}

    }

    fun loadFragment(fragment:Fragment){
        var transaction=supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragFrame,fragment)
        transaction.commit()
    }

}