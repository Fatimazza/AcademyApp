package io.github.fatimazza.academyapp.ui.home

import android.os.Bundle
import android.view.MenuItem
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import io.github.fatimazza.academyapp.R
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    private val tvMessage: TextView
        get() = tv_message

    private val navView: BottomNavigationView
        get() = nav_view

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        setupNavigation()
    }

    private fun setupNavigation() {
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }

    private val mOnNavigationItemSelectedListener =
        object : BottomNavigationView.OnNavigationItemSelectedListener {
            override fun onNavigationItemSelected(item: MenuItem): Boolean {
                when (item.itemId) {
                    R.id.navigation_home -> {
                        tvMessage.setText(R.string.title_home)
                        return true
                    }
                    R.id.navigation_dashboard -> {
                        tvMessage.setText(R.string.title_dashboard)
                        return true
                    }
                    R.id.navigation_notifications -> {
                        tvMessage.setText(R.string.title_notifications)
                        return true
                    }
                }
                return false
            }
        }
}
