package com.example.foodhunt.article

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.foodhunt.DetailFoodActivity
import com.example.foodhunt.R
import com.example.foodhunt.adapter.FoodAdapter
import com.example.foodhunt.ui.Food

class ArticleFragment : Fragment() {

    companion object {
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    private lateinit var adapter: FoodAdapter
    private lateinit var recyclerView: RecyclerView
    private lateinit var foodArrayList: ArrayList<Food>

    lateinit var image: Array<Int>
    lateinit var title: Array<String>
    lateinit var descriptions: Array<String>


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_article, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        dataInitialize()
        val layoutManager = LinearLayoutManager(context)
        recyclerView = view.findViewById(R.id.rv_food)
        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = FoodAdapter(foodArrayList){
            val intent = Intent(context, DetailFoodActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }
    }
    private fun dataInitialize() {
        foodArrayList = arrayListOf<Food>()

        image = arrayOf(
            R.drawable.klepon,
            R.drawable.ketoprak,
            R.drawable.martabak_manis,
            R.drawable.pecel_sayur,
            R.drawable.pempek,
            R.drawable.pepes_ikan,
            R.drawable.perkedel,
            R.drawable.putu_ayu,
            R.drawable.sate_lilit,
            R.drawable.sop_buntut,
            R.drawable.mendoan,
            R.drawable.papeda,

            )
        title = arrayOf(
            getString(R.string.title_klepon),
            getString(R.string.title_ketoprak),
            getString(R.string.title_martabak_manis),
            getString(R.string.title_pecel_sayur),
            getString(R.string.title_pempek),
            getString(R.string.title_pepes_ikan),
            getString(R.string.title_perkedel),
            getString(R.string.title_putu_ayu),
            getString(R.string.title_sate_lilit),
            getString(R.string.title_sop_buntut),
            getString(R.string.title_mendoan),
            getString(R.string.title_papeda),
        )
        descriptions = arrayOf(
            getString(R.string.desc_klepon),
            getString(R.string.desc_ketoprak),
            getString(R.string.desc_martabak_manis),
            getString(R.string.desc_pecel_sayur),
            getString(R.string.desc_pempek),
            getString(R.string.desc_pepes_ikan),
            getString(R.string.desc_perkedel),
            getString(R.string.desc_putu_ayu),
            getString(R.string.desc_sate_lilit),
            getString(R.string.desc_sop_buntut),
            getString(R.string.desc_mendoan),
            getString(R.string.desc_papeda),
        )
        for (i in image.indices) {

            val food = Food(image[i],title[i], descriptions[i])
            foodArrayList.add(food)
        }
    }
}