package ru.mry.profnotes

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2

class HomeFragment : Fragment() {
    private lateinit var viewPager: ViewPager2

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view: View? = null
        view = inflater.inflate(R.layout.fragment_home, container, false)
        viewPager = view.findViewById(R.id.vp_card_course)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var item = listOf(Courses(
            1, "bdhd",
            "hjh", "ghdj",
            "ndbdn", "ndbd",
            "mdns"),
            Courses(2, "ndb",
                "hdbdj", "jdbdj",
                "jdb", "nddk",
                "njsdk")
        )
        viewPager.adapter = ViewPagerAdapter(item)
    }

    override fun onDestroyView() {
        super.onDestroyView()
    }
}